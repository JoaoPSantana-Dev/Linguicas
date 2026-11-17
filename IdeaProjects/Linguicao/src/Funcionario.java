public class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario;

    int numeroId=1;

    public Funcionario(String nomeFuncionario){
        if(nomeFuncionario.isBlank()){
            System.out.println("Por favor preencha o nome do funcionário");
            return;
        }

        this.idFuncionario=numeroId;
        this.nomeFuncionario=nomeFuncionario;

        numeroId++;
    }

    //getters
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void mostrarDados(){
        System.out.println("O nome do funcionário é: "+nomeFuncionario);
    }


}
