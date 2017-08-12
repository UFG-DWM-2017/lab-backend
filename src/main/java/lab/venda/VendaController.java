package lab.venda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VendaController {

  @GetMapping("/venda")
  public Venda vender() {
    return new Venda("Coca cola", "3");
  }

  @GetMapping("/vendas")
  public String listarVendas() {
    return "Aqui virá a lista de vendas";
  }
}
