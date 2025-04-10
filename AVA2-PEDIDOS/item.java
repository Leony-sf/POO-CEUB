public class item {
    private String descricao;
    private float codigoproduto;

    public int quantidade() {
        return 0;
    }

    public float precoUnitario(){
        return 0.0f;
    }
    public String getDescricao(){return descricao;}
    public void setDescricao(String descricao){this.descricao=descricao;}

    public float getCodigoProduto() { return codigoproduto; }
    public void setCodigoProduto(float codigoproduto) {this.codigoproduto = codigoproduto;}
}