package org.example;

import org.example.DAO.iLoginDAO;
import org.example.Entity.LoginMgmtServiceImpl;
import org.example.Service.ILoginMgmtService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLoginManagement {

    private static ILoginMgmtService loginService;
    private static iLoginDAO loginDAOMock;

    @BeforeAll
    public static void setupOnce() {
        loginDAOMock = Mockito.mock(iLoginDAO.class);
        loginService = new LoginMgmtServiceImpl(loginDAOMock);
    }

    @AfterAll
    public static void clearOnce() {
        loginDAOMock = null;
        loginService = null;
    }

    @Test
    public void testLoginWithValidCredentials() {
        Mockito.when(loginDAOMock.authenticate("user1", "root"))
                .thenReturn(1);
        Assertions.assertTrue(loginService.login("user1", "root"));
    }

    @Test
    public void testLoginWithInValidCredentials() {
        Mockito.when(loginDAOMock.authenticate("user1", "root1"))
                .thenReturn(0);
        Assertions.assertFalse(loginService.login("user1", "root1"));
    }

    @Test
    public void testLoginWithNoCredentials() {
        assertThrows(IllegalArgumentException.class,
                () -> loginService.login("", ""));
    }

    @Test
    public void testRegisterWithSpy() {
        iLoginDAO loginDAOSpy = Mockito.spy(iLoginDAO.class);
        ILoginMgmtService loginService = new LoginMgmtServiceImpl(loginDAOSpy);

        loginService.registerUser("Raja", "admin");
        loginService.registerUser("Navin", "visitor");
        loginService.registerUser("John", "");

        Mockito.verify(loginDAOSpy, Mockito.times(1)).addUser("Raja", "admin");
        Mockito.verify(loginDAOSpy, Mockito.times(0)).addUser("Navin", "visitor");
        Mockito.verify(loginDAOSpy, Mockito.never()).addUser("John", "");
    }
}
