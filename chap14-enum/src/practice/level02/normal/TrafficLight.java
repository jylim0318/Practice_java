package practice.level02.normal;

public enum TrafficLight {

    RED(1,"정지하세요") ,
    YELLOW(2,"감속하세요") ,
    GREEN(3,"통과하세요");

    private final int index;
    private final String message;

    TrafficLight(int index, String message) {

        this.index = index;
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public String getMessage() {
        return message;
    }
}
