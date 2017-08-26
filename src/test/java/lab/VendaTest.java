package lab;

import static org.junit.Assert.*;

import org.junit.Test;

import lab.venda.Venda;

public class VendaTest {

  @Test
  public void verificacaoCodigo() {
    Venda venda = new Venda();
    venda.setCodigo(99);

    assert(venda.getCodigo().equals(99));
  }

}
