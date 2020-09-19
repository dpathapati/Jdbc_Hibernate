package com.dxc.Hibdao;

import java.util.List;

public interface HibDAO<E> {

	boolean edit(E e);
	boolean save(E e);
	boolean delete(int id);
	E find(int id);
	List<E> findAll();
}
