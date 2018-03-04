/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class PersonData {
    
    private final ArrayList<Person> persons;
    
    public PersonData(){
        this.persons = new ArrayList();
    }
    
    public void addData(){
        persons.add(new Person("Helle", "Jensen", 48));
        persons.add(new Person("Frank", "Svendsen", 10));
        persons.add(new Person("Peter", "Fransen", 15));
        persons.add(new Person("Norma", "Tuk", 23));
        persons.add(new Person("Ole", "Larsen", 53));
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}
