package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

	 public List<User> findByUsernameAndPassword(String username,String password);
}
