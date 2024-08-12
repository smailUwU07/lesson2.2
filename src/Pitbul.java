public final class Pitbul extends  Dog{
    private boolean isAggressive;

    private Color color;


    public boolean isAggressive() {
        return isAggressive;
    }

    public Pitbul(String name, int age, String breed, String size, boolean isAggressive, Color color) {
        super(name, age, breed, size);
        this.isAggressive = isAggressive;
        this.color = color;

    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("питбуль лает");
    }

}
