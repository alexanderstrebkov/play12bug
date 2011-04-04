package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        GameOption option = new GameOption();
        option.game = Game.find("byName", "Starcraft").first();
        option.description = "something";
        option.create();
        renderText("ok");
    }

}
