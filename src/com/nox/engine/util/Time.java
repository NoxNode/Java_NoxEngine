package com.nox.engine.util;

/**
	This is a utility class to abstract how the current time is recorded.
*/

public class Time {
	public static long currentTimeMillis() {
		return System.currentTimeMillis();
	}

	public static long nanoTime() {
		return System.nanoTime();
	}
}
