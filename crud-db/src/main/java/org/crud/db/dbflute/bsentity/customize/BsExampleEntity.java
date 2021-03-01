package org.crud.db.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.crud.db.dbflute.exentity.customize.*;

/**
 * The entity of ExampleEntity. <br>
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
public abstract class BsExampleEntity extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {BIGINT UNSIGNED(20), refers to user.id} */
    protected Long id;

    /** token: {VARCHAR(255), refers to user.token} */
    protected String token;

    /** user_name: {VARCHAR(2)} */
    protected String userName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.crud.db.dbflute.bsentity.customize.dbmeta.ExampleEntityDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ExampleEntity";
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
        if (obj instanceof BsExampleEntity) {
            BsExampleEntity other = (BsExampleEntity)obj;
            if (!xSV(this.id, other.id)) { return false; }
            if (!xSV(this.token, other.token)) { return false; }
            if (!xSV(this.userName, other.userName)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, this.id);
        hs = xCH(hs, this.token);
        hs = xCH(hs, this.userName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(this.id));
        sb.append(dm).append(xfND(this.token));
        sb.append(dm).append(xfND(this.userName));
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
    public ExampleEntity clone() {
        return (ExampleEntity)super.clone();
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
        return this.id;
    }

    /**
     * [set] id: {BIGINT UNSIGNED(20), refers to user.id} <br>
     * ID
     * @param id The value of the column 'id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        this.id = id;
    }

    /**
     * [get] token: {VARCHAR(255), refers to user.token} <br>
     * ログイントークン
     * @return The value of the column 'token'. (NullAllowed even if selected: for no constraint)
     */
    public String getToken() {
        checkSpecifiedProperty("token");
        return this.token;
    }

    /**
     * [set] token: {VARCHAR(255), refers to user.token} <br>
     * ログイントークン
     * @param token The value of the column 'token'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToken(String token) {
        registerModifiedProperty("token");
        this.token = token;
    }

    /**
     * [get] user_name: {VARCHAR(2)} <br>
     * @return The value of the column 'user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return this.userName;
    }

    /**
     * [set] user_name: {VARCHAR(2)} <br>
     * @param userName The value of the column 'user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        this.userName = userName;
    }
}
