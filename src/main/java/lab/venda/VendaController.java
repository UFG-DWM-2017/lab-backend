package lab.venda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venda")
public class VendaController {
  
  @Autowired
  VendaService vendaService;

  @PostMapping
  public Venda salvar(Venda venda) {
    return vendaService.salvar(venda);
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
