package org.crud.core.repository;

import org.crud.db.dbflute.exbhv.CustomerBhv;
import org.crud.db.dbflute.exentity.Customer;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.stereotype.Repository;

/**
 * 顧客Repositoryクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Repository
public class CustomerRepository extends AbstractRepository<CustomerBhv, Customer> {

    @Override
    public ListResultBean<Customer> findAll() {
        return null;
    }
}
