package models;

import play.db.jpa.Model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Game extends Model {

    public String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game")
    public List<GameOption> options;

}
