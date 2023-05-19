package com.warleydev.warleyfilmes.repositories;

import com.warleydev.warleyfilmes.entities.Movie;
import com.warleydev.warleyfilmes.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
