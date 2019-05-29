package by.htp.les02.main;

public class Airline {
	
	private String destination;
	private int flight_number;
	private String aircraft_type;
	private int depature_hour;
	private int depature_minute;
	private String day_of_the_week;
	
	Airline(String destination, int flight_number, String aircraft_type, int depature_hour, int depature_minute, String day_of_the_week){
		
		int i = 0;
		if (depature_minute > 60) { 
			
			int diff = depature_minute;
			
			for (i = 0; diff > 60; i++) {
				
				diff = depature_minute - 60;
				depature_minute = diff;
				
				if (diff > 0) {
					
					depature_hour++;
					
				}
				
			}
			
		}
		if (depature_hour > 24) { depature_hour = 0; }
		
		this.destination = destination;
		this.flight_number = flight_number;
		this.aircraft_type = aircraft_type;
		this.depature_hour = depature_hour;
		this.depature_minute = depature_minute;
		this.day_of_the_week = day_of_the_week;
		
	}
	
	public void set_destination(String destination) {
		
		this.destination = destination;
		
	}
	
	public void set_flight_number(int flight_number) {
		
		this.flight_number = flight_number;
		
	}
	
	public void set_aircraft_type(String aircraft_type) {
		
		this.aircraft_type = aircraft_type;
		
	}
	
	public void set_depature_hour(int depature_hour) {
		
		this.depature_hour = depature_hour;
		
	}
	
	public void set_depature_minute(int depature_minute) {
		
		this.depature_minute = depature_minute;
		
	}
	
	public void set_day_of_the_week(String day_of_the_week) {
		
		this.day_of_the_week = day_of_the_week;
		
	}
	
	public String get_destination() {
		
		return (this.destination);
		
	}
	
	public int get_flight_number() {
		
		return (this.flight_number);
		
	}
	
	public String get_aircraft_type() {
		
		return (this.aircraft_type);
		
	}
	
	public int get_depature_hour() {
		
		return (this.depature_hour);
		
	}
	
	public int get_depature_minute() {
		
		return (this.depature_minute);
		
	}
	
	public String get_day_of_the_week() {
		
		return (this.day_of_the_week);
		
	}
	
	@Override
    public String toString() {
        return ("Airline\n" +
        		"  destination: " +  this.destination + "\n" +
        		"  flight number: " + this.flight_number + "\n" +
        		"  aircraft type: " + this.aircraft_type + "\n" +
        		"  depature time: " + this.depature_hour + " : " + this.depature_minute + "\n" +
        		"  day_of_the_week: " + this.day_of_the_week + "\n");
    }
	
}
