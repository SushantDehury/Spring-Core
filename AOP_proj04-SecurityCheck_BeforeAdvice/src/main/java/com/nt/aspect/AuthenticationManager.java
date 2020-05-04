package com.nt.aspect;

import com.nt.bo.Userlist;
import com.nt.dao.AuthDAO;

public class AuthenticationManager {
	private AuthDAO dao;
	ThreadLocal<Userlist> tloacal=new ThreadLocal();

	public AuthenticationManager(AuthDAO dao) {
		this.dao = dao;
	}
	
	public void logIn(String username,String password) {
		Userlist list=new Userlist();
		list.setUsername(username);
		list.setPassword(password);
		tloacal.set(list);
	}
	public void logOut() {
		tloacal.remove();
	}
	public boolean validate() {
		Userlist ulist=tloacal.get();
		int result=dao.checkUser(ulist);
		if(result==0)
			return false;
		return true;
	}

}
