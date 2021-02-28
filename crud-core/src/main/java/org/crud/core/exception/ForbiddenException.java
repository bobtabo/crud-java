package org.crud.core.exception;

/**
 * アクセス禁止の例外クラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class ForbiddenException extends RuntimeException {
    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = -2781612929442852926L;

    /**
     * コンストラクタ。
     */
    public ForbiddenException() {
        super();
    }

    /**
     * コンストラクタ。
     *
     * @param message
     * @param cause
     */
    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * コンストラクタ。
     *
     * @param message
     */
    public ForbiddenException(String message) {
        super(message);
    }
}
