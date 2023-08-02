package com.gap.sample.practice.Springboot_practice.repositories;

import com.gap.sample.practice.Springboot_practice.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
@RepositoryRestResource(path = "products")
public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
