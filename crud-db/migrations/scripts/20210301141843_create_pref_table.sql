-- // create pref table
-- Migration SQL that makes the change goes here.
CREATE TABLE `pref` (
    `id` int unsigned NOT NULL COMMENT 'ID',
    `name` varchar(128) NOT NULL COMMENT '都道府県名',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
    `deleted_at` timestamp NULL COMMENT '削除日時',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='都道府県';

-- //@UNDO
-- SQL to undo the change goes here.
DROP TABLE IF EXISTS `pref`;
