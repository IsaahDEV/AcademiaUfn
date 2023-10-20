public class animal {
    private String nome;
    private String especie;
    private String raca;
    private String dataNascimento;
    private String proprietario;

    public animal(String nome, String especie, String raca, String dataNascimento, String proprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
    }

    // Get's e set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
    	return especie;
    }
    public void setEspecie(String especie) {
    	this.especie = especie;
    }
    public String getraca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
        
    }
    public String getdataNascimento() {
        return dataNascimento ;
    }

    public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getproprietario() {
        return proprietario;
    }

    public void setproprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}