package org.crud.core.repository;

import org.crud.db.dbflute.exbhv.CustomerBhv;
import org.crud.db.dbflute.exentity.Customer;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 顧客Repositoryクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Repository
public class CustomerRepository extends AbstractRepository<CustomerBhv, Customer> {

    @Override
    public ListResultBean<Customer> findAll() {
        return getBehavior().selectList(cb -> {
            cb.query().setDeletedAt_IsNull();
        });
    }

    public ListResultBean<Customer> search(String lastKana, String firstKana, List genders, Integer prefId) {
        return getBehavior().selectList(cb -> {
            cb.setupSelect_Pref();
            cb.query().setDeletedAt_IsNull();
            cb.query().setLastKana_LikeSearch(lastKana, LikeSearchOption::likeContain);
            cb.query().setFirstKana_LikeSearch(firstKana, LikeSearchOption::likeContain);
            cb.query().setGender_InScope(genders);
            cb.query().setPrefId_Equal(prefId);
        });
    }
}
