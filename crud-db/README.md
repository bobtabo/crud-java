## DBクラス生成環境の設定

#### Mavenをインストール

```
$ brew install maven
```

!!! 以降の作業は全てcrud-db直下で行う !!!

#### DBFlute本体のダウンロード

- 生成テンプレートを置換する為、シェルを経由する
- 詳しくは[コチラ](http://dbflute.seasar.org/ja/environment/setup/maven.html)

```
$ chmod 755 bin/dbflute-download.sh
$ bin/dbflute-download.sh
```

## マイグレーション

- Mybatis Migrationsのパスを通さず利用する為、シェルを経由する
- コマンドは[コチラ](http://mybatis.org/migrations/migrate.html)

```
$ chmod 755 bin/migrate.sh
$ bin/migrate.sh up
```

## クラス生成

- DaoとEntityを生成する

```
$ chmod 755 dbflute_crud/manage.sh
$ dbflute_crud/manage.sh 2
```

## ローカルデータに関して

up/downをフックして、データ登録できます。
- 詳しくは[コチラ](https://mybatis.org/migrations/hooks.html)

- 下記にSQLスクリプトを用意すれば、upでデータ登録されます。
  - migrations/hooks/after_each_up/local
  - ファイル名は、対応するマイグレーションID.sql
    - マイグレーションID：scripts/20201012142600_xxxxx.sqlの先頭タイムスタンプ
- 環境による切り替えについて
  - environmentsの各環境ファイルを編集（一番下）
  - hooksに各環境用JSファイルを作成
  

## 作り直し

### テーブルだけ作り直し（CHANGELOGテーブルがある場合）
```
bin/migrate.sh refresh
```

### 全部作る（全部作り直す）

```
$ chmod 755 bin/generate.sh
$ bin/generate.sh
```

### 外部SQLだけ作り直し

```
$ chmod 755 bin/outside-sql.sh
$ bin/outside-sql.sh
```
