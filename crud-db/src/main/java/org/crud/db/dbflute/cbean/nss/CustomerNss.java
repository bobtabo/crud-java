package org.crud.db.dbflute.cbean.nss;

import org.crud.db.dbflute.cbean.cq.CustomerCQ;

/**
 * The nest select set-upper of customer.
 * @author DBFlute(AutoGenerator)
 */
public class CustomerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CustomerCQ _query;
    public CustomerNss(CustomerCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * pref by my pref_id, named 'pref'.
     */
    public void withPref() {
        _query.xdoNss(() -> _query.queryPref());
    }
}
