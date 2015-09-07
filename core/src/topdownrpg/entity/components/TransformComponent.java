package topdownrpg.entity.components;

import com.badlogic.ashley.core.Component;

import com.badlogic.gdx.math.Vector2;

public class TransformComponent implements Component {
	public Vector2 position;
	public Direction orientation;

	public TransformComponent() {
		this(new Vector2(), Direction.UP);
	}

	public TransformComponent(Vector2 position, Direction orientation) {
		this.position = position;
		this.orientation = orientation;
	}
	
	public static enum Direction {
		UP, DOWN, LEFT, RIGHT
	}
}
