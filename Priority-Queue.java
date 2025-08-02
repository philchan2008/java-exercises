import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private final int id;
    private final String name;
    private final double cgpa;
    
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    int getID() {
        return this.id;
    }
    
    String getName() {
        return this.name;
    }
    
    double getCGPA() {
        return this.cgpa;
    }
}
class Priorities {
    
    //Create Comparator for the PriorityQueue
    Comparator<Student> studentComparentor = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int result = Double.compare(s2.getCGPA(), s1.getCGPA());
            result = result == 0 ? s1.getName().compareTo(s2.getName()) : result;
            result = result == 0 ? Integer.compare(s1.getID(), s2.getID()) : result;
            return result;
        }
    };
    
    List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
            events.size(), 
            studentComparentor);

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll(); // Remove highest priority student
                //pq.remove();
            }
        }

        List<Student> remainingStudents = new ArrayList<>(pq.size());
        
        while (!pq.isEmpty()) {
            remainingStudents.add(
                pq.poll()
                //pq.remove()
                );
        }

        return remainingStudents;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}