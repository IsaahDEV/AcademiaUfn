import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }
    
    public List<Livro> getLivroEmprestado(){
    	List<Livro> livroEmpretados = new ArrayList<>();
    	
    	for(Livro livro : catalogo) { 
    		
    		if(livro.getEmprestado()) {
    			livroEmpretados.add(livro);
    		}
    		
    	}
    	return livroEmpretados;
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public void removerLivro(String isbn) {
        Livro livroRemovido = null;
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                livroRemovido = livro;
                break;
            }
        }
        if (livroRemovido != null) {
            catalogo.remove(livroRemovido);
        }
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.gettitulo().toLowerCase().contains(titulo.toLowerCase())) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public boolean emprestarLivro(String isbn) {
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro.reservar();
            }
        }
        return false;
    }

    public void devolverLivro(String isbn) {
        for(Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                livro.devolver();
                break;
            }
        }
    }

    public List<Livro> listarLivros() {
        return catalogo;
    }
   
}