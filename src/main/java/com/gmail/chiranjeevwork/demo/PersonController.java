package com.gmail.chiranjeevwork.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService people;

    @RequestMapping("/list")
    public List<Person> getPeople() {

        return people.getPeople();
    }
    @RequestMapping("/list/{id}")
    public Person getPerson(@PathVariable("id") String name){

        return people.getPerson(name);
    }
    @RequestMapping(method= RequestMethod.POST,value = "/list/multiple")
    public void addPerson(@RequestBody Person[] person){
        people.addPeople(person);
    }
    @RequestMapping(method= RequestMethod.POST,value = "/list")
    public void addPerson(@RequestBody Person person){
        people.addPerson(person);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/list/{id}")
    public void updatePerson(@RequestBody Person person,
                             @PathVariable String id){
        people.updatePerson(person,id);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/list/{id}")
    public void deletePerson(@PathVariable String id){
        people.deletePerson(id);
    }

}
