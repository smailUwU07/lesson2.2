public class Rectangle extends  Figure implements Drawable {

    private int sideA, sideC;

    public Rectangle(String name, int sideA, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideC = sideC;
    }

    public Rectangle(String name) {
     super(name);

 }

    @Override
    public int calculatePerimeter() {
        return (sideA + sideC) * 2;
    }

    @Override
    public void drow() {
        System.out.println("▇");
    }
}
