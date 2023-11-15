package Setor;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import Pessoa.Funcionario;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany(mappedBy = "departamentos")
    private List<Funcionario> usuarios = new ArrayList<>();
    
    
    // Construtores, getters, setters e outros métodos
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Funcionario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Funcionario> usuarios) {
		this.usuarios = usuarios;
	}










}




	
	
	
	
