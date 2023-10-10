package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
@Profile("test")
public class TC0005_AddCartTests {

    @Autowired
    private cartDao cartDao;

    @Test
    @Transactional
    public void testAddCart() {
        User user = new User();
        user.setUsername("TestUser");
        user.setAddress("TestAddress");
        user.setEmail("lisa@gmail.com");
        user.setPassword("password123");

        ArrayList<Product> products = new ArrayList<Product>();

        Product product = new Product();
        product.setName("Mock Product");
        product.setPrice(100);
        products.add(product);

        Cart cart = new Cart();
        cart.setCustomer(user);
        cart.setProducts(products);

        Cart savedCart = cartDao.addCart(cart);
        Assertions.assertNotNull(savedCart.getId());
        Assertions.assertEquals(products,savedCart.getProducts());
        Assertions.assertThrows(IllegalArgumentException.class, () -> cartDao.addCart(null));
    }
}
