package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.dao.categoryDao;
import com.jtspringproject.JtSpringProject.models.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class TC0010_DeleteCategoryTests {

    @InjectMocks
    categoryDao daoUnderTest;

    @Mock
    private SessionFactory sessionFactory;

    @Mock
    private Session session;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        when(sessionFactory.getCurrentSession()).thenReturn(session);
    }

    @Test
    void deleteCategoryValid() {
        int categoryId = 1;
        Category persistentInstance = new Category();
        when(session.load(Category.class, categoryId)).thenReturn(persistentInstance);


        boolean result = daoUnderTest.deletCategory(categoryId);


        assertTrue(result);
        verify(session, times(1)).delete(persistentInstance);
    }

    @Test
    void deleteCategoryInvalid() {

        int categoryId = 2;
        when(session.load(Category.class, categoryId)).thenReturn(null);


        boolean result = daoUnderTest.deletCategory(categoryId);

        assertFalse(result);
    }


}
