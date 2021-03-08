package org.crud.core.repository;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
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

    /**
     *
     * @param lastKana
     * @param firstKana
     * @param genders
     * @param prefId
     * @return
     */
    public ListResultBean<Customer> search(String lastKana, String firstKana, List<Integer> genders, Integer prefId) {
        return getBehavior().selectList(cb -> {
            cb.setupSelect_Pref();
            cb.query().setDeletedAt_IsNull();
            if (StringUtils.isNotEmpty(lastKana)) {
                cb.query().setLastKana_LikeSearch(lastKana, LikeSearchOption::likeContain);
            }
            if (StringUtils.isNotEmpty(firstKana)) {
                cb.query().setFirstKana_LikeSearch(firstKana, LikeSearchOption::likeContain);
            }
            if (CollectionUtils.isNotEmpty(genders)) {
                cb.query().setGender_InScope(genders);
            }
            if (prefId != null) {
                cb.query().setPrefId_Equal(prefId);
            }
        });
    }
}
