package by.htp.les02.main;

public class Clock {
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	Clock (int hour, int minute, int second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public String display() {
		
		return (this.hour + ":" + this.minute + ":" + this.second);
		
	}
	
	public void set_time(int hour, int minute, int second) {
		
		// check for lower and upper limits of values
		if (hour < 0 || hour > 24) { hour = 0; }
		if (minute < 0 || minute > 60) { minute = 0; }
		if (second < 0 || second > 60) { second = 0; }
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public void add_time(int hour, int minute, int second) {
		
		int i = 0;
		
		if (second < 0) { second = 0; }
		if (second > 60) {
			
			int diff = second;
			
			for (i = 0; diff > 60; i++) {
				
				diff = second - 60;
				second = diff;
				
				if (diff > 0) {
					
					minute++;
					
				}
				
			}
			
		}
		
		if (minute < 0) { minute = 0; }
		if (minute > 60) {
			
			int diff = minute;
			
			for (i = 0; diff > 60; i++) {
				
				diff = minute - 60;
				minute = diff;
				
				if (diff > 0) {
					
					hour++;
					
				}
				
			}
			
		}
		
		if (hour < 0 && hour > 24) { hour = 0; }
		
		int temp[] = new int[3];
		temp = get_time();
		
		this.hour = temp[0] + hour;
		this.minute = temp[1] + minute;
		this.second = temp[2] + second;
		
	}
	
	public int get_hour() {
		
		return (this.hour);
		
	}
	
	public int get_minute() {
		
		return (this.minute);
		
	}
	
	public int get_second() {
		
		return (this.second);
		
	}
	
	public int[] get_time() {

		int temp[] = { this.hour, this.minute, this.second };
		return (temp);
		
	}

}
