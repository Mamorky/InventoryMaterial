package com.example.usuario.inventorymaterial.ui.login;

/**
 * Created by mamorky on 10/11/17.
 */

public interface LoginInteractor {

    void validateCredentials(String user, String password,LoginInteractor.OnLoginFinishedListener listener);

    interface  OnLoginFinishedListener{
        void onUserEmptyError();

        void onPasswordEmptyError();

        void onPasswordError();

        void onUserCorrect();

        void onSucess();
    }
}
