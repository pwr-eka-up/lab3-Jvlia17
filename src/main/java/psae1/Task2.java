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

public class Task2 {
    
    public static void main(String[] args) {
        People people = new People();
        System.out.println("\nThis is a list of people: ");
        people.print(); 
        System.out.println("\nThis is a list of people sorted by age: ");
        people.sortByAge();
        System.out.println("\nThis is a list of people sorted by name: ");
        people.sortByName();
        System.out.println("\nThis is a list of people sorted by surname: ");
        people.sortBySurname();
        System.out.println();
        people.salary();
    }
}
