package by.htp.les02.main;

public class Customer implements Comparable <Customer> {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditcard;
	private int bank_account;
	
	Customer(int id, String surname, String name, String patronymic, String address, int creditcard, int bank_account) {
		
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditcard = creditcard;
		this.bank_account = bank_account;
		
	}
	
	public void set_id(int id) {
		
		this.id = id;
		
	}
	
	public void set_surname(String surname) {
		
		this.surname = surname;
		
	}
	
	public void set_name(String name) {
		
		this.name = name;
		
	}
	
	public void set_patronymic(String patronymic) {
		
		this.patronymic = patronymic;
		
	}
	
	public void set_address(String address) {
		
		this.address = address;
		
	}
	
	public void set_creditcard(int creditcard) {
		
		this.creditcard = creditcard;
		
	}
	
	public void set_bank_account(int bank_account) {
		
		this.bank_account = bank_account;
		
	}
	
	public int get_id() {
		
		return (this.id);
		
	}
	
	public String get_surname() {
		
		return (this.surname);
		
	}
	
	public String get_name() {
		
		return (this.name);
		
	}
	
	public String get_patronymic() {
		
		return (this.patronymic);
		
	}
	
	public String get_address() {
		
		return (this.address);
		
	}
	
	public int get_creditcard() {
		
		return (this.creditcard);
		
	}
	
	public int get_bank_account() {
		
		return (this.bank_account);
		
	}
	
	@Override
    public String toString() {
        return ("Customer\n" +
        		"  id: " +  this.id + "\n" +
        		"  surname: " + this.surname + "\n" +
        		"  name: " + this.name + "\n" +
        		"  patronymic: " + this.patronymic + "\n" +
        		"  address: " + this.address + "\n" +
        		"  creditcard: " + this.creditcard + "\n" +
        		"  bank_account :" + this.bank_account + "\n");
    }
	
    @Override
    public int compareTo(Customer o) {
    	
    	return (this.surname.compareTo(o.surname));
    	
    }

}