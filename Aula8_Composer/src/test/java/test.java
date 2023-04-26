import composite.Corpo;
import composite.Orgao;
import composite.Sistema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class test {
    @Test
    void deveRetornarCorpo() {
        Sistema sistema1 = new Sistema("Nervoso");
        Orgao orgao1 = new Orgao("Cerebro");
        Orgao orgao2 = new Orgao("Nervos");
        Orgao orgao3 = new Orgao("Medula");
        sistema1.addConteudo(orgao1);
        sistema1.addConteudo(orgao2);
        sistema1.addConteudo(orgao3);

        Sistema sistema2 = new Sistema("Vascular");
        Orgao orgao4 = new Orgao("Coração");
        Orgao orgao5 = new Orgao("Arterias");
        Orgao orgao6 = new Orgao("Veias");
        sistema2.addConteudo(orgao4);
        sistema2.addConteudo(orgao5);
        sistema2.addConteudo(orgao6);

        Sistema sistemaCompleto = new Sistema("Corpo");
        sistemaCompleto.addConteudo(sistema1);
        sistemaCompleto.addConteudo(sistema2);

        Corpo corpo = new Corpo();
        corpo.setConteudo(sistemaCompleto);

        assertEquals("Sistema = Corpo\n" +
                        "Sistema = Nervoso\n" +
                        "- Cerebro\n" +
                        "- Nervos\n" +
                        "- Medula\n" +
                        "Sistema = Vascular\n" +
                        "- Coração\n" +
                        "- Arterias\n" +
                        "- Veias\n",
                corpo.getConteudo());
    }

    @Test
    void deveRetornarCorpoVazio() {
        try {
            Corpo corpo = new Corpo();
            corpo.getConteudo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Corpo vazio", e.getMessage());

        }
    }
}
