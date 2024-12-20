public class Livros extends Publicacoes{
    private String edicao, isbn;

    public Livros(String t, String a, String g, int ano, String e, int qD, String ed, String isbn) {
        super(t, a, g, ano, e, qD);
        this.edicao = ed;
        this.isbn = isbn;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Edição: " + this.edicao + "\nISBN: " + this.isbn);
    }

}
