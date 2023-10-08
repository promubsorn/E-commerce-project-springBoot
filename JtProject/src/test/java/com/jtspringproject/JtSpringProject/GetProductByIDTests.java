package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.dao.productDao;
import com.jtspringproject.JtSpringProject.models.Product;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GetProductByIDTests {

    @Autowired
    private productDao productService;

    @Mock
    private SessionFactory sessionFactory;

    @Mock
    private Session session;

    @Test
    public void testGetProductByID() {
        int productId = 1;
        Product expectedProduct = new Product();
        expectedProduct.setId(productId);
        productService.addProduct(expectedProduct);
        Product actualProduct = productService.getProduct(productId);
        assertNotNull(actualProduct);
        assertEquals(1, actualProduct.getId());


        int invalidProductId = -1;
        assertNull(productService.getProduct(invalidProductId));
    }

}
