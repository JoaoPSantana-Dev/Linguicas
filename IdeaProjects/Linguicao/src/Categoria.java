import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Categoria {
    private int idCategoria;
    private String nomeCategoria;


    int numeroId=1;
    public Categoria(String nomeCategoria){
        if(nomeCategoria.isBlank()){
            System.out.println("O nome não deve estar vazio!");
            return;
        }

        this.idCategoria=numeroId;
        this.nomeCategoria=nomeCategoria;

        numeroId++;
    }


    public String getNomeCategoria(){
        return nomeCategoria;
    }

    public void MostrarDados(){
        System.out.println("O id da categoria é: "+idCategoria);
        System.out.println("O nome da categoria é: "+nomeCategoria);
    }


}
