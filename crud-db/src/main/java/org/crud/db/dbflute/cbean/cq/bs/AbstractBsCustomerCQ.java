package org.crud.db.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.crud.db.dbflute.allcommon.*;
import org.crud.db.dbflute.cbean.*;
import org.crud.db.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of customer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCustomerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "customer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Long id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Long id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Long id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Long id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Long id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Long id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Long id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Long id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Long> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Long> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Long> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Long> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_Equal(String lastName) {
        doSetLastName_Equal(fRES(lastName));
    }

    protected void doSetLastName_Equal(String lastName) {
        regLastName(CK_EQ, lastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotEqual(String lastName) {
        doSetLastName_NotEqual(fRES(lastName));
    }

    protected void doSetLastName_NotEqual(String lastName) {
        regLastName(CK_NES, lastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterThan(String lastName) {
        regLastName(CK_GT, fRES(lastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessThan(String lastName) {
        regLastName(CK_LT, fRES(lastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterEqual(String lastName) {
        regLastName(CK_GE, fRES(lastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessEqual(String lastName) {
        regLastName(CK_LE, fRES(lastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastNameList The collection of lastName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_InScope(Collection<String> lastNameList) {
        doSetLastName_InScope(lastNameList);
    }

    protected void doSetLastName_InScope(Collection<String> lastNameList) {
        regINS(CK_INS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastNameList The collection of lastName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotInScope(Collection<String> lastNameList) {
        doSetLastName_NotInScope(lastNameList);
    }

    protected void doSetLastName_NotInScope(Collection<String> lastNameList) {
        regINS(CK_NINS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lastName The value of lastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_LikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_LikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastName The value of lastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLastName_LikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_NotLikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_NotLikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_name: {NotNull, VARCHAR(255)}
     * @param lastName The value of lastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLastName_NotLikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    protected void regLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastName(), "last_name"); }
    protected abstract ConditionValue xgetCValueLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_Equal(String firstName) {
        doSetFirstName_Equal(fRES(firstName));
    }

    protected void doSetFirstName_Equal(String firstName) {
        regFirstName(CK_EQ, firstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotEqual(String firstName) {
        doSetFirstName_NotEqual(fRES(firstName));
    }

    protected void doSetFirstName_NotEqual(String firstName) {
        regFirstName(CK_NES, firstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterThan(String firstName) {
        regFirstName(CK_GT, fRES(firstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessThan(String firstName) {
        regFirstName(CK_LT, fRES(firstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterEqual(String firstName) {
        regFirstName(CK_GE, fRES(firstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessEqual(String firstName) {
        regFirstName(CK_LE, fRES(firstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstNameList The collection of firstName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_InScope(Collection<String> firstNameList) {
        doSetFirstName_InScope(firstNameList);
    }

    protected void doSetFirstName_InScope(Collection<String> firstNameList) {
        regINS(CK_INS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstNameList The collection of firstName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotInScope(Collection<String> firstNameList) {
        doSetFirstName_NotInScope(firstNameList);
    }

    protected void doSetFirstName_NotInScope(Collection<String> firstNameList) {
        regINS(CK_NINS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstName The value of firstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_LikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_LikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstName The value of firstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstName_LikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_NotLikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_NotLikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_name: {NotNull, VARCHAR(255)}
     * @param firstName The value of firstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstName_NotLikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    protected void regFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstName(), "first_name"); }
    protected abstract ConditionValue xgetCValueFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_Equal(String lastKana) {
        doSetLastKana_Equal(fRES(lastKana));
    }

    protected void doSetLastKana_Equal(String lastKana) {
        regLastKana(CK_EQ, lastKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_NotEqual(String lastKana) {
        doSetLastKana_NotEqual(fRES(lastKana));
    }

    protected void doSetLastKana_NotEqual(String lastKana) {
        regLastKana(CK_NES, lastKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_GreaterThan(String lastKana) {
        regLastKana(CK_GT, fRES(lastKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_LessThan(String lastKana) {
        regLastKana(CK_LT, fRES(lastKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_GreaterEqual(String lastKana) {
        regLastKana(CK_GE, fRES(lastKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_LessEqual(String lastKana) {
        regLastKana(CK_LE, fRES(lastKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKanaList The collection of lastKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_InScope(Collection<String> lastKanaList) {
        doSetLastKana_InScope(lastKanaList);
    }

    protected void doSetLastKana_InScope(Collection<String> lastKanaList) {
        regINS(CK_INS, cTL(lastKanaList), xgetCValueLastKana(), "last_kana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKanaList The collection of lastKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastKana_NotInScope(Collection<String> lastKanaList) {
        doSetLastKana_NotInScope(lastKanaList);
    }

    protected void doSetLastKana_NotInScope(Collection<String> lastKanaList) {
        regINS(CK_NINS, cTL(lastKanaList), xgetCValueLastKana(), "last_kana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setLastKana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lastKana The value of lastKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastKana_LikeSearch(String lastKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastKana_LikeSearch(lastKana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setLastKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastKana The value of lastKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLastKana_LikeSearch(String lastKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastKana), xgetCValueLastKana(), "last_kana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastKana_NotLikeSearch(String lastKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastKana_NotLikeSearch(lastKana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * last_kana: {NotNull, VARCHAR(255)}
     * @param lastKana The value of lastKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLastKana_NotLikeSearch(String lastKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastKana), xgetCValueLastKana(), "last_kana", likeSearchOption);
    }

    protected void regLastKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastKana(), "last_kana"); }
    protected abstract ConditionValue xgetCValueLastKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_Equal(String firstKana) {
        doSetFirstKana_Equal(fRES(firstKana));
    }

    protected void doSetFirstKana_Equal(String firstKana) {
        regFirstKana(CK_EQ, firstKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_NotEqual(String firstKana) {
        doSetFirstKana_NotEqual(fRES(firstKana));
    }

    protected void doSetFirstKana_NotEqual(String firstKana) {
        regFirstKana(CK_NES, firstKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_GreaterThan(String firstKana) {
        regFirstKana(CK_GT, fRES(firstKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_LessThan(String firstKana) {
        regFirstKana(CK_LT, fRES(firstKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_GreaterEqual(String firstKana) {
        regFirstKana(CK_GE, fRES(firstKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_LessEqual(String firstKana) {
        regFirstKana(CK_LE, fRES(firstKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKanaList The collection of firstKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_InScope(Collection<String> firstKanaList) {
        doSetFirstKana_InScope(firstKanaList);
    }

    protected void doSetFirstKana_InScope(Collection<String> firstKanaList) {
        regINS(CK_INS, cTL(firstKanaList), xgetCValueFirstKana(), "first_kana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKanaList The collection of firstKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstKana_NotInScope(Collection<String> firstKanaList) {
        doSetFirstKana_NotInScope(firstKanaList);
    }

    protected void doSetFirstKana_NotInScope(Collection<String> firstKanaList) {
        regINS(CK_NINS, cTL(firstKanaList), xgetCValueFirstKana(), "first_kana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setFirstKana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstKana The value of firstKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstKana_LikeSearch(String firstKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstKana_LikeSearch(firstKana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setFirstKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstKana The value of firstKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstKana_LikeSearch(String firstKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstKana), xgetCValueFirstKana(), "first_kana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstKana_NotLikeSearch(String firstKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstKana_NotLikeSearch(firstKana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * first_kana: {NotNull, VARCHAR(255)}
     * @param firstKana The value of firstKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstKana_NotLikeSearch(String firstKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstKana), xgetCValueFirstKana(), "first_kana", likeSearchOption);
    }

    protected void regFirstKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstKana(), "first_kana"); }
    protected abstract ConditionValue xgetCValueFirstKana();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_Equal(Integer gender) {
        doSetGender_Equal(gender);
    }

    protected void doSetGender_Equal(Integer gender) {
        regGender(CK_EQ, gender);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_NotEqual(Integer gender) {
        doSetGender_NotEqual(gender);
    }

    protected void doSetGender_NotEqual(Integer gender) {
        regGender(CK_NES, gender);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_GreaterThan(Integer gender) {
        regGender(CK_GT, gender);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_LessThan(Integer gender) {
        regGender(CK_LT, gender);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_GreaterEqual(Integer gender) {
        regGender(CK_GE, gender);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param gender The value of gender as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGender_LessEqual(Integer gender) {
        regGender(CK_LE, gender);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gender. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gender. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGender_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGender_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of gender. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gender. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGender_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGender(), "gender", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param genderList The collection of gender as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGender_InScope(Collection<Integer> genderList) {
        doSetGender_InScope(genderList);
    }

    protected void doSetGender_InScope(Collection<Integer> genderList) {
        regINS(CK_INS, cTL(genderList), xgetCValueGender(), "gender");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * gender: {NotNull, INT UNSIGNED(10)}
     * @param genderList The collection of gender as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGender_NotInScope(Collection<Integer> genderList) {
        doSetGender_NotInScope(genderList);
    }

    protected void doSetGender_NotInScope(Collection<Integer> genderList) {
        regINS(CK_NINS, cTL(genderList), xgetCValueGender(), "gender");
    }

    protected void regGender(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGender(), "gender"); }
    protected abstract ConditionValue xgetCValueGender();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @param birthday The value of birthday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_Equal(java.time.LocalDateTime birthday) {
        regBirthday(CK_EQ,  birthday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @param birthday The value of birthday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterThan(java.time.LocalDateTime birthday) {
        regBirthday(CK_GT,  birthday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @param birthday The value of birthday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessThan(java.time.LocalDateTime birthday) {
        regBirthday(CK_LT,  birthday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @param birthday The value of birthday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterEqual(java.time.LocalDateTime birthday) {
        regBirthday(CK_GE,  birthday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * @param birthday The value of birthday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessEqual(java.time.LocalDateTime birthday) {
        regBirthday(CK_LE, birthday);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthday_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthday_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {NotNull, DATETIME(19)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBirthday_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "birthday"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthday(), nm, op);
    }

    protected void regBirthday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthday(), "birthday"); }
    protected abstract ConditionValue xgetCValueBirthday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_Equal(String postCode) {
        doSetPostCode_Equal(fRES(postCode));
    }

    protected void doSetPostCode_Equal(String postCode) {
        regPostCode(CK_EQ, postCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotEqual(String postCode) {
        doSetPostCode_NotEqual(fRES(postCode));
    }

    protected void doSetPostCode_NotEqual(String postCode) {
        regPostCode(CK_NES, postCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterThan(String postCode) {
        regPostCode(CK_GT, fRES(postCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessThan(String postCode) {
        regPostCode(CK_LT, fRES(postCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterEqual(String postCode) {
        regPostCode(CK_GE, fRES(postCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessEqual(String postCode) {
        regPostCode(CK_LE, fRES(postCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCodeList The collection of postCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_InScope(Collection<String> postCodeList) {
        doSetPostCode_InScope(postCodeList);
    }

    protected void doSetPostCode_InScope(Collection<String> postCodeList) {
        regINS(CK_INS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCodeList The collection of postCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotInScope(Collection<String> postCodeList) {
        doSetPostCode_NotInScope(postCodeList);
    }

    protected void doSetPostCode_NotInScope(Collection<String> postCodeList) {
        regINS(CK_NINS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_LikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_LikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPostCode_LikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_NotLikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_NotLikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, VARCHAR(255)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPostCode_NotLikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    protected void regPostCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostCode(), "post_code"); }
    protected abstract ConditionValue xgetCValuePostCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_Equal(Integer prefId) {
        doSetPrefId_Equal(prefId);
    }

    protected void doSetPrefId_Equal(Integer prefId) {
        regPrefId(CK_EQ, prefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_NotEqual(Integer prefId) {
        doSetPrefId_NotEqual(prefId);
    }

    protected void doSetPrefId_NotEqual(Integer prefId) {
        regPrefId(CK_NES, prefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_GreaterThan(Integer prefId) {
        regPrefId(CK_GT, prefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_LessThan(Integer prefId) {
        regPrefId(CK_LT, prefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_GreaterEqual(Integer prefId) {
        regPrefId(CK_GE, prefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefId The value of prefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrefId_LessEqual(Integer prefId) {
        regPrefId(CK_LE, prefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param minNumber The min number of prefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPrefId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPrefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param minNumber The min number of prefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPrefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrefId(), "pref_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefIdList The collection of prefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefId_InScope(Collection<Integer> prefIdList) {
        doSetPrefId_InScope(prefIdList);
    }

    protected void doSetPrefId_InScope(Collection<Integer> prefIdList) {
        regINS(CK_INS, cTL(prefIdList), xgetCValuePrefId(), "pref_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @param prefIdList The collection of prefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefId_NotInScope(Collection<Integer> prefIdList) {
        doSetPrefId_NotInScope(prefIdList);
    }

    protected void doSetPrefId_NotInScope(Collection<Integer> prefIdList) {
        regINS(CK_NINS, cTL(prefIdList), xgetCValuePrefId(), "pref_id");
    }

    protected void regPrefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefId(), "pref_id"); }
    protected abstract ConditionValue xgetCValuePrefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_Equal(String address) {
        doSetAddress_Equal(fRES(address));
    }

    protected void doSetAddress_Equal(String address) {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotEqual(String address) {
        doSetAddress_NotEqual(fRES(address));
    }

    protected void doSetAddress_NotEqual(String address) {
        regAddress(CK_NES, address);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterThan(String address) {
        regAddress(CK_GT, fRES(address));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessThan(String address) {
        regAddress(CK_LT, fRES(address));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterEqual(String address) {
        regAddress(CK_GE, fRES(address));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessEqual(String address) {
        regAddress(CK_LE, fRES(address));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param addressList The collection of address as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_InScope(Collection<String> addressList) {
        doSetAddress_InScope(addressList);
    }

    protected void doSetAddress_InScope(Collection<String> addressList) {
        regINS(CK_INS, cTL(addressList), xgetCValueAddress(), "address");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param addressList The collection of address as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotInScope(Collection<String> addressList) {
        doSetAddress_NotInScope(addressList);
    }

    protected void doSetAddress_NotInScope(Collection<String> addressList) {
        regINS(CK_NINS, cTL(addressList), xgetCValueAddress(), "address");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_LikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_LikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAddress_LikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address), xgetCValueAddress(), "address", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_NotLikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_NotLikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, VARCHAR(255)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAddress_NotLikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address), xgetCValueAddress(), "address", likeSearchOption);
    }

    protected void regAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress(), "address"); }
    protected abstract ConditionValue xgetCValueAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_Equal(String building) {
        doSetBuilding_Equal(fRES(building));
    }

    protected void doSetBuilding_Equal(String building) {
        regBuilding(CK_EQ, building);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_NotEqual(String building) {
        doSetBuilding_NotEqual(fRES(building));
    }

    protected void doSetBuilding_NotEqual(String building) {
        regBuilding(CK_NES, building);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_GreaterThan(String building) {
        regBuilding(CK_GT, fRES(building));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_LessThan(String building) {
        regBuilding(CK_LT, fRES(building));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_GreaterEqual(String building) {
        regBuilding(CK_GE, fRES(building));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_LessEqual(String building) {
        regBuilding(CK_LE, fRES(building));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)}
     * @param buildingList The collection of building as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_InScope(Collection<String> buildingList) {
        doSetBuilding_InScope(buildingList);
    }

    protected void doSetBuilding_InScope(Collection<String> buildingList) {
        regINS(CK_INS, cTL(buildingList), xgetCValueBuilding(), "building");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)}
     * @param buildingList The collection of building as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBuilding_NotInScope(Collection<String> buildingList) {
        doSetBuilding_NotInScope(buildingList);
    }

    protected void doSetBuilding_NotInScope(Collection<String> buildingList) {
        regINS(CK_NINS, cTL(buildingList), xgetCValueBuilding(), "building");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)} <br>
     * <pre>e.g. setBuilding_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param building The value of building as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBuilding_LikeSearch(String building, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBuilding_LikeSearch(building, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)} <br>
     * <pre>e.g. setBuilding_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param building The value of building as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBuilding_LikeSearch(String building, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(building), xgetCValueBuilding(), "building", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBuilding_NotLikeSearch(String building, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBuilding_NotLikeSearch(building, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * building: {VARCHAR(255)}
     * @param building The value of building as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBuilding_NotLikeSearch(String building, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(building), xgetCValueBuilding(), "building", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     */
    public void setBuilding_IsNull() { regBuilding(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     */
    public void setBuilding_IsNullOrEmpty() { regBuilding(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * building: {VARCHAR(255)}
     */
    public void setBuilding_IsNotNull() { regBuilding(CK_ISNN, DOBJ); }

    protected void regBuilding(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBuilding(), "building"); }
    protected abstract ConditionValue xgetCValueBuilding();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_Equal(String tel) {
        doSetTel_Equal(fRES(tel));
    }

    protected void doSetTel_Equal(String tel) {
        regTel(CK_EQ, tel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_NotEqual(String tel) {
        doSetTel_NotEqual(fRES(tel));
    }

    protected void doSetTel_NotEqual(String tel) {
        regTel(CK_NES, tel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_GreaterThan(String tel) {
        regTel(CK_GT, fRES(tel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_LessThan(String tel) {
        regTel(CK_LT, fRES(tel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_GreaterEqual(String tel) {
        regTel(CK_GE, fRES(tel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_LessEqual(String tel) {
        regTel(CK_LE, fRES(tel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param telList The collection of tel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_InScope(Collection<String> telList) {
        doSetTel_InScope(telList);
    }

    protected void doSetTel_InScope(Collection<String> telList) {
        regINS(CK_INS, cTL(telList), xgetCValueTel(), "tel");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param telList The collection of tel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTel_NotInScope(Collection<String> telList) {
        doSetTel_NotInScope(telList);
    }

    protected void doSetTel_NotInScope(Collection<String> telList) {
        regINS(CK_NINS, cTL(telList), xgetCValueTel(), "tel");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTel_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tel The value of tel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTel_LikeSearch(String tel, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTel_LikeSearch(tel, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tel The value of tel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTel_LikeSearch(String tel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tel), xgetCValueTel(), "tel", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTel_NotLikeSearch(String tel, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTel_NotLikeSearch(tel, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * tel: {NotNull, VARCHAR(255)}
     * @param tel The value of tel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTel_NotLikeSearch(String tel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tel), xgetCValueTel(), "tel", likeSearchOption);
    }

    protected void regTel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTel(), "tel"); }
    protected abstract ConditionValue xgetCValueTel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_Equal(String mobile) {
        doSetMobile_Equal(fRES(mobile));
    }

    protected void doSetMobile_Equal(String mobile) {
        regMobile(CK_EQ, mobile);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_NotEqual(String mobile) {
        doSetMobile_NotEqual(fRES(mobile));
    }

    protected void doSetMobile_NotEqual(String mobile) {
        regMobile(CK_NES, mobile);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_GreaterThan(String mobile) {
        regMobile(CK_GT, fRES(mobile));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_LessThan(String mobile) {
        regMobile(CK_LT, fRES(mobile));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_GreaterEqual(String mobile) {
        regMobile(CK_GE, fRES(mobile));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_LessEqual(String mobile) {
        regMobile(CK_LE, fRES(mobile));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobileList The collection of mobile as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_InScope(Collection<String> mobileList) {
        doSetMobile_InScope(mobileList);
    }

    protected void doSetMobile_InScope(Collection<String> mobileList) {
        regINS(CK_INS, cTL(mobileList), xgetCValueMobile(), "mobile");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobileList The collection of mobile as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMobile_NotInScope(Collection<String> mobileList) {
        doSetMobile_NotInScope(mobileList);
    }

    protected void doSetMobile_NotInScope(Collection<String> mobileList) {
        regINS(CK_NINS, cTL(mobileList), xgetCValueMobile(), "mobile");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMobile_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mobile The value of mobile as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMobile_LikeSearch(String mobile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMobile_LikeSearch(mobile, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMobile_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mobile The value of mobile as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMobile_LikeSearch(String mobile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mobile), xgetCValueMobile(), "mobile", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMobile_NotLikeSearch(String mobile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMobile_NotLikeSearch(mobile, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mobile: {NotNull, VARCHAR(255)}
     * @param mobile The value of mobile as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMobile_NotLikeSearch(String mobile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mobile), xgetCValueMobile(), "mobile", likeSearchOption);
    }

    protected void regMobile(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMobile(), "mobile"); }
    protected abstract ConditionValue xgetCValueMobile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param emailList The collection of email as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    protected void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), xgetCValueEmail(), "email");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param emailList The collection of email as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    protected void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), xgetCValueEmail(), "email");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_LikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), xgetCValueEmail(), "email", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_NotLikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * email: {UQ, NotNull, VARCHAR(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "email", likeSearchOption);
    }

    protected void regEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail(), "email"); }
    protected abstract ConditionValue xgetCValueEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_Equal(String remarks) {
        doSetRemarks_Equal(fRES(remarks));
    }

    protected void doSetRemarks_Equal(String remarks) {
        regRemarks(CK_EQ, remarks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotEqual(String remarks) {
        doSetRemarks_NotEqual(fRES(remarks));
    }

    protected void doSetRemarks_NotEqual(String remarks) {
        regRemarks(CK_NES, remarks);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterThan(String remarks) {
        regRemarks(CK_GT, fRES(remarks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessThan(String remarks) {
        regRemarks(CK_LT, fRES(remarks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterEqual(String remarks) {
        regRemarks(CK_GE, fRES(remarks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessEqual(String remarks) {
        regRemarks(CK_LE, fRES(remarks));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarksList The collection of remarks as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_InScope(Collection<String> remarksList) {
        doSetRemarks_InScope(remarksList);
    }

    protected void doSetRemarks_InScope(Collection<String> remarksList) {
        regINS(CK_INS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarksList The collection of remarks as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotInScope(Collection<String> remarksList) {
        doSetRemarks_NotInScope(remarksList);
    }

    protected void doSetRemarks_NotInScope(Collection<String> remarksList) {
        regINS(CK_NINS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_LikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_LikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRemarks_LikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_NotLikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_NotLikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {TEXT(65535)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRemarks_NotLikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     */
    public void setRemarks_IsNull() { regRemarks(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     */
    public void setRemarks_IsNullOrEmpty() { regRemarks(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * remarks: {TEXT(65535)}
     */
    public void setRemarks_IsNotNull() { regRemarks(CK_ISNN, DOBJ); }

    protected void regRemarks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemarks(), "remarks"); }
    protected abstract ConditionValue xgetCValueRemarks();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_Equal(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_EQ,  createdAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GT,  createdAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LT,  createdAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GE,  createdAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LE, createdAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "created_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedAt(), nm, op);
    }

    protected void regCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedAt(), "created_at"); }
    protected abstract ConditionValue xgetCValueCreatedAt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param updatedAt The value of updatedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_Equal(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_EQ,  updatedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param updatedAt The value of updatedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_GreaterThan(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_GT,  updatedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param updatedAt The value of updatedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_LessThan(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_LT,  updatedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param updatedAt The value of updatedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_GreaterEqual(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_GE,  updatedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param updatedAt The value of updatedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedAt_LessEqual(java.time.LocalDateTime updatedAt) {
        regUpdatedAt(CK_LE, updatedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setUpdatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setUpdatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "updated_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedAt(), nm, op);
    }

    protected void regUpdatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedAt(), "updated_at"); }
    protected abstract ConditionValue xgetCValueUpdatedAt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @param deletedAt The value of deletedAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeletedAt_Equal(java.time.LocalDateTime deletedAt) {
        regDeletedAt(CK_EQ,  deletedAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @param deletedAt The value of deletedAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeletedAt_GreaterThan(java.time.LocalDateTime deletedAt) {
        regDeletedAt(CK_GT,  deletedAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @param deletedAt The value of deletedAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeletedAt_LessThan(java.time.LocalDateTime deletedAt) {
        regDeletedAt(CK_LT,  deletedAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @param deletedAt The value of deletedAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeletedAt_GreaterEqual(java.time.LocalDateTime deletedAt) {
        regDeletedAt(CK_GE,  deletedAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * @param deletedAt The value of deletedAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeletedAt_LessEqual(java.time.LocalDateTime deletedAt) {
        regDeletedAt(CK_LE, deletedAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * <pre>e.g. setDeletedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDeletedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDeletedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     * <pre>e.g. setDeletedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deletedAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDeletedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "deleted_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDeletedAt(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     */
    public void setDeletedAt_IsNull() { regDeletedAt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * deleted_at: {TIMESTAMP(19)}
     */
    public void setDeletedAt_IsNotNull() { regDeletedAt(CK_ISNN, DOBJ); }

    protected void regDeletedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeletedAt(), "deleted_at"); }
    protected abstract ConditionValue xgetCValueDeletedAt();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CustomerCB&gt;() {
     *     public void query(CustomerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CustomerCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CustomerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CustomerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CustomerCQ sq);

    protected CustomerCB xcreateScalarConditionCB() {
        CustomerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CustomerCB xcreateScalarConditionPartitionByCB() {
        CustomerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CustomerCB cb = new CustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CustomerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CustomerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CustomerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CustomerCB cb = new CustomerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CustomerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CustomerCB cb = new CustomerCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CustomerCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected CustomerCB newMyCB() {
        return new CustomerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CustomerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
