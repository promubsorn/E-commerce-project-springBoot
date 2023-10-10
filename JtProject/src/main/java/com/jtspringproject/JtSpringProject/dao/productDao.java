package com.jtspringproject.JtSpringProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jtspringproject.JtSpringProject.models.Category;
import com.jtspringproject.JtSpringProject.models.Product;

@Repository
@Service
public class productDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
	
	@Transactional
	public List<Product> getProducts(){
		return this.sessionFactory.getCurrentSession().createQuery("from PRODUCT").list();
	}
	
	@Transactional
	public Product addProduct(Product product) {
		this.sessionFactory.getCurrentSession().save(product);
		return product;
	}
	
	@Transactional
	public Product getProduct(int id) {
		return this.sessionFactory.getCurrentSession().get(Product.class, id);
	}

	public Product updateProduct(Product product){
		this.sessionFactory.getCurrentSession().update(String.valueOf(Product.class),product);
		return product;
	}
	@Transactional
	public Boolean deletProduct(int id) {
		Session session = this.sessionFactory.getCurrentSession();

		// Attempt to load the product by ID
		Product product = session.get(Product.class, id);

		if (product != null) {
			session.delete(product);
			return true;
		}

		return false; // Product with the given ID does not exist
	}


}
