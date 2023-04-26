package composite;

public class Corpo {

    private Conteudo conteudo;

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Corpo vazio");
        }
        return this.conteudo.getConteudo();
    }
}