package by.htp.les02.main;

import java.util.*;

public class OOPMain {

	public static void main(String[] args) {
		
		/*
		Test1 test1 = new Test1(); // default values a = 0; b = 0
		test1.set_values(20, 10);
		display_values(test1.get_a(), test1.get_b());
		
		Test2 test2 = new Test2(); // default a = 10; b = 10
		test2.set_values(5, 2);
		display_values(test2.get_a(), test2.get_b());
		
		// student class
		students_test();
		
		// train class
		train_test();
		
		// decimal counter class
		decimal_test();
		
		// clock class
		clock_test();
		
		// triangle class
		triangle_test();
		
		// customer classes
		customer_test();
		
		// book classes
		book_test();
		
		*/
		
		// airline classes
		airline_test();
		
	}
	
	public static void display_values(int a, int b) {
		
		System.out.println("a = " + a + "; b = " + b + ";");
		
	}
	
	public static void students_test() {
		
		Student[] student = new Student[10];
		
		int i = 0;
		for (i = 0; i < student.length; i++) {
			
			student[i] = new Student();
			
		}

		student[0].set_info("Kuznetsova", "KAA", 2);
		student[0].set_grades(9, 10, 7, 9, 8);
		
		student[1].set_info("Ivanov", "IRE", 1);
		student[1].set_grades(10, 9, 9, 9, 10);
		
		student[2].set_info("Petrov", "PMI", 2);
		student[2].set_grades(9, 10, 9, 10, 9);

		student[3].set_info("Kutuzov", "KMO", 3);
		student[3].set_grades(9, 10, 10, 10, 10);
		
		student[4].set_info("Semenova", "SLA", 3);
		student[4].set_grades(3, 4, 6, 3, 8);
		
		student[5].set_info("Bayramukova", "BAB", 1);
		student[5].set_grades(10, 10, 10, 10, 10);
		
		student[6].set_info("Sarkisyan", "SVA", 2);
		student[6].set_grades(5, 9, 3, 3, 2);
		
		student[7].set_info("Kochkarov", "KMR", 2);
		student[7].set_grades(9, 10, 9, 9, 10);
		
		student[8].set_info("Dumanishev", "DJO", 1);
		student[8].set_grades(5, 7, 8, 5, 8);
		
		student[9].set_info("Lisenko", "LAS", 3);
		student[9].set_grades(10, 8, 7, 9, 10);
		
		// display only students with 9 to 10 grades
		for (i = 0; i < 10; i++) {
			
			if (student[i].display_info(9) != null) {
				
				System.out.println(student[i].display_info(9));
				
			}
			
		}
		
	}
	
	public static void train_test() {
		
		Train[] train = new Train[5];
		
		int i = 0;
		for (i = 0; i < train.length; i++) {
			
			train[i] = new Train();
			
		}
		
		// setup by hand
		train[0].setup(10, "Minsk", "10:00");
		train[1].setup(2, "Moscow", "02:00");
		train[2].setup(5, "Kazan", "05:45");
		train[3].setup(8, "Brest", "14:40");
		train[4].setup(3, "Moscow", "01:40");
		
		// sort them by their id's
		Train.train_sort_by_id(train);
		
		// display all trains
		train_display_all(train);
		
		// display train by it's number
		System.out.println(Train.train_display(train, 5) + "\n");
		
		// sort them by their destinations
		// for trains with same destinations
		// we sort them by destination time
		Train.train_sort_by_destination(train);
		
		// display all trains
		train_display_all(train);
		
	}
	
	public static void train_display_all(Train train[]) {
		
		int i = 0;
		
		// display all trains
		for (i = 0; i < train.length; i++) {
			
			System.out.println(train[i].display());
			
		}
		
		System.out.println();
		
	}
	
	public static void decimal_test() {
		
		// create our counter and check it's state
		Decimal_counter counter = new Decimal_counter(1, 1, 10);
		System.out.println(counter.get_state());
		
		// count up till we hit the upper limit and get error
		// display each step
		while (counter.error_check() == false) {
			
			counter.increase();
			System.out.println(counter.get_state());
			
		}
		
		// show our error
		System.out.println(counter.get_error_msg());
		
		// reset counter to default values
		counter.reset();
		
		// show it's state again
		System.out.println(counter.get_state());
		
	}
	
	public static void clock_test() {
		
		Clock clock = new Clock(12, 00, 00);
		System.out.println(clock.display());
		
		// add time to the clock
		clock.add_time(0, 70, 70);
		System.out.println(clock.display());
		
		// set new time
		clock.set_time(12, 34, 60);
		System.out.println(clock.display());
		
	}
	
