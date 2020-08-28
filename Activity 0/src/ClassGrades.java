/**
 * A simple class to store values in a hash map and print the entries.
 * @author Ashiqur Rahman
 * @author_email ashiqur.r@niu.edu
 * @author_url https://ashiqur.com
 */

/**
 * Import the required libraries
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ClassGrades creates the hashmap and contains the methods to print the values
 */
public class ClassGrades {
    /**
     * classList Map default HashMap to store the entries
     */
    Map<String, String> classList = new HashMap<String, String>();

    /**
     * Constructor to store the entries in the HashMap
     */
    public ClassGrades() {
        classList.put("Bob", "A");
        classList.put("Mary", "C");
        classList.put("Sarah", "B");
        classList.put("Philip", "A");
        classList.put("Greg", "F");
    }

    /**
     * Print the HashMap
     * @return void
     */
    public void printClassList() {
        Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
        while (entries.hasNext()) {
            Entry<String, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /**
     * Print the HashMan using different iterators
     * @return void
     */
    public void printClassList2() {
        for (Entry<String, String> entry : classList.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        for (String key : classList.keySet()) {
            System.out.println("Key = " + key);
        }

        for (String value : classList.values()) {
            System.out.println("Value = " + value);
        }
    }

    /**
     * Main method as the class entry point
     * @param args none
     * @return void
     */
    public static void main(String[] args) {
        ClassGrades myClassList = new ClassGrades();
        myClassList.printClassList();
        myClassList.printClassList2();
    }
}
