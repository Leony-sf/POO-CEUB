import java.util.Date;

public class Pedido {
    private int codigo;
    private Date dataEhora;
    private float valorTotal;

    private item item;
    private cliente cliente;
    private vendedor vendedor;
    private statusPedido status;

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Date getDataEhora() { return dataEhora; }
    public void setDataEhora(Date dataEhora) { this.dataEhora = dataEhora; }

    public float getValorTotal() { return valorTotal; }
    public void setValorTotal(float valorTotal) { this.valorTotal = valorTotal; }

    public item getItem() { return item; }
    public void setItem(item item) { this.item = item; }

    public cliente getCliente() { return cliente; }
    public void setCliente(cliente cliente) { this.cliente = cliente; }

    public vendedor getVendedor() { return vendedor; }
    public void setVendedor(vendedor vendedor) { this.vendedor = vendedor; }

    public statusPedido getStatus() { return status; }
    public void setStatus(statusPedido status) { this.status = status; }
}