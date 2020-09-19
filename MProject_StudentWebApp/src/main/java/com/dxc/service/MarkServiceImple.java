package com.dxc.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.dxc.Jdbcdao.MarkJdbcDAO;

import com.dxc.service.MarkService;
import com.dxc.beans.Mark;

public class MarkServiceImple implements MarkService<Mark> {

	@Override
	public boolean save(Mark mark) throws Exception {
		// TODO Auto-generated method stub
		boolean res=false;
		try {
		 MarkJdbcDAO MarksJdbcDAO=new MarkJdbcDAO();
			return MarksJdbcDAO.save(mark);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return res;
		
	}

	@Override
	public boolean edit(Mark marks) throws Exception {
		boolean res=false;
		try {
			MarkJdbcDAO MarksJdbcDAO =new MarkJdbcDAO();
			res=MarksJdbcDAO.edit(marks);
			if(res)
			{
				MarksJdbcDAO.save();
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	return res;
	}

	@Override
	public boolean delete(String examid, int id) throws Exception {
		// TODO Auto-generated method stub
		boolean res = false;
		MarkJdbcDAO MarksJdbcDAO;
			try {
				MarksJdbcDAO = new MarkJdbcDAO ();
				res = MarksJdbcDAO.delete(examid,id);
				if(res)
				{
					MarksJdbcDAO.save();
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
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return res;
		}
	

	@Override
	public Mark find(String examid,int id) throws Exception {
		// TODO Auto-generated method stub
      Mark marks=null;
		
		try {
			MarkJdbcDAO MarksJdbcDAO=new MarkJdbcDAO();
			marks=MarksJdbcDAO.find(examid,id);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return marks;
		
	}

	@Override
	public List<Mark> findAll() throws Exception {
		List<Mark> marks=null;
		try {
			MarkJdbcDAO MarksjdbcDAO = new MarkJdbcDAO();
			marks=MarksjdbcDAO.findAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return marks;

	}
}
