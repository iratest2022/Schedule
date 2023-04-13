package ru.netology.services.schedule.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class scheduleServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/schedule.csv")
    public void testCoachSchedule(int expected, int income, int expenses, int threshold) {
        scheduleService service = new scheduleService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
