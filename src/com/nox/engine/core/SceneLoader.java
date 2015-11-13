package com.nox.engine.core;

/**
	This class is basically a way of managing memory so that instead of instantiating everything in a scene and letting it sit there, you store a function for loading the scene and run it when you want to instantiate everything for the scene.
*/

public abstract class SceneLoader {
	private String tag;

	public SceneLoader(String tag) {
		this.tag = tag;
	}

	public abstract Scene loadScene();

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
}
