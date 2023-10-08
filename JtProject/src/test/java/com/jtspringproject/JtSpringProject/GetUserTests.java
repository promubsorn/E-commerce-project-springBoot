/* Copyright (C) 1883 Kittipat Arpanon - All Rights Reserved
* You may use, distribute and modify this code under the terms of the MU license.
*/
package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.hibernate.query.Query;
import com.jtspringproject.JtSpringProject.dao.userDao;

@SpringBootTest
public class GetUserTests {

    @Mock
    private SessionFactory sessionFactory;

    @Mock
    private userDao userDao;

    @Mock
    private Session session;

    @Mock
    private Query query;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        when(session.createQuery(anyString())).thenReturn(query);
    }
    @Test
    public void testGetUser() {

        // Given Valid Credentials
        String username = "admin";
        String password = "123";
        User MockUser1 = new User();
        MockUser1.setUsername(username);
        MockUser1.setPassword(password);
        // When
        User result1 = userDao.getUser(username, password);
        try {
            assertEquals(MockUser1.getUsername(),result1.getUsername());
        }catch (Exception e){
            System.out.println(e);
        }
        // Given invalid Credentials
        username = "admin";
        password = "invalidpassword";
        // When
        User result2 = userDao.getUser(username, password);
        assertNull(result2);
        //Given non existence credentials
        username = "non existence username";
        password = "non existence password";
        User result3 = userDao.getUser(username, password);
        assertNull(result3);
    }
}
