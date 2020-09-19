package com.dxc.Hibservice;

import java.util.List;

public interface Service<E> {

	boolean save(E e);
	E find(int id);
	List<E> findAll();
	boolean edit(E e);
	boolean delete(int id);
}
