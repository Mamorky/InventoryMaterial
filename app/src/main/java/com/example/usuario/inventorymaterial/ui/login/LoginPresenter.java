package com.example.usuario.inventorymaterial.ui.login;

/**
 * Created by mamorky on 10/11/17.
 */

public interface LoginPresenter {

    void validateCredentials(String user, String password);

    void onDestroy();
}
