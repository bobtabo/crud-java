-- // create customer table
-- Migration SQL that makes the change goes here.
CREATE TABLE `customer` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `last_name` varchar(255) NOT NULL COMMENT '姓',
    `first_name` varchar(255) NOT NULL COMMENT '名',
    `last_kana` varchar(255) NOT NULL COMMENT '姓かな',
    `first_kana` varchar(255) NOT NULL COMMENT '名かな',
    `gender` int unsigned NOT NULL COMMENT '性別',
    `birthday` datetime NOT NULL COMMENT '生年月日',
    `post_code` varchar(255) NOT NULL COMMENT '郵便番号',
    `pref_id` int unsigned NOT NULL COMMENT '都道府県ID',
    `address` varchar(255) NOT NULL COMMENT '住所',
    `building` varchar(255) COMMENT '建物名',
    `tel` varchar(255) NOT NULL COMMENT '電話番号',
    `mobile` varchar(255) NOT NULL COMMENT '携帯番号',
    `email` varchar(255) NOT NULL COMMENT 'メールアドレス',
    `remarks` text COMMENT '備考',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
    `deleted_at` timestamp NULL COMMENT '削除日時',
    PRIMARY KEY (`id`),
    UNIQUE KEY `customer_email_unique` (`email`),
    FOREIGN KEY (`pref_id`) REFERENCES pref (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='顧客';

-- //@UNDO
-- SQL to undo the change goes here.
DROP TABLE IF EXISTS `customer`;
