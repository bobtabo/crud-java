package org.crud.core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import org.crud.core.dto.Dto;
import org.crud.core.util.DozerUtil;
import org.crud.core.util.JsonUtil;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * 基底Controllerクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class ControllerSupport {
    @Autowired
    protected ObjectMapper jsonMapper;

    /**
     * マッピングオブジェクトを取得します。
     *
     * @param dxo マッピング設定オブジェクト
     * @return マッピングオブジェクト
     */
    protected Mapper getDozerMapper(BeanMappingBuilder dxo) {
        return DozerUtil.getMapper(dxo);
    }

    /**
     * レスポンスを取得します。
     *
     * @param response レスポンスオブジェクト
     * @return レスポンス
     */
    protected ResponseEntity<String> getResponse(HttpStatus status, JsonResponse response) {
        return getResponseEntity(status, response);
    }

    /**
     * レスポンスを取得します。
     *
     * @param dto DTO
     * @return レスポンス
     */
    protected ResponseEntity<String> getResponse(HttpStatus status, Dto dto) {
        return getResponseEntity(status, dto);
    }

    /**
     * レスポンスを取得します。
     *
     * @param entity エンティティ
     * @return レスポンス
     */
    protected ResponseEntity<String> getResponse(HttpStatus status, DomainEntity entity) {
        return getResponseEntity(status, entity);
    }

    /**
     * レスポンスを取得します。
     *
     * @param list リスト
     * @return レスポンス
     */
    protected <E> ResponseEntity<String> getResponse(HttpStatus status, List<E> list) {
        return getResponseEntity(status, list);
    }

    /**
     * レスポンスを取得します。
     *
     * @param object オブジェクト
     * @return レスポンス
     */
    protected <E> ResponseEntity<String> getResponse(HttpStatus status, E object) {
        return getResponseEntity(status, object);
    }

    /**
     * オブジェクトをレスポンスに変換します。
     *
     * @param object オブジェクト
     * @return レスポンス
     */
    private <E> ResponseEntity<String> getResponseEntity(HttpStatus status, E object) {
        return ResponseEntity.status(status).contentType(MediaType.APPLICATION_JSON).body(toJson(object));
    }

    /**
     * オブジェクトをJson出力します。
     *
     * @param object オブジェクト
     * @return 出力したJson
     */
    private <E> String toJson(E object) {
        try {
            //ObjectMapperのMockインスタンスだと、テスト実行時にJson出力が空文字になってしまう対応
            if (jsonMapper == null) {
                jsonMapper = JsonUtil.getMapper();
            }

            return jsonMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
