package com.github.rq.ddd.core;

public interface Repository<ID_TYPE> {
	Entity<ID_TYPE> get(ID_TYPE id);

	void store(Entity<ID_TYPE> entity);
}
