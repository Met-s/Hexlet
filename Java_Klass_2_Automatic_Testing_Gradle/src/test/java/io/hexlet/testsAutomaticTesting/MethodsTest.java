package io.hexlet.testsAutomaticTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;

import static io.hexlet.testsAutomaticTesting.Methods.findByName;
import io.hexlet.testsAutomaticTesting.User;

// BEGIN (write your solution here)
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
// END

class MethodsTest {

    private static List<User> users = new ArrayList<>();

    // BEGIN (write your solution here)
    @BeforeAll
    public static void beforeAll() throws Exception {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();

        int i = 0;
        while (i < 15) {
            users.add(new User(firstName, lastName, email));
            i++;
        }
    }


    // END

    @Test
    public void testCommonCase1() {
        var name = users.getFirst().getFirstName();
        var expected = users.stream().filter(u -> u.getFirstName().equals(name)).toList();
        var actual = findByName(users, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testCommonCase2() {
        var name = users.getLast().getFirstName();
        var expected = users.stream().filter(u -> u.getFirstName().equals(name)).toList();
        var actual = findByName(users, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyList() {
        var expected = List.<User>of();
        var actual = findByName(List.<User>of(), "John");
        assertEquals(expected, actual);
    }
}

