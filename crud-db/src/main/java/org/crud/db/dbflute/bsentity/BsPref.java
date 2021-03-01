package org.crud.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.crud.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.crud.db.dbflute.exentity.*;

/**
 * The entity of pref as TABLE. <br>
 * 都道府県
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String name = entity.getName();
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * java.time.LocalDateTime updatedAt = entity.getUpdatedAt();
 * java.time.LocalDateTime deletedAt = entity.getDeletedAt();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setCreatedAt(createdAt);
 * entity.setUpdatedAt(updatedAt);
 * entity.setDeletedAt(deletedAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPref extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, NotNull, INT UNSIGNED(10)} */
    protected Integer id;

    /** name: {NotNull, VARCHAR(128)} */
    protected String name;

    /** created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime createdAt;

    /** updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime updatedAt;

    /** deleted_at: {TIMESTAMP(19)} */
    protected java.time.LocalDateTime deletedAt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "pref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (this.id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** customer by pref_id, named 'customerList'. */
    protected List<Customer> customerList;

    /**
     * [get] customer by pref_id, named 'customerList'.
     * @return The entity list of referrer property 'customerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Customer> getCustomerList() {
        if (this.customerList == null) { this.customerList = newReferrerList(); }
        return this.customerList;
    }

    /**
     * [set] customer by pref_id, named 'customerList'.
     * @param customerList The entity list of referrer property 'customerList'. (NullAllowed)
     */
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPref) {
            BsPref other = (BsPref)obj;
            if (!xSV(this.id, other.id)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (this.customerList != null) { for (Customer et : this.customerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "customerList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(this.id));
        sb.append(dm).append(xfND(this.name));
        sb.append(dm).append(xfND(this.createdAt));
        sb.append(dm).append(xfND(this.updatedAt));
        sb.append(dm).append(xfND(this.deletedAt));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (this.customerList != null && !this.customerList.isEmpty())
        { sb.append(dm).append("customerList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Pref clone() {
        return (Pref)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, NotNull, INT UNSIGNED(10)} <br>
     * ID
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return this.id;
    }

    /**
     * [set] id: {PK, NotNull, INT UNSIGNED(10)} <br>
     * ID
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        this.id = id;
    }

    /**
     * [get] name: {NotNull, VARCHAR(128)} <br>
     * 都道府県名
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return this.name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(128)} <br>
     * 都道府県名
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        this.name = name;
    }

    /**
     * [get] created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @return The value of the column 'created_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return this.createdAt;
    }

    /**
     * [set] created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 作成日時
     * @param createdAt The value of the column 'created_at'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        this.createdAt = createdAt;
    }

    /**
     * [get] updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @return The value of the column 'updated_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedAt() {
        checkSpecifiedProperty("updatedAt");
        return this.updatedAt;
    }

    /**
     * [set] updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * 更新日時
     * @param updatedAt The value of the column 'updated_at'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        registerModifiedProperty("updatedAt");
        this.updatedAt = updatedAt;
    }

    /**
     * [get] deleted_at: {TIMESTAMP(19)} <br>
     * 削除日時
     * @return The value of the column 'deleted_at'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getDeletedAt() {
        checkSpecifiedProperty("deletedAt");
        return this.deletedAt;
    }

    /**
     * [set] deleted_at: {TIMESTAMP(19)} <br>
     * 削除日時
     * @param deletedAt The value of the column 'deleted_at'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedAt(java.time.LocalDateTime deletedAt) {
        registerModifiedProperty("deletedAt");
        this.deletedAt = deletedAt;
    }
}
