package com.warleydev.warleyfilmes.repositories;

import com.warleydev.warleyfilmes.entities.Movie;
import com.warleydev.warleyfilmes.entities.Score;
import com.warleydev.warleyfilmes.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
