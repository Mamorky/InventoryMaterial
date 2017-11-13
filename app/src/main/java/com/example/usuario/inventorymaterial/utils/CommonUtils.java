package com.example.usuario.inventorymaterial.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mamorky on 13/11/17.
 */

public class CommonUtils {

    /**
     * Método que prueba que la contraseña tenga los siguientes requisitos
     * Debe contener al menos un digito del 0-9
     * Debe contener al menos un carácter en minuscula
     * Debe contener al menos un carácter en mayúscula
     * Y debe de tener una longitud de almenos 6 carácteres
     * */
    public static boolean isPasswordValid(String password){
        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
