import java.util.List;

public class main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Criação de livros
        Livro livro1 = new Livro("A culpa é das estrelas", "John Green", "978-85-8057-380-0");
        Livro livro2 = new Livro("Como eu era antes de você", "Jojo Moyes", "978-85-8057-329-9");
        Livro livro3 = new Livro("A Cabana", "William P. Young", "978-85-9929-36-3");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Reserva de um livro (livro1)
        boolean reserva1 = livro1.reservar();
        System.out.println("Reserva do livro 1: " + reserva1);

        // Devolução de um livro (livro2)
        livro2.devolver();
        System.out.println("Status de empréstimo do livro 2 após devolução: " + livro2.getEmprestado());

        // Buscar livros por título
        String tituloBuscado = "A Cabana"; 
        List<Livro> livrosEncontrados = biblioteca.buscarPorTitulo(tituloBuscado);

        System.out.println("\nLivros encontrados com o título \"" + tituloBuscado + "\":");
        for (Livro livro : livrosEncontrados) {
            System.out.println(livro.exibirInfor());
        }

        // Emprestar um livro (livro3)
        boolean emprestado = biblioteca.emprestarLivro("978-85-9929-36-3"); 
        System.out.println("Empréstimo do Livro 3 bem-sucedido: " + emprestado);

        // Devolver um livro (livro3)
        biblioteca.devolverLivro("978-85-9929-36-3");

        // Listar todos os livros no catálogo
        System.out.println("\nLista de todos os livros no catálogo:");
        List<Livro> todosLivros = biblioteca.listarLivros();
        for (Livro livro : todosLivros){
            System.out.println("================");
            System.out.println(livro.exibirInfor());
        }

        // Listar os livros emprestados
        System.out.println("\nLista de livros emprestados:");
        List<Livro> livrosEmprestados = biblioteca.getLivroEmprestado();
        for (Livro livro : livrosEmprestados) {
            System.out.println("================");
            System.out.println(livro.exibirInfor());
        }
    }
}
