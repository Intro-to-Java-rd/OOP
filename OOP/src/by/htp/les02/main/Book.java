package by.htp.les02.main;

public class Book {
	
	private int id;
	private String name;
	private String authors;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	private String cover;
	
	Book(int id, String name, String authors, String publisher, int year, int pages, double price, String cover){
		
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.cover = cover;
		
	}
	
	public void set_id(int id) {
		
		this.id = id;
		
	}
	
	public void set_name(String name) {
		
		this.name = name;
		
	}
	
	public void set_authors(String authors) {
		
		this.authors = authors;
		
	}
	
	public void set_publisher(String publisher) {
		
		this.publisher = publisher;
		
	}
	
	public void set_year(int year) {
		
		this.year = year;
		
	}
	
	public void set_pages(int pages) {
		
		this.pages = pages;
		
	}
	
	public void set_price(double price) {
		
		this.price = price;
		
	}
	
	public void set_cover(String cover) {
		
		this.cover = cover;
		
	}
	
	public int get_id() {
		
		return (this.id);
		
	}
	
	public String get_name() {
		
		return (this.name);
		
	}
	
	public String get_authors() {
		
		return (this.authors);
		
	}
	
	public String get_publisher() {
		
		return (this.publisher);
		
	}
	
	public int get_year() {
		
		return (this.year);
		
	}
	
	public int get_pages() {
		
		return (this.pages);
		
	}
	
	public double get_price() {
		
		return (this.price);
		
	}
	
	public String get_cover() {
		
		return (this.cover);
		
	}
	
	@Override
    public String toString() {
        return ("Book\n" +
        		"  id: " +  this.id + "\n" +
        		"  name: " + this.name + "\n" +
        		"  author(s): " + this.authors + "\n" +
        		"  publisher: " + this.publisher + "\n" +
        		"  year: " + this.year + "\n" +
        		"  pages: " + this.pages + "\n" +
        		"  price: " + this.price + "\n" + 
        		"  cover type: " + this.cover + "\n");
    }

}
