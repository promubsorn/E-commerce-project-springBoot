package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.dao.categoryDao;
import com.jtspringproject.JtSpringProject.models.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class TC0008_UpdateCategoryTests {

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
    void updateCategory_ValidIdAndName_CategoryUpdated() {
        int categoryId = 1;
        String newName = "UpdatedCategory";
        Category existingCategory = new Category();
        existingCategory.setName("OldCategory");

        when(session.get(Category.class, categoryId)).thenReturn(existingCategory);

        Category updatedCategory = daoUnderTest.updateCategory(categoryId, newName);

        assertEquals(newName, updatedCategory.getName());
        verify(session).update(existingCategory);
    }


    @Test
    void updateCategory_ValidIdAndName_FailureFetching_NoUpdate() {
        int categoryId = 1;
        String newName = "UpdatedCategory";

        when(session.get(Category.class, categoryId)).thenThrow(new RuntimeException("Database fetch error"));

        Assertions.assertThrows(RuntimeException.class, () -> daoUnderTest.updateCategory(categoryId, newName));

        verify(session, never()).update(any());
    }


    @Test
    void updateCategory_ValidIdAndName_FailureUpdating_NoUpdate() {
        int categoryId = 1;
        String newName = "UpdatedCategory";
        Category existingCategory = new Category();
        existingCategory.setName("OldCategory");

        when(session.get(Category.class, categoryId)).thenReturn(existingCategory);
        doThrow(new RuntimeException("Database update error")).when(session).update(existingCategory);

        Assertions.assertThrows(RuntimeException.class, () -> daoUnderTest.updateCategory(categoryId, newName));
    }
}
