package lab.venda;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venda")
public class VendaController {

  @PostMapping
  public Venda salvarVenda(Venda venda) {
    //TODO Salvar a venda.
    return new Venda("Coca cola", "3");
  }

  @GetMapping
  public List<Venda> listarVendas() {
    //TODO Retornar as vendas.
    Venda venda = new Venda("Coca cola", "3");
    return Arrays.asList(venda);
  }

  @DeleteMapping
  public Venda apagarVenda(Venda venda) {
    //TODO Apagar a venda..
    return new Venda("Coca cola", "3");
  }
}
