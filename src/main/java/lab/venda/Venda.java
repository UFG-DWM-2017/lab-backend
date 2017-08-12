package lab.venda;

public class Venda {

  private String produto;

  private String quantidade;

  public String getProduto() {
    return produto;
  }

  public void setProduto(String produto) {
    this.produto = produto;
  }

  public String getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(String quantidade) {
    this.quantidade = quantidade;
  }

  public Venda() {
    super();
  }

  public Venda(String produto, String quantidade) {
    super();
    this.produto = produto;
    this.quantidade = quantidade;
  }

}
