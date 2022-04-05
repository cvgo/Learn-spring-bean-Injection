package com.bug.di;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

public class Student
{
	private String str;
	private Address address;
	private String[] books;
	private List<String> hob;
	private Map<String,String> card;
	private Set<String> games;
	private String wife;
	private Properties info;

	public void setInfo(Properties info) {
		this.info = info;
	}

	public Properties getInfo() {
		return info;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	public String getWife() {
		return wife;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}

	public Set<String> getGames() {
		return games;
	}
	public void setCard(Map<String, String> card) {
		this.card = card;
	}

	public Map<String, String> getCard() {
		return card;
	}

	public void setHob(List<String> hob) {
		this.hob = hob;
	}

	public List<String> getHob() {
		return hob;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public String[] getBooks() {
		return books;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}


	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}
	
	public void show(){
		System.out.println("姓名:"+str+"\n"+"住址:"+address.getAddress()+"\n");
		System.out.print("书包:");
		for(int i=0;i<books.length;i++){
			System.out.print("《"+books[i]+"》");
		}
		System.out.println("");
		System.out.println("爱好:"+hob);
		System.out.println("证件:"+card);
		System.out.println("游戏:"+games);
		System.out.println("妻子:"+wife);
		System.out.println("特殊:"+info);
	}
}
