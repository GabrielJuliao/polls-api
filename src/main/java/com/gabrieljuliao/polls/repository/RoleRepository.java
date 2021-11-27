package com.gabrieljuliao.polls.repository;

import com.gabrieljuliao.polls.model.Role;
import com.gabrieljuliao.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
