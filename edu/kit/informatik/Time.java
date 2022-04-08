package edu.kit.informatik;

/**
 * This class describes the time in hours and minutes. And as a weekday always
 * has the same departure time, its better to include it in this class instead
 * of in the class TrainJourney.
 *
 * @author uogok
 *
 * @version 1.0
 */
public class Time {

    private int hours;
    private int minutes;

    private enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
