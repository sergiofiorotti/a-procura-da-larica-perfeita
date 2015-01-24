package View;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Jogo extends StateBasedGame {

	public Jogo(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SlickException {
		Jogo jogo = new Jogo("À procura da LARICA perfeita!");
		AppGameContainer container = new AppGameContainer(jogo);
		container.setDisplayMode(800, 600, false);
		container.setShowFPS(false);
		container.start();
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}
}
