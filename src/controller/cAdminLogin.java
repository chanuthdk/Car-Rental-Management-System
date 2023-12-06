package controller;

import model.mAdminLogin;

public class cAdminLogin {
    public boolean validateLogin(String username, String password) {
        mAdminLogin mLogin = new mAdminLogin();
        return mLogin.validateLogin(username, password);
    }
}
