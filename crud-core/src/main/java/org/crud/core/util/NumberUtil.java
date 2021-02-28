package org.crud.core.util;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 数値関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public final class NumberUtil {

    /**
     * 文字列が数値に変換可能か確認します。
     *
     * @param str 文字列
     * @return 変換可能であれば true を返します
     */
    public static boolean isNumber(String str) {
        return isNumber(str, false);
    }

    /**
     * 文字列が数値に変換可能か確認します。
     *
     * @param str        文字列
     * @param emptyFalse Null文字列も確認する場合は true を設定します
     * @return 変換可能であれば true を返します
     */
    public static boolean isNumber(String str, boolean emptyFalse) {
        String numberStr = str;
        if (!emptyFalse) {
            numberStr = StringUtil.toString(numberStr, "0");
        }
        return NumberUtils.isNumber(numberStr);
    }

    /**
     * 文字列がゼロ値であるか確認します。
     *
     * @param str 文字列
     * @return 文字列がゼロ値の場合 true を返します
     */
    public static boolean isZero(String str) {
        int value = NumberUtils.toInt(str);
        return value == 0;
    }

    /**
     * 数値がゼロ値であるか確認します。
     *
     * @param num 数値
     * @return 数値がゼロ値の場合 true を返します
     */
    public static boolean isZero(Integer num) {
        int value = (num == null) ? 0 : num;
        return value == 0;
    }

    /**
     * 数値がゼロ値であるか確認します。
     *
     * @param num 数値
     * @return 数値がゼロ値の場合 true を返します
     */
    public static boolean isZero(Long num) {
        long value = (num == null) ? 0 : num;
        return value == 0;
    }

    /**
     * オブジェクトを数値に変換します。
     *
     * @param obj オブジェクト
     * @return 数値
     */
    public static Integer toInteger(Object obj) {
        return toInteger(ObjectUtils.toString(obj));
    }

    /**
     * オブジェクト配列をプリミティブ数値配列に変換します。
     *
     * @param obj オブジェクト配列
     * @return プリミティブ数値配列
     */
    public static int[] toInts(Object[] obj) {
        return ArrayUtils.toPrimitive(toIntegers(obj));
    }

    /**
     * オブジェクト配列を数値配列に変換します。
     *
     * @param obj オブジェクト配列
     * @return 数値配列
     */
    public static Integer[] toIntegers(Object[] obj) {
        Integer[] result = new Integer[obj.length];
        for (int i = 0; i < obj.length; i++) {
            result[i] = toInteger(ObjectUtils.toString(obj[i]));
        }
        return result;
    }

    /**
     * オブジェクトを数値に変換します。
     *
     * @param obj          文字列
     * @param defaultValue デフォルト値
     * @return 数値
     */
    public static Integer toInteger(Object obj, Integer defaultValue) {
        return toInteger(ObjectUtils.toString(obj), defaultValue);
    }

    /**
     * 文字列を数値に変換します。
     *
     * @param str 文字列
     * @return 数値
     */
    public static Integer toInteger(String str) {
        return toInteger(str, null);
    }

    /**
     * 文字列を数値に変換します。
     *
     * @param str          文字列
     * @param defaultValue デフォルト値
     * @return 数値
     */
    public static Integer toInteger(String str, Integer defaultValue) {
        if (StringUtils.isBlank(str)) {
            return defaultValue;
        }
        return NumberUtils.createInteger(str);
    }

    /**
     * 2つの数値オブジェクトが一致するか確認します。
     *
     * @param arg1 比較する数値オブジェクト
     * @param arg2 比較する数値オブジェクト
     * @return 一致した場合 true を返します
     */
    public static boolean equals(Integer arg1, Integer arg2) {
        if (arg1 == null && arg2 == null) {
            return true;
        }
        if (arg1 == null || arg2 == null) {
            return false;
        }
        return arg1.intValue() == arg2.intValue();
    }

    /**
     * 3桁カンマ区切りにフォーマットします。
     *
     * @param obj 数値オブジェクト
     * @return フォーマットした文字列
     */
    public static String format(Object obj) {
        try {
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.JAPAN);
            Object value = null;
            if (obj instanceof String) {
                if (isNumber((String) obj, true)) {
                    value = NumberUtils.toLong((String) obj);
                } else {
                    value = obj;
                }
            } else {
                value = obj;
            }
            String formatValue = nf.format(value);
            return ObjectUtils.toString(formatValue);
        } catch (Exception e) {
            return ObjectUtils.toString(obj);
        }
    }

    /**
     * 3桁カンマ区切りにフォーマットします。
     *
     * @param obj          数値オブジェクト
     * @param defaultValue 数値オブジェクトが 0 以下およびフォーカット不可の場合に返す文字列を設定します
     * @return フォーマットした文字列
     */
    public static String format(Object obj, String defaultValue) {
        return format(obj, defaultValue, -1, false, false, false);
    }

    /**
     * 3桁カンマ区切りにフォーマットします。
     *
     * @param obj          数値オブジェクト
     * @param defaultValue 数値オブジェクトが 0 以下およびフォーカット不可の場合に返す文字列を設定します
     * @param isZero       ゼロを無効を（defaultValue）にする場合 true を設定します
     * @return フォーマットした文字列
     */
    public static String format(Object obj, String defaultValue, boolean isZero, boolean isMinus) {
        return format(obj, defaultValue, -1, false, isZero, isMinus);
    }

    /**
     * 3桁カンマ区切りにフォーマットします。
     *
     * @param obj          数値オブジェクト
     * @param defaultValue 数値オブジェクトが 0 以下およびフォーカット不可の場合に返す文字列を設定します
     * @param max          数値の最大値
     * @param isMax        数値の最大値を無効（defaultValue）にする場合 true を設定します
     * @param isZero       ゼロを無効を（defaultValue）にする場合 true を設定します
     * @param isMinus      ゼロ以下を無効を（defaultValue）にする場合 true を設定します
     * @return フォーマットした文字列
     */
    public static String format(Object obj, String defaultValue, int max, boolean isMax, boolean isZero, boolean isMinus) {
        try {
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.JAPAN);

            if (StringUtil.isEmpty(obj)) {
                return defaultValue;
            }

            String value = ObjectUtils.toString(obj);

            Number number;
            if (isNumber(value, true)) {
                number = NumberUtils.toLong(value);
            } else {
                return defaultValue;
            }

            if (isZero) {
                if (number.longValue() == 0) {
                    return defaultValue;
                }
            }

            if (isMinus) {
                if (number.longValue() < 0) {
                    return defaultValue;
                }
            }

            if (isMax) {
                if (number.longValue() > max) {
                    return defaultValue;
                }
            }
            return nf.format(number);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 対象数値がNullおよびゼロ以下はハイフン表示し、以外の場合3桁カンマ区切りにフォーマットします。
     *
     * @param obj 数値オブジェクト
     * @return フォーマットした文字列
     */
    public static String formatByHyphen(Object obj) {
        try {
            if (obj != null) {
                int value = toInteger(obj, 0);
                if (value < 0) {
                    return "-";
                }
                // NumberFormat nf =
                // NumberFormat.getNumberInstance(Locale.JAPAN);
                // return ObjectUtils.toString(nf.format(obj));
            }
            if (obj instanceof Long) {
                return format(StringUtil.checkZeroData((Long) obj));
            } else {
                return format(StringUtil.checkZeroData((Integer) obj));
            }
        } catch (Exception e) {
            return format(ObjectUtils.toString(obj));
        }
    }

    /**
     * 数字データを数値データに変換します。 (3桁カンマ区切りの数字を数値に戻します) ("-"表示はゼロ扱いにします)
     *
     * @param str 数字
     * @return 数値
     */
    public static long reverseFormat(String str) {
        long ret = 0;
        try {
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.JAPAN);
            Number num = nf.parse(str);
            ret = num.longValue();
        } catch (Exception ignored) {
        }
        return ret;
    }

    /**
     * 数値オブジェクトの null を変換します。
     *
     * @param value 数値
     * @return 数値オブジェクトが null の場合は 0 、以外の場合は数値を返します
     */
    public static long nvl(Long value) {
        return (value != null) ? value : 0;
    }

    /**
     * 数値をゼロサプライします。
     *
     * @param value 数値文字列
     * @param digit 桁数
     * @return ゼロサプライした文字列
     */
    public static String zeroSupply(String value, int digit) {
        return zeroSupply(NumberUtils.toInt(value), digit);
    }

    /**
     * 数値をゼロサプライします。
     *
     * @param value 数値
     * @param digit 桁数
     * @return ゼロサプライした文字列
     */
    public static String zeroSupply(int value, int digit) {
        DecimalFormat df = new DecimalFormat("0".repeat(Math.max(0, digit)));
        return df.format(value);
    }
}
