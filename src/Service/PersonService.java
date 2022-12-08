package Service;

import Classes.Person;

import java.util.List;
import java.util.Map;

public interface PersonService {
     String createPeople(List<Person>people);
     List<Person>person();
     Map<Integer, Person>getAge(List<Person>people);
     String getSearchDebut (String name,List<Person>people,String name1,List<Person>people1, int money);
     String getSearchName (String name,List<Person>people);
     String getSearchId (int id,List<Person>people);

}
