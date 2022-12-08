import ClassImpl.PersonImpl;
import Classes.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Map<String,Integer>map = new HashMap<>();
        map.put("Asyl",22);
        map.put("Kanat",20);
        map.put("Janat",18);
        map.put("Aijan",23);

        System.out.println(map);*/


       /* Map<String,String>map = new HashMap<String,String>();
        map.put("Kyrgyzstan","kyrgyz");
        map.put("Russia","russia");

        Iterator<Map.Entry<String,String>>itr = map.entrySet().iterator();
        while ((itr.hasNext())){
            Map.Entry<String,String>entry = itr.next();
            System.out.println(map);
        }*/


        Person person = new Person("Asan", LocalDate.of(2001, 12, 23), 1234, BigDecimal.valueOf(20000));
        Person person1 = new Person("Balancha", LocalDate.of(1998, 3, 5), 1235, BigDecimal.valueOf(30000));
        Person person2 = new Person("Tukuncho", LocalDate.of(2000, 10, 14), 1236, BigDecimal.valueOf(25000));
        ArrayList<Person> people = new ArrayList<>(
                Arrays.asList(person, person1, person2)
        );
        ArrayList<Person> people1 = new ArrayList<>(
                Arrays.asList(person, person1, person2)
        );
        PersonImpl person3 = new PersonImpl();
        while (true) {
            try {
                System.out.println("Сан жаз!");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();

                switch (number) {
                    case 1 -> {
                        System.out.println(person3.createPeople(people));
                    }
                    case 2 -> {
                        System.out.println(person3.person());
                    }
                    case 3 -> {
                        System.out.println(person3.getAge(people));
                    }
                    case 4 -> {


                        System.out.println("Карыз алуучу адамдын аты :");
                        String nam1 =  new Scanner(System.in).nextLine();
                        System.out.println("Карыз беруучу адамдын аты :");
                        String nam =  new Scanner(System.in).nextLine();;
                        System.out.println("Канча акча ");
                        int i = new Scanner(System.in).nextInt();

                        System.out.println(person3.getSearchDebut(nam1, people, nam, people1, i));
                    }
                    case 5 -> {
                        int id = scanner.nextInt();
                        System.out.println("Id жаз");
                        System.out.println(person3.getSearchId(id, people));
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You must write a number not a word");
            }
        }

    }

    static {
        System.out.println("""
                Press 1 : Create people
                Press 2 : All person
                Press 3 : getAge
                Press 4 : getSearchDebut
                Press 5 : getSearchId
                """);

    }
}