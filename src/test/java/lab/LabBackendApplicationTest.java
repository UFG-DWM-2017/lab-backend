package lab;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_METHOD;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;

import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lab.venda.Venda;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@Sql(scripts = "/load.sql", executionPhase = BEFORE_TEST_METHOD)
@Sql(scripts = "/clean.sql", executionPhase = AFTER_TEST_METHOD)
public class LabBackendApplicationTest {

  @LocalServerPort
  private int randomServerPort;

  @Before
  public void setUp() throws Exception {
    RestAssured.port = randomServerPort;
  }

  @Test
  public void vendaTest() {
    get("/api/vendas/-1").
    then().
      body("produto", equalTo("Pastel de Carne")).
      body("quantidade", equalTo(4));
  }

  @Test
  public void novaVendaTest() {
    Venda venda = new Venda();
    venda.setCodigo(-100);
    venda.setProduto("Arroz");
    venda.setQuantidade(30);
    
    given().
      contentType(ContentType.JSON).
      body(venda).
    when().
      post("/api/vendas").
    then().
      statusCode(200).
      body("codigo", equalTo(-100));
  }

  @Test
  public void quantidadeVendaTest() {
    get("/api/vendas").
    then().
      body("size()", greaterThan(1));
  }
}
