package topdownrpg.entity;

import topdownrpg.entity.components.PlayerControlComponent;
import topdownrpg.entity.components.TransformComponent;

import com.badlogic.ashley.core.Entity;

public class Player extends Entity {
	public Player() {
		super();

		this.add(new TransformComponent());
		this.add(new PlayerControlComponent());
	}
}
