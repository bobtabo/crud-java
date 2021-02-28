/*
 [df:title]
 ユーザー検索

 [df:description]
 ユーザー検索の説明
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!
select
  id
, token
, 'ほげ' as user_name
from user
where id = /*pmb.id*/9999999999
