import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private double valorPedido;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private ArrayList<Integer> quantidadeProdutos = new ArrayList<>();

    int numeroPedido=1;

    public Pedido(ArrayList<Produto> listaProdutos, ArrayList<Integer> quantidadeProdutos){
        if(listaProdutos.isEmpty() && quantidadeProdutos.isEmpty()){
            System.out.println("Por favor preencha os campos!");
            return;
        }

        this.idPedido=numeroPedido;
        this.listaProdutos=listaProdutos;
        this.quantidadeProdutos=quantidadeProdutos;
        this.dataPedido= new Date();


        for(int i=0; i<listaProdutos.size();i++){

            this.valorPedido
    }
}
