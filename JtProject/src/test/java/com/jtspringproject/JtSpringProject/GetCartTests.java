package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@Profile("test")
public class GetCartTests {

    @MockBean
    private cartDao cartDao;

    @Test
    public void testGetCarts() {
        
        User user = new User();
        user.setUsername("TestUser");
        user.setAddress("TestAddress");
        user.setEmail("lisa@gmail.com");
        user.setPassword("password123");

        ArrayList<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setName("Mock Product");
        product.setPrice(100);
        products.add(product);

        Cart cart = new Cart();
        cart.setCustomer(user);
        cart.setProducts(products);

        List<Cart> expectedCarts = new ArrayList<>();
        expectedCarts.add(cart);

        when(cartDao.getCarts()).thenReturn(expectedCarts);
        List<Cart> actualCarts = cartDao.getCarts();
        assertNotNull(actualCarts);
        assertEquals(expectedCarts.size(), actualCarts.size());
    }
}

