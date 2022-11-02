import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPhone11Test {

    @Test
    void deveRetornarPrecoIPhone11Normal() {
        Versao versao = new VersãoNormal();
        IPhone11 iPhone11 = new IPhone11(3500.0f);
        iPhone11.setVersao(versao);
        assertEquals(3500.0f, iPhone11.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11Pro() {
        Versao versao = new VersaoPro();
        IPhone11 iPhone11 = new IPhone11(3400.0f);
        iPhone11.setVersao(versao);
        assertEquals(4420.0f, iPhone11.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoIPhone11ProMax() {
        Versao versao = new VersaoProMax();
        IPhone11 iPhone11 = new IPhone11(3400.0f);
        iPhone11.setVersao(versao);
        assertEquals(4760.0f, iPhone11.calcularPreco(), 0.01f);
    }

}