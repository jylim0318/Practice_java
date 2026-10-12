package practice.level01.basic;

public enum DayEnum {

    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private final int index;

    DayEnum(int index) {

        this.index = index;

    }

    public int getIndex() {
        return index;
    }


}
