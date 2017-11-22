import groovy.transform.ASTTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

/**
 * @author liliangxi.
 *         Created on 2017/11/22.
 */
public class TestHomeInterfaceTest {
    @Test
    public void test_Excellent_Topics_MoreThan_One(){
        final String uri = "https://testerhome.com/api/v3/topics.json";

        given().when()
                .get(uri)
                .then()
                .body("topics.findAll{it.excellent == 1}.size()", greaterThan(1));
    }

}
