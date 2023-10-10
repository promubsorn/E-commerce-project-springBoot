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
    public void testGetUser1() {
        // (False, correct credential)
        //'admin', '123'
        //expected result ('1', '123, Albany Street', 'admin@nyan.cat', '123', 'ROLE_ADMIN', 'admin')
        String username = "admin";
        String password = "123";
        User MockUser1 = new User();
        MockUser1.setUsername(username);
        MockUser1.setPassword(password);
        // When
        User result1 = userDao.getUser(username, password);
        assertEquals(MockUser1.getUsername(), result1.getUsername());
    }
    @Test
    public void testGetUser2() {
        // (False,Incorrect credential)
        //‘admin’,’invalidpassword’
        //expected result (null)
        String username = "admin";
        String password = "invalidpassword";
        // When
        User result2 = userDao.getUser(username, password);
        assertNull(result2);
    }
    @Test
    public void testGetUser3() {
        // (True, correct credential)
        //‘admin’,null
        //expected result (null)
        String username = "admin";
        String password = null;
        User result3 = userDao.getUser(username, password);
        assertNull(result3);
    }
    @Test
    public void testGetUser4(){
        // (True, incorrect credential)
        //‘invalidusername’,null
        //expected result (null)
        String username = "invalidusername";
        String password = null;
        User result4 = userDao.getUser(username, password);
        assertNull(result4);
    }
}
