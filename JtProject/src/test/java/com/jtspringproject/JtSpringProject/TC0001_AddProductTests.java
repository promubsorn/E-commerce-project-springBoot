package com.jtspringproject.JtSpringProject;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.dao.productDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Profile("test")
public class TC0001_AddProductTests {

    @Autowired
    private productDao productService;

    @Test
    @Transactional
    public void testAddProduct() {
        // Test not null product
        Product product = new Product();
        product.setName("Mock Product");
        product.setPrice(100);
        Product savedProduct = productService.addProduct(product);
        assertNotNull(savedProduct.getId());
        assertEquals("Mock Product", savedProduct.getName());

        //Test null product
        assertThrows(IllegalArgumentException.class, () -> productService.addProduct(null));
    }
}
