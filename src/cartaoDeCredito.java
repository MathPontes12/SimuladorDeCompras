import java.util.ArrayList;
import java.util.List;

public class cartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    // metodo com if para o lançamento da compra
    public boolean lancaCompra(Compra compra) {

        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }




    // o construtor para gerar os valores
    public cartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }




    // somente os get, os set nao, pois nao queremos que tenha alteraçao de fora do valor
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}
