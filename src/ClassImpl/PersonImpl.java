package ClassImpl;

import Classes.Person;
import Service.PersonService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonImpl implements PersonService {
    private final List<Person>personList=new ArrayList<>();
    @Override
    public String createPeople(List<Person> people) {
        this.personList.addAll(people);
        return "Create person";
    }

    @Override
    public List<Person> person() {
        return personList;
    }

    @Override
    public Map<Integer, Person> getAge(List<Person> people) {
        Map<Integer, Person> getAge = new HashMap<>();
        for (Person person : people) {
            int years = Period.between(person.getDateOfBirth(), LocalDate.now()).getYears();
            getAge.put(years,person);
        }
        return getAge;
    }

    @Override
    public String getSearchDebut(String name,List<Person>people, String name1,List<Person>people1, int money) {
        for (Person person : people) {
            if(person.getName().equals(name)){
                for (Person person1 : people1) {
                    if(person1.getName().equals(name1)){
                        boolean a = person1.getMoney().intValue()>=money;
                        if(a){
                            BigDecimal subtract = person1.getMoney().subtract(BigDecimal.valueOf(money));
                            person1.setMoney(subtract);
                            BigDecimal add = person.getMoney().add(BigDecimal.valueOf(money));
                            person.setMoney(add);
                        }return "Кайра кайтарып бер";
                    }else return "Акча жетпейт";
                }
            }
        }

        return "Акча бере албайм";
    }

    @Override
    public String getSearchName(String name, List<Person> people) {
        for (Person person : people) {
            if(name.equals(person.getName())){
                System.out.println(person);
            }
        }
        return "Person name";
    }

    @Override
    public String getSearchId(int id, List<Person> people) {
        for (Person person : people) {
            if(id == person.getId()){
                System.out.println(person);
            }
        }
        return " Create Id ";
    }
}
