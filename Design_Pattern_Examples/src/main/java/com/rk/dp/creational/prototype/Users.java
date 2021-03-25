package com.rk.dp.creational.prototype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable{
	
	private List<User> userList;
	
	public Users() {
		userList = new ArrayList<User>();
	}
	
	public Users(List<User> userList) {
		this.userList = userList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "UserList [userList=" + userList + "]";
	}
	
	public List<User> loadUser() {
		userList.add(new User("0", "Name 0", "Name", 20, "City 1", "country 1", false, LocalDate.now()));
		userList.add(new User("1", "Name 1", "Name", 21, "City 2", "country 2", false, LocalDate.now()));
		userList.add(new User("2", "Name 2", "Name", 22, "City 3", "country 3", false, LocalDate.now()));
		userList.add(new User("3", "Name 3", "Name", 23, "City 4", "country 4", false, LocalDate.now()));
		userList.add(new User("4", "Name 4", "Name", 24, "City 5", "country 5", false, LocalDate.now()));
		userList.add(new User("5", "Name 5", "Name", 25, "City 6", "country 6", false, LocalDate.now()));
		userList.add(new User("6", "Name 6", "Name", 26, "City 7", "country 7", false, LocalDate.now()));
		return userList;
	
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<User> ul = new ArrayList<User>();
		for(User u : this.getUserList()) {
			ul.add(u);
		}
		return new Users(ul);
	}
}
