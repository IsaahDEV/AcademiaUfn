
public class produto {
	    private String nome;
	    private String categoria;
	    private double preco;
	    private int quantidadeEmEstoque;

	    public produto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
	        this.nome = nome;
	        this.categoria = categoria;
	        this.preco = preco;
	        this.quantidadeEmEstoque = quantidadeEmEstoque;
	    }

	    //  diminuir a quantidade em estoque
	    public void vender(int quantidade) {
	        if (quantidade <= quantidadeEmEstoque) {
	            quantidadeEmEstoque = quantidadeEmEstoque - quantidade;
	            System.out.println("Foram vendidos " + quantidade + "do produto");
	        } else {
	            System.out.println("Estoque insuficiente.");
	        }
	    }

	    // Get's e Set's
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getcategoria() {
	    	return categoria;
	    }
	    public void setcategoria(String categoria) {
	    	this.categoria = categoria;
	    }
	    public double getpreco() {
	        return preco;
	    }

	    public void setpreco(double preco) {
	        this.preco = preco;
	        
	    }
	    public int getquantidadeEmEstoque() {
	        return quantidadeEmEstoque ;
	    }

	    public void setquantidadeEmEstoque(int quantidadeEmEstoque) {
	        this.quantidadeEmEstoque = quantidadeEmEstoque;
	    }
	    
}

