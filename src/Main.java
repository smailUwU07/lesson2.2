//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle( "круг", 23);
        Triangle triangle = new Triangle("Треуголльник", 24, 5, 6 );
        Square square = new Square("Квадрат", 42);
        Rectangle rectangle = new Rectangle("Прямоугльник", 42, 56);

        Bus bus = new Bus( "Китайский автобус");
        Car car = new Car("Мерседес");


        Drawable [] drawables = {circle, triangle, square, rectangle, bus, car};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof  Figure) {
                System.out.println( ((Figure) drawables[i]).getName() + "Периметр ->" +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof  Transport){
                System.out.println(((Transport) drawables[i]).getName());
            }
            drawables[i].drow();

        }

       Dog dog = new Dog("шарик", 3, "замир", "маленькая" );
        Pitbul pitbul = new Pitbul("белка", 5, "Pitbul", "Большая", true, Color.RED  );
        Pitbul pitbul2 = new Pitbul("белка", 5, "Pitbul", "Большая", true, Color.BLACK  );
        System.out.println(dog.getName());
        dog.bark(56);
        pitbul2.bark();
        pitbul.bark("gav gav");

    }
}