package test;

public class Apple {
    String title;

    public Apple(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "title='" + title + '\'' +
                '}';
    }
}
