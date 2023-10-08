package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;
import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;
import java.util.ArrayList;

@SpringBootTest
@Profile("test")
public class DeleteCartTests {

    @Mock
    private cartDao cartDao;

    @Test
    @Transactional
    public void testDeleteCart() {
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
        cartDao.deleteCart(savedCart);
        Assertions.assertEquals(0, cartDao.getCarts().size());
    }
}
