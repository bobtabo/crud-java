package org.crud.api.exception;

import org.crud.core.exception.AppException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 例外Handlerクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     *
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(AppException.class)
    public ResponseEntity<Object> handleAppException(AppException e, WebRequest request) {
        return super.handleExceptionInternal(e, e.getMessage(), null, HttpStatus.BAD_REQUEST, request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers, HttpStatus status, WebRequest request) {
        // SpringBoot内で用意されている例外については、ResponseEntityExceptionHandlerクラスで例外ごとに
        // 専用のメソッドが用意されているのでそれをオーバーライドする
        return super.handleExceptionInternal(e, e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    /**
     * すべての例外をキャッチする、どこにもキャッチされなかったら呼ばれる
     *
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception e, WebRequest request) {
        return super.handleExceptionInternal(e, e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception e, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        // すべてのハンドリングに共通する処理を挟みたい場合はオーバーライドする
        // ex) ログを吐くなど

        // 任意の処理

        return super.handleExceptionInternal(e, body, headers, status, request);
    }
}
