public class Dog extends Animal {

    private String breed;
    private String size;

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public Dog(String name, int age, String breed, String size) {
        super(name, age);
        this.breed = breed;
        this.size = size;
    }

    public void bark() {
        System.out.println("The gog is barking ");
    }

    public void bark(String sound) {
        System.out.println("The gog is barking " + sound);
    }

    public final void bark(int volume) {
        System.out.println("The gog is barking at volume " + volume);
    }

}
