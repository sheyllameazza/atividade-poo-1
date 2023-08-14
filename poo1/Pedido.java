public class Pedido {
  Cliente cliente;
  Vendedor vendedor;
  Produto produto;
  int quantidade;

  public Pedido(Cliente cliente, Vendedor vendedor, Produto produto, int quantidade) {
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.produto = produto;
    this.quantidade = quantidade;
  }

  public void resultado() {
    System.out.println("Pedido de " + produto.nome + " do cliente " + cliente.nome + " deu um total de "
        + produto.preco * quantidade);
  }
}
