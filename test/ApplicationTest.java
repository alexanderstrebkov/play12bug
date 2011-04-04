import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;
import play.db.jpa.JPA;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testGameOption() {
        Fixtures.deleteAllModels();
        Fixtures.load("games.yml");
        Response response = GET("/");
        assertEquals(4, GameOption.count());
        assertIsOk(response);
    }

}
