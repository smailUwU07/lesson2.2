public class Square extends Figure implements  Drawable {

    private  int side;
    public Square(String name) {
        super(name);
    }


    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDFE5 ");
    }
}
