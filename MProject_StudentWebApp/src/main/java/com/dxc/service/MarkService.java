package com.dxc.service;

import java.util.List;

public interface MarkService<E> {

	boolean save(E e) throws Exception;
	boolean edit(E e) throws Exception;
	boolean delete(String examid,int id) throws Exception;
	E find(String examid,int id) throws Exception;
	List<E> findAll() throws Exception;
}
