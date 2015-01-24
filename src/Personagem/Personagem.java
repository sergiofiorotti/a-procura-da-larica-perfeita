package Personagem;

import Main.Animacao;

public class Personagem {

	public Personagem(String nome, int batimento, int larica, Animacao animacao) {
		this.nome = nome;
		this.batimento = batimento;
		this.larica = larica;
		this.animacao = animacao;
	}
	
	private String nome;
	
	private int batimento;
	
	private int larica;
	
	private Animacao animacao;

	public String getNome(){
		return nome;
	}
	
	public int getBatimento(){
		return batimento;
	}
	
	public int getLarica(){
		return larica;
	}
	
	public Animacao getAnimacao(){
		return animacao;
	}
}