package by.htp.les02.main;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Triangle {
	
	private double AB;
	private double BC;
	private double AC;
	private Point centroid;
	
	private static DecimalFormat decimal = new DecimalFormat("#.##");
	
	Triangle(double x1, double x2, double y1, double y2, double c1, double c2){
		
		Point a = new Point(x1, x2);
		Point b = new Point(y1, y2);
		Point c = new Point(c1, c2);
		
		this.AB = get_length(a, b);
		this.BC = get_length(b, c);
		this.AC = get_length(a, c);
		
		double[] temp = { this.AB, this.BC, this.AC };
		Arrays.sort(temp);
		
		if (check_triangle(temp[2], temp[0], temp[1]) == false) {
			
			System.out.println("Triangle doesn't exist!");
			
		}
		
		double x = a.x + b.x + c.x;
		double y = a.y + b.y + c.y;
        centroid = new Point(x / 3, y / 3);
        
	}
	
	public boolean check_triangle(double a, double b, double c) {
		
		if (a > b + c) { return (false); }
		else { return(true); }
		
	}
	
	public double get_length(Point a, Point b) {
		
		return (Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2)));
		
	}
	
	public double get_perimeter() {
		
		return (this.AB + this.BC + this.AC);
		
	}
	
	public double get_area() {
		
		double s = get_perimeter() / 2;
		return (Math.sqrt(s * (s - this.AB) * (s - this.BC) * (s - this.AC)));
	}
	
	public void get_info() {
		
		System.out.println("AB length is " + decimal.format(this.AB));
		System.out.println("BC length is " + decimal.format(this.BC));
		System.out.println("AC length is " + decimal.format(this.AC));
		
		System.out.println("Perimeter of triangle " + decimal.format(get_perimeter()));
		System.out.println("Area of triangle " + decimal.format(get_area()));
		System.out.println("Centroid point of triangle x = " + decimal.format(this.centroid.x) + " y = "  + decimal.format(this.centroid.y));
		
	}

}
