package topdownrpg.entity.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;

import topdownrpg.entity.components.PlayerControlComponent;
import topdownrpg.entity.components.TransformComponent;
import topdownrpg.reference.ComponentMappers;

public class PlayerControlSystem extends IteratingSystem {
	public PlayerControlSystem() {
		super(Family.all(PlayerControlComponent.class, TransformComponent.class).get());

		Gdx.input.setCursorCatched(true);
//		Gdx.input.setCursorPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
	}
	
	public void processEntity(Entity entity, float delta) {
		TransformComponent transform = ComponentMappers.TRANSFORM_MAPPER.get(entity);


		boolean movingForward = Gdx.input.isKeyPressed(Input.Keys.W);
		boolean movingLeft = Gdx.input.isKeyPressed(Input.Keys.A);
		boolean movingBackward = Gdx.input.isKeyPressed(Input.Keys.S);
		boolean movingRight = Gdx.input.isKeyPressed(Input.Keys.D);

		Vector2 movement = new Vector2();
		if(movingForward)
			movement.x = 1;

		if(movingBackward)
			movement.x = -1;

		if(movingLeft)
			movement.y = -1;

		if(movingRight)
			movement.y = 1;

		transform.position.add(movement);
	}
}
