package lab.venda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
  
  @Autowired
  VendaRepository vendaRepository;

  public Venda salvar(Venda venda) {
    return vendaRepository.save(venda);
  }

  public Iterable<Venda> listar() {
    return vendaRepository.findAll();
  }

  public void remover(Integer codigo) {
    vendaRepository.delete(codigo);
  }
  
}
