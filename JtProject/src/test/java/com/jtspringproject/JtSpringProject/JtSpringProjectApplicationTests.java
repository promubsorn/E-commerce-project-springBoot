package com.jtspringproject.JtSpringProject;

import com.jtspringproject.JtSpringProject.controller.UserController;
import com.jtspringproject.JtSpringProject.dao.productDao;
import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.jtspringproject.JtSpringProject.services.userService;
import org.hibernate.query.Query;
import com.jtspringproject.JtSpringProject.dao.userDao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SpringBootTest
class JtSpringProjectApplicationTests {
	@Test
	void contextLoads() {
	}

}
