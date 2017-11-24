package com.example.usuario.inventoryFragment;

import android.support.annotation.StringRes;
import android.support.test.espresso.matcher.ViewMatchers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by mamorky on 9/11/17.
 */


/**
 * 1.- El usuario introduce una contraseña(Instrumental)
 * 2.- El usuario introduce un usuario(Instrumental)
 * 3.- Que la contraseña tenga al menos 6 caracteres(Instrumental)
 * 4.- Doble Comprobación de la contraseña(Instrumental)
 **/

@RunWith(JUnit4.class)
public class LoginInstrumentalTest {

    /**
     * Comprueba que el campo usuario no este vacio
     * */
    @Test
    public void isUserEmpty(){
        onView(withId(R.id.btnSignIn)).perform(click());
        checkSnackBarDisplayByMessage(R.string.errorUsuarioEmpty);
    }

    /**
     * Comprueba que el campo contraseña no este vacio
     * */
    @Test
    public void isPasswordEmpty(){
        onView(withId(R.id.btnSignIn)).perform(click());
        checkSnackBarDisplayByMessage(R.string.errorPasswordEmpty);
    }

    /**
     *Caso de prueba que comprueba que la longitud de la contraseña es correcta
     * */
    @Test
    public void passwordLength(){

    }

    @Test
    public void passwordDoubleCheck(){

    }

    public void checkSnackBarDisplayByMessage(@StringRes int message){
        onView(withText(message)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}
