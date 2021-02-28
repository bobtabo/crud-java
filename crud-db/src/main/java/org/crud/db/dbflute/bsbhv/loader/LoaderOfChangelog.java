package org.crud.db.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.crud.db.dbflute.exbhv.*;
import org.crud.db.dbflute.exentity.*;

/**
 * The referrer loader of CHANGELOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, APPLIED_AT, DESCRIPTION
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfChangelog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Changelog> _selectedList;
    protected BehaviorSelector _selector;
    protected ChangelogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfChangelog ready(List<Changelog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ChangelogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ChangelogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Changelog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
