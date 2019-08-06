package com.gmail.chiranjeevwork.demo;

import com.gmail.chiranjeevwork.demo.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    List<Person> people= new ArrayList<>(Arrays.asList(new Person(34, "chiranjeev"),
            new Person(30, "Aradhana"), new Person(70,"Thomas")));


    public List getPeople() {
        return people;
    }


    public Person getPerson(String id){

        return people.stream().filter( t->t.getName().
                equals(id)).
                findFirst().
                get();
    }
    public void addPerson(Person person){
        people.add(person);
    }
    public void addPeople(Person[] persons){
        people.addAll(Arrays.asList(persons));
    }
    public void updatePerson(Person person,String id){

        for (int i = 0; i <people.size(); i++) {
            if(people.get(i).getName().equals(id)){
                people.set(i,person);
            }
        }
    }

    public void deletePerson(String id) {

        people.removeIf(t-> t.getName().equals(id));
        //below function does the same as above lambda expression
//        for (int i = 0; i <people.size() ; i++) {
//            if(people.get(i).getName().equals(id)){
//                people.remove(i);
//            }
//        }
    }
}
