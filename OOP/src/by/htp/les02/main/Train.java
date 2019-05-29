package by.htp.les02.main;

public class Train {
	
	private int id;
	private String destination;
	private String dispatch_time;
	
	public int get_id() {
		
		return (this.id);
		
	}
	
	public void setup(int id, String destination, String dispatch_time) {
		
		this.id = id;
		this.destination = destination;
		this.dispatch_time = dispatch_time;
		
	}
	
	public String display() {
		
		return ("Train number " + this.id + " to " + this.destination + " departs at " + this.dispatch_time + " local time.");
		
	}
	
	public static void train_sort_by_id(Train train[]) {
		
		int i = 0;
		int j = 0;
		Train temp;
		
		for (i = 1; i < train.length; i++) {
			
			for (j = i; j > 0; j--) {
				
				if (train[j].get_id() < train[j - 1].get_id()) {
					
					temp = train[j];
					train[j] = train[j - 1];
					train[j - 1] = temp;
					
				}
				
			}
			
		}
		
	}
	
	public static void train_sort_by_destination(Train train[]) {
		
		int i = 0;
		int j = 0;
		Train temp;
		
		for (i = 0; i < train.length; i++) {
			
			for (j = i + 1; j < train.length; j++) {
				
				// alphabetical order
				if (train[i].destination.compareTo(train[j].destination) > 0) {
					
					temp = train[i];
					train[i] = train[j];
                    train[j] = temp;
					
				}
				
				// same names ? order by time!
				if (train[i].destination.compareTo(train[j].destination) == 0) {
					
					if (train[i].dispatch_time.compareTo(train[j].dispatch_time) > 0) {
						
						temp = train[i];
						train[i] = train[j];
	                    train[j] = temp;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	public static String train_display(Train train[], int id) {
		
		int i = 0;
		for (i = 0; i < train.length; i++) {
			
			if(train[i].get_id() != id) { continue;	}
			
			return (train[i].display());
			
		}
		
		return (null);
		
	}

}
