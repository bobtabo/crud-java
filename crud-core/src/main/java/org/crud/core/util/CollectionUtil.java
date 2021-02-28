package org.crud.core.util;

import java.util.*;

/**
 * コレクション関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class CollectionUtil {

    /**
     * 対象リストからランダムな値を取得します。
     *
     * @param list 対象リスト
     * @return ランダムな値
     */
    public static <E> E randomOfList(List<E> list) {
        if (list.size() == 0) {
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return list.get(random(list.size() - 1));
        }
    }

    /**
     * 対象リストの順序をランダムに並び替えたリストを作成します。
     *
     * @param list 対象リスト
     * @return ランダムリスト
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static List randomList(List list) {
        List tmpList = newArrayList();

        while (list.size() > 0) {
            int choice = random(list.size() - 1);
            tmpList.add(list.get(choice));
            list.remove(choice);
        }

        return tmpList;
    }

    /**
     * 指定された最大値以内のランダム数値を取得します。
     *
     * @param max ランダム数値の最大値
     * @return ランダム数値
     */
    public static int random(int max) {
        return Math.abs(new Random().nextInt() % (max + 1));
    }

    /**
     * @param list
     * @param unitSize
     * @param <E>
     * @return
     */
    public static <E> List<List<E>> recombinantFillList(List<E> list, int unitSize) {
        fillList(list, unitSize, null);
        return recombinantList(list, unitSize);
    }

    /**
     * @param list
     * @param unitSize
     * @param <E>
     * @return
     */
    public static <E> List<List<E>> recombinantList(List<E> list, int unitSize) {
        if (unitSize < 1) {
            return null;
        }
        if (list != null && list.size() > 0) {
            List<List<E>> resultList = CollectionUtil.newArrayList();
            List<E> unitList = newArrayList(unitSize);
            for (E e : list) {
                if (unitList.size() == unitSize) {
                    resultList.add(unitList);
                    unitList = newArrayList(unitSize);
                    unitList.add(e);
                } else {
                    unitList.add(e);
                }
            }
            if (unitList.size() > 0) {
                fillList(unitList, unitSize, null);
                resultList.add(unitList);
            }
            return resultList;
        }
        return null;
    }

    public static <E> void fillList(List<E> list, int unitSize, E defaul) {
        if (list == null) {
            list = newArrayList();
        }
        while (list.size() < unitSize) {
            list.add(defaul);
        }
    }

    /**
     * {@link ArrayList}の新しいインスタンスを作成して返します。
     *
     * @param <E> {@link ArrayList}の要素型
     * @return {@link ArrayList}の新しいインスタンス
     */
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }

    /**
     * {@link ArrayList}の新しいインスタンスを作成して返します。
     *
     * @param <E>             {@link ArrayList}の要素型
     * @param initialCapacity リストの初期容量
     * @return {@link ArrayList}の新しいインスタンス
     */
    public static <E> ArrayList<E> newArrayList(int initialCapacity) {
        return new ArrayList<E>(initialCapacity);
    }

    /**
     * {@link LinkedList}の新しいインスタンスを作成して返します。
     *
     * @param <E> {@link LinkedList}の要素型
     * @return {@link LinkedList}の新しいインスタンス
     */
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<E>();
    }

    /**
     * {@link HashSet}の新しいインスタンスを作成して返します。
     *
     * @param <E> {@link HashSet}の要素型
     * @return {@link HashSet}の新しいインスタンス
     */
    public static <E> HashSet<E> newHashSet() {
        return new HashSet<E>();
    }

    /**
     * {@link HashMap}の新しいインスタンスを作成して返します。
     *
     * @param <K> {@link LinkedHashMap}の要素型
     * @param <V> {@link LinkedHashMap}の要素型
     * @return {@link HashMap}の新しいインスタンス
     */
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    /**
     * {@link LinkedHashMap}の新しいインスタンスを作成して返します。
     *
     * @param <K> {@link LinkedHashMap}の要素型
     * @param <V> {@link LinkedHashMap}の要素型
     * @return {@link LinkedHashMap}の新しいインスタンス
     */
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<K, V>();
    }
}
