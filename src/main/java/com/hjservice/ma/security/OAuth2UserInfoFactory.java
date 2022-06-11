package com.hjservice.ma.security;

import com.hjservice.ma.dto.auth.AuthProvider;
import com.hjservice.ma.dto.auth.GoogleOAuth2UserInfo;
import com.hjservice.ma.dto.auth.OAuth2UserInfo;
import com.hjservice.ma.exception.OAuth2AuthenticationProcessingException;

import java.util.Map;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}