public class Cliente {
    private int idCliente;
    private String cpfCliente;
    private  String nomeCliente;
    private static int numeroId;

    //Construtor
    public Cliente(String cpfCliente, String nomeCliente){
        if( cpfCliente == null || nomeCliente==null || cpfCliente.isBlank() || nomeCliente.isBlank()){
            throw new IllegalArgumentException("Não deve haver campos vazios!");
        }

        this.idCliente=numeroId++;
        this.cpfCliente=cpfCliente;
        this.nomeCliente=nomeCliente;
    }

    //Setter

    public void setCpfCliente(String cpfCliente){
        if( cpfCliente == null ||cpfCliente.isBlank()){
            throw new IllegalArgumentException("O cpf não pode estar vazio!");
        }

        this.cpfCliente = cpfCliente;
    }

    public void setNomeCliente(String nomeCliente){
        if(nomeCliente == null || nomeCliente.isBlank()){
            throw new IllegalArgumentException("O nome do cliente não pode estar vazio!");
        }

        this.nomeCliente=nomeCliente;
    }

    //Getters
    public String getCpfCliente(){
        return this.cpfCliente;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    //Metodos
    public void mostrarDados(){
        System.out.println("O id do cliente é: "+idCliente);
        System.out.println("O nome do cliente é: "+nomeCliente);
        System.out.println("O cpf do cliente é: "+cpfCliente);

    }

}
