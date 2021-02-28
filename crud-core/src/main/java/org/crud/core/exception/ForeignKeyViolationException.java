package org.crud.core.exception;

/**
 * 外部キー違反の例外クラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class ForeignKeyViolationException extends RuntimeException {
    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 682839077173839556L;

    /**
     * コンストラクタ。
     */
    public ForeignKeyViolationException() {
        super();
    }

    /**
     * コンストラクタ。
     *
     * @param message
     * @param cause
     */
    public ForeignKeyViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * コンストラクタ。
     *
     * @param message
     */
    public ForeignKeyViolationException(String message) {
        super(message);
    }

    /**
     * コンストラクタ。
     *
     * @param cause
     */
    public ForeignKeyViolationException(Throwable cause) {
        super(cause);
    }
}
