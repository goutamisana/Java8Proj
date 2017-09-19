package com.hcl.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.model.User.Role;

public interface RoleRespository extends  CrudRepository<Role,Long>{

}
