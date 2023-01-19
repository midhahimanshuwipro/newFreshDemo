package Utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class RandomData {

    Faker faker = new Faker();


    public String getFirstName()
    {
        String firstName = faker.name().firstName();
        return firstName;
    }


    public String getLastname()
    {
        String latName = faker.name().lastName();
        return latName;
    }

    public String getEmailID()
    {
        String emailAddress = faker.internet().emailAddress();
        return emailAddress;
    }



    public int generateRandomNumber()
    {
        Random rm = new Random();
        int number = rm.nextInt();
        return number;
    }




}
