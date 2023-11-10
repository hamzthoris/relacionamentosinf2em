package com.itb.relacionamentos.relacionamentosinf2em.model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "pessoas", uniqueConstraints = @UniqueConstraint(columnNames = {"email", "cpf"}))
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(nullable = false)
	private String email;
	private String senha;
	@Column(nullable = false, length = 15)
	private String cpf;
	private String sexo;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	
	private boolean codStatus;
	
	public boolean getCodStatus() {
		return codStatus;
		
	}
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	@Column(columnDefinition = "VARBINARY(max)")
	private byte[] foto;
	
	@OneToMany(mappedBy= "pessoa", cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	// Métodos Construtores: facil identificação "Possui o mesmo nome da classe
	// Construtor Padrão: VEM DE FÁBRICA, portanto "DEVE" ser recriado no momento em que criamos novo(s) construtor(es)
	//                    O MESMO NÃO TEM PARÃMETROS, É VAZIO
	
    public Pessoa() {
		
	}
	// Você criar vários construtores o quanto achar necessário 
	// O construtor abaixo recebe 2 parâmetros (nome, email)
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
