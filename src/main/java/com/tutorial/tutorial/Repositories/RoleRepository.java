package com.tutorial.tutorial.Repositories;

import com.tutorial.tutorial.Entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRoleIgnoreCase(String role);
}
