package topdownrpg.screens;

import topdownrpg.TopDownRPG;
import topdownrpg.entity.Player;
import topdownrpg.entity.systems.PlayerControlSystem;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class MainGameScreen implements Screen {
	private final TopDownRPG game;
	private final Engine entityEngine;
	
	private final PlayerControlSystem playerControlSystem;
	
	private final Player player;
	
	private TiledMap map;
	private OrthogonalTiledMapRenderer mapRenderer;
	
	private OrthographicCamera camera;

	public MainGameScreen(TopDownRPG game) {
		this.game = game;
		
		entityEngine = new Engine();
		
		playerControlSystem = new PlayerControlSystem();
		entityEngine.addSystem(playerControlSystem);
		
		player = new Player();
		entityEngine.addEntity(player);
	}
	
	@Override
	public void show() {
		map = new TmxMapLoader().load("test-map.tmx");
		mapRenderer = new OrthogonalTiledMapRenderer(map);
		
		camera = new OrthographicCamera();
	}
	
	public void update(float delta) {
		entityEngine.update(delta);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		mapRenderer.setView(camera);
		mapRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
		camera.viewportWidth = width;
		camera.viewportHeight = height;
		
		camera.update();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		map.dispose();
		mapRenderer.dispose();
	}
}
