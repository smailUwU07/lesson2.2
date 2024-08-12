public  class Circle extends Figure implements Drawable {


    private  int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (Math.PI * radius * 2);
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDD34");
    }
}
