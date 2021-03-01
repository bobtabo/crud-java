package org.crud.db.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.crud.db.dbflute.allcommon.*;
import org.crud.db.dbflute.exentity.*;

/**
 * The DB meta of pref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PrefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PrefDbm _instance = new PrefDbm();
    private PrefDbm() {}
    public static PrefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Pref)et).getId(), (et, vl) -> ((Pref)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Pref)et).getName(), (et, vl) -> ((Pref)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Pref)et).getCreatedAt(), (et, vl) -> ((Pref)et).setCreatedAt(ctldt(vl)), "createdAt");
        setupEpg(_epgMap, et -> ((Pref)et).getUpdatedAt(), (et, vl) -> ((Pref)et).setUpdatedAt(ctldt(vl)), "updatedAt");
        setupEpg(_epgMap, et -> ((Pref)et).getDeletedAt(), (et, vl) -> ((Pref)et).setDeletedAt(ctldt(vl)), "deletedAt");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "pref";
    protected final String _tableDispName = "pref";
    protected final String _tablePropertyName = "pref";
    protected final TableSqlName _tableSqlName = new TableSqlName("pref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "customerList", null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, true, "VARCHAR", 128, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("created_at", "created_at", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, true, "TIMESTAMP", 19, 0, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedAt = cci("updated_at", "updated_at", null, null, java.time.LocalDateTime.class, "updatedAt", null, false, false, true, "TIMESTAMP", 19, 0, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedAt = cci("deleted_at", "deleted_at", null, null, java.time.LocalDateTime.class, "deletedAt", null, false, false, false, "TIMESTAMP", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * name: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
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
        ls.add(columnName());
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * customer by pref_id, named 'customerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), CustomerDbm.getInstance().columnPrefId());
        return cri("customer_ibfk_1", "customerList", this, CustomerDbm.getInstance(), mp, false, "pref");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.crud.db.dbflute.exentity.Pref"; }
    public String getConditionBeanTypeName() { return "org.crud.db.dbflute.cbean.PrefCB"; }
    public String getBehaviorTypeName() { return "org.crud.db.dbflute.exbhv.PrefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Pref> getEntityType() { return Pref.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Pref newEntity() { return new Pref(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Pref)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Pref)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
