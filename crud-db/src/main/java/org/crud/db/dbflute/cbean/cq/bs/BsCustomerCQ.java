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
 * The base condition-query of customer.
 * @author DBFlute(AutoGenerator)
 */
public class BsCustomerCQ extends AbstractBsCustomerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CustomerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from customer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CustomerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CustomerCIQ xcreateCIQ() {
        CustomerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CustomerCIQ xnewCIQ() {
        return new CustomerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join customer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CustomerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CustomerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _lastName;
    public ConditionValue xdfgetLastName()
    { if (_lastName == null) { _lastName = nCV(); }
      return _lastName; }
    protected ConditionValue xgetCValueLastName() { return xdfgetLastName(); }

    /**
     * Add order-by as ascend. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_LastName_Asc() { regOBA("last_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_LastName_Desc() { regOBD("last_name"); return this; }

    protected ConditionValue _firstName;
    public ConditionValue xdfgetFirstName()
    { if (_firstName == null) { _firstName = nCV(); }
      return _firstName; }
    protected ConditionValue xgetCValueFirstName() { return xdfgetFirstName(); }

    /**
     * Add order-by as ascend. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_FirstName_Asc() { regOBA("first_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_FirstName_Desc() { regOBD("first_name"); return this; }

    protected ConditionValue _lastKana;
    public ConditionValue xdfgetLastKana()
    { if (_lastKana == null) { _lastKana = nCV(); }
      return _lastKana; }
    protected ConditionValue xgetCValueLastKana() { return xdfgetLastKana(); }

    /**
     * Add order-by as ascend. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_LastKana_Asc() { regOBA("last_kana"); return this; }

    /**
     * Add order-by as descend. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_LastKana_Desc() { regOBD("last_kana"); return this; }

    protected ConditionValue _firstKana;
    public ConditionValue xdfgetFirstKana()
    { if (_firstKana == null) { _firstKana = nCV(); }
      return _firstKana; }
    protected ConditionValue xgetCValueFirstKana() { return xdfgetFirstKana(); }

    /**
     * Add order-by as ascend. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_FirstKana_Asc() { regOBA("first_kana"); return this; }

    /**
     * Add order-by as descend. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_FirstKana_Desc() { regOBD("first_kana"); return this; }

    protected ConditionValue _gender;
    public ConditionValue xdfgetGender()
    { if (_gender == null) { _gender = nCV(); }
      return _gender; }
    protected ConditionValue xgetCValueGender() { return xdfgetGender(); }

    /**
     * Add order-by as ascend. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Gender_Asc() { regOBA("gender"); return this; }

    /**
     * Add order-by as descend. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Gender_Desc() { regOBD("gender"); return this; }

    protected ConditionValue _birthday;
    public ConditionValue xdfgetBirthday()
    { if (_birthday == null) { _birthday = nCV(); }
      return _birthday; }
    protected ConditionValue xgetCValueBirthday() { return xdfgetBirthday(); }

    /**
     * Add order-by as ascend. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Birthday_Asc() { regOBA("birthday"); return this; }

    /**
     * Add order-by as descend. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Birthday_Desc() { regOBD("birthday"); return this; }

    protected ConditionValue _postCode;
    public ConditionValue xdfgetPostCode()
    { if (_postCode == null) { _postCode = nCV(); }
      return _postCode; }
    protected ConditionValue xgetCValuePostCode() { return xdfgetPostCode(); }

    /**
     * Add order-by as ascend. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_PostCode_Asc() { regOBA("post_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_PostCode_Desc() { regOBD("post_code"); return this; }

    protected ConditionValue _prefId;
    public ConditionValue xdfgetPrefId()
    { if (_prefId == null) { _prefId = nCV(); }
      return _prefId; }
    protected ConditionValue xgetCValuePrefId() { return xdfgetPrefId(); }

    /**
     * Add order-by as ascend. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_PrefId_Asc() { regOBA("pref_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_PrefId_Desc() { regOBD("pref_id"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /**
     * Add order-by as ascend. <br>
     * address: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br>
     * address: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _building;
    public ConditionValue xdfgetBuilding()
    { if (_building == null) { _building = nCV(); }
      return _building; }
    protected ConditionValue xgetCValueBuilding() { return xdfgetBuilding(); }

    /**
     * Add order-by as ascend. <br>
     * building: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Building_Asc() { regOBA("building"); return this; }

    /**
     * Add order-by as descend. <br>
     * building: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Building_Desc() { regOBD("building"); return this; }

    protected ConditionValue _tel;
    public ConditionValue xdfgetTel()
    { if (_tel == null) { _tel = nCV(); }
      return _tel; }
    protected ConditionValue xgetCValueTel() { return xdfgetTel(); }

    /**
     * Add order-by as ascend. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Tel_Asc() { regOBA("tel"); return this; }

    /**
     * Add order-by as descend. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Tel_Desc() { regOBD("tel"); return this; }

    protected ConditionValue _mobile;
    public ConditionValue xdfgetMobile()
    { if (_mobile == null) { _mobile = nCV(); }
      return _mobile; }
    protected ConditionValue xgetCValueMobile() { return xdfgetMobile(); }

    /**
     * Add order-by as ascend. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Mobile_Asc() { regOBA("mobile"); return this; }

    /**
     * Add order-by as descend. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Mobile_Desc() { regOBD("mobile"); return this; }

    protected ConditionValue _email;
    public ConditionValue xdfgetEmail()
    { if (_email == null) { _email = nCV(); }
      return _email; }
    protected ConditionValue xgetCValueEmail() { return xdfgetEmail(); }

    /**
     * Add order-by as ascend. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Email_Asc() { regOBA("email"); return this; }

    /**
     * Add order-by as descend. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Email_Desc() { regOBD("email"); return this; }

    protected ConditionValue _remarks;
    public ConditionValue xdfgetRemarks()
    { if (_remarks == null) { _remarks = nCV(); }
      return _remarks; }
    protected ConditionValue xgetCValueRemarks() { return xdfgetRemarks(); }

    /**
     * Add order-by as ascend. <br>
     * remarks: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Remarks_Asc() { regOBA("remarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * remarks: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_Remarks_Desc() { regOBD("remarks"); return this; }

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
    public BsCustomerCQ addOrderBy_CreatedAt_Asc() { regOBA("created_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_CreatedAt_Desc() { regOBD("created_at"); return this; }

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
    public BsCustomerCQ addOrderBy_UpdatedAt_Asc() { regOBA("updated_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_UpdatedAt_Desc() { regOBD("updated_at"); return this; }

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
    public BsCustomerCQ addOrderBy_DeletedAt_Asc() { regOBA("deleted_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @return this. (NotNull)
     */
    public BsCustomerCQ addOrderBy_DeletedAt_Desc() { regOBD("deleted_at"); return this; }

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
    public BsCustomerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCustomerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CustomerCQ bq = (CustomerCQ)bqs;
        CustomerCQ uq = (CustomerCQ)uqs;
        if (bq.hasConditionQueryPref()) {
            uq.queryPref().reflectRelationOnUnionQuery(bq.queryPref(), uq.queryPref());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * pref by my pref_id, named 'pref'.
     * @return The instance of condition-query. (NotNull)
     */
    public PrefCQ queryPref() {
        return xdfgetConditionQueryPref();
    }
    public PrefCQ xdfgetConditionQueryPref() {
        String prop = "pref";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPref()); xsetupOuterJoinPref(); }
        return xgetQueRlMap(prop);
    }
    protected PrefCQ xcreateQueryPref() {
        String nrp = xresolveNRP("customer", "pref"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PrefCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pref", nrp);
    }
    protected void xsetupOuterJoinPref() { xregOutJo("pref"); }
    public boolean hasConditionQueryPref() { return xhasQueRlMap("pref"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CustomerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CustomerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CustomerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CustomerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CustomerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CustomerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CustomerCQ> _myselfExistsMap;
    public Map<String, CustomerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CustomerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CustomerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CustomerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CustomerCB.class.getName(); }
    protected String xCQ() { return CustomerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
