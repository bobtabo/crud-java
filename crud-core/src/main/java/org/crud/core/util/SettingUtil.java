package org.crud.core.util;

import java.util.ResourceBundle;

/**
 * 「setting.properties」の設定値を取得する為のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class SettingUtil {
    public static ResourceBundle setting = ResourceBundle.getBundle("setting");

    /**
     * 文字列の設定値を取得します。
     *
     * @param key キー
     * @return 文字列の設定値
     */
    public static String getString(String key) {
        return setting.getString(key);
    }

    /**
     * 文字列配列の設定値を取得します。
     *
     * @param key キー
     * @return 文字列配列の設定値
     */
    public static String[] getStringArray(String key) {
        return setting.getStringArray(key);
    }

    /**
     * 数値の設定値を取得します。
     *
     * @param key キー
     * @return 数値の設定値
     */
    public static Integer getInteger(String key) {
        return Integer.parseInt(getString(key));
    }

    /**
     * Booleanの設定値を取得します。
     *
     * @param key キー
     * @return Booleanの設定値
     */
    public static boolean isTrue(String key) {
        return "true".equals(setting.getString(key));
    }
}
