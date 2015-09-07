package topdownrpg;

import topdownrpg.screens.MainGameScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TopDownRPG extends Game {
	public SpriteBatch spriteBatch;

	public MainGameScreen gameScreen;

	@Override
	public void create() {
		spriteBatch = new SpriteBatch();
		
		gameScreen = new MainGameScreen(this);
		setScreen(gameScreen);
	}

	@Override
	public void render() {
		gameScreen.render(1 / 60.0f);
	}
}
