package Enums;

public enum EDays {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    EDays(int dayNumber){
        this.dayNumber = dayNumber;
    }

    int getDayNumber(){
        return this.dayNumber;
    }

}
