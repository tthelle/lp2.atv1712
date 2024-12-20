import java.sql.SQLOutput;

public class Publicacoes {
    private String titulo, autor, genero, editora;
    private int anoPubli, quantDisp;

    public Publicacoes(String t, String a, String g, int ano, String e, int qD){
        this.titulo = t;
        this.autor = a;
        this.genero = g;
        this.anoPubli = ano;
        this.editora = e;
        this.quantDisp = qD;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantDisp() {
        return quantDisp;
    }

    public void imprimirDados(){
        System.out.println("Título: " + this.titulo  + "\nAutor: " + this.autor + "\nGênero: " + this.genero + "\nAno de publicação: " + this.anoPubli + "\nEditora: " + this.editora + "\nQuantidade disponível: " + this.quantDisp);
    }
}