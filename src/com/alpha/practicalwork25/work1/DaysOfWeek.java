package com.alpha.practicalwork25.work1;

public enum DaysOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public DaysOfWeek nextDay() {
        return this.equals(SATURDAY) ? SUNDAY : DaysOfWeek.values()[this.ordinal() + 1];
    }
}
