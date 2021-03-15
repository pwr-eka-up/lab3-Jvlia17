/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae1;

/**
 *
 * @author Julia Rzepka
 */

import java.util.ArrayList;
import java.util.Collections; //for sorting

public class People {
    
    private ArrayList<Person> people;
    
    public People(){  //default constructor
        people = new ArrayList<>();
        int random_number = (int) (Math.random() * 10+1);
        for (int i = 0; i < random_number; i++) {
            people.add(new Person());
        }
    }
    
    public void print() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
    
    public void sortByAge() { //sort people by age
        Comparator_age compAge = new Comparator_age();
        Collections.sort(people, compAge);
        for (Person i : people) {
            System.out.println(i.toString());
        }
    }
    
    public void sortByName() { //sort people by name
        Comparator_name compName = new Comparator_name();
        Collections.sort(people, compName);
        for (Person i : people) {
            System.out.println(i.toString());
        }
    }
    
    public void sortBySurname() { //sort people by surname
        Comparator_surname compSurname = new Comparator_surname();
        Collections.sort(people, compSurname);  // Sort people
        for (Person i : people) {
            System.out.println(i.toString());
        }
    }
    
    public void salary() { //for 3rd task
        int full_age = 0;
        int counter = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getSalary()>1000){
                full_age+=people.get(i).getAge();
                counter++;
            }
        }
        if (counter>0)
            System.out.println("This is the average age of people which a salary above 1000: " + full_age/counter); 
        else 
            System.out.println("There is no person with salary above 1000");
    }
}

