public class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private static int numeroId=1;

    public Funcionario(String nomeFuncionario){
        if(nomeFuncionario == null ||nomeFuncionario.isBlank()){
            throw new IllegalArgumentException("O nome não deve estar vazio!");
        }

        this.idFuncionario=numeroId++;
        this.nomeFuncionario=nomeFuncionario;
    }


    //Setters
    public void setNomeFuncionario(String nomeFuncionario) {
        if(nomeFuncionario == null || nomeFuncionario.isBlank()){
            throw new IllegalArgumentException("O nome não deve estar vazio!");
        }

        this.nomeFuncionario = nomeFuncionario;
    }

    //Getters
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    //Metodos

    public void mostrarDados(){
        System.out.println("O id do funcionário é: "+idFuncionario);
        System.out.println("O nome do funcionário é: "+nomeFuncionario);
    }

}
