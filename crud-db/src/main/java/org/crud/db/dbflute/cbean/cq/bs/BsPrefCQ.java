package org.crud.db.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.crud.db.dbflute.cbean.cq.ciq.*;
import org.crud.db.dbflute.cbean.*;
import org.crud.db.dbflute.cbean.cq.*;

/**
 * The base condition-query of pref.
 * @author DBFlute(AutoGenerator)
 */
public class BsPrefCQ extends AbstractBsPrefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PrefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPrefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from pref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PrefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PrefCIQ xcreateCIQ() {
        PrefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PrefCIQ xnewCIQ() {
        return new PrefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join pref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PrefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PrefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, CustomerCQ> xdfgetId_ExistsReferrer_CustomerList() { return xgetSQueMap("id_ExistsReferrer_CustomerList"); }
    public String keepId_ExistsReferrer_CustomerList(CustomerCQ sq) { return xkeepSQue("id_ExistsReferrer_CustomerList", sq); }

    public Map<String, CustomerCQ> xdfgetId_NotExistsReferrer_CustomerList() { return xgetSQueMap("id_NotExistsReferrer_CustomerList"); }
    public String keepId_NotExistsReferrer_CustomerList(CustomerCQ sq) { return xkeepSQue("id_NotExistsReferrer_CustomerList", sq); }

    public Map<String, CustomerCQ> xdfgetId_SpecifyDerivedReferrer_CustomerList() { return xgetSQueMap("id_SpecifyDerivedReferrer_CustomerList"); }
    public String keepId_SpecifyDerivedReferrer_CustomerList(CustomerCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_CustomerList", sq); }

    public Map<String, CustomerCQ> xdfgetId_QueryDerivedReferrer_CustomerList() { return xgetSQueMap("id_QueryDerivedReferrer_CustomerList"); }
    public String keepId_QueryDerivedReferrer_CustomerList(CustomerCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_CustomerList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_CustomerListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_CustomerList"); }
    public String keepId_QueryDerivedReferrer_CustomerListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_CustomerList", pm); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * name: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _createdAt;
    public ConditionValue xdfgetCreatedAt()
    { if (_createdAt == null) { _createdAt = nCV(); }
      return _createdAt; }
    protected ConditionValue xgetCValueCreatedAt() { return xdfgetCreatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_CreatedAt_Asc() { regOBA("created_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_CreatedAt_Desc() { regOBD("created_at"); return this; }

    protected ConditionValue _updatedAt;
    public ConditionValue xdfgetUpdatedAt()
    { if (_updatedAt == null) { _updatedAt = nCV(); }
      return _updatedAt; }
    protected ConditionValue xgetCValueUpdatedAt() { return xdfgetUpdatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_UpdatedAt_Asc() { regOBA("updated_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_UpdatedAt_Desc() { regOBD("updated_at"); return this; }

    protected ConditionValue _deletedAt;
    public ConditionValue xdfgetDeletedAt()
    { if (_deletedAt == null) { _deletedAt = nCV(); }
      return _deletedAt; }
    protected ConditionValue xgetCValueDeletedAt() { return xdfgetDeletedAt(); }

    /**
     * Add order-by as ascend. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_DeletedAt_Asc() { regOBA("deleted_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @return this. (NotNull)
     */
    public BsPrefCQ addOrderBy_DeletedAt_Desc() { regOBD("deleted_at"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPrefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsPrefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PrefCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PrefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PrefCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PrefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PrefCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PrefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PrefCQ> _myselfExistsMap;
    public Map<String, PrefCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PrefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PrefCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PrefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PrefCB.class.getName(); }
    protected String xCQ() { return PrefCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
