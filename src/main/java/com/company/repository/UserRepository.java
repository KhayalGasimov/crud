package com.company.repository;

import com.company.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByPublished(boolean published);
    List<User> findByTitleContaining(String title);
}
