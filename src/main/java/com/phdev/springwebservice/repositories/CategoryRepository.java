package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
