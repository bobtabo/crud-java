package org.crud.core.exception;

/**
 * データが存在しない例外クラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class DataNotFoundException extends RuntimeException {
    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1092112078446489052L;

    /**
     * コンストラクタ。
     */
    public DataNotFoundException() {
        super();
    }

    /**
     * コンストラクタ。
     *
     * @param message
     * @param cause
     */
    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * コンストラクタ。
     *
     * @param message
     */
    public DataNotFoundException(String message) {
        super(message);
    }

    /**
     * コンストラクタ。
     *
     * @param cause
     */
    public DataNotFoundException(Throwable cause) {
        super(cause);
    }
}
