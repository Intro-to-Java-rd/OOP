package by.htp.les02.main;

public class Student {
	
	private String surname = " ";
	private String initials = " ";
	
	private int group;
	private int[] marks = new int[5];
	
	public boolean check_grade(int grade) {
		
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			
			// don't allow to continue
			// if our student has grades smaller than the given ones
			if (this.marks[i] < grade) { return (false); }
			
		}
		
		return (true);
		
	}
	
	public void set_info(String surname, String initials, int group) {
		
		this.surname = surname;
		this.initials = initials;
		this.group = group;
		
	}
	
	public void set_grades(int a, int b, int c, int d, int e) {
		
		if (a > 10 || a < 0) { a = 0; }
		if (b > 10 || b < 0) { b = 0; }
		if (c > 10 || c < 0) { c = 0; }
		if (d > 10 || d < 0) { d = 0; }
		if (e > 10 || e < 0) { e = 0; }
		
		this.marks[0] = a;
		this.marks[1] = b;
		this.marks[2] = c;
		this.marks[3] = d;
		this.marks[4] = e;
		
	}
	
	public String display_info(int grade) {
		
		if (check_grade(grade) == true) {
			
			return ("Student's surname is " + surname + " / " + initials + " and his group is " + group);
			
		}
		
		return (null);
		
	}

}
