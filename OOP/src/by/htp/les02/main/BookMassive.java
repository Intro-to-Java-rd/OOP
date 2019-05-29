package by.htp.les02.main;

import java.util.*;

public class BookMassive {
	
	ArrayList<Book> list;
	
	BookMassive(Book massive[]){
		
		int i = 0;
		this.list = new ArrayList<Book>();
		
		for(i = 0; i < massive.length; i++) {
			
			this.list.add(massive[i]);
			
		}
		
	}
	
	public List<Book> display_all() {
		
		return (this.list);
		
	}
	
	public List<Book> display_by_authors(String authors){
		
		int i = 0;
		List<Book> temp = new ArrayList<Book>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_authors().equals(authors)) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}
	
	public List<Book> display_by_publisher(String publisher){
		
		int i = 0;
		List<Book> temp = new ArrayList<Book>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_publisher().equals(publisher)) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}
	
	public List<Book> display_by_year(int year){
		
		int i = 0;
		List<Book> temp = new ArrayList<Book>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_year() >= year) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}

}
