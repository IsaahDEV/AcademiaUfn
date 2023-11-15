  import java.time.LocalDate;
  
  
  
public class Livro {
  private String titulo;
  private String autor;
  private String isbn;
  private boolean emprestado;
  private LocalDate dataEmprestimo;

   public Livro(String titulo, String autor, String isbn) {
	  this.titulo = titulo;
	  this.autor = autor;
	  this.isbn = isbn;
	  this.emprestado = false;
	  this.dataEmprestimo = null;
	  }
// para reservar
 public boolean reservar() {
    if (!emprestado) {
        emprestado = true;
        dataEmprestimo = LocalDate.now();
	     return true;
  }
    else {
    	return false;
   }
}
// para poder devolver 
 public void devolver() {
    emprestado = false;
 }
// para ver devolução 
 public boolean verificarAtrasoDevolucao(int limiteDias) {
	    if (emprestado) {
	        LocalDate dataAtual = LocalDate.now();
	        LocalDate dataLimite = dataEmprestimo.plusDays(limiteDias);
	        return dataAtual.isAfter(dataLimite); 
	    }
	    return false;
	}
 // exibir status 
 public String exibirInfor(){
	 String statusemprestado;
	 
	 if(emprestado == true) {
		 statusemprestado = "Emprestado";
	 }else {
		 statusemprestado = "Disponivel";
	 }
	 
	 return "titulo: " + titulo + "\nautor: " + autor + "\nisbn: " + isbn + "\nstatus: " + statusemprestado;
	
 }
 
  public String gettitulo() {
	  return titulo;
  }
 public String getIsbn() {
	 return isbn;
	 
 }
 public boolean getEmprestado() {
	 return emprestado;
 }
 
 public void setTitulo(String titulo) {
	 this.titulo = titulo;
 }
 public void setIsbn(String isbn) {
	 this.isbn = isbn;
 }
 
 public void SetEmprestado(boolean emprestado) {
	 this.emprestado = emprestado;
 }
}


