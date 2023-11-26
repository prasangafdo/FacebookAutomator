package com.facebook.function;

import com.facebook.page.LoginPage;

public class Login {

    private static final LoginPage login = new LoginPage();

    public static void loginWithCredentials(String username, String password){
        login.loginWithCredentials(username, password);
    }
    public static void endSession(){
        login.endSession();
    }


}
