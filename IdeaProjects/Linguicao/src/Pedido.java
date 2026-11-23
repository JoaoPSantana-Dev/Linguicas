import java.util.Collections;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private double valorPedido = 0;
    private ArrayList<ProdutoVenda> listaProdutos = new ArrayList<>();
    private Funcionario funcionario;
    private Cliente cliente;
    private static int numeroId=1;

    //Construtor
    public Pedido(ArrayList<ProdutoVenda> listaProdutos, Funcionario funcionario, Cliente cliente){
        if(listaProdutos == null ||listaProdutos.isEmpty() || funcionario == null || cliente == null){
            throw new IllegalArgumentException("Os campos não devem estar vazios!");
        }

        this.idPedido=numeroId++;
        this.dataPedido= new Date();
        this.listaProdutos = new ArrayList<>(listaProdutos);
        this.funcionario=funcionario;
        this.cliente=cliente;
        atualizarValorPedido();
    }

    //Setters
    public void setFuncionario(Funcionario funcionario){
        if(funcionario == null){
            throw new IllegalArgumentException("O funcionário não deve ser nulo");
        }

        this.funcionario=funcionario;
    }


    public void setCliente(Cliente cliente){
        if(cliente == null){
            throw new IllegalArgumentException("O cliente não deve ser nulo!");
        }
        this.cliente=cliente;
    }

    //Getters

    public int getIdPedido(){
        return idPedido;
    }

    public Date getDataPedido(){
        return dataPedido;
    }

    public double getValorPedido(){
        return valorPedido;
    }

    public List<ProdutoVenda> getListaProdutos(){
        return Collections.unmodifiableList(listaProdutos);
    }

    public Funcionario getFuncionario(){
        return funcionario;
    }

    public Cliente getCliente(){
        return cliente;
    }

    //Metodos
    void mostrarDados(){
        System.out.println("O id do pedido é: "+idPedido);
        System.out.println("A data do pedido é: "+dataPedido);
        System.out.printf("O valor do pedido é: %.2f\n ",valorPedido);
        System.out.println("A lista de produtos é: "+listaProdutos);
        System.out.println("O funcionário que atendeu o pedido é: "+funcionario);
        System.out.println("O cliente que fez o pedido é: "+cliente);
    }

    private void atualizarValorPedido() {
        valorPedido = 0;

        for (ProdutoVenda produto : listaProdutos) {
            valorPedido += produto.calcularSubtotal();
        }
    }

    public void adicionarProduto(ProdutoVenda produto) {
        if (produto == null) {
            throw new IllegalArgumentException(
                    "O produto não pode ser nulo!"
            );
        }

        listaProdutos.add(produto);
        atualizarValorPedido();
    }

    public void removerProduto(ProdutoVenda produto) {
        if (produto == null) {
            throw new IllegalArgumentException(
                    "O produto não pode ser nulo!"
            );
        }

        if (listaProdutos.size() == 1
                && listaProdutos.contains(produto)) {
            throw new IllegalStateException(
                    "O pedido deve possuir pelo menos um produto!"
            );
        }

        if (listaProdutos.remove(produto)) {
            atualizarValorPedido();
        }
    }


}
