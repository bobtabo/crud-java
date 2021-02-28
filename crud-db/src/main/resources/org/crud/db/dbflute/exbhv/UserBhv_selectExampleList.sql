/*
 [df:title]
 ユーザーリスト検索

 [df:description]
 ユーザーリスト検索の説明
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
select
    id
     , token
     , 'ほげ' as user_name
from user
where id < /*pmb.id*/9999999999
ORDER BY
    /*pmb.orderBy*/id