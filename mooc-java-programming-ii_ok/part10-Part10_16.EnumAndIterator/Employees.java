/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Employees {
    ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    public void add(Person personToAdd) {
        //adds the given person to the employees list
        employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        //adds the given list of people to the employees list
        for (Person person : peopleToAdd) {
            this.add(person);
        }
    }
    public void print() {
        //prints all employees
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    public void print(Education education) {
        //prints the employees whose education matches the education given as a parameter.
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                System.out.println(employee.toString());
            }
        }
        
    }
    public void fire(Education education) {
        //prints the employees whose education matches the education given as a parameter.
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
