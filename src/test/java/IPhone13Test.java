import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPhone13Test {

    @Test
    void deveRetornarPrecoIPhone11Normal() {
        Versao versao = new VersãoNormal();
        IPhone13 iPhone13 = new IPhone13(4900.0f);
        iPhone13.setVersao(versao);
        iPhone13.setCarregador(true);
        assertEquals(5050.0f, iPhone13.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11Pro() {
        Versao versao = new VersaoPro();
        IPhone13 iPhone13 = new IPhone13(4900.0f);
        iPhone13.setVersao(versao);
        iPhone13.setCarregador(true);
        assertEquals(6520.0f, iPhone13.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11ProMax() {
        Versao versao = new VersaoProMax();
        IPhone13 iPhone13 = new IPhone13(4900.0f);
        iPhone13.setVersao(versao);
        iPhone13.setCarregador(true);
        assertEquals(7010.0f, iPhone13.calcularPreco(), 0.01f);
    }

}