package lab.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {
  
  @Autowired
  VendaService vendaService;

  @PostMapping
  public Venda salvar(@RequestBody Venda venda) {
    return vendaService.salvar(venda);
  }

  @GetMapping
  public Iterable<Venda> listar() {
    return vendaService.listar();
  }

  @GetMapping("/grande")
  public Iterable<Venda> listarGrandesVendas() {
    return vendaService.listarGrandesVendas();
  }

  @GetMapping("/{codigo}")
  public Venda obter(@PathVariable("codigo") Integer codigo) {
    return vendaService.obter(codigo);
  }

  @DeleteMapping("/{codigo}")
  public void remover(@PathVariable("codigo") Integer codigo) {
    vendaService.remover(codigo);
  }
}
