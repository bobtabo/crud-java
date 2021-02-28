package org.crud.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.spring.DozerBeanMapperFactoryBean;
import org.crud.core.ext.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.crud.core.util.JsonUtil;
import org.crud.db.dbflute.allcommon.DBFluteBeansJavaConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Configuration
@PropertySource("classpath:application.properties")
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan(
        nameGenerator = AnnotationBeanNameGenerator.class,
        basePackages = {
                "org.crud.core",
        }
)
@Import({DBFluteBeansJavaConfig.class})
@EnableAspectJAutoProxy
public class ApiConfig implements WebMvcConfigurer {

    /**
     * @return
     */
    @Bean
    public ObjectMapper jsonMapper() {
        return JsonUtil.getMapper();
    }

    /**
     * @return
     */
    @Bean
    public Mapper dozerMapper() {
        return new DozerBeanMapperFactoryBean().getObject();
    }

    /**
     * @return
     */
    @Bean
    public RestTemplate rest() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        return restTemplateBuilder.build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginCheckInterceptor()).addPathPatterns("/**");
//                registry.addInterceptor(new SetFrontCommonDataInterceptor()).addPathPatterns("/**");
//                registry.addInterceptor(new ParameterFilterInterceptor()).addPathPatterns("/**");
//                registry.addInterceptor(new PrepareInterceptor()).addPathPatterns("/**");
    }
}
