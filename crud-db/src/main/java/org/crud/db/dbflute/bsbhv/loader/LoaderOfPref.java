package org.crud.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.crud.db.dbflute.exbhv.*;
import org.crud.db.dbflute.exentity.*;
import org.crud.db.dbflute.cbean.*;

/**
 * The referrer loader of pref as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, name, created_at, updated_at, deleted_at
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     customer
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     customerList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPref {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Pref> _selectedList;
    protected BehaviorSelector _selector;
    protected PrefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPref ready(List<Pref> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PrefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PrefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Customer> _referrerCustomer;

    /**
     * Load referrer of customerList by the set-upper of referrer. <br>
     * customer by pref_id, named 'customerList'.
     * <pre>
     * <span style="color: #0000C0">prefBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">prefList</span>, <span style="color: #553000">prefLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prefLoader</span>.<span style="color: #CC4747">loadCustomer</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Pref pref : <span style="color: #553000">prefList</span>) {
     *     ... = pref.<span style="color: #CC4747">getCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPrefId_InScope(pkList);
     * cb.query().addOrderBy_PrefId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCustomer> loadCustomer(ReferrerConditionSetupper<CustomerCB> refCBLambda) {
        myBhv().loadCustomer(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCustomer = refLs);
        return hd -> hd.handle(new LoaderOfCustomer().ready(_referrerCustomer, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Pref> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
