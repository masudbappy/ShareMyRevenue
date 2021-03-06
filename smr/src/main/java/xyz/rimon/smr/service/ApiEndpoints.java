package xyz.rimon.smr.service;

/**
 * Created by SAyEM on 4/12/17.
 */

public class ApiEndpoints {
    private ApiEndpoints() {
    }

    public static String BASE_URL = "https://api.sharemyrevenue.net";
//    public static String BASE_URL = "http://192.168.0.102:8080";
    public static String API_VERSION = "/api/v1";

    public static String HOME_URL = "https://www.sharemyrevenue.net";


    public static String REGISTER_URL = BASE_URL + API_VERSION + "/users/create";
    public static String OAUTH_TOKEN_URL = BASE_URL + "/oauth/token";
    public static String POST_EVENT_URL = BASE_URL + API_VERSION + "/events";
    public static String GET_USER_REVENUE_URL = BASE_URL + API_VERSION + "/rev/self";
    public static String POST_PAYMENT_REQUEST_URL = BASE_URL + API_VERSION + "/payments/requests";


    public static String KEY_ACCESS_TOKEN = "access_token";
    public static String KEY_REFRESH_TOKEN = "refresh_token";
    public static String KEY_GRANT_TYPE = "grant_type";
    public static String KEY_CLIENT_ID = "client_id";
    public static String KEY_CLIENT_SECRET = "client_secret";

    public static String KEY_CLIENT_ID_CAMELCASE = "clientId";
    public static String KEY_CLIENT_SECRET_CAMELCASE = "clientSecret";
    public static String KEY_NAME = "name";
    public static String KEY_USERNAME = "username";
    public static String KEY_EMAIL = "email";
    public static String KEY_PASSOWRD = "password";
    public static String KEY_APP_NAME = "appName";
    public static String KEY_APP_PACKAGE_NAME = "appPackageName";
    public static String KEY_MONTH = "month";
    public static String KEY_YEAR = "year";
    public static String KEY_PAYMENT_METHOD = "paymentMethod";
    public static String KEY_ACCOUNT_NUMBER= "accountNumber";
    public static String KEY_REQUEST_AMOUNT = "requestAmount";


    public static String VAL_PASSWORD = "password";
    public static String VAL_REFRESH_TOKEN = "refresh_token";

}
