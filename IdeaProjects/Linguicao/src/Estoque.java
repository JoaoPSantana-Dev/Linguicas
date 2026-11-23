public class Estoque {
    private int idEstoque;
    private Produto produto;
    private int quantidadeEstoque;
    private static int numeroId=1;

    //Construtor
    public Estoque(Produto produto, int quantidadeEstoque){
        if(produto == null){
            throw new IllegalArgumentException("O produto não pode ser nulo");
        }

        if(quantidadeEstoque<0){
            throw new IllegalArgumentException("A quantidade no estoque não deve ser negativa");
        }

        this.idEstoque=numeroId++;
        this.produto=produto;
        this.quantidadeEstoque=quantidadeEstoque;
    }

    //Setters
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque<0){
            throw new IllegalArgumentException("O valor não deve ser negativo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        this.quantidadeEstoque += quantidade;
    }

    public void retirarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        if (quantidade > quantidadeEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente!");
        }

        this.quantidadeEstoque -= quantidade;
    }



    //Getters
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getNomeProduto(){
        return produto.getNomeProduto();
    }

    public int getIdEstoque(){
        return idEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    //Metodo
    public void mostrarEstoque(){
        System.out.println("O id do estoque é: "+idEstoque);
        System.out.println("A quantidade do produto "+produto.getNomeProduto() + " é: "+quantidadeEstoque);
    }

}
