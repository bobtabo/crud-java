package org.crud.core.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 暗号化のユーティリティクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
public class Encrypter {

	/** ログ出力 */
	private static final Log LOG = LogFactory.getLog(Encrypter.class);
	/** メッセージダイジェスト */
	private static final String SHA_ALGORITHM = "SHA-256";
	/** メッセージダイジェスト */
	private static final String MD5_ALGORITHM = "MD5";

	/**
	 * 対象文字列をSHAアルゴリズムで暗号化します。
	 *
	 * @param str
	 *            暗号化される文字列
	 * @return 暗号化した文字列
	 */
	public static String toSha(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance(SHA_ALGORITHM);
			md.update(str.getBytes());
			byte[] hash = md.digest();
			return toHex(hash, SHA_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			LOG.error(e.getMessage(), e);
			return null;
		}
	}

	/**
	 * 対象文字列をMD5アルゴリズムで暗号化します。
	 *
	 * @param str
	 *            暗号化される文字列
	 * @return 暗号化した文字列
	 */
	public static String toMd5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance(MD5_ALGORITHM);
			md.update(str.getBytes());
			byte[] hash = md.digest();
			return toHex(hash, MD5_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			LOG.error(e.getMessage(), e);
			return null;
		}
	}

	/**
	 * 対象ファイルをMD5アルゴリズムで暗号化します。
	 *
	 * @param file
	 *            暗号化されるファイル
	 * @return 暗号化したファイル
	 */
	@SuppressWarnings("deprecation")
	public static String toMd5(File file) {
		DigestInputStream dis = null;
		try {
			MessageDigest md = MessageDigest.getInstance(MD5_ALGORITHM);
			dis = new DigestInputStream(new BufferedInputStream(FileUtils.openInputStream(file)), md);
			while (dis.read() != -1) {
			}
			byte[] hash = md.digest();
			return toHex(hash, MD5_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			LOG.error(e.getMessage(), e);
			return null;
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
			e.printStackTrace();
			return null;
		} finally {
			IOUtils.closeQuietly(dis);
		}
	}

	/**
	 * ハッシュ値を文字列に変換します。
	 *
	 * @param hash
	 *            ハッシュ値に対するバイトデータの配列
	 * @param algorithm
	 *            暗号化アルゴリズム
	 * @return 変換した文字列
	 */
	private static String toHex(byte[] hash, String algorithm) {
		StringBuilder result = new StringBuilder();
		if (SHA_ALGORITHM.equals(algorithm)) {
			for (int i = 0; i < hash.length; i++) {
				result.append(Integer.toHexString((hash[i] >> 4) & 0x0F));
				result.append(Integer.toHexString(hash[i] & 0x0F));
			}
		} else if (MD5_ALGORITHM.equals(algorithm)) {
			for (int i = 0; i < hash.length; i++) {
				if ((0xff & hash[i]) < 0x10) {
					result.append("0" + Integer.toHexString((0xFF & hash[i])));
				} else {
					result.append(Integer.toHexString(0xFF & hash[i]));
				}
			}
		}
		return result.toString();
	}
}
