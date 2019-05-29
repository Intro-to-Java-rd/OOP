package by.htp.les02.main;

import java.util.*;

public class CustomerMassive {
	
	ArrayList<Customer> list;
	
	CustomerMassive(Customer massive[]){
		
		int i = 0;
		this.list = new ArrayList<Customer>();
		
		for(i = 0; i < massive.length; i++) {
			
			this.list.add(massive[i]);
			
		}
		
	}
	
	public void sort_by_alphabet() {
		
		Collections.sort(this.list);
		
	}
	
	public List<Customer> display_all() {
		
		return (this.list);
		
	}
	
	public List<Customer> display_within_range(int min, int max){
		
		int i = 0;
		List<Customer> temp = new ArrayList<Customer>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_creditcard() > min && this.list.get(i).get_creditcard() < max) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}
	 
}