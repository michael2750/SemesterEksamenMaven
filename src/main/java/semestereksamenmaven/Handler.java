/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestereksamenmaven;

import impl.Person;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public interface Handler {
    

    
    public ArrayList<String> arrayToArrayList(String[] data);
    
    public String[] splitString(String str);
    
    public ArrayList<Integer> sortListAscending(ArrayList<Integer> data);
    
    public String appendString(String str1, String str2);
    
    public int getAvarage(int a, int b, int c, int d);
    
    public int getLastValue(ArrayList<Integer> value);
    
    public Person createPerson(String firstName, String lastName, int age);
    
    public ArrayList<Person> addPersons();
    
    public boolean isAtWork(int hour);
   
    public int isAdultCount();
    
}
