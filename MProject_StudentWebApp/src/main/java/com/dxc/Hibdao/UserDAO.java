package com.dxc.Hibdao;

import java.util.List;

public interface UserDAO<E> {
	boolean edit(E e);
	boolean save(E e);
	boolean delete(String id);
	E find(String id);
	List<E> findAll();
}
