package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_Faker {

    @Test
    public void fakerUsage () {

        Faker faker = new Faker();

        String isim = faker.name().nameWithMiddle();

        String city = faker.address().city();

        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println("isim = " + isim);
        System.out.println("city = " + city);
        System.out.println("phoneNumber = " + phoneNumber);
    }

}
