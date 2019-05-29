package by.htp.les02.main;

public class Test2 {
	
	private int a;
	private int b;
	
	Test2(){
		
		this.a = 10;
		this.b = 10;
		
	}
	
	Test2(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
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

}
