package com.nox.engine.physics2d;

/**
	This class is a framework for colliders to implement more specific functionality.
*/

public abstract class Collider2d {
	public abstract CollisionInfo2d getCollisionInfo(Collider2d other);
}
