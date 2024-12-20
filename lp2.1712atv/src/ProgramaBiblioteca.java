public class ProgramaBiblioteca {
        public static void main(String[] args) {
            //III. Crie um array de duas posições para objetos Publicação e adicione nele
            //os objetos instanciados nos itens I e II;
            //IV. Faça um loop para percorrer o array de objetos Publicação executando o
            //método imprimeDados();
            //V. Explique com suas palavras porque foi possível adiciona no array de
            //publicação um objeto do tipo Filme e um objeto tipo Livro?
            //VI. Se método imprime dados é abstrato na classe Publicação, como é
            //possível imprimir os dados do Livro e do Filme quando o loop é
            //executado?
            Publicacoes livro = new Livros("a", "b", "c", 1998, "d", 4, "e", "675243");
            livro.imprimirDados();

            Publicacoes filme = new Filmes("a", "b", "c", 2020, "d", 1, "e", "f", "g", 160);

            Publicacoes[] publicacoes = new Publicacoes[2];

            publicacoes[0] = livro;
            publicacoes[1] = filme;

            for (Publicacoes publicacao : publicacoes) {
                publicacao.imprimirDados();
                System.out.println("--------------------");
            }
        }
}
