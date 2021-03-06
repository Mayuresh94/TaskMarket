package com.kodekonveyor.market.integrationtests;

public class EndToEndTestData {

  public static final String OBJECT_BOX_SELECTOR =
      "#\\/user > td:nth-child(2) > span:nth-child(1) > span:nth-child(1)";
  public static final String BUTTON_SELECTOR = ".btn";
  public static final String PASSWORD_SELECTOR = "#password";
  public static final String LOGIN_FIELD_SELECTOR = "#login_field";
  public static final String LOGIN_BUTTON_SELECTOR =
      ".auth0-lock-social-button-text";
  public static final String URL =
      "https://localhost:1443/market/member/login?next=/market/member/user";
  public static final String PASSWORD = "password1";
}
