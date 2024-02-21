package br.com.eduardohmf.poo;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String dtMatricula;
	
	public Aluno(String matricula, String dtMatricula, String nome, String email)
	{
		super(nome, email);
		this.matricula = matricula;
		this.dtMatricula = dtMatricula;		
	}
	
	public Aluno(String matricula, String dtMatricula, String nome, String email, String telefone)
	{
		super(nome, email, telefone);
		this.matricula = matricula;
		this.dtMatricula = dtMatricula;		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getDtMatricula() {
		return dtMatricula;
	}
	
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

	@Override
	public String toString() {
		return "Matrícula = " + this.matricula + "\nDt Matrícula = " + this.dtMatricula 
				+ "\nNome = " + super.getNome() + "\nE-mail = " + super.getEmail() +
				"\nTelefone = " + super.getTelefone();
	}
}
