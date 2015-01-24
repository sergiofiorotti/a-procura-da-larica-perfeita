package Personagem;

public class Personagem {

	public Personagem(String nome, int batimento, int larica) {
		this.nome = nome;
		this.batimento = batimento;
		this.larica = larica;
	}
	
	private String nome;
	
	private int batimento;
	
	private int larica;

	public String getNome(){
		return nome;
	}
	
	public int getBatimento(){
		return batimento;
	}
	
	public int getLarica(){
		return larica;
	}
}