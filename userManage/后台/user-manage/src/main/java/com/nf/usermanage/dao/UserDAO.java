package com.nf.usermanage.dao;

import com.nf.usermanage.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDAO extends JpaRepository<Users,Long> {

    Users getUsersById(Long uid);

}
