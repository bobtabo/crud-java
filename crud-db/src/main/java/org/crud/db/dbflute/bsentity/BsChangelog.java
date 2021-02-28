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
    protected java.math.BigDecimal _id;

    /** APPLIED_AT: {NotNull, VARCHAR(25)} */
    protected String _appliedAt;

    /** DESCRIPTION: {NotNull, VARCHAR(255)} */
    protected String _description;

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
        if (obj instanceof BsChangelog) {
            BsChangelog other = (BsChangelog)obj;
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
        sb.append(dm).append(xfND(_appliedAt));
        sb.append(dm).append(xfND(_description));
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
        return _id;
    }

    /**
     * [set] ID: {PK, NotNull, DECIMAL(20)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(java.math.BigDecimal id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] APPLIED_AT: {NotNull, VARCHAR(25)} <br>
     * @return The value of the column 'APPLIED_AT'. (basically NotNull if selected: for the constraint)
     */
    public String getAppliedAt() {
        checkSpecifiedProperty("appliedAt");
        return _appliedAt;
    }

    /**
     * [set] APPLIED_AT: {NotNull, VARCHAR(25)} <br>
     * @param appliedAt The value of the column 'APPLIED_AT'. (basically NotNull if update: for the constraint)
     */
    public void setAppliedAt(String appliedAt) {
        registerModifiedProperty("appliedAt");
        _appliedAt = appliedAt;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR(255)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }
}
