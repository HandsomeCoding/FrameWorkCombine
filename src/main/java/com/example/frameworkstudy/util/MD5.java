package com.example.frameworkstudy.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;

/**
 *
 */
public class MD5 {
	/**
	 * 将指定byte数组转换成16进制字符串
	 * 
	 * @param b
	 * @return
	 */
	public static String byteToHexString(byte[] b) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			hexString.append(hex.toUpperCase());
		}
		return hexString.toString();
	}

    /**
     * 加密
     * @param content
     * @return
     */
    public static String getMD5Code(String content) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(content.getBytes());
			byte[] b = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				int v = (int) b[i];
				v = v < 0 ? 0x100 + v : v;
				String cc = Integer.toHexString(v);
				if (cc.length() == 1) {
					sb.append('0');
				}
				sb.append(cc);
			}
			return sb.toString();
		}
		catch (Exception e) {
		}
		return "";
	}

	public static byte[] hmacSha1(String src, String key) {
		try {
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes("utf-8"), "HmacSHA1");
			Mac mac = Mac.getInstance("HmacSHA1");
			mac.init(signingKey);
            return mac.doFinal(src.getBytes("utf-8"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}