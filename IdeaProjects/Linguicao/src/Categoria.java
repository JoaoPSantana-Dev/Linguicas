public class Categoria {
    private int idCategoria;
    private String nomeCategoria;
    private static int numeroId=1;

    //Construtor
    public Categoria(String nomeCategoria){
        if(nomeCategoria== null || nomeCategoria.isBlank()){
            throw new IllegalArgumentException("O nome não deve estar vazio!");
        }
        this.idCategoria=numeroId++;
        this.nomeCategoria=nomeCategoria;
    }

    //Setter
    public void setNomeCategoria(String nomeCategoria) {
        if(nomeCategoria== null || nomeCategoria.isBlank()){
            throw new IllegalArgumentException("O nome não deve estar vazio!");
        }
        
        this.nomeCategoria = nomeCategoria;
    }

    //Getters
    public String getNomeCategoria(){
        return this.nomeCategoria;
    }

    public int getNumeroId(){ return this.idCategoria;}

    public void mostrarDados(){
        System.out.println("O id da categoria é: "+idCategoria);
        System.out.println("O nome da categoria é: "+nomeCategoria);
    }


}
