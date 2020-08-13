package com.phdev.springwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phdev.springwebservice.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
