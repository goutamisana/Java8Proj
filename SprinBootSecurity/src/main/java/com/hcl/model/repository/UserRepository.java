package com.hcl.model.repository;

import com.hcl.model.User.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

	 User findByUsername(String username);
}
