#!/bin/bash
#
# マイグレーション
#

cd migrations
if [ $1 = 'refresh' ]; then
  ./mybatis-migrations-3.3.9/bin/migrate version 20201012133656
  ./mybatis-migrations-3.3.9/bin/migrate up
else
  ./mybatis-migrations-3.3.9/bin/migrate $1 $2
fi
