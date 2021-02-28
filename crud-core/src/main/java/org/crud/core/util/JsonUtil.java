package org.crud.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * Json関連のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class JsonUtil {
    /**
     * マッピングオブジェクトを取得します。
     *
     * @return マッピングオブジェクト
     */
    public static ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        mapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

        JavaTimeModule jtm = new JavaTimeModule();
        jtm.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        mapper.registerModule(jtm);
        return mapper;
    }
}
