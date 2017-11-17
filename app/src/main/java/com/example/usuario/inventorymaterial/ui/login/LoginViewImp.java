package com.example.usuario.inventorymaterial.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.usuario.inventorymaterial.DashBoardActivity;
import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.ui.base.BaseActivity;


/**
 * @author mamorky
 * @version 20.08
 * */

public class LoginViewImp extends BaseActivity implements LoginView{

    private Button btnSignIn;
    LoginPresenter loginPresenter;
    EditText edtUser,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Pasamos la visa al presentador
        loginPresenter = new LoginPresenterImp(this);

        edtUser = (EditText)findViewById(R.id.edtUser);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.validateCredentials(edtUser.getText().toString(),edtPassword.getText().toString());
            }
        });
    }


    @Override
    public void navigateToHome() {
        Intent i = new Intent(LoginViewImp.this,DashBoardActivity.class);
        startActivity(i);
    }

    @Override
    public void setUserEmptyError() {
        onError(R.string.errorUsuarioEmpty);
    }

    @Override
    public void setPassordEmptyError() {
        onError(R.string.errorPasswordEmpty);
    }

    @Override
    public void setPasswordError() {
        onError(R.string.errorPasswordLenght);
    }

    @Override
    public void setUserCorrect() {

    }

    @Override
    public void setSuccessError() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.onDestroy();
    }
}
