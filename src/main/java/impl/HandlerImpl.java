/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;
import java.util.Collections;
import semestereksamenmaven.Handler;

/**
 *
 * @author micha
 */
public class HandlerImpl implements Handler {

    public ArrayList<Person> persons = new ArrayList();
    PersonData pd = new PersonData();

    /*
        Take all elements from the String[] data and put it into
        a new ArrayList<String>.
     */
    @Override
    public ArrayList<String> arrayToArrayList(String[] data) {
        ArrayList<String> list = new ArrayList();
        for (String data1 : data) {
            list.add(data1);
        }
        return list;
    }

    /*
        Split the string for each comma.
     */
    @Override
    public String[] splitString(String str) {
        String[] array = new String[4];
        for (int i = 0; i < array.length; i++) {
            array = str.split(",");
        }
        return array;
    }

    /*
        Sort an arraylist, smallest int first.
     */
    @Override
    public ArrayList<Integer> sortListAscending(ArrayList<Integer> data) {
        Collections.sort(data);
        return data;
    }

    /*
        Build multiple strings into one.
     */
    @Override
    public String appendString(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        String finalStr;
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        finalStr = stringBuilder.toString();
        return finalStr;

    }

    /*
        get the avarage of four numbers
     */
    @Override
    public int getAvarage(int a, int b, int c, int d) {
        int avg = (a + b + c + d) / 4;
        return avg;
    }

    /*
        Get the last value from the ArrayList.
     */
    @Override
    public int getLastValue(ArrayList<Integer> value) {
        int last = value.get(value.size() - 1);
        return last;
    }

    /*
        Create a person using the Person class.
     */
    @Override
    public Person createPerson(String firstName, String lastName, int age) {
        Person p = new Person(firstName, lastName, age);
        return p;
    }

    /*
        Add persons using the PersonData class.
     */
    @Override
    public ArrayList<Person> addPersons() {
        persons = pd.getPersons();
        return persons;
    }

    /*
        Return true or false weather the person is at work or not.
        Working hours are between 8-16.
     */
    @Override
    public boolean isAtWork(int hour) {
        return !(hour <= 8 || hour >= 16);
    }

    /*
        Count up all persons that is 18 or above.
     */
    @Override
    public int isAdultCount() {
        int count = 0;
        pd.addData();
        persons = pd.getPersons();
        for (Person p : persons) {
            if (p.getAge() >= 18) {
                count++;
            }
        }
        return count;
    }
}
