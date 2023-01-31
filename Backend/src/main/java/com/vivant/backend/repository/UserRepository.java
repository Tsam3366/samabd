package com.vivant.backend.repository;

import com.vivant.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long>
{
    @Query(value = "select * from user where username=?1 and password=?2",nativeQuery = true)
    User findByUsernameAndPassword(String username,String Password);
}
