package org.crud.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.crud.db.dbflute.allcommon.*;
import org.crud.db.dbflute.exentity.*;

/**
 * The DB meta of customer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CustomerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CustomerDbm _instance = new CustomerDbm();
    private CustomerDbm() {}
    public static CustomerDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Customer)et).getId(), (et, vl) -> ((Customer)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((Customer)et).getLastName(), (et, vl) -> ((Customer)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((Customer)et).getFirstName(), (et, vl) -> ((Customer)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((Customer)et).getLastKana(), (et, vl) -> ((Customer)et).setLastKana((String)vl), "lastKana");
        setupEpg(_epgMap, et -> ((Customer)et).getFirstKana(), (et, vl) -> ((Customer)et).setFirstKana((String)vl), "firstKana");
        setupEpg(_epgMap, et -> ((Customer)et).getGender(), (et, vl) -> ((Customer)et).setGender(cti(vl)), "gender");
        setupEpg(_epgMap, et -> ((Customer)et).getBirthday(), (et, vl) -> ((Customer)et).setBirthday(ctldt(vl)), "birthday");
        setupEpg(_epgMap, et -> ((Customer)et).getPostCode(), (et, vl) -> ((Customer)et).setPostCode((String)vl), "postCode");
        setupEpg(_epgMap, et -> ((Customer)et).getPrefId(), (et, vl) -> ((Customer)et).setPrefId(cti(vl)), "prefId");
        setupEpg(_epgMap, et -> ((Customer)et).getAddress(), (et, vl) -> ((Customer)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((Customer)et).getBuilding(), (et, vl) -> ((Customer)et).setBuilding((String)vl), "building");
        setupEpg(_epgMap, et -> ((Customer)et).getTel(), (et, vl) -> ((Customer)et).setTel((String)vl), "tel");
        setupEpg(_epgMap, et -> ((Customer)et).getMobile(), (et, vl) -> ((Customer)et).setMobile((String)vl), "mobile");
        setupEpg(_epgMap, et -> ((Customer)et).getEmail(), (et, vl) -> ((Customer)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((Customer)et).getRemarks(), (et, vl) -> ((Customer)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((Customer)et).getCreatedAt(), (et, vl) -> ((Customer)et).setCreatedAt(ctldt(vl)), "createdAt");
        setupEpg(_epgMap, et -> ((Customer)et).getUpdatedAt(), (et, vl) -> ((Customer)et).setUpdatedAt(ctldt(vl)), "updatedAt");
        setupEpg(_epgMap, et -> ((Customer)et).getDeletedAt(), (et, vl) -> ((Customer)et).setDeletedAt(ctldt(vl)), "deletedAt");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Customer)et).getPref(), (et, vl) -> ((Customer)et).setPref((OptionalEntity<Pref>)vl), "pref");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "customer";
    protected final String _tableDispName = "customer";
    protected final String _tablePropertyName = "customer";
    protected final TableSqlName _tableSqlName = new TableSqlName("customer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Long.class, "id", null, true, true, true, "BIGINT UNSIGNED", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("last_name", "last_name", null, null, String.class, "lastName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("first_name", "first_name", null, null, String.class, "firstName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastKana = cci("last_kana", "last_kana", null, null, String.class, "lastKana", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstKana = cci("first_kana", "first_kana", null, null, String.class, "firstKana", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGender = cci("gender", "gender", null, null, Integer.class, "gender", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthday = cci("birthday", "birthday", null, null, java.time.LocalDateTime.class, "birthday", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostCode = cci("post_code", "post_code", null, null, String.class, "postCode", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrefId = cci("pref_id", "pref_id", null, null, Integer.class, "prefId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "pref", null, null, false);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, String.class, "address", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBuilding = cci("building", "building", null, null, String.class, "building", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTel = cci("tel", "tel", null, null, String.class, "tel", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMobile = cci("mobile", "mobile", null, null, String.class, "mobile", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("email", "email", null, null, String.class, "email", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("created_at", "created_at", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, true, "TIMESTAMP", 19, 0, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedAt = cci("updated_at", "updated_at", null, null, java.time.LocalDateTime.class, "updatedAt", null, false, false, true, "TIMESTAMP", 19, 0, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedAt = cci("deleted_at", "deleted_at", null, null, java.time.LocalDateTime.class, "deletedAt", null, false, false, false, "TIMESTAMP", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * last_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * first_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * last_kana: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastKana() { return _columnLastKana; }
    /**
     * first_kana: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstKana() { return _columnFirstKana; }
    /**
     * gender: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGender() { return _columnGender; }
    /**
     * birthday: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthday() { return _columnBirthday; }
    /**
     * post_code: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostCode() { return _columnPostCode; }
    /**
     * pref_id: {IX, NotNull, INT UNSIGNED(10), FK to pref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefId() { return _columnPrefId; }
    /**
     * address: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * building: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBuilding() { return _columnBuilding; }
    /**
     * tel: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTel() { return _columnTel; }
    /**
     * mobile: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobile() { return _columnMobile; }
    /**
     * email: {UQ, NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * remarks: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
    /**
     * created_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedAt() { return _columnCreatedAt; }
    /**
     * updated_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedAt() { return _columnUpdatedAt; }
    /**
     * deleted_at: {TIMESTAMP(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeletedAt() { return _columnDeletedAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnLastName());
        ls.add(columnFirstName());
        ls.add(columnLastKana());
        ls.add(columnFirstKana());
        ls.add(columnGender());
        ls.add(columnBirthday());
        ls.add(columnPostCode());
        ls.add(columnPrefId());
        ls.add(columnAddress());
        ls.add(columnBuilding());
        ls.add(columnTel());
        ls.add(columnMobile());
        ls.add(columnEmail());
        ls.add(columnRemarks());
        ls.add(columnCreatedAt());
        ls.add(columnUpdatedAt());
        ls.add(columnDeletedAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnEmail()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * pref by my pref_id, named 'pref'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPref() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPrefId(), PrefDbm.getInstance().columnId());
        return cfi("customer_ibfk_1", "pref", this, PrefDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "customerList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.crud.db.dbflute.exentity.Customer"; }
    public String getConditionBeanTypeName() { return "org.crud.db.dbflute.cbean.CustomerCB"; }
    public String getBehaviorTypeName() { return "org.crud.db.dbflute.exbhv.CustomerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Customer> getEntityType() { return Customer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Customer newEntity() { return new Customer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Customer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Customer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
