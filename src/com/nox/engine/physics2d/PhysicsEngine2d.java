package com.nox.engine.physics2d;

import java.util.ArrayList;

import com.nox.engine.physics.PhysicsEngine;

/**
	This class is the main physics manager. Each update it goes through all the 2d PhysicsComponents in the current GameObjectLayer and performs any necessary CollisionActions
*/

public class PhysicsEngine2d extends PhysicsEngine {
	private ArrayList<PhysicsComponent2d> physicsComponents;

	public PhysicsEngine2d() {
		this.physicsComponents = new ArrayList<PhysicsComponent2d>();
	}

	public void addPhysicsComponent(PhysicsComponent2d component) {
		this.physicsComponents.add(component);
	}

	@Override
	public void update() {
		for(int i = 0, size = physicsComponents.size(); i < size; i++) {
			PhysicsComponent2d component = physicsComponents.get(i);
			for(int j = i + 1; j < size; j++) {
				PhysicsComponent2d other = physicsComponents.get(j);
				CollisionInfo2d info = component.getCollider().getCollisionInfo(other.getCollider());
				component.performCollisionAction(info);
				other.performCollisionAction(info);
			}
		}
	}
}
