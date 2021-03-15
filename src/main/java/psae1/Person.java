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

public class Person {
    
    private String name;
    private String surname;
    private int age;
    private int salary; //for 3rd task
    
    public Person(){  //default constructor
        this.name=rand_name();
        this.salary=rand_salary();
        this.surname=rand_surname();
        this.age=rand_age();
    }
    
    public int getAge() { //getter
        return age;
    }
    
    public int getSalary() { //getter
        return salary;
    }
    
    public String getName() { //getter
        return name;
    }
    
    public String getSurname() { //getter
        return surname;
    }
    
    public void setAge(int ageParameter) { //setter  
        age = ageParameter;
    }
    
    public void setSalary(int salaryParameter) { //setter  
        salary = salaryParameter;
    }
    
    public void setName(String nameParameter) { //setter  
        name = nameParameter;
    }
    
    public void setSurname(String surnameParameter) { //setter  
        surname = surnameParameter;
    }
    
    public static int rand_age() {
        int random_age = (int) (Math.random() * 100) + 1;
        return random_age;
    }
    
    public static int rand_salary() {
        int random_salary = (int) (Math.random() * 5000);
        return random_salary;
    }
    
    public static String rand_name() {
        String tablica[] = new String [10]; 
        tablica[0] = "Abigail";
        tablica[1] = "Brigitte";
        tablica[2] = "Camille";
        tablica[3] = "Danys";
        tablica[4] = "Elise";
        tablica[5] = "Fenix";
        tablica[6] = "Gordon";
        tablica[7] = "Hasley";
        tablica[8] = "Iroh";
        tablica[9] = "Jessie";
        
        int random_number = (int) (Math.random() * 10);
        String rand_name = tablica[random_number];
        return rand_name;
    }
    
    public static String rand_surname() {
        String tablica[] = new String [10]; 
        tablica[0] = "Ackland";
        tablica[1] = "Badley";
        tablica[2] = "Carden";
        tablica[3] = "Dawson";
        tablica[4] = "Ellis";
        tablica[5] = "Farrow";
        tablica[6] = "Gates";
        tablica[7] = "Hallman";
        tablica[8] = "Ivens";
        tablica[9] = "Jetton";
        
        int random_number = (int) (Math.random() * 10);
        String rand_surname = tablica[random_number];
        return rand_surname;
    }
    
    @Override
    public String toString(){
        return this.name+"\t"+this.surname+"\tAge:"+this.age+"\tSalary:"+this.salary; 
    }
}
