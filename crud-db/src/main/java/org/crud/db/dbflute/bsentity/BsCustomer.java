package org.crud.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.crud.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.crud.db.dbflute.exentity.*;

/**
 * The entity of customer as TABLE. <br>
 * 顧客
 * <pre>
 * [primary-key]
 *     id
 *
 * [column]
 *     id, last_name, first_name, last_kana, first_kana, gender, birthday, post_code, pref_id, address, building, tel, mobile, email, remarks, created_at, updated_at, deleted_at
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
 *     pref
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pref
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String lastName = entity.getLastName();
 * String firstName = entity.getFirstName();
 * String lastKana = entity.getLastKana();
 * String firstKana = entity.getFirstKana();
 * Integer gender = entity.getGender();
 * java.time.LocalDateTime birthday = entity.getBirthday();
 * String postCode = entity.getPostCode();
 * Integer prefId = entity.getPrefId();
 * String address = entity.getAddress();
 * String building = entity.getBuilding();
 * String tel = entity.getTel();
 * String mobile = entity.getMobile();
 * String email = entity.getEmail();
 * String remarks = entity.getRemarks();
 * java.time.LocalDateTime createdAt = entity.getCreatedAt();
 * java.time.LocalDateTime updatedAt = entity.getUpdatedAt();
 * java.time.LocalDateTime deletedAt = entity.getDeletedAt();
 * entity.setId(id);
 * entity.setLastName(lastName);
 * entity.setFirstName(firstName);
 * entity.setLastKana(lastKana);
 * entity.setFirstKana(firstKana);
 * entity.setGender(gender);
 * entity.setBirthday(birthday);
 * entity.setPostCode(postCode);
 * entity.setPrefId(prefId);
 * entity.setAddress(address);
 * entity.setBuilding(building);
 * entity.setTel(tel);
 * entity.setMobile(mobile);
 * entity.setEmail(email);
 * entity.setRemarks(remarks);
 * entity.setCreatedAt(createdAt);
 * entity.setUpdatedAt(updatedAt);
 * entity.setDeletedAt(deletedAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCustomer extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long id;

    /** last_name: {NotNull, VARCHAR(255)} */
    protected String lastName;

    /** first_name: {NotNull, VARCHAR(255)} */
    protected String firstName;

    /** last_kana: {NotNull, VARCHAR(255)} */
    protected String lastKana;

    /** first_kana: {NotNull, VARCHAR(255)} */
    protected String firstKana;

    /** gender: {NotNull, INT UNSIGNED(10)} */
    protected Integer gender;

    /** birthday: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime birthday;

    /** post_code: {NotNull, VARCHAR(255)} */
    protected String postCode;

    /** pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref} */
    protected Integer prefId;

    /** address: {NotNull, VARCHAR(255)} */
    protected String address;

    /** building: {VARCHAR(255)} */
    protected String building;

    /** tel: {NotNull, VARCHAR(255)} */
    protected String tel;

    /** mobile: {NotNull, VARCHAR(255)} */
    protected String mobile;

    /** email: {UQ, NotNull, VARCHAR(255)} */
    protected String email;

    /** remarks: {TEXT(65535)} */
    protected String remarks;

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
        return "customer";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (this.id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param email : UQ, NotNull, VARCHAR(255). (NotNull)
     */
    public void uniqueBy(String email) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("email");
        setEmail(email);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** pref by my pref_id, named 'pref'. */
    protected OptionalEntity<Pref> pref;

    /**
     * [get] pref by my pref_id, named 'pref'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'pref'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Pref> getPref() {
        if (this.pref == null) { pref = OptionalEntity.relationEmpty(this, "pref"); }
        return this.pref;
    }

    /**
     * [set] pref by my pref_id, named 'pref'.
     * @param pref The entity of foreign property 'pref'. (NullAllowed)
     */
    public void setPref(OptionalEntity<Pref> pref) {
        this.pref = pref;
    }

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
        if (obj instanceof BsCustomer) {
            BsCustomer other = (BsCustomer)obj;
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
        if (this.pref != null && pref.isPresent())
        { sb.append(li).append(xbRDS(this.pref, "pref")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(this.id));
        sb.append(dm).append(xfND(this.lastName));
        sb.append(dm).append(xfND(this.firstName));
        sb.append(dm).append(xfND(this.lastKana));
        sb.append(dm).append(xfND(this.firstKana));
        sb.append(dm).append(xfND(this.gender));
        sb.append(dm).append(xfND(this.birthday));
        sb.append(dm).append(xfND(this.postCode));
        sb.append(dm).append(xfND(this.prefId));
        sb.append(dm).append(xfND(this.address));
        sb.append(dm).append(xfND(this.building));
        sb.append(dm).append(xfND(this.tel));
        sb.append(dm).append(xfND(this.mobile));
        sb.append(dm).append(xfND(this.email));
        sb.append(dm).append(xfND(this.remarks));
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
        if (this.pref != null && pref.isPresent())
        { sb.append(dm).append("pref"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Customer clone() {
        return (Customer)super.clone();
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
        return this.id;
    }

    /**
     * [set] id: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * ID
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        this.id = id;
    }

    /**
     * [get] last_name: {NotNull, VARCHAR(255)} <br>
     * 姓
     * @return The value of the column 'last_name'. (basically NotNull if selected: for the constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return this.lastName;
    }

    /**
     * [set] last_name: {NotNull, VARCHAR(255)} <br>
     * 姓
     * @param lastName The value of the column 'last_name'. (basically NotNull if update: for the constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        this.lastName = lastName;
    }

    /**
     * [get] first_name: {NotNull, VARCHAR(255)} <br>
     * 名
     * @return The value of the column 'first_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return this.firstName;
    }

    /**
     * [set] first_name: {NotNull, VARCHAR(255)} <br>
     * 名
     * @param firstName The value of the column 'first_name'. (basically NotNull if update: for the constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        this.firstName = firstName;
    }

    /**
     * [get] last_kana: {NotNull, VARCHAR(255)} <br>
     * 姓かな
     * @return The value of the column 'last_kana'. (basically NotNull if selected: for the constraint)
     */
    public String getLastKana() {
        checkSpecifiedProperty("lastKana");
        return this.lastKana;
    }

    /**
     * [set] last_kana: {NotNull, VARCHAR(255)} <br>
     * 姓かな
     * @param lastKana The value of the column 'last_kana'. (basically NotNull if update: for the constraint)
     */
    public void setLastKana(String lastKana) {
        registerModifiedProperty("lastKana");
        this.lastKana = lastKana;
    }

    /**
     * [get] first_kana: {NotNull, VARCHAR(255)} <br>
     * 名かな
     * @return The value of the column 'first_kana'. (basically NotNull if selected: for the constraint)
     */
    public String getFirstKana() {
        checkSpecifiedProperty("firstKana");
        return this.firstKana;
    }

    /**
     * [set] first_kana: {NotNull, VARCHAR(255)} <br>
     * 名かな
     * @param firstKana The value of the column 'first_kana'. (basically NotNull if update: for the constraint)
     */
    public void setFirstKana(String firstKana) {
        registerModifiedProperty("firstKana");
        this.firstKana = firstKana;
    }

    /**
     * [get] gender: {NotNull, INT UNSIGNED(10)} <br>
     * 性別
     * @return The value of the column 'gender'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGender() {
        checkSpecifiedProperty("gender");
        return this.gender;
    }

    /**
     * [set] gender: {NotNull, INT UNSIGNED(10)} <br>
     * 性別
     * @param gender The value of the column 'gender'. (basically NotNull if update: for the constraint)
     */
    public void setGender(Integer gender) {
        registerModifiedProperty("gender");
        this.gender = gender;
    }

    /**
     * [get] birthday: {NotNull, DATETIME(19)} <br>
     * 生年月日
     * @return The value of the column 'birthday'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getBirthday() {
        checkSpecifiedProperty("birthday");
        return this.birthday;
    }

    /**
     * [set] birthday: {NotNull, DATETIME(19)} <br>
     * 生年月日
     * @param birthday The value of the column 'birthday'. (basically NotNull if update: for the constraint)
     */
    public void setBirthday(java.time.LocalDateTime birthday) {
        registerModifiedProperty("birthday");
        this.birthday = birthday;
    }

    /**
     * [get] post_code: {NotNull, VARCHAR(255)} <br>
     * 郵便番号
     * @return The value of the column 'post_code'. (basically NotNull if selected: for the constraint)
     */
    public String getPostCode() {
        checkSpecifiedProperty("postCode");
        return this.postCode;
    }

    /**
     * [set] post_code: {NotNull, VARCHAR(255)} <br>
     * 郵便番号
     * @param postCode The value of the column 'post_code'. (basically NotNull if update: for the constraint)
     */
    public void setPostCode(String postCode) {
        registerModifiedProperty("postCode");
        this.postCode = postCode;
    }

    /**
     * [get] pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref} <br>
     * 都道府県ID
     * @return The value of the column 'pref_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPrefId() {
        checkSpecifiedProperty("prefId");
        return this.prefId;
    }

    /**
     * [set] pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref} <br>
     * 都道府県ID
     * @param prefId The value of the column 'pref_id'. (basically NotNull if update: for the constraint)
     */
    public void setPrefId(Integer prefId) {
        registerModifiedProperty("prefId");
        this.prefId = prefId;
    }

    /**
     * [get] address: {NotNull, VARCHAR(255)} <br>
     * 住所
     * @return The value of the column 'address'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return this.address;
    }

    /**
     * [set] address: {NotNull, VARCHAR(255)} <br>
     * 住所
     * @param address The value of the column 'address'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        this.address = address;
    }

    /**
     * [get] building: {VARCHAR(255)} <br>
     * 建物名
     * @return The value of the column 'building'. (NullAllowed even if selected: for no constraint)
     */
    public String getBuilding() {
        checkSpecifiedProperty("building");
        return this.building;
    }

    /**
     * [set] building: {VARCHAR(255)} <br>
     * 建物名
     * @param building The value of the column 'building'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBuilding(String building) {
        registerModifiedProperty("building");
        this.building = building;
    }

    /**
     * [get] tel: {NotNull, VARCHAR(255)} <br>
     * 電話番号
     * @return The value of the column 'tel'. (basically NotNull if selected: for the constraint)
     */
    public String getTel() {
        checkSpecifiedProperty("tel");
        return this.tel;
    }

    /**
     * [set] tel: {NotNull, VARCHAR(255)} <br>
     * 電話番号
     * @param tel The value of the column 'tel'. (basically NotNull if update: for the constraint)
     */
    public void setTel(String tel) {
        registerModifiedProperty("tel");
        this.tel = tel;
    }

    /**
     * [get] mobile: {NotNull, VARCHAR(255)} <br>
     * 携帯番号
     * @return The value of the column 'mobile'. (basically NotNull if selected: for the constraint)
     */
    public String getMobile() {
        checkSpecifiedProperty("mobile");
        return this.mobile;
    }

    /**
     * [set] mobile: {NotNull, VARCHAR(255)} <br>
     * 携帯番号
     * @param mobile The value of the column 'mobile'. (basically NotNull if update: for the constraint)
     */
    public void setMobile(String mobile) {
        registerModifiedProperty("mobile");
        this.mobile = mobile;
    }

    /**
     * [get] email: {UQ, NotNull, VARCHAR(255)} <br>
     * メールアドレス
     * @return The value of the column 'email'. (basically NotNull if selected: for the constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return this.email;
    }

    /**
     * [set] email: {UQ, NotNull, VARCHAR(255)} <br>
     * メールアドレス
     * @param email The value of the column 'email'. (basically NotNull if update: for the constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        this.email = email;
    }

    /**
     * [get] remarks: {TEXT(65535)} <br>
     * 備考
     * @return The value of the column 'remarks'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemarks() {
        checkSpecifiedProperty("remarks");
        return this.remarks;
    }

    /**
     * [set] remarks: {TEXT(65535)} <br>
     * 備考
     * @param remarks The value of the column 'remarks'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemarks(String remarks) {
        registerModifiedProperty("remarks");
        this.remarks = remarks;
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
