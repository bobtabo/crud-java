package org.crud.core.repository;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.crud.core.exception.AppException;
import org.crud.core.util.DateUtil;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 基底Repositoryクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public abstract class AbstractRepository<BEHAVIOR, ENTITY> {
    @Autowired
    private BEHAVIOR behavior;

    /**
     * 登録/更新します。
     *
     * @param entity エンティティ
     */
    public void save(ENTITY entity) {
        try {
            Object id = MethodUtils.invokeMethod(entity, "getId");
            if (id == null) {
                insert(entity);
            } else {
                update(entity);
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new AppException(e);
        }
    }

    /**
     * 登録します。
     *
     * @param entity エンティティ
     */
    public void insert(ENTITY entity) {
        prepareInsert(entity);
        insertNoPrepare(entity);
    }

    /**
     * 共通フィールドを設定しないで登録します。
     *
     * @param entity エンティティ
     */
    public void insertNoPrepare(ENTITY entity) {
        try {
            MethodUtils.invokeMethod(behavior, "insert", entity);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new AppException(e);
        }
    }

    /**
     * 更新します。
     *
     * @param entity エンティティ
     */
    public void update(ENTITY entity) {
        prepareUpdate(entity);
        try {
            MethodUtils.invokeMethod(behavior, "update", entity);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new AppException(e);
        }
    }

    /**
     * 論理削除を行います。
     *
     * @param entity エンティティ
     */
    public void logicalDelete(ENTITY entity) {
        // 論理削除
        try {
            // 共通のフィールドに値を入れる
            if (PropertyUtils.getPropertyDescriptor(entity, "deleteDate") != null) {
                PropertyUtils.setProperty(entity, "deleteAt", LocalDateTime.now());
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AppException(e);
        }
        update(entity);
    }

    /**
     * 全件を検索します。
     *
     * @return エンティティのリスト
     */
    public abstract ListResultBean<ENTITY> findAll();

    /**
     * PKで検索します。
     *
     * @param id ID
     * @return エンティティ
     */
    @SuppressWarnings("unchecked")
    public ENTITY findById(int id) {
        try {
            return ((OptionalEntity<ENTITY>) MethodUtils.invokeMethod(behavior, "selectByPK", id)).get();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new AppException(e);
        }
    }

    /**
     * PKで検索します。
     *
     * @param id ID
     * @return エンティティ
     */
    @SuppressWarnings("unchecked")
    public ENTITY findById(Long id) {
        try {
            return ((OptionalEntity<ENTITY>) MethodUtils.invokeMethod(behavior, "selectByPK", id)).get();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new AppException(e);
        }
    }

    /**
     * ビヘイビアを取得します。
     *
     * @return ビヘイビア
     */
    protected BEHAVIOR getBehavior() {
        return behavior;
    }

    /**
     * エンティティの共通フィールドを設定します。
     *
     * @param entity エンティティ
     */
    protected void prepareInsert(ENTITY entity) {
        try {
            // 共通のフィールドに値を入れる
            if (PropertyUtils.getPropertyDescriptor(entity, "createdAt") != null) {
                LocalDateTime now = DateUtil.getLocalDateTime();
                PropertyUtils.setProperty(entity, "createdAt", now);
                PropertyUtils.setProperty(entity, "updatedAt", now);
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AppException(e);
        }
    }

    /**
     * エンティティの共通フィールドを設定します。
     *
     * @param entity エンティティ
     * @return エンティティ
     */
    private ENTITY prepareUpdate(ENTITY entity) {
        try {
            // 共通のフィールドに値を入れる
            if (PropertyUtils.getPropertyDescriptor(entity, "updatedAt") != null) {
                PropertyUtils.setProperty(entity, "updatedAt", DateUtil.getLocalDateTime());
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AppException(e);
        }

        return entity;
    }

    /**
     * BULK登録します。
     *
     * @param entities エンティティlist
     */
    public void batchInsert(List<ENTITY> entities) {
        try {
            entities.stream().iterator().forEachRemaining(this::prepareInsert);
            MethodUtils.invokeMethod(behavior, "batchInsert", entities);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AppException(e);
        }
    }

    /**
     * BULK更新します。
     *
     * @param entities エンティティlist
     */
    public void batchUpdate(List<ENTITY> entities) {
        try {
            entities.stream().iterator().forEachRemaining(this::prepareUpdate);
            MethodUtils.invokeMethod(behavior, "batchUpdate", entities);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AppException(e);
        }
    }
}