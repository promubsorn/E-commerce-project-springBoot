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
public class DeleteProductTests {

    @Autowired
    private productDao productService;

    @Test
    @Transactional
    public void testDeleteProduct() {

        Product product = new Product();
        product.setName("ProductTest01");
        product.setPrice(99);
        productService.addProduct(product);

        int productId = product.getId();
        assertNotNull(productService.getProduct(productId));

        boolean isDeleted = productService.deletProduct(productId);
        assertTrue(isDeleted);

        assertNull(productService.getProduct(productId));

    }

}
