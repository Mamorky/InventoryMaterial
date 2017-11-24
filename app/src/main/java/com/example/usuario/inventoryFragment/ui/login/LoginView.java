package com.example.usuario.inventoryFragment.ui.login;

/**
 * Created by mamorky on 10/11/17.
 */

/**
 * Contiene los métodos necesarios/expuestos para que el presentador los use
 * */

public interface LoginView {
    void navigateToHome();

    void setUserEmptyError();

    void setPassordEmptyError();

    void setPasswordError();

    void setUserCorrect();

    void setSuccessError();
}
