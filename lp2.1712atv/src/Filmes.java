public class Filmes extends Publicacoes {
    private String diretor, atorPrincipal, sinopse;
    private int tempoDuracao; //em minutos

    public Filmes(String t, String a, String g, int ano, String e, int qD, String d, String aP, String s, int tD) {
        super(t, a, g, ano, e, qD);
        this.diretor = d;
        this.atorPrincipal = aP;
        this.sinopse = s;
        this.tempoDuracao = tD;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Diretor: " + this.diretor + "\nAtor Principal: " + this.atorPrincipal + "\nSinopse: " + this.sinopse + "\nTempo de duração: " + tempoDuracao);
    }
}
