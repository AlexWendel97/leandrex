package br.sceweb.modelo;


import java.util.InputMismatchException;

public class Empresa {
	
	String cnpj;
	String NomeDaEmpresa;
	String NomeFantasia;
	String Endereco;
	String Telefone;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeDaEmpresa() {
		return NomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {

			if (nomeDaEmpresa.equals("")) {

			throw new IllegalArgumentException("Nome da empresa inválido!");

			} else

			this.NomeDaEmpresa = nomeDaEmpresa;
		
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.equals("")) {

			throw new IllegalArgumentException("Nome Fantasia inválido!");

			} else

			this.NomeFantasia = nomeFantasia;
	}
	public String getEndereco() {
		return Endereco;
	}
	
	
	public void setEndereco(String endereco) {
		if (endereco.equals("")) {

			throw new IllegalArgumentException("Nome endereco inválido!");

			} else

			this.Endereco = endereco;
	}
	
	
	
	
	
	
	
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.equals("")) {

		throw new IllegalArgumentException("Nome da empresa inválido!");

		} else

		this.Telefone = telefone;
	
}
	
	

}
