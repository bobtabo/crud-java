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
 * The DB meta of CHANGELOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ChangelogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ChangelogDbm _instance = new ChangelogDbm();
    private ChangelogDbm() {}
    public static ChangelogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Changelog)et).getId(), (et, vl) -> ((Changelog)et).setId(ctb(vl)), "id");
        setupEpg(_epgMap, et -> ((Changelog)et).getAppliedAt(), (et, vl) -> ((Changelog)et).setAppliedAt((String)vl), "appliedAt");
        setupEpg(_epgMap, et -> ((Changelog)et).getDescription(), (et, vl) -> ((Changelog)et).setDescription((String)vl), "description");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CHANGELOG";
    protected final String _tableDispName = "CHANGELOG";
    protected final String _tablePropertyName = "changelog";
    protected final TableSqlName _tableSqlName = new TableSqlName("CHANGELOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, java.math.BigDecimal.class, "id", null, true, false, true, "DECIMAL", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAppliedAt = cci("APPLIED_AT", "APPLIED_AT", null, null, String.class, "appliedAt", null, false, false, true, "VARCHAR", 25, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, NotNull, DECIMAL(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * APPLIED_AT: {NotNull, VARCHAR(25)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAppliedAt() { return _columnAppliedAt; }
    /**
     * DESCRIPTION: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnAppliedAt());
        ls.add(columnDescription());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.crud.db.dbflute.exentity.Changelog"; }
    public String getConditionBeanTypeName() { return "org.crud.db.dbflute.cbean.ChangelogCB"; }
    public String getBehaviorTypeName() { return "org.crud.db.dbflute.exbhv.ChangelogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Changelog> getEntityType() { return Changelog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Changelog newEntity() { return new Changelog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Changelog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Changelog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
