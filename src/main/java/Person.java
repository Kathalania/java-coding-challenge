
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Person {

    public String firstName;
    public String lastName;
    public LocalDate birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Object person1) {
        if (this == person1) {
            return true;
        }
        if (person1 == null) {
            return false;
        }

        Person person2 = (Person) person1;
        return Objects.equals(firstName, person2.firstName) &&
               Objects.equals(lastName, person2.lastName) &&
               Objects.equals(birthday, person2.birthday);
    }



    /// <summary>
    /// Gets the first names of the given person enumerable unordered in this format: 1. Alpha, 2. Beta,...
    /// </summary>
    /// <param name="persons">The persons enumerable</param>
    /// <returns>The first names of the given persons enumerable</returns>
    public static String getFirstNames(ArrayList<Person> persons) {
        if (persons == null || persons.isEmpty() || persons.size() == 0){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < persons.size(); i++){
            Person person = persons.get(i);
            if (person.firstName != null){
                stringBuilder.append((i+1) + ". " + person.getFirstName());
            }
            if (i < persons.size() -1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    /// <summary>
    /// Gets the first names of the given persons enumerable ordered in this format: 1. Alpha, 2. Beta,...
    /// </summary>
    /// <param name="persons">The persons enumerable</param>
    /// <returns>The first names of the given persons enumerable</returns>
    public static String getFirstNamesOrdered(ArrayList<Person> persons) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
