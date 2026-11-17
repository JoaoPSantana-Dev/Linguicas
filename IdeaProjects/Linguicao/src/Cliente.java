public class Cliente {
    private int idCliente;
    private String cpfCliente;
    private String nomeCliente;

    int numeroId=1;
    public Cliente(String cpfCliente, String nomeCliente){

        if(cpfCliente.isBlank() || nomeCliente.isBlank()){
            System.out.println("Por favor coloque dados válidos");
            return;
        }

        this.idCliente=numeroId;
        this.cpfCliente=cpfCliente;
        this.nomeCliente=nomeCliente;

        numeroId++;
    }


    public void mostrarDados(){
        System.out.println("O id do cliente é: "+idCliente);
        System.out.println("O nome do cliente é: "+nomeCliente);
        System.out.println("O cpf do cliente é: "+cpfCliente);

    }

}
