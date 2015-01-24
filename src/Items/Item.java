package Items;

import org.newdawn.slick.Image;
import Main.Mapa;

public class Item {

	public Item(Image imagem, int quantidade) {
		this.imagem = imagem;
		this.quantidade = quantidade;
	}

	private Image imagem;
	
	private int quantidade;
	
	private Boolean[][] item;
	
	private int[][] posicao;
	
	public Image getImagem(){
		return imagem;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public Boolean[][] getItem(){
		return item;
	}
	
	public int[][] getPosicao(){
		return posicao;
	}
	
	public Boolean temItem(float x, float y){
		int xItem = (int)x / Mapa.getSize();
        int yItem = (int)y / Mapa.getSize();
        return item[xItem][yItem];
	}
	
	public void SortearItem(){
		
	}
}