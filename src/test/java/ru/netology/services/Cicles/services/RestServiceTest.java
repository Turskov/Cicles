package ru.netology.services.Cicles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    public void should(int income, int expences, int threshold, long expected) {
        RestService service = new RestService();

        long actual = service.calculateRestMonths(income, expences, threshold);
        Assertions.assertEquals(expected, actual);

    }

}