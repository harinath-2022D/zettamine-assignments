package com.zettamine.java.day6.phone_book;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	private List<Contact> phoneBook ;
	
	public PhoneBook() {
		this.phoneBook = new ArrayList<>();
	}
	
	public void addContact(Contact obj) {
		phoneBook.add(obj);
	}
	
	public boolean removeContact(long num) {
		for(int i = 0; i < phoneBook.size(); i++) {
			Contact c = phoneBook.get(i);
			if(c.getNum() == num) {
				phoneBook.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public List<Contact> viewAllContacts(){
		List<Contact> list = new ArrayList<>();
		for(Contact b : phoneBook) {
			list.add(b);
		}
		return list;
	}
	
	public Contact viewContactByPhoneNum(long num){
		
		for(Contact b : phoneBook) {
			if(b.getNum() == num) {
			   return b;
			}
		}
		return null;
	}
	
}
