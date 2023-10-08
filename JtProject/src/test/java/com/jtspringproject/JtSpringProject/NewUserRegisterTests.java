package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import com.jtspringproject.JtSpringProject.controller.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import com.jtspringproject.JtSpringProject.services.userService;


@SpringBootTest
public class NewUserRegisterTests {
    @InjectMocks
    private UserController userController; // Assuming the controller's name is UserController

    @Mock
    private userService userService; // Assuming the service's name is UserService

    @Captor
    private ArgumentCaptor<User> userCaptor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testNewUserRegister1() {
        //Given Valid register new user
        User ValidUser = new User();
        ValidUser.setUsername("TestUser");
        ValidUser.setAddress("TestAddress");
        ValidUser.setEmail("Test@example.com");
        ValidUser.setPassword("password123");

        // When
        String result1 = userController.newUseRegister(ValidUser);
        verify(userService).addUser(userCaptor.capture());

        User addedUser = userCaptor.getValue();

        // Then
        assertEquals("ROLE_NORMAL", addedUser.getRole()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestUser",addedUser.getUsername()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestAddress",addedUser.getAddress());
        assertEquals("Test@example.com",addedUser.getEmail());
        assertEquals("password123",addedUser.getPassword());
        assertEquals("redirect:/", result1); // Ensure redirection to home page
        verify(userService).addUser(addedUser); // Ensure the user is added using the service
    }
}
