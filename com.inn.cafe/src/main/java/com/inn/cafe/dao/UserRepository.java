package com.inn.cafe.dao;

import com.inn.cafe.model.User;
import com.inn.cafe.wrapper.UserMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmailId(@Param("email") String email);

    List<UserMapper> getAllUser();

    List<String> getAllAdmin();


    @Transactional
    @Modifying
    Integer updateStatus (@Param("status") String status,@Param("id") Integer id);

    User findByEmail(String email);
}
