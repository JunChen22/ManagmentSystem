package com.brooklyn.cuny.cisc4900.cisc4900.sercurity;

public class SecurityConstants {

    public static final String SIGN_UP_URLS = "/api/user/**";
    public static final String H2_URL = "h2-console/**";
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRATION_TIME = 300_000; //30 seconds
    //public static final SignatureAl
}