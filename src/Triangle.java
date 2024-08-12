public class Triangle extends  Figure implements Drawable {

    private int sideA, sideB, sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public int calculatePerimeter() {
        return sideA + sideB +sideC;
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDD3A");
    }
}
