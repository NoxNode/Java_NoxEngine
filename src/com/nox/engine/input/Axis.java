package com.nox.engine.input;

/**
	This class is an abstraction of input methods that can be stored in a float such as joy-sticks.
*/

public class Axis {
	private float value;
	private boolean valueUsed = true;

	public Axis() {
		value = 0;
	}

	public void refresh() {
		if(valueUsed) {
			value = 0;
		}
		valueUsed = true;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
		valueUsed = false;
	}
}
