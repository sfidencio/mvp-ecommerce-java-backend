package com.github.sfidencio.config;

import org.apache.commons.lang.StringUtils;

public class Constants {

    public static final String SPRING = "spring"; ;

    private Constants() {
        throw new IllegalStateException(CLASS_UTILITIY);
    }

    public static final String CLASS_UTILITIY = "Utility class don't need to be instantiated.";
    public static final String MSG_ERRO_DOMAIN_INVALID_PRICE = "Invalid price.";
    public static final String MSG_ERRO_DOMAIN_INVALID_STOCK = "Invalid stock.";
    public static final String MSG_EMPTY = StringUtils.EMPTY;
    public static final int HTTP_STATUS_CODE_400 = 400;
    public static final int HTTP_STATUS_CODE_500 = 500;
    public static final int HTTP_STATUS_CODE_422 = 422;
    public static final int HTTP_STATUS_CODE_409 = 409;
}
