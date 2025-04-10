public class statusPedido {
    private int processamento;
    private String enviado;
    private String entregue;
    private String cancelado;

    public int getProcessamento() { return processamento; }
    public void setProcessamento(int processamento) { this.processamento = processamento; }

    public String getEnviado() { return enviado; }
    public void setEnviado(String enviado) { this.enviado = enviado; }

    public String getEntregue() { return entregue; }
    public void setEntregue(String entregue) { this.entregue = entregue; }

    public String getCancelado() { return cancelado; }
    public void setCancelado(String cancelado) { this.cancelado = cancelado; }
}
