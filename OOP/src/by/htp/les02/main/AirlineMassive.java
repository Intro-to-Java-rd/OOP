package by.htp.les02.main;

import java.util.ArrayList;
import java.util.List;

public class AirlineMassive {
	
	ArrayList<Airline> list;
	
	AirlineMassive(Airline massive[]){
		
		int i = 0;
		this.list = new ArrayList<Airline>();
		
		for(i = 0; i < massive.length; i++) {
			
			this.list.add(massive[i]);
			
		}
		
	}
	
	public List<Airline> display_all() {
		
		return (this.list);
		
	}
	
	public List<Airline> display_by_destination(String destination){
		
		int i = 0;
		List<Airline> temp = new ArrayList<Airline>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_destination().equals(destination)) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}
	
	public List<Airline> display_by_day_of_the_week(String day_of_the_week){
		
		int i = 0;
		List<Airline> temp = new ArrayList<Airline>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_day_of_the_week().equals(day_of_the_week)) {
				
				temp.add(this.list.get(i));
				
			}
			
		}
		
		return (temp);
		
	}
	
	public List<Airline> display_by_day_and_time(String day_of_the_week, int hour, int minute){
		
		int i = 0;
		List<Airline> temp = new ArrayList<Airline>();
		
		for(i = 0; i < this.list.size(); i++) {
			
			if(this.list.get(i).get_day_of_the_week().equals(day_of_the_week)) {
				
				if(this.list.get(i).get_depature_hour() >= hour && this.list.get(i).get_depature_minute() > minute) {
					
					temp.add(this.list.get(i));
					
				}
				
			}
			
		}
		
		return (temp);
		
	}
	

}
