package com.nox.engine.audio;

/**
	This class is a framework for more specific sound classes that have the basic functionality of this class.
*/

public abstract class Sound {
	public abstract void play();

	public abstract void stop();

	public abstract void loop(int count);

	public abstract void loop();
}
