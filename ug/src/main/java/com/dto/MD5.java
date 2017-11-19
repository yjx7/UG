package com.dto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;


public class MD5 {

	private String md5;
	
	public MD5()
	{}
	public MD5(String pw,String time)
	{
		this.md5=toMd5(pw,time);
	}
	private String toMd5(String pw, String time) {
		  byte[] bytes = null;
          MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
	        md.update((pw+time).getBytes());
	        bytes = md.digest();	} 
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	   BASE64Encoder enc=new BASE64Encoder();
       String mes=enc.encodeBuffer(bytes); //使用BASE64编码
       mes=mes.replaceAll("\\r\\n", "");
		return mes;
	}
	
	public String getMd5() {
		return md5;
	}

}
