package lab.venda;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venda {

  @Id
  private Integer codigo;

  private String produto;

  private Integer quantidade;

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getProduto() {
    return produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

}
