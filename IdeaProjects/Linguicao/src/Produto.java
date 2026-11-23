public class Produto {
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    private String descricaoProduto;
    private Categoria categoria;
    private static int numeroId=1;


    public Produto(String nomeProduto, double precoProduto, String descricaoProduto, Categoria categoria){

        if(nomeProduto == null || nomeProduto.isBlank()){
            throw new IllegalArgumentException("O nome do produto não deve estar vazio!");
        }

        if(descricaoProduto==null || descricaoProduto.isBlank()){
            throw new IllegalArgumentException("Por favor preencha a descrição do produto!");
        }

        if(Double.isFinite(precoProduto) || precoProduto<=0){
            throw new IllegalArgumentException("Por favor, o preço do produto não pode ser nulo e nem negativo!");
        }

        if (categoria == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula!");
        }

        this.idProduto=numeroId++;
        this.nomeProduto=nomeProduto;
        this.precoProduto=precoProduto;
        this.descricaoProduto=descricaoProduto;
        this.categoria=categoria;
    }

    //Setters
    public void setNomeProduto(String nomeProduto){
        if(nomeProduto == null || nomeProduto.isBlank()){
            throw new IllegalArgumentException("O nome do produto não deve estar vazio!");
        }

        this.nomeProduto=nomeProduto;
    }

    public void setPrecoProduto(double precoProduto){
        if(!Double.isFinite(precoProduto) || precoProduto<=0){
            throw new IllegalArgumentException("Por favor, o preço do produto não pode ser nulo e nem negativo!");
        }

        this.precoProduto=precoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto){
        if(descricaoProduto==null || descricaoProduto.isBlank()){
            throw new IllegalArgumentException("Por favor preencha a descrição do produto!");
        }

        this.descricaoProduto=descricaoProduto;
    }

    public void setCategoria(Categoria categoria){
        if (categoria == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula!");
        }

        this.categoria=categoria;
    }

    //Getters
    public int getIdProduto(){ return idProduto;}

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    //Metodos
    public void mostrarDados(){
        System.out.println("O id do produto é: "+idProduto);
        System.out.println("O nome do produto é: "+nomeProduto);
        System.out.println("O preço do produto é: R$ "+precoProduto);
        System.out.println("A descrição do produto é: "+descricaoProduto);
        System.out.println("A categoria do produto é: "+categoria.getNomeCategoria());
    }

}
