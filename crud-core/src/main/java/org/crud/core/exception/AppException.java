package org.crud.core.exception;

/**
 * システム例外クラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class AppException extends RuntimeException {
    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 8080156003121348364L;

    /**
     * コンストラクタ
     */
    public AppException() {
        super();
    }

    /**
     * コンストラクタ
     *
     * @param s
     */
    public AppException(String s) {
        super(s);
    }

    /**
     * コンストラクタ
     *
     * @param s
     * @param throwable
     */
    public AppException(String s, Throwable throwable) {
        super(s, throwable);
    }

    /**
     * コンストラクタ
     *
     * @param throwable
     */
    public AppException(Throwable throwable) {
        super(throwable);
    }
}
