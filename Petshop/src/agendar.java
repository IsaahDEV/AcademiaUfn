import java.util.Scanner;

public class agendar {
   
	private animal bixo;
	private servico procedimento;
	private String data;
	private String hora;
	
	public agendar(animal bixo, servico procedimento, String data, String hora) {
		this.bixo = bixo;
		this.procedimento = procedimento;
		this.data = data;
		this.hora = hora;
	}
	
	
	public animal getBixo() {
		return bixo;
	}
	public void setBixo(animal bixo) {
		this.bixo = bixo;
	}
	public servico getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(servico procedimento) {
		this.procedimento = procedimento;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	 public static int menu(){
		    Scanner leitor = new Scanner(System.in);
		    int escolha = 0;
		    System.out.println("Digite 01 para cadastrar o animal ");
		    System.out.println("Digite 02 para agendar seu animal ");
		    System.out.println("Digite 03 para comprar um produto ");
		    System.out.println("Digite 04 para sair do sistema ");
		    escolha = leitor.nextInt();
		      return escolha;
		  }
	
	
}

