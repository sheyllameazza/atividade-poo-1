public class SQLFactory {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 18);
        Vendedor vendedor1 = new Vendedor("Maria", 20);
        Produto produto1 = new ProdutoAcabado("camisetas", 29.99);
        Estoque estoque1 = new Estoque(produto1, 50);

        Pedido pedido1 = new Pedido(cliente1, vendedor1, produto1, 3);

        System.out.println("Estoque do produto: " + estoque1.produto.nome + " " + estoque1.quantidade);
        System.out.println("Vendedor: " + vendedor1.nome);
        pedido1.resultado();

    }
}
