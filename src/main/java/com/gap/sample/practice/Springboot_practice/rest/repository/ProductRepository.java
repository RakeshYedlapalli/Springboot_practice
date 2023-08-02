package com.gap.sample.practice.Springboot_practice.rest.repository;

import com.gap.sample.practice.Springboot_practice.rest.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
