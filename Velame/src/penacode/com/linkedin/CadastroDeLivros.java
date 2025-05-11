package penacode.com.linkedin;

public class CadastroDeLivros {
    public static void main(String [] args) {
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "jrparreiras10@gmail.com";
        autor.cpf = "123.123.123-12";

        Livro livro = new Livro();
        livro.nome = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-86-66250-46-6";
        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Penaforte";
        outroAutor.email = "sockgamer216@gmail.com";
        outroAutor.cpf = "345-345-345-64";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();

    }
}
