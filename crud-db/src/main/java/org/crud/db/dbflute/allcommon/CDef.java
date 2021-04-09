package org.crud.db.dbflute.allcommon;

import java.util.*;

import org.dbflute.exception.ClassificationNotFoundException;
import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;
import org.dbflute.optional.OptionalThing;
import static org.dbflute.util.DfTypeUtil.emptyStrings;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /**
     * 性別
     */
    public enum GenderType implements CDef {
        /** M: 男 */
        MEN("1", "M", new String[] {"1"})
        ,
        /** W: 女 */
        WOMEN("2", "W", new String[] {"2"})
        ;
        private static final Map<String, GenderType> _codeClsMap = new HashMap<String, GenderType>();
        private static final Map<String, GenderType> _nameClsMap = new HashMap<String, GenderType>();
        static {
            for (GenderType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private GenderType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.GenderType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<GenderType> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof GenderType) { return OptionalThing.of((GenderType)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<GenderType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static GenderType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof GenderType) { return (GenderType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static GenderType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<GenderType> listAll() {
            return new ArrayList<GenderType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<GenderType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: GenderType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<GenderType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<GenderType> clsList = new ArrayList<GenderType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<GenderType> groupOf(String groupName) {
            return new ArrayList<GenderType>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** 性別 */
        GenderType
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public OptionalThing<? extends Classification> of(Object code) {
            if (GenderType.name().equals(name())) { return CDef.GenderType.of(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public OptionalThing<? extends Classification> byName(String name) {
            if (GenderType.name().equals(name())) { return CDef.GenderType.byName(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification codeOf(Object code) { // null if not found, old style so use of(code)
            if (GenderType.name().equals(name())) { return CDef.GenderType.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) { // null if not found, old style so use byName(name)
            if (GenderType.name().equals(name())) { return CDef.GenderType.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if (GenderType.name().equals(name())) { return toClsList(CDef.GenderType.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listByGroup(String groupName) { // exception if not found
            if (GenderType.name().equals(name())) { return toClsList(CDef.GenderType.listByGroup(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listOf(Collection<String> codeList) {
            if (GenderType.name().equals(name())) { return toClsList(CDef.GenderType.listOf(codeList)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) { // old style
            if (GenderType.name().equals(name())) { return toClsList(CDef.GenderType.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClsList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if (GenderType.name().equals(name())) { return ClassificationCodeType.Number; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if (GenderType.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }

        public static OptionalThing<CDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (GenderType.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(CDef.DefMeta.GenderType); }
            return OptionalThing.ofNullable(null, () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }

        public static CDef.DefMeta meta(String classificationName) { // old style so use find(name)
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (GenderType.name().equalsIgnoreCase(classificationName)) { return CDef.DefMeta.GenderType; }
            throw new IllegalStateException("Unknown classification: " + classificationName);
        }

        @SuppressWarnings("unused")
        private String[] xinternalEmptyString() {
            return emptyStrings(); // to suppress 'unused' warning of import statement
        }
    }
}
