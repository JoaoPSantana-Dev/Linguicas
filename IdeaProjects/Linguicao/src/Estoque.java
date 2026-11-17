public class Estoque {
    private int idEstoque;
    private Produto produto;
    private int quantidadeEstoque;

    int numeroId=1;

    public Estoque(Produto produto, int quantidadeEstoque){
        if(quantidadeEstoque<0){
            System.out.println("Por favor coloque um valor válido!");
            return;
        }

        this.idEstoque=numeroId;
        this.produto=produto;
        this.quantidadeEstoque=quantidadeEstoque;

        idEstoque++;
    }

    public void mostrarEstoque(){
        System.out.println("O id do estoque é: "+idEstoque);
        System.out.println("A quantidade do produto "+produto.getNomeProduto() + " é: "+quantidadeEstoque);
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
