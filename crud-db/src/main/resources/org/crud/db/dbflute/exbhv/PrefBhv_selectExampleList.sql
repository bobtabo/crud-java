/*
 [df:title]
 都道府県リスト検索

 [df:description]
 都道府県リスト検索の説明
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
select
    id
     , 'ほげ' as pref_name
from pref
where id < /*pmb.id*/9999999999
ORDER BY
    /*pmb.orderBy*/id