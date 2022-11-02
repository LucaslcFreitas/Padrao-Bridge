import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPhone12Test {

    @Test
    void deveRetornarPrecoIPhone11Normal() {
        Versao versao = new VersãoNormal();
        IPhone12 iPhone12 = new IPhone12(4400.0f);
        iPhone12.setVersao(versao);
        assertEquals(4400.0f, iPhone12.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11Pro() {
        Versao versao = new VersaoPro();
        IPhone12 iPhone12 = new IPhone12(4400.0f);
        iPhone12.setVersao(versao);
        assertEquals(5720.0f, iPhone12.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11ProMax() {
        Versao versao = new VersaoProMax();
        IPhone12 iPhone12 = new IPhone12(4400.0f);
        iPhone12.setVersao(versao);
        assertEquals(6160.0f, iPhone12.calcularPreco(), 0.01f);
    }

}