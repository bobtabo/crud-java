#!/bin/bash
#
# マイグレーションし直して、クラス作り直す
#

DB_HOST=localhost
DB_DATABASE=crud
DB_USER=cruduser
DB_PASSWORD=docker#DOCKER1234

QUERY="SHOW TABLES LIKE 'CHANGELOG'"
MYSQL_COMMAND_ARGS="-h ${DB_HOST} -u${DB_USER} -p${DB_PASSWORD} --database=${DB_DATABASE}"
Ret=`echo ${QUERY} | mysql ${MYSQL_COMMAND_ARGS} 2>&1`

if [ $Ret -gt 0 ]; then
  bin/migrate.sh up
else
  bin/migrate.sh refresh
fi

dbflute_crud/manage.sh 2
