public abstract class ModeloIPhone {

    protected Versao versao;
    protected float precoBase;

    public ModeloIPhone(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setVersao(Versao versao) {
        this.versao = versao;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
