package org.crud.core.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.converters.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

/**
 * JavaBean関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public final class BeanUtil {
    /**
     * ログ出力
     */
    private static final Log LOG = LogFactory.getLog(BeanUtil.class);

    static {
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
        ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
        ConvertUtils.register(new BigIntegerConverter(null), BigInteger.class);
        ConvertUtils.register(new SqlDateConverter(null), Date.class);
        ConvertUtils.register(new SqlTimeConverter(null), Time.class);
        ConvertUtils.register(new SqlTimestampConverter(null), Timestamp.class);
        ConvertUtils.register(new FileConverter(null), File.class);
        ConvertUtils.register(new URLConverter(null), URL.class);
        ConvertUtils.register(new BooleanConverter(null), Boolean.class);
    }

    /**
     * プライベートコンストラクタ
     */
    private BeanUtil() {
    }

    /**
     * Beanのプロパティのコピーを行います。
     *
     * @param value    コピー先のBean
     * @param newValue コピー元のBean
     */
    public static void copy(Object newValue, Object value) {
        try {
            BeanUtils.copyProperties(newValue, value);
        } catch (IllegalAccessException e) {
            LOG.error(e.getMessage(), e);
        } catch (InvocationTargetException e) {
            LOG.error(e.getMessage(), e);
            LOG.error(e.getCause().getMessage(), e.getCause());
        }
    }

    /**
     * Beanのプロパティのコピーを行います。
     *
     * @param <V>           V
     * @param newValueClass コピー先のBeanクラス
     * @param value         コピー元のBean
     * @return コピーされたBean
     */
    public static <V> V createCopy(Class<V> newValueClass, Object value) {
        V newValue = null;
        try {
            newValue = newValueClass.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(newValue, value);
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
            if (e instanceof InvocationTargetException) {
                LOG.error(e.getCause().getMessage(), e.getCause());
            }
        }

        return newValue;
    }

    /**
     * Beanのプロパティのコピーを行います。
     *
     * @param value    コピー先のBean
     * @param newValue コピー元のBean
     */
    public static void copyProperties(Object newValue, Object value) {
        try {
            PropertyUtils.copyProperties(newValue, value);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
        } catch (InvocationTargetException e) {
            LOG.error(e.getMessage(), e);
            LOG.error(e.getCause().getMessage(), e.getCause());
        }
    }

    /**
     * Beanのプロパティのコピーを行います。
     *
     * @param <V>           V
     * @param newValueClass コピー先のBeanクラス
     * @param value         コピー元のBean
     */
    public static <V> V createCopyProperties(Class<V> newValueClass, Object value) {
        V newValue = null;
        try {
            newValue = newValueClass.getDeclaredConstructor().newInstance();
            PropertyUtils.copyProperties(newValue, value);
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
            if (e instanceof InvocationTargetException) {
                LOG.error(e.getCause().getMessage(), e.getCause());
            }
        }

        return newValue;
    }

    /**
     * Beanのプロパティをクリアします。
     *
     * @param value Bean
     */
    public static void clear(Object value) {
        try {
            copy(value, value.getClass().getDeclaredConstructor().newInstance());
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    /**
     * Bool値を取得します。
     *
     * @param value    Bean
     * @param property プロパティ
     * @return Bool値
     */
    public static boolean getBooleanValue(Object value, String property) {
        boolean result = false;
        try {
            Class<?> classType = PropertyUtils.getPropertyType(value, property);
            if (classType == Boolean.class) {
                result = (Boolean) getProperty(value, property);
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Beanのプロパティ値を取得します。
     *
     * @param value    Bean
     * @param property プロパティ
     * @return プロパティ値
     */
    public static Object getProperty(Object value, String property) {
        Object result = null;
        try {
            result = PropertyUtils.getProperty(value, property);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Beanのプロパティ値を設定します。
     *
     * @param bean     Bean
     * @param property プロパティ
     * @param value    プロパティ値
     */
    public static void setProperty(Object bean, String property, Object value) {
        try {
            PropertyUtils.setProperty(bean, property, value);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    /**
     * Beanのプロパティ値を設定します。
     *
     * @param bean  Bean
     * @param value マップ
     */
    public static void populate(Object bean, Map<String, ?> value) {
        try {
            BeanUtils.populate(bean, value);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LOG.error(e.getMessage(), e);
        }
    }
}
