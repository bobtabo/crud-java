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
 *     id, pref_name
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
 * Integer id = entity.getId();
 * String prefName = entity.getPrefName();
 * entity.setId(id);
 * entity.setPrefName(prefName);
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
    /** id: {INT UNSIGNED(10), refers to pref.id} */
    protected Integer id;

    /** pref_name: {VARCHAR(2)} */
    protected String prefName;

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
            if (!xSV(this.id, other.id)) { return false; }
            if (!xSV(this.prefName, other.prefName)) { return false; }
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
        hs = xCH(hs, this.prefName);
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
        sb.append(dm).append(xfND(this.prefName));
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
     * [get] id: {INT UNSIGNED(10), refers to pref.id} <br>
     * ID
     * @return The value of the column 'id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return this.id;
    }

    /**
     * [set] id: {INT UNSIGNED(10), refers to pref.id} <br>
     * ID
     * @param id The value of the column 'id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        this.id = id;
    }

    /**
     * [get] pref_name: {VARCHAR(2)} <br>
     * @return The value of the column 'pref_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrefName() {
        checkSpecifiedProperty("prefName");
        return this.prefName;
    }

    /**
     * [set] pref_name: {VARCHAR(2)} <br>
     * @param prefName The value of the column 'pref_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefName(String prefName) {
        registerModifiedProperty("prefName");
        this.prefName = prefName;
    }
}
