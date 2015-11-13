package com.nox.game;

import com.nox.engine.core.CoreEngine;
import com.nox.engine.core.JavaCanvasEngine;
import com.nox.engine.core.JavaFrameWindow;
import com.nox.engine.core.Window;

/**
	Entry point for the program. When using this game engine, you need to pass an instance of Window and Game along with the width, height, and fps to a CoreEngine instance, then run start()
*/

/**
	Here's also where I'll put TODOs (things that can be added to the project)
	TODO: more support for 3d rendering.
	TODO: maybe add hardware rendering option (it's currently only software rendering)
	TODO: maybe add more to the PhysicsEngine (especially for 3d)
*/

public class Main {
	public static void main(String[] args) {
		Window window = new JavaFrameWindow("Nox Engine");
		window.setSize(800, 600);
		CoreEngine engine = new JavaCanvasEngine(window, 800, 600, 60, new GameSplat());
		engine.start();
	}
}
