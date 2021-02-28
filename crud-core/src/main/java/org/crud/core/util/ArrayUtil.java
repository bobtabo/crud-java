package org.crud.core.util;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ObjectUtils;

import java.util.Collections;
import java.util.List;

/**
 * 配列関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class ArrayUtil {

    /**
     * 配列をリストに変換します。
     *
     * @param array 配列
     * @return リスト
     */
    @SuppressWarnings("unchecked")
    public static <E> List<E> toList(E... array) {
        List<E> result = CollectionUtil.newArrayList();
        Collections.addAll(result, array);
        return result;
    }

    /**
     * 配列および配列の全要素が Null であるか確認します。
     *
     * @param array 配列
     * @return 配列および配列の全要素が Null の場合 true を返します
     */
    @SuppressWarnings("unchecked")
    public static <E> boolean isEmpty(E... array) {
        if (ArrayUtils.isEmpty(array)) {
            return true;
        }

        boolean result = true;
        for (E e : array) {
            if (!"".equals(ObjectUtils.toString(e))) {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * 配列および配列の全要素が Null ではないか確認します。
     *
     * @param array 配列
     * @return 配列および配列の全要素が Null ではない場合 true を返します
     */
    @SuppressWarnings("unchecked")
    public static <E> boolean isNotEmpty(E... array) {
        return !isEmpty(array);
    }
}
