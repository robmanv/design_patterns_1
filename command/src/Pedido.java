import java.util.Calendar;

public class Pedido {
    private String cliente;
    private Double valor;
    private Status status;
    Calendar dataFinalizacao;

    public Pedido(String cliente, Double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga() {
        status = Status.PAGO;
    }

    public void finaliza() {
        dataFinalizacao = Calendar.getInstance();
        status = Status.ENTREGUE;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public Status getStatus() {
        return status;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }
}