	public static void triangle_test() {
		
		// point AB = {12, 3}
		// point BC = {35, 6}
		// point AC = {41, 6}
		Triangle triangle = new Triangle(12.0D, 3.0D, 35.0D, 6.0D, 41.0D, 6.0D);
		triangle.get_info(); // display all info about this triangle
		
	}
	
	public static void customer_test() {
		
		Customer[] customer = new Customer[5];
		customer[0] = new Customer(4, "Kochkarov", "Magomet", "Robertovich", "Minsk, Kuzmi Chernogo street", 453670, 445633308);
		customer[1] = new Customer(9, "Sidorov", "Andrey", "Michaelovich", "Kislovodsk, Lenin street", 313570, 552344658);
		customer[2] = new Customer(2, "Ivanov", "Ivan", "Ivanovich", "Brest, Ivan street", 567567, 759423589);
		customer[3] = new Customer(1, "Petrov", "Petr", "Petrovich", "Grodno, Petr street", 115570, 112567894);
		customer[4] = new Customer(3, "Semenov", "Ilya", "Eduardovich", "Moscow, Kutuzov street", 866381, 775521036);
		
		// create massive
		CustomerMassive massive = new CustomerMassive(customer);
		
		// sort by alphabet
		massive.sort_by_alphabet();
		
		// display
		display_customer_list(massive.display_all());
		
		// display within the given range
		int min = 100000;
		int max = 400000;
		System.out.println("Customers found within the given range of " + min + " to " + max);
		display_customer_list(massive.display_within_range(min, max));
		
	}
	
	public static void display_customer_list(List<Customer> list) {
		
		int i = 0;
		for(i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}
	
	public static void book_test() {
		
		Book[] book = new Book[5];
		book[0] = new Book(4, "Metro 2033", "Dmitry Glukhovsky", "Gollancz", 2010, 458, 3.47, "Hard cover");
		book[1] = new Book(7, "Hulinomics. Hooligan economy.", "Alexey Markov", "ACT", 2017, 390, 8.16, "Hard cover");
		book[2] = new Book(2, "Crime and Punishment", "Fyodor Dostoevsky", "The Russian Messenger", 1866, 545, 7.0, "Hard cover");
		book[3] = new Book(1, "Head First Java, 2nd Edition", "Bert Bates, Kathy Sierra", "O'Reilly Media, Inc", 2005, 688, 14.22, "Soft cover");
		book[4] = new Book(13, "Fathers and Sons (novel)", "Ivan Turgenev", "The Russian Messenger", 1862, 226 , 10.7, "Hard cover");
		
		// create massive
		BookMassive massive = new BookMassive(book);
		
		String author = "Ivan Turgenev";
		String publisher = "The Russian Messenger";
		int year = 2010;
		
		// display by author
		System.out.println("Display by author " + author + ".");
		display_book_list(massive.display_by_authors(author));
		
		// display by publisher
		System.out.println("Display by publisher " + publisher + ".");
		display_book_list(massive.display_by_publisher(publisher));
		
		// display by year
		System.out.println("Display starting from year " + year + ".");
		display_book_list(massive.display_by_year(year));
		
	}
	
	public static void display_book_list(List<Book> list) {
		
		int i = 0;
		for(i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}
	
	public static void airline_test() {
		
		Airline[] airline = new Airline[5];
		airline[0] = new Airline("New-York", 145, "Boeing 737", 12, 45, "Sunday");
		airline[1] = new Airline("Moscow", 134, "Airbus A320", 22, 15, "Thuesday");
		airline[2] = new Airline("Bali", 386, "Comac C919", 2, 30, "Monday");
		airline[3] = new Airline("Grodno", 225, "Airbus A320", 7, 30, "Sunday");
		airline[4] = new Airline("Berlin", 525, "Airbus A320", 15, 25, "Thursday");
		
		// create massive
		AirlineMassive massive = new AirlineMassive(airline);
		
		String destination = "Moscow";
		String day_of_the_week = "Sunday";
		int hour = 12;
		int minute = 30;
		
		// display by destination
		System.out.println("Display airlines by destination " + destination + ".");
		display_airline_list(massive.display_by_destination(destination));
		
		// display by day of the week
		System.out.println("Display airlines by " + day_of_the_week + ".");
		display_airline_list(massive.display_by_day_of_the_week(day_of_the_week));
		
		// display by day and time
		System.out.println("Display airlines by " + day_of_the_week + " and after " + hour + " : " + minute + " o'clock.");
		display_airline_list(massive.display_by_day_and_time(day_of_the_week, hour, minute));
		
	}
	
	public static void display_airline_list(List<Airline> list) {
		
		int i = 0;
		for(i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
	}

}
