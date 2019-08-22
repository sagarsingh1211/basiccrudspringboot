package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class HomeService {

	 List<User> userList = new ArrayList<>();
	public void addUser(User user) {
		userList.add(user);
	}

	public List<User> getUsers() {
		return userList;
	}

	public void deleteUser(int id) {
		List<User> getL = getUsers();
		ListIterator<User> itr = getL.listIterator();
		while(itr.hasNext()) {
			User u = itr.next();
			if(u.getId() == id) {
				itr.remove();
			}
		}
	}

	public void updateUser(User user) {

		List<User> getL = getUsers();
		ListIterator<User> itr = getL.listIterator();
		boolean flag = true;
		while(itr.hasNext()) {
			User u = itr.next();
			if(u.getId() == user.getId()) {
				u.setCity(user.getCity());
				u.setName(user.getName());
				flag = false;
			}
		}
		if(flag) {
			getL.add(user);
		}
	}
	
	

}
