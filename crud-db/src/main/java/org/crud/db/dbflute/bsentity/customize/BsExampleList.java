package org.crud.db.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.crud.db.dbflute.exentity.customize.*;

/**
 * The entity of ExampleList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     id, token, user_name
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String token = entity.getToken();
 * String userName = entity.getUserName();
 * entity.setId(id);
 * entity.setToken(token);
 * entity.setUserName(userName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsExampleList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {BIGINT UNSIGNED(20), refers to user.id} */
    protected Long _id;

    /** token: {VARCHAR(255), refers to user.token} */
    protected String _token;

    /** user_name: {VARCHAR(2)} */
    protected String _userName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.crud.db.dbflute.bsentity.customize.dbmeta.ExampleListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ExampleList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsExampleList) {
            BsExampleList other = (BsExampleList)obj;
            if (!xSV(_id, other._id)) { return false; }
            if (!xSV(_token, other._token)) { return false; }
            if (!xSV(_userName, other._userName)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        hs = xCH(hs, _token);
        hs = xCH(hs, _userName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_token));
        sb.append(dm).append(xfND(_userName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public ExampleList clone() {
        return (ExampleList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {BIGINT UNSIGNED(20), refers to user.id} <br>
     * ID
     * @return The value of the column 'id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {BIGINT UNSIGNED(20), refers to user.id} <br>
     * ID
     * @param id The value of the column 'id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] token: {VARCHAR(255), refers to user.token} <br>
     * ログイントークン
     * @return The value of the column 'token'. (NullAllowed even if selected: for no constraint)
     */
    public String getToken() {
        checkSpecifiedProperty("token");
        return _token;
    }

    /**
     * [set] token: {VARCHAR(255), refers to user.token} <br>
     * ログイントークン
     * @param token The value of the column 'token'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToken(String token) {
        registerModifiedProperty("token");
        _token = token;
    }

    /**
     * [get] user_name: {VARCHAR(2)} <br>
     * @return The value of the column 'user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] user_name: {VARCHAR(2)} <br>
     * @param userName The value of the column 'user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }
}
