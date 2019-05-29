package by.htp.les02.main;

public class Test1 {
	
	private int a = 0;
	private int b = 0;
	
	public void set_values(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public int get_a() {
		
		return(this.a);
		
	}
	
	public int get_b() {
		
		return(this.b);
		
	}
	
	public int get_sum() {
		
		return(this.a + this.b);
		
	}
	
	public int get_biggest() {
		
		if (this.a > this.b) {
			
			return(this.a);
		}
		else {
			
			return(this.b);
		}
		
	}

}
