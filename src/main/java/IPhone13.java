public class IPhone13 extends ModeloIPhone{

    private boolean opcaoCarregador;

    public IPhone13(float precoBase) {
        super(precoBase);
    }

    public void setCarregador(boolean opcaoCarregador) {
        this.opcaoCarregador = opcaoCarregador;
    }

    @Override
    public float calcularPreco() {
        return (this.precoBase * (1 + this.versao.percentualAumento())) + (opcaoCarregador ? 150 : 0);
    }
}
