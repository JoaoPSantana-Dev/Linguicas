public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descricaoProduto;
    private Categoria categoria;

    public Produto(String nomeProduto, double precoProduto, String descricaoProduto, Categoria categoria){

        if(nomeProduto.isBlank()){
            System.out.println("Por favor preencha o nome do produto!");
            return;
        }

        if(descricaoProduto.isBlank()){
            System.out.println("Por favor preencha a descrição do produto!");
            return;
        }

        if(precoProduto<=0){
            System.out.println("Por favor, o preço do produto não pode ser nulo e nem negativo!");
            return;
        }

        this.nomeProduto=nomeProduto;
        this.precoProduto=precoProduto;
        this.descricaoProduto=descricaoProduto;
        this.categoria=categoria;
    };

    public void mostrarDados(){
        System.out.println("O nome do produto é: "+nomeProduto);
        System.out.println("O preço do produto é: R$ "+precoProduto);
        System.out.println("A descrição do produto é: "+descricaoProduto);
        System.out.println("A categoria do produto é: "+categoria.getNomeCategoria());
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getCategoria() {
        return categoria.getNomeCategoria();
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
}
