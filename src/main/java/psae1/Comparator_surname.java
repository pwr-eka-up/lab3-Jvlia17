/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae1;
import java.util.Comparator;

/**
 *
 * @author Julia Rzepka
 */

public class Comparator_surname implements Comparator<Person> {
    
    @Override
    public int compare(Person person1, Person person2){
        return person1.getSurname().compareTo(person2.getSurname());
    }
}

