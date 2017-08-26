package lab;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.restassured.RestAssured;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Sql(scripts = "/load.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(scripts = "/clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class LabBackendApplicationTest {

  @Value("${local.server.port}")
  private int serverPort;

  @Before
  public void setUp() throws Exception {
    RestAssured.port = serverPort;
  }

  @Test
  public void vendaTest() {
    get("/api/vendas/-2").
    then().
      body("produto", equalTo("Pastel de Carne"));
  }

}
