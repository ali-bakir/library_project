package com.bakir.ali.library_project.utils;

import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

public class CookieUtils {
    public static Optional<Object> getCookie(HttpServletRequest request, String oauth2AuthorizationRequestCookieName) {
        return Optional.empty();
    }

    public static Object deserialize(Object cookie, Class<OAuth2AuthorizationRequest> oAuth2AuthorizationRequestClass) {
        return null;
    }

    public static void deleteCookie(HttpServletRequest request, HttpServletResponse response, String oauth2AuthorizationRequestCookieName) {

    }

    public static void addCookie(HttpServletResponse response, String redirectUriParamCookieName, String redirectUriAfterLogin, int cookieExpireSeconds) {
    }

    public static String serialize(OAuth2AuthorizationRequest authorizationRequest) {
        return null;
    }
}
