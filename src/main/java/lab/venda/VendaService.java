package lab.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
  
  @Autowired
  VendaRepository vendaRepository;

  public Venda salvar(Venda venda) {
    return vendaRepository.save(venda);
  }
  
}
