package morozova.oop.lesson9;

public class MyArrayDataException extends NumberFormatException {
    int x;

    public MyArrayDataException(String s, int x) {
        super(s);
        this.x = x;
    }
}
