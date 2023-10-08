package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.models.Category;
import com.jtspringproject.JtSpringProject.models.Product;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;
import com.jtspringproject.JtSpringProject.services.categoryService;
import com.jtspringproject.JtSpringProject.controller.AdminController;
import com.jtspringproject.JtSpringProject.services.productService;

@SpringBootTest
class JtSpringProjectApplicationTests {
	@InjectMocks
	private AdminController AdminController;

	@Mock
	private categoryService categoryService;

	@Mock
	private productService productService;
	@Captor
	private ArgumentCaptor<Product> productCaptor;
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	@Test
	public void testAddProduct() {
		// Given
		int categoryId = 1;
		Category mockCategory = new Category();
		when(categoryService.getCategory(categoryId)).thenReturn(mockCategory);

		// When
		String result = AdminController.addProduct("Orange", categoryId, 100, 50, 10, "Orange", "https://www.kapruka.com/cdn-cgi/image/width=700,quality=93,f=auto/shops/specialGifts/additionalImages/large/1215158420453_oranges.jpg");


		// Then
		assertEquals("redirect:/admin/products", result);
		verify(categoryService).getCategory(categoryId);
		verify(productService).addProduct(productCaptor.capture());

		Product addedProduct = productCaptor.getValue();
		assertEquals("Orange", addedProduct.getName());
		assertEquals(mockCategory, addedProduct.getCategory());
		assertEquals(100, addedProduct.getPrice());
		assertEquals(50, addedProduct.getWeight());
		assertEquals(10, addedProduct.getQuantity());
		assertEquals("Orange", addedProduct.getDescription());
		assertEquals("https://www.kapruka.com/cdn-cgi/image/width=700,quality=93,f=auto/shops/specialGifts/additionalImages/large/1215158420453_oranges.jpg", addedProduct.getImage());
	}
	@Test
	public void testRemoveProduct() {
		// Given
		int testId = 1;

		// When
		String result = AdminController.removeProduct(testId);
		System.out.println(result);
		// Then
		assertEquals("redirect:/admin/products", result);
		verify(productService).deleteProduct(testId);
	}

	@Test
	void contextLoads() {
	}

}
