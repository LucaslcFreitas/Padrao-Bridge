public class IPhone11 extends ModeloIPhone{

    public IPhone11(float precoBase) {
        super(precoBase);
    }

    @Override
    public float calcularPreco() {
        return this.precoBase * (1 + this.versao.percentualAumento());
    }
}
