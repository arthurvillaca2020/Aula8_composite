package composite;

public class Orgao extends Conteudo {


    public Orgao(String descricao) {
        super(descricao);
    }

    public String getConteudo() {
        return "- " + this.getDescricao() + "\n";
    }
}
