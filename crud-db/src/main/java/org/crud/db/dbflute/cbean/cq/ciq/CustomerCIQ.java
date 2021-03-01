package org.crud.db.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.crud.db.dbflute.cbean.*;
import org.crud.db.dbflute.cbean.cq.bs.*;
import org.crud.db.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of customer.
 * @author DBFlute(AutoGenerator)
 */
public class CustomerCIQ extends AbstractBsCustomerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCustomerCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CustomerCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCustomerCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    protected ConditionValue xgetCValueLastName() { return _myCQ.xdfgetLastName(); }
    protected ConditionValue xgetCValueFirstName() { return _myCQ.xdfgetFirstName(); }
    protected ConditionValue xgetCValueLastKana() { return _myCQ.xdfgetLastKana(); }
    protected ConditionValue xgetCValueFirstKana() { return _myCQ.xdfgetFirstKana(); }
    protected ConditionValue xgetCValueGender() { return _myCQ.xdfgetGender(); }
    protected ConditionValue xgetCValueBirthday() { return _myCQ.xdfgetBirthday(); }
    protected ConditionValue xgetCValuePostCode() { return _myCQ.xdfgetPostCode(); }
    protected ConditionValue xgetCValuePrefId() { return _myCQ.xdfgetPrefId(); }
    protected ConditionValue xgetCValueAddress() { return _myCQ.xdfgetAddress(); }
    protected ConditionValue xgetCValueBuilding() { return _myCQ.xdfgetBuilding(); }
    protected ConditionValue xgetCValueTel() { return _myCQ.xdfgetTel(); }
    protected ConditionValue xgetCValueMobile() { return _myCQ.xdfgetMobile(); }
    protected ConditionValue xgetCValueEmail() { return _myCQ.xdfgetEmail(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueCreatedAt() { return _myCQ.xdfgetCreatedAt(); }
    protected ConditionValue xgetCValueUpdatedAt() { return _myCQ.xdfgetUpdatedAt(); }
    protected ConditionValue xgetCValueDeletedAt() { return _myCQ.xdfgetDeletedAt(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CustomerCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CustomerCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CustomerCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CustomerCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CustomerCB.class.getName(); }
    protected String xinCQ() { return CustomerCQ.class.getName(); }
}
