package org.crud.core.ext.springframework.context.annotation;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * コンテナ登録Bean名の拡張NameGeneratorクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class AnnotationBeanNameGenerator extends org.springframework.context.annotation.AnnotationBeanNameGenerator {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String buildDefaultBeanName(BeanDefinition definition) {
        return definition.getBeanClassName();
    }
}
