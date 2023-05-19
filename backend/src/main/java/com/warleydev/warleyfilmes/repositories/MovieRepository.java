package com.warleydev.warleyfilmes.repositories;

import com.warleydev.warleyfilmes.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
