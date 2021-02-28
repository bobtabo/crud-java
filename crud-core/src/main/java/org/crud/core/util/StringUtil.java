package org.crud.core.util;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 文字列関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public final class StringUtil {

    /**
     * 半角数字.
     */
    private static final String REGEX_NUMERIC = "[0-9]+";
    /**
     * 半角英数字.
     */
    private static final String REGEX_ALPHA_NUMERIC = "[0-9a-zA-Z]+";
    /**
     * 半角記号.
     */
    private static final String REGEX_SIGN = "[!-~&&[^0-9a-zA-Z]]+";
    /**
     * 半角記号、半角英数字.
     */
    private static final String REGEX_SIGN_ALPHA_NUMERIC = "[!-~]+";

    /**
     * コンストラクタ.
     */
    private StringUtil() {
    }

    /**
     * 文字列が空かを判断します.
     *
     * @param val 文字列
     * @return blank：true<BR>
     * not blank：false
     */
    public static boolean isBlank(Object val) {
        return val != null && val.toString().trim().length() != 0;
    }

    /**
     * 文字列が半角数字かを判断します.
     *
     * @param val 文字列
     * @return numeric：true<BR>
     * not numeric：false
     */
    public static boolean isNumeric(Object val) {
        if (isBlank(val)) {
            String value = val.toString();
            return value.matches(REGEX_NUMERIC);
        }

        return true;
    }

    /**
     * 文字列が半角英数字かを判断します.
     *
     * @param val 文字列
     * @return numeric：true<BR>
     * not numeric：false
     */
    public static boolean isAlphaNumeric(Object val) {
        if (isBlank(val)) {
            String value = val.toString();
            return value.matches(REGEX_ALPHA_NUMERIC);
        }

        return true;
    }

    /**
     * 文字列が半角記号かを判断します.
     *
     * @param val 文字列
     * @return numeric：true<BR>
     * not numeric：false
     */
    public static boolean isSign(Object val) {
        if (isBlank(val)) {
            String value = val.toString();
            return value.matches(REGEX_SIGN);
        }

        return true;
    }

    /**
     * 文字列が半角記号、半角英数字かを判断します.
     *
     * @param val 文字列
     * @return numeric：true<BR>
     * not numeric：false
     */
    public static boolean isSignAlphaNumeric(Object val) {
        if (isBlank(val)) {
            String value = val.toString();
            return value.matches(REGEX_SIGN_ALPHA_NUMERIC);
        }

        return true;
    }

    /**
     * 先頭の文字を大文字に変換する.
     *
     * @param src ソース
     * @return 変換後のソース
     */
    public static String firstCharUpper(String src) {
        if (StringUtils.isEmpty(src)) {
            return StringUtils.EMPTY;
        }
        String firstChar = src.substring(0, 1).toUpperCase();
        return firstChar + src.substring(1, src.length());
    }

    /**
     * 先頭の文字を小文字に変換する.
     *
     * @param src ソース
     * @return 変換後のソース
     */
    public static String firstCharlower(String src) {
        if (StringUtils.isEmpty(src)) {
            return StringUtils.EMPTY;
        }
        String firstChar = src.substring(0, 1).toLowerCase();
        return firstChar + src.substring(1, src.length());
    }

    /**
     * 半角数字を全角に変換します.
     *
     * @param s 変換元文字列
     * @return 変換後文字列
     */
    public static String hankakuNumberToZenkakuNumber(Object s) {
        String target = s.toString();
        StringBuilder sb = new StringBuilder(target);
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.setCharAt(i, (char) (c - '0' + '０'));
            }
        }
        return sb.toString();
    }

    /**
     * bean のプロパティ値を文字列にする.
     *
     * @param obj bean
     * @return プロパティ値の文字列
     */
    public static String beanToString(Object obj) {
        if (obj != null) {
            try {
                Map<String, Object> beanMap = PropertyUtils.describe(obj);
                if (beanMap != null && !beanMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String key : beanMap.keySet()) {
                        sb.append(key).append("=").append(beanMap.get(key)).append(",");
                    }
                    return sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 文字列をint型の数値に変換します.<br>
     * intに変換できない場合は0を返します.
     *
     * @param src 文字列.
     * @return int型の数値.
     */
    public static int parseInt(String src) {
        try {
            return Integer.parseInt(src);
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    /**
     * NULLの場合に空文字に変換します.
     *
     * @param src 変換元.
     * @return 変換先.
     */
    public static String convertNullToEmpty(String src) {
        if (src == null) {
            return "";
        }
        return src;
    }

    /**
     * 文字列を置換します.
     *
     * @param src    変換対象文字列.
     * @param before 変換前文字列.
     * @param after  変換後文字列.
     * @return 変換結果文字列.
     */
    public static String replace(String src, String before, String after) {

        // パラメータチェック
        if (src == null) {
            throw new IllegalArgumentException("src is null.");
        }
        if (before == null) {
            throw new IllegalArgumentException("before is null.");
        }
        if (after == null) {
            throw new IllegalArgumentException("after is null.");
        }

        if (src.equals("") || before.equals("")) {
            return src;
        }

        // 置換前文字列を検索
        int index = src.indexOf(before);
        if (index == -1)
            return src;

        // 前方文字列を格納
        StringBuilder dst = new StringBuilder();
        dst.append(src.substring(0, index));
        dst.append(after);

        // 後方文字列を取得
        String indexAfterString = src.substring(index + before.length());

        // 後方文字列を再帰的に置換
        dst.append(replace(indexAfterString, before, after));

        return (dst.toString());
    }

    /**
     * 文字列を置換します(エスケープ対応).<br>
     * 変換前文字列と変換後文字列にはエスケープ文字を含められません.
     *
     * @param src        変換対象文字列.
     * @param before     変換前文字列.
     * @param after      変換後文字列.
     * @param escapeChar エスケープ文字.
     * @return 変換結果文字列.
     */
    public static String replace(String src, String before, String after, char escapeChar) {

        // パラメータチェック
        if (src == null) {
            throw new IllegalArgumentException("src is null.");
        }
        if (before == null) {
            throw new IllegalArgumentException("before is null.");
        }
        if (after == null) {
            throw new IllegalArgumentException("after is null.");
        }

        if (src.equals("") || before.equals("")) {
            return src;
        }

        if (before.contains(String.valueOf(escapeChar))) {
            throw new IllegalArgumentException("escapeChar not include before");
        }
        if (after.contains(String.valueOf(escapeChar))) {
            throw new IllegalArgumentException("escapeChar not include after");
        }

        // 置換前文字列を検索
        int index = src.indexOf(before);
        if (index == -1)
            return unescape(src, escapeChar);

        // 前方文字列を取得
        String indexBeforeString = src.substring(0, index);

        // 前方文字列を格納
        StringBuilder dst = new StringBuilder();
        dst.append(unescape(indexBeforeString, escapeChar));

        // 前方文字列の末尾を参照してエスケープすべきか判定
        if (checkEscapeString(indexBeforeString, escapeChar)) {
            dst.append(before); // エスケープあり
        } else {
            dst.append(after); // エスケープなし
        }

        // 後方文字列を取得
        String indexAfterString = src.substring(index + before.length());

        // 後方文字列を再帰的に置換
        dst.append(replace(indexAfterString, before, after, escapeChar));

        return dst.toString();
    }

    /**
     * 文字列の末尾を参照してエスケープすべきか判定します.<br>
     * 文字列の末尾にエスケープ文字が奇数個あった場合はエスケープすべきと判定します.
     *
     * @param src        判定文字列.
     * @param escapeChar エスケープ文字.
     * @return 判定結果.
     */
    private static boolean checkEscapeString(String src, char escapeChar) {
        boolean escapeFlag = false;
        int index = src.length() - 1;
        while (index >= 0) {
            if (escapeChar != src.charAt(index)) {
                break;
            }
            escapeFlag = !escapeFlag;
            index--;
        }
        return escapeFlag;
    }

    /**
     * 文字列をエスケープします.<br>
     * 1つのエスケープ文字を2つにすることでエスケープします(例:\→\\).
     *
     * @param src        変換対象文字列.
     * @param escapeChar エスケープ文字.
     * @return 変換結果文字列.
     */
    public static String escape(String src, char escapeChar) {
        String escape = String.valueOf(escapeChar);
        return replace(src, escape, escape + escape);
    }

    /**
     * エスケープ文字をまとめます.<br>
     * エスケープ文字が'\'の場合は、\→,\\→\,\\\→\,\\\\→\\のようにまとめられます.
     *
     * @param src        変換対象文字列.
     * @param escapeChar エスケープ文字.
     * @return 変換結果文字列.
     */
    public static String unescape(String src, char escapeChar) {

        // パラメータチェック
        if (src == null) {
            throw new IllegalArgumentException("src is null.");
        }

        if (src.equals("")) {
            return src;
        }

        boolean insertFlag = true;
        StringBuilder dst = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (escapeChar == c)
                insertFlag = !insertFlag; // 反転
            else
                insertFlag = true; // 初期化
            if (insertFlag)
                dst.append(c);
        }
        return dst.toString();
    }

    /**
     * XMLの特殊文字をエスケープして返す。(&amp;, &lt;, &gt;, &quot;)
     *
     * @param text エスケープ対象の文字列
     * @return エスケープ後の文字列
     */
    public static String escapeXml(String text) {
        if (text == null) {
            return "";
        }
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length + 50);

        for (char aChar : chars) {
            switch (aChar) {
                case '&':
                    sb.append("&amp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '"':
                    sb.append("&quot;");
                    break;
                default:
                    sb.append(aChar);
            }
        }

        return sb.toString();
    }

    /**
     * 改行文字を&lt;br&gt;タグにして返す。
     *
     * @param text    エスケープ対象の文字列
     * @param forHTML HTML用か否か(HTML用ならemptyなタグにはしない)
     * @return エスケープ後の文字列
     */
    public static String escapeEol(String text, boolean forHTML) {
        if (text == null) {
            return "";
        }
        String br = (forHTML ? "<br>" : "<br />");

        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length + 50);

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '\r':
                    sb.append(br);
                    if (chars.length > i + 1 && chars[i + 1] == '\n') {
                        i++;
                    }
                    break;
                case '\n':
                    sb.append(br);
                    break;
                default:
                    sb.append(chars[i]);
            }
        }

        return sb.toString();
    }

    /**
     * XMLの空白文字を数値参照にエスケープして返す。(\r, \n, \t)
     *
     * @param text エスケープ対象の文字列
     * @return エスケープ後の文字列
     */
    public static String escapeWhitespace(String text) {
        if (text == null) {
            return "";
        }
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length + 50);

        for (char aChar : chars) {
            switch (aChar) {
                case '\r':
                    sb.append("&#xd;");
                    break;
                case '\n':
                    sb.append("&#xa;");
                    break;
                case '\t':
                    sb.append("&#x9;");
                    break;
                default:
                    sb.append(aChar);
            }
        }

        return sb.toString();
    }

    /**
     * 文字列を返します。
     *
     * @param str     対象文字列
     * @param nullStr 文字列が空orNull時に置き換える文字列
     * @return 文字列
     */
    public static String toString(String str, String nullStr) {
        return StringUtils.isEmpty(str) ? nullStr : str;
    }

    /**
     * オブジェクトが Null であるか確認します。
     *
     * @param obj オブジェクト
     * @return Null の場合 true を返します
     */
    public static boolean isEmpty(Object obj) {
        return StringUtils.isEmpty(ObjectUtils.toString(obj));
    }

    /**
     * オブジェクトが Null ではないか確認します。
     *
     * @param obj オブジェクト
     * @return Null ではない場合 true を返します
     */
    public static boolean isNotEmpty(Object obj) {
        return (!isEmpty(obj));
    }

    /**
     * データが0またはnullであった場合、"-"表記に変更します。
     *
     * @param rank rank
     * @return 0ないしはNullの場合"-"を返します。
     */
    public static String checkZeroData(Integer rank) {
        return NumberUtil.isZero(rank) ? "-" : rank.toString();
    }

    /**
     * データが0またはnullであった場合、"-"表記に変更します。
     *
     * @param rank rank
     * @return 0ないしはNullの場合"-"を返します。
     */
    public static String checkZeroData(Long rank) {
        return NumberUtil.isZero(rank) ? "-" : rank.toString();
    }

    /**
     * アンダースコア（_）記法の文字列をキャメル記法に変換します。
     *
     * @param str 文字列
     * @return 変換した文字列
     */
    public static String camelize(String str) {
        String[] strings = StringUtils.split(str.toLowerCase(), "_");
        for (int i = 1; i < strings.length; i++) {
            strings[i] = StringUtils.capitalize(strings[i]);
        }
        return StringUtils.join(strings);
    }

    /**
     * 文字列の先頭に http:// もしくは https://　が付加されてるか確認します。
     *
     * @param str 文字列
     * @return 付加されている場合 true を返します
     */
    public static boolean isHttp(String str) {
        String http = StringUtils.substring(str, 0, "http://".length());
        String https = StringUtils.substring(str, 0, "https://".length());

        return (StringUtils.equals(http, "http://") || StringUtils.equals(https, "https://"));
    }

    /**
     * 文字列の先頭から http:// を除いた文字列を取得します。
     *
     * @param str 文字列
     * @return http:// を除いた文字列
     */
    public static String removeHttp(String str) {
        return StringUtils.replaceOnce(str, "http://", StringUtils.EMPTY);
    }

    /**
     * 文字列の先頭に http:// を付加した文字列を取得します。
     *
     * @param str 文字列
     * @return http:// を付加した文字列
     */
    public static String addHttp(String str) {
        return (!isHttp(str)) ? "http://" + str : str;
    }

    /**
     * 最初から指定された文字列までを削除します。（指定された文字列含む）
     *
     * @param sb   sb
     * @param word word
     */
    public static void deleteFront(StringBuilder sb, String word) {
        if (sb != null && word != null) {
            if (sb.indexOf(word) >= 0) {
                sb.delete(0, sb.indexOf(word) + word.length());
            }
        }
    }

    /**
     * 最初から指定された文字列までを削除します。（指定された文字列含む）
     *
     * @param str  str
     * @param word word
     * @return 削除された文字列
     */
    public static String deleteFront(String str, String word) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            deleteFront(sb, word);
            str = sb.toString();
        }
        return str;
    }

    /**
     * 指定された文字列から最後までを削除します。（指定された文字列含む）
     *
     * @param sb   sb
     * @param word word
     */
    public static void deleteEnd(StringBuilder sb, String word) {
        if (sb != null && word != null) {
            if (sb.indexOf(word) >= 0) {
                sb.delete(sb.indexOf(word), sb.length());
            }
        }
    }

    /**
     * 指定された文字列から最後までを削除します。（指定された文字列含む）
     *
     * @param str  str
     * @param word word
     * @return 削除された文字列
     */
    public static String deleteEnd(String str, String word) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            deleteEnd(sb, word);
            str = sb.toString();
        }
        return str;
    }

    /**
     * 空文字を Null に変換します。
     *
     * @param str 文字列
     * @return 空文字の場合 Null を返します
     */
    public static String blankToNull(String str) {
        String result = ObjectUtils.toString(str);
        return "".equals(result) ? null : result;
    }

    /**
     * 文字列が指定のサイズを超えている場合、短縮して末尾に「...」を付加します。<br/>
     * 「...」の直前に改行コード・空白・タブ文字がある場合、削除して「...」を付加します。
     *
     * @param str      文字列
     * @param maxWidth 指定サイズ
     * @return 短縮した文字列
     */
    public static String abbreviate(String str, int maxWidth) {
        String result = StringUtils.abbreviate(str, maxWidth);

        if (StringUtils.length(str) <= maxWidth) {
            return result;
        }

        result = StringUtils.chomp(result, "...");

        List<String> chompList = CollectionUtil.newLinkedList();
        for (int i = result.length() - 1; i > -1; i--) {
            String s = StringUtils.substring(result, i, i + 1);
            if (StringUtils.isEmpty(s)) {
                continue;
            }
            if ("\n".equals(s) || "\t".equals(s) || " ".equals(s) || "　".equals(s)) {
                chompList.add(s);
            } else {
                break;
            }
        }

        for (String chomp : chompList) {
            result = StringUtils.chomp(result, chomp);
        }

        result += "...";

        return result;
    }
}
