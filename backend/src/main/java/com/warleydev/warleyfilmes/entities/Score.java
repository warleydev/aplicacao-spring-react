package com.warleydev.warleyfilmes.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {

    public static final long serialVersionUID = 1L;

    @EmbeddedId
    private ScorePK id = new ScorePK();

    @Column(name = "score_value")
    private Double value;

    public Score(){
    }

    public void setMovie(Movie movie){
        id.setMovie(movie);
    }

    public void setUser(User user){
            id.setUser(user);
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
