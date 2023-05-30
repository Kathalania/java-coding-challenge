
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void PersonIsEqual()
    {
        var person1 = new Person();
        person1.setFirstName("Emma");
        person1.setLastName("Müller");
        person1.setBirthday(LocalDate.of( 2000 , 1 , 1 ));

        var person2 = new Person();
        person2.setFirstName("Emma");
        person2.setLastName("Müller");
        person2.setBirthday(LocalDate.of( 2000 , 1 , 1 ));

        assertTrue(person1.equals(person2));
    }

    @Test
    public void PersonIsNotEqual()
    {
        var person1 = new Person();
        person1.setFirstName("Emma");
        person1.setLastName("Müller");
        person1.setBirthday(LocalDate.of( 2000 , 1 , 1 ));

        var person2 = new Person();
        person2.setFirstName("Ben");
        person2.setLastName("Müller");
        person2.setBirthday(LocalDate.of( 1999 , 1 , 1 ));

        assertTrue(!person1.equals(person2));
    }

    @Test
    public void GetFirstNames()
    {
        var person1 = new Person();
        person1.setFirstName("Emma");
        person1.setLastName("Müller");
        person1.setBirthday(LocalDate.of( 2001 , 1 , 1 ));

        var person2 = new Person();
        person2.setFirstName("Ben");
        person2.setLastName("Schäfer");
        person2.setBirthday(LocalDate.of( 1999 , 1 , 1 ));

        var person3 = new Person();
        person3.setFirstName("Paul");
        person3.setLastName("Fischer");
        person3.setBirthday(LocalDate.of( 1998 , 1 , 1 ));

        var personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        var firstNames = Person.getFirstNames(personList);

        assertEquals("1. Emma, 2. Ben, 3. Paul", firstNames);
    }

    @Test
    public void GetFirstNames_WithNull()
    {
        var firstNames = Person.getFirstNames(null);

        assertEquals("", firstNames);
    }

    @Test
    public void GetFirstNamesOrdered()
    {
        var person1 = new Person();
        person1.setFirstName("Emma");
        person1.setLastName("Müller");
        person1.setBirthday(LocalDate.of( 2001 , 1 , 1 ));

        var person2 = new Person();
        person2.setFirstName("Ben");
        person2.setLastName("Schäfer");
        person2.setBirthday(LocalDate.of( 1999 , 1 , 1 ));

        var person3 = new Person();
        person3.setFirstName("Paul");
        person3.setLastName("Fischer");
        person3.setBirthday(LocalDate.of( 1998 , 1 , 1 ));

        var personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        var orderedFirstNames = Person.getFirstNamesOrdered(personList);

        assertEquals("1. Ben, 2. Emma, 3. Paul", orderedFirstNames);
    }
}
