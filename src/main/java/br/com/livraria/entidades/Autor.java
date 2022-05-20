package br.com.livraria.entidades;

public class Autor {

	private Integer id;
	private String nome;
	private String codigo;
	private String cpf;

	public Autor() {
	}

	public Autor(Integer id, String nome, String codigo, String cpf) {
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
