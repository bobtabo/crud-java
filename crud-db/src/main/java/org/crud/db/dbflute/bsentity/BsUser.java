package org.crud.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.crud.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.crud.db.dbflute.exentity.*;

/**
 * The entity of user as TABLE. <br>
 * ユーザー
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, token, created_at, updated_at, deleted_at
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
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * java.time.LocalDateTime updatedAt = entity.getUpdatedAt();
 * java.time.LocalDateTime deletedAt = entity.getDeletedAt();
 * entity.setId(id);
 * entity.setToken(token);
 * entity.setCreatedAt(createdAt);
 * entity.setUpdatedAt(updatedAt);
 * entity.setDeletedAt(deletedAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _id;

    /** token: {VARCHAR(255)} */
    protected String _token;

    /** created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _createdAt;

    /** updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _updatedAt;

    /** deleted_at: {TIMESTAMP(19)} */
    protected java.time.LocalDateTime _deletedAt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
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
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_id, other._id)) { return false; }
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
        sb.append(dm).append(xfND(_createdAt));
        sb.append(dm).append(xfND(_updatedAt));
        sb.append(dm).append(xfND(_deletedAt));
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
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * ID
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * ID
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] token: {VARCHAR(255)} <br>
     * ログイントークン
     * @return The value of the column 'token'. (NullAllowed even if selected: for no constraint)
     */
    public String getToken() {
        checkSpecifiedProperty("token");
        return _token;
    }

    /**
     * [set] token: {VARCHAR(255)} <br>
     * ログイントークン
     * @param token The value of the column 'token'. (NullAllowed: null update allowed for no constraint)
     */
    public void setToken(String token) {
        registerModifiedProperty("token");
        _token = token;
    }

    /**
     * [get] created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @return The value of the column 'created_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return _createdAt;
    }

    /**
     * [set] created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @param createdAt The value of the column 'created_at'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        _createdAt = createdAt;
    }

    /**
     * [get] updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @return The value of the column 'updated_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedAt() {
        checkSpecifiedProperty("updatedAt");
        return _updatedAt;
    }

    /**
     * [set] updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @param updatedAt The value of the column 'updated_at'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        registerModifiedProperty("updatedAt");
        _updatedAt = updatedAt;
    }

    /**
     * [get] deleted_at: {TIMESTAMP(19)} <br>
     * 論理削除実行日時
     * @return The value of the column 'deleted_at'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getDeletedAt() {
        checkSpecifiedProperty("deletedAt");
        return _deletedAt;
    }

    /**
     * [set] deleted_at: {TIMESTAMP(19)} <br>
     * 論理削除実行日時
     * @param deletedAt The value of the column 'deleted_at'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedAt(java.time.LocalDateTime deletedAt) {
        registerModifiedProperty("deletedAt");
        _deletedAt = deletedAt;
    }
}
