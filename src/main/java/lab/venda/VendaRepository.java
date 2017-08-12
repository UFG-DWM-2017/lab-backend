package lab.venda;

import org.springframework.data.repository.CrudRepository;

public interface VendaRepository extends CrudRepository<Venda, Integer> {
  public Iterable<Venda> findByQuantidadeGreaterThan(Integer quantidade);
}
