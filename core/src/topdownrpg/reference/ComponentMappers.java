package topdownrpg.reference;

import topdownrpg.entity.components.TransformComponent;

import com.badlogic.ashley.core.ComponentMapper;

public final class ComponentMappers {
	public static final ComponentMapper<TransformComponent> TRANSFORM_MAPPER = ComponentMapper.getFor(TransformComponent.class);

	private ComponentMappers() {}
}
