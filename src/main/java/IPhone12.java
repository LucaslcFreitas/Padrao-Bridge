public class IPhone12 extends ModeloIPhone{

    public IPhone12(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.percentualAumento());
    }
}
