package DAY9;

import java.util.PriorityQueue;

class Patient  {
	String name;
	int priority;
	Patient(String name, int priority){
		this.name = name;
		this.priority = priority;
	}
}
public class class905 {
	public static void main(String[] args) {
		PriorityQueue<Patient> queue = new PriorityQueue<>(
				(p1,p2) -> p1.priority - p2.priority
				);
		
		queue.add(new Patient("Anand", 2));
		queue.add(new Patient("Rahul", 3));
		queue.add(new Patient("Priya", 6));
		queue.add(new Patient("John", 8));
		
		while(!queue.isEmpty()) {
			Patient p = queue.poll();
			
			System.out.println(p.name + " - Priority " + p.priority);
		}
	}
}
