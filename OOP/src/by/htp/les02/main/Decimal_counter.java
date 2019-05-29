package by.htp.les02.main;

public class Decimal_counter {
	
	private int current_state;
	private int upper_limit;
	private int lower_limit;
	private boolean error;
	private String error_message;
	
	Decimal_counter() {
		
		this.current_state = 1;
		this.upper_limit = 10;
		this.lower_limit = 1;
		this.error = false;
		this.error_message = null;
	}
	
	public Decimal_counter(int value, int min, int max) {
		
		if (min > max) {
			
			int temp = max;
			max = min;
			min = temp;
			
		}
		
		if (value < min || value > max) {
			
			this.current_state = min;
			
		}
		else {
			
			this.current_state = value;
			
		}
		
		this.lower_limit = min;
		this.upper_limit = max;
		
	}
	
	public int get_state() {
		
		return (this.current_state);
		
	}
	
	public boolean error_check() {
		
		return (this.error);
		
	}
	
	public String get_error_msg() {

		return (this.error_message);
		
	}
	
	public void increase() {
		
		this.current_state++;
		
		if(this.current_state >= this.upper_limit) {
			
			this.current_state = this.upper_limit;
			this.error = true;
			this.error_message = "Out of bounds!";
			
		}
		
	}
	
	public void decrease() {
		
		this.current_state--;
		
		if(this.current_state <= this.lower_limit) {
			
			this.current_state = this.lower_limit;
			this.error = true;
			this.error_message = "Out of bounds!";
			
		}
		
	}
	
	public void reset() {
		
		this.current_state = 1;
		this.upper_limit = 10;
		this.lower_limit = 1;
		this.error = false;
		this.error_message = null;
		
	}

}
