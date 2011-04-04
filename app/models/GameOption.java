package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class GameOption extends Model {

    @ManyToOne
    public Game game;

    public String description;

}
