package com.example.usuario.inventorymaterial;

import com.example.usuario.inventorymaterial.data.db.pojo.User;
import com.example.usuario.inventorymaterial.data.db.repository.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private ArrayList<User> users = new ArrayList<>();

    @Mock
    UserRepository userRepository;

    @Before
    public void inicialice(){
        userRepository = mock(UserRepository.class);
        users = UserRepository.getInstance().getUser();
    }

    // 1.- El usuario introduce una contraseña(Instrumental)

    // 2.- El usuario introduce un usuario(Instrumental)

    // 3.- El usuario exista en la base de datos (Repository)
    //Comparar dos objetos usuario

    @Test
    public void isUserExists_isCorrect(){
        // Cuando se llame al método isUserExists, devuelva un valor predeterminado
        when(userRepository.isUserExists(users.get((0)))).thenReturn(true);
        assertTrue(userRepository.isUserExists(users.get(0)));
    }

    @Test
    public void getUser_isCorrect(){
        when(userRepository.getUser()).thenReturn(users);
        assertEquals(users.get(0),userRepository.getUser().get(0));
    }
    // 4.- Contraseña es correcta(Repository)
    @Test
    public void password_isCorrect(){
        when(userRepository.getUser()).thenReturn(users);
        assertEquals(users.get(0),userRepository.getUser().get(0));
    }

    @Test
    public void testAssertions(){
        User  user = new User(1,"mamorky","123","Andrés","andres_ball@hotmail.com",true,true);
        assertEquals(user,users.get(0));
        User user2 = null;
        User user3 = user;

        // Podemos comprobar si no es nulo con AssertNotNull
        assertNotNull(user);
        // Podemos comprobar si un objeto es nulo
        assertNull(user2);

        // Dos objetos apuntan a la misma referencia.
        assertSame(user,user3);
    }

    @Test
    public void login_isCorrect() throws Exception {

    }

    @Test
    public void registro_isCorrect() throws Exception{
        // 1.- El usuario introduce una contraseña(Instrumentales)

        // 2.- El usuario introduce un usuario/email(Instrumentales)

        // 5.- Que la contraseña tenga al menos 6 caracteres(Instrumental)

        // 8.- Doble Comprobación de la contraseña(Instrumental)
    }
}