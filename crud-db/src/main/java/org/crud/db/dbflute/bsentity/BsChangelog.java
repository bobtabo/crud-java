package org.crud.db.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.crud.db.dbflute.allcommon.DBMetaInstanceHandler;
import org.crud.db.dbflute.exentity.*;

/**
 * The entity of CHANGELOG as TABLE. <br>
 * 変更ログ
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal id = entity.getId();
 * String appliedAt = entity.getAppliedAt();
 * String description = entity.getDescription();
 * entity.setId(id);
 * entity.setAppliedAt(appliedAt);
 * entity.setDescription(description);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsChangelog extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, NotNull, DECIMAL(20)} */
    protected java.math.BigDecimal id;

    /** APPLIED_AT: {NotNull, VARCHAR(25)} */
    protected String appliedAt;

    /** DESCRIPTION: {NotNull, VARCHAR(255)} */
    protected String description;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "CHANGELOG";
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsChangelog) {
            BsChangelog other = (BsChangelog)obj;
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
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(this.id));
        sb.append(dm).append(xfND(this.appliedAt));
        sb.append(dm).append(xfND(this.description));
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
    public Changelog clone() {
        return (Changelog)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, NotNull, DECIMAL(20)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getId() {
        checkSpecifiedProperty("id");
        return this.id;
    }

    /**
     * [set] ID: {PK, NotNull, DECIMAL(20)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(java.math.BigDecimal id) {
        registerModifiedProperty("id");
        this.id = id;
    }

    /**
     * [get] APPLIED_AT: {NotNull, VARCHAR(25)} <br>
     * @return The value of the column 'APPLIED_AT'. (basically NotNull if selected: for the constraint)
     */
    public String getAppliedAt() {
        checkSpecifiedProperty("appliedAt");
        return this.appliedAt;
    }

    /**
     * [set] APPLIED_AT: {NotNull, VARCHAR(25)} <br>
     * @param appliedAt The value of the column 'APPLIED_AT'. (basically NotNull if update: for the constraint)
     */
    public void setAppliedAt(String appliedAt) {
        registerModifiedProperty("appliedAt");
        this.appliedAt = appliedAt;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return this.description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR(255)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        this.description = description;
    }
}
