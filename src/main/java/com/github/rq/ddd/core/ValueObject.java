package com.github.rq.ddd.core;

public abstract class ValueObject {
	public abstract boolean equals(Object object);

	public abstract int hashCode();
}
