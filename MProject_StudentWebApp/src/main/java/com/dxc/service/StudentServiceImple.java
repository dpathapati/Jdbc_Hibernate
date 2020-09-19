package com.dxc.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.dxc.beans.Student;
import com.dxc.Hibdao.StudentHibDAO;
import com.dxc.Jdbcdao.StudentjdbcDAO;

public class StudentServiceImple implements Service<Student> {

	@Override
	public boolean save(Student student) {
		// TODO Auto-generated method stub
		try {
			StudentjdbcDAO studentjdbcDAO=new StudentjdbcDAO();
			return studentjdbcDAO.save(student);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
//		try {
//			StudentHibDAO stHD=new StudentHibDAO();
//			return stHD.save(student);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		Student student=null;
		
		try {
			StudentjdbcDAO studentjdbcDAO=new StudentjdbcDAO();
			student=studentjdbcDAO.find(id);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
//		StudentHibDAO stHD=new StudentHibDAO();
//		try {
//			student= stHD.find(id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return student;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		List<Student> students=null;
		
		try {
			StudentjdbcDAO studentjdbcDAO=new StudentjdbcDAO();
			try {
				students=studentjdbcDAO.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
//		StudentHibDAO stHD=new StudentHibDAO();
//		try {
//			students=stHD.findAll();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return students;
	}

	@Override
	public boolean edit(Student student) {
		// TODO Auto-generated method stub
		boolean res=false;
		
		try {
			StudentjdbcDAO studentjdbcDAO=new StudentjdbcDAO();
			return studentjdbcDAO.edit(student);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
//		StudentHibDAO stHD=new StudentHibDAO();
//		try {
//			return stHD.edit(student);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		boolean res=false;
		StudentjdbcDAO studentjdbcDAO;
		
		try {
			studentjdbcDAO = new StudentjdbcDAO();
			res=studentjdbcDAO.delete(id);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
//		StudentHibDAO stHD=new StudentHibDAO();
//		try {
//			res=stHD.delete(id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return res;
	}

	
}
