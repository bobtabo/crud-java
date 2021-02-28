package org.crud.core.util;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;

/**
 * Dozer関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class DozerUtil {
    /**
     * マッピングオブジェクトを取得します。
     *
     * @param dxo マッピング設定オブジェクト
     * @return マッピングオブジェクト
     */
    public static Mapper getMapper(BeanMappingBuilder dxo) {
        return DozerBeanMapperBuilder.create().withMappingBuilder(dxo).build();
    }
}
