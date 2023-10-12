package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.dao.categoryDao;
import com.jtspringproject.JtSpringProject.models.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TC0009_AddCategoryTests {

    @InjectMocks
    private categoryDao daoUnderTest;

    @Mock
    private SessionFactory sessionFactory;

    @Mock
    private Session session;

    @Mock
    private Transaction transaction;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        when(session.getTransaction()).thenReturn(transaction);
    }

    @Test
    void testAddCategory() {
        String categoryName = "Electronics";
        Category category = new Category();
        category.setName(categoryName);


        Category addedCategory = daoUnderTest.addCategory(categoryName);

        Assertions.assertEquals(categoryName, addedCategory.getName());
        Assertions.assertNotNull(categoryName, addedCategory.getName());
        Assertions.assertNotEquals("", addedCategory.getName());


        verify(session, times(1)).saveOrUpdate(any(Category.class));
    }
}
