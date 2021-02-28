var path = java.nio.file.Paths.get(migrationPaths.getHookPath() + "/development/after_each_up/" + hookContext.getChange().getId() + ".sql");
if (java.nio.file.Files.exists(path)) {
    var query = java.lang.String.join("\n", java.nio.file.Files.readAllLines(path, java.nio.charset.StandardCharsets.UTF_8));
    hookContext.executeSql(query);
}