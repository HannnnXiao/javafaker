package com.testCases;

import com.github.javafaker.Faker;
import org.junit.Test;

import java.util.Locale;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class TestBugs {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String rst = faker.expression("Internet.userAgent");
        System.out.println(rst);

        new Faker().expression("Internet.userAgent");

    }

    @Test
    public void testHungarianZipCodeByState() {
        Faker faker;
        for (int i = 0; i < 10; i++) {
            faker = new Faker(new Locale("hu"));

            assertThat(faker.address().zipCodeByState(faker.address().stateAbbr()), matchesRegularExpression("[0-9]{4}"));
        }
    }
}
