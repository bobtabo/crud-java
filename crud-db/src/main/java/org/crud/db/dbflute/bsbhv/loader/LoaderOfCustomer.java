package org.crud.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.crud.db.dbflute.exbhv.*;
import org.crud.db.dbflute.exentity.*;

/**
 * The referrer loader of customer as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, last_name, first_name, last_kana, first_kana, gender, birthday, post_code, pref_id, address, building, tel, mobile, email, remarks, created_at, updated_at, deleted_at
 *
 * [sequence]
 *     
 *
 * [identity]
 *     id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     pref
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pref
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCustomer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Customer> _selectedList;
    protected BehaviorSelector _selector;
    protected CustomerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCustomer ready(List<Customer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CustomerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CustomerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPref _foreignPrefLoader;
    public LoaderOfPref pulloutPref() {
        if (_foreignPrefLoader == null)
        { _foreignPrefLoader = new LoaderOfPref().ready(myBhv().pulloutPref(_selectedList), _selector); }
        return _foreignPrefLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Customer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
