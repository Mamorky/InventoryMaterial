package com.example.usuario.inventorymaterial.ui.login;

/**
 * Created by mamorky on 10/11/17.
 */

public class LoginInteractorImp implements LoginInteractor{

    @Override
    public void validateCredentials(String user, String password, OnLoginFinishedListener listener) {
        if listener.onPasswordEmptyError();
        if else
            listener.onUserEmptyError();
        if else
            listener.onPasswordEmptyError();
        else
            listener.onSucess();

    }
}
