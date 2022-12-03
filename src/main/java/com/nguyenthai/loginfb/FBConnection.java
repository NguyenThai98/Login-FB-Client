package com.nguyenthai.loginfb;

import java.io.UnsupportedEncodingException;
 
import java.net.URLEncoder;

public class FBConnection {
	public static final String FB_APP_ID = "1041055959643557";
	public static final String REDIRECT_URI = "http://localhost:8080/api/code";

	public static String getFBAuthUrl() {
		String fbLoginUrl = "";
		try {
			fbLoginUrl = "http://www.facebook.com/dialog/oauth?" + "client_id="
					+ FBConnection.FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(FBConnection.REDIRECT_URI, "UTF-8")
					+ "&scope=email,public_profile";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbLoginUrl;
	}


}
