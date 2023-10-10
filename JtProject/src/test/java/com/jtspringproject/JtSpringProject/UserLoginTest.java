package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.controller.UserController;
import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import com.jtspringproject.JtSpringProject.services.productService;
import com.jtspringproject.JtSpringProject.services.userService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserLoginTest {

    @InjectMocks
    UserController userController;

    @Mock
    userService userServiceMock;

    @Mock
    productService productServiceMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testUserLoginWithValidCredentials() {

        User mockUser = new User();
        mockUser.setUsername("Testeiei");
        when(userServiceMock.checkLogin("Testeiei", "password123")).thenReturn(mockUser);

        Product mockProduct = new Product();
        List<Product> mockProducts = Arrays.asList(mockProduct);
        when(productServiceMock.getProducts()).thenReturn(mockProducts);

        ModelAndView result = userController.userlogin("Testeiei", "password123", null, new MockHttpServletResponse());

        assertEquals("index", result.getViewName());
    }

    @Test
    void testUserLoginWithInvalidCredentials() {
        User mockUser = new User();
        mockUser.setUsername("");
        when(userServiceMock.checkLogin("invalidUser", "invalidPass")).thenReturn(mockUser);


        ModelAndView result = userController.userlogin("invalidUser", "invalidPass", null, new MockHttpServletResponse());


        assertEquals("userLogin", result.getViewName());
        assertEquals("Please enter correct email and password", result.getModel().get("msg"));
    }

    @Test
    void testUserLoginWithValidCredentialsButDatabaseError() {
        when(userServiceMock.checkLogin("Testeiei", "password123")).thenReturn(null);

        assertThrows(NullPointerException.class, () -> {
            userController.userlogin("Testeiei", "password123", null, new MockHttpServletResponse());
        });
    }
}
