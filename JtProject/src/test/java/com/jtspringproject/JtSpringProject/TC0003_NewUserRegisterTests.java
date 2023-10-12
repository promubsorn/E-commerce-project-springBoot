/* Copyright (C) 2023 Kittipat Arpanon - All Rights Reserved
 * You may use, distribute and modify this code under the terms of the MU license.
 */
package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
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
        //(False, Capable)
        //'4', 'TestAddress', 'Test@example.com', 'password123', 'ROLE_NORMAL', 'TestUser'
        //expected result (The method able to add new user to the table and return “redirect:/”)
        User ValidUser = new User();
        ValidUser.setUsername("TestUser");
        ValidUser.setAddress("TestAddress");
        ValidUser.setEmail("Test@example.com");
        ValidUser.setPassword("password123");

        // When
        String result = userController.newUseRegister(ValidUser);
        verify(userService).addUser(userCaptor.capture());

        User addedUser = userCaptor.getValue();

        // Then
        assertEquals("ROLE_NORMAL", addedUser.getRole()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestUser",addedUser.getUsername()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestAddress",addedUser.getAddress());
        assertEquals("Test@example.com",addedUser.getEmail());
        assertEquals("password123",addedUser.getPassword());
        assertEquals("redirect:/", result); // Ensure redirection to home page
        verify(userService, times(1)).addUser(ValidUser);
    }
    @Test
    public void testNewUserRegister2(){
        //(False, Incapable)
        //'4', 'TestAddress', 'invalidemailformat', 'password123', 'ROLE_NORMAL', 'TestUser'
        //expected result (The method unable to add new user to the table and return “redirect:/”)
        User ValidUser = new User();
        ValidUser.setUsername("TestUser");
        ValidUser.setAddress("TestAddress");
        ValidUser.setEmail("invalidemailformat");
        ValidUser.setPassword("password123");
        // When
        String result = userController.newUseRegister(ValidUser);
        verify(userService).addUser(userCaptor.capture());

        User addedUser = userCaptor.getValue();
        assertEquals("ROLE_NORMAL", addedUser.getRole()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestUser",addedUser.getUsername()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestAddress",addedUser.getAddress());
        assertEquals("invalidemailformat",addedUser.getEmail());
        assertEquals("password123",addedUser.getPassword());
        assertEquals("redirect:/", result);
        verify(userService, times(0)).addUser(ValidUser);
    }
    @Test
    public void testNewUserRegister3(){
        //(True,Capable)
        //'4',null, 'Test@example.com', 'password123', 'ROLE_NORMAL', 'TestUser'
        //expected result (The method able to add new user to the table and return “redirect:/”)
        User ValidUser = new User();
        ValidUser.setUsername("TestUser");
        ValidUser.setAddress(null);
        ValidUser.setEmail("Test@example.com");
        ValidUser.setPassword("password123");
        // When
        String result = userController.newUseRegister(ValidUser);
        verify(userService).addUser(userCaptor.capture());

        User addedUser = userCaptor.getValue();
        assertEquals("ROLE_NORMAL", addedUser.getRole()); // Ensure role is set to ROLE_NORMAL
        assertEquals("TestUser",addedUser.getUsername()); // Ensure role is set to ROLE_NORMAL
        assertNull(addedUser.getAddress());
        assertEquals("Test@example.com",addedUser.getEmail());
        assertEquals("password123",addedUser.getPassword());
        assertEquals("redirect:/", result);
        verify(userService, times(1)).addUser(ValidUser);
    }
    @Test
    public void testNewUserRegister4(){
        //(True, Incapable)
        //'4',null, 'Test@example.com', 'password123', 'ROLE_NORMAL', 'TestUser'
        //expected result (The method unable to add new user to the table and return “redirect:/”)
        User ValidUser = new User();
        ValidUser.setUsername(null);
        ValidUser.setAddress(null);
        ValidUser.setEmail("Test@example.com");
        ValidUser.setPassword("password123");
        // When
        String result = userController.newUseRegister(ValidUser);
        verify(userService).addUser(userCaptor.capture());

        User addedUser = userCaptor.getValue();
        assertEquals("ROLE_NORMAL", addedUser.getRole()); // Ensure role is set to ROLE_NORMAL
        assertNull(addedUser.getUsername()); // Ensure role is set to ROLE_NORMAL
        assertNull(addedUser.getAddress());
        assertEquals("Test@example.com",addedUser.getEmail());
        assertEquals("password123",addedUser.getPassword());
        assertEquals("redirect:/", result);
        verify(userService, times(0)).addUser(ValidUser);
    }
}
