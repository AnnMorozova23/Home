package morozova.oop.lesson9;

public class MayArraySizeException extends RuntimeException {
    int j;

    public MayArraySizeException(String s, int j) {
        super(s);
        this.j = j;
    }

    public int getI() {
        return j;
    }

}
