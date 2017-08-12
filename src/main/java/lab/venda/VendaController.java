package lab.venda;

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
    return null;
  }

  @GetMapping
  public List<Venda> listarVendas() {
    //TODO Retornar as vendas.
    return null;
  }

  @DeleteMapping
  public Venda apagarVenda(Venda venda) {
    //TODO Apagar a venda.
    return null;
  }
}
