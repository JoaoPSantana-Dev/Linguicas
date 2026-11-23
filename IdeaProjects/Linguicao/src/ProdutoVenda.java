public class ProdutoVenda {
    private Produto produto;
    private int quantidadeProduto;

    //Construtor
    public  ProdutoVenda(Produto produto, int quantidadeProduto){
        if(produto == null || quantidadeProduto<=0){
            throw new IllegalArgumentException("Por favor insira valores válidos");
        }

        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
    }

    //Setters
    public void setQuantidadeProduto(int quantidadeProduto){
        if(quantidadeProduto<=0){
            throw new IllegalArgumentException("A quantidade deve ser maior que 0");
        }

        this.quantidadeProduto=quantidadeProduto;
    }

    public void adicionarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        this.quantidadeProduto += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= 0 || quantidade >= quantidadeProduto) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        this.quantidadeProduto -= quantidade;
    }

    //Getters
    public Produto getProduto(){
        return produto;
    }

    public int getQuantidadeProduto(){
        return quantidadeProduto;
    }

    //Metodos
    public void mostrarDados(){
        System.out.println("O nome do produto é: "+getProduto().getNomeProduto());
        System.out.println("A quantidade do produto é: "+quantidadeProduto);
        System.out.println("O subtotal é: "+calcularSubtotal());
    }

    public double calcularSubtotal() {
        return produto.getPrecoProduto() * quantidadeProduto;
    }

}
