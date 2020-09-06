package Part1JavaSyntax.visibilityOfVariables;


public class Cat {

    private String name = " ";
    private static int age = 0;
    public static int count = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Cat.age = age;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Kitty");
        cat1.setAge(3);
        Cat.count ++;
        System.out.println(cat1.name + " " + cat1.age);
        System.out.println("We have " + Cat.count + " cats!");

        Cat cat2 = new Cat();
        cat2.setName("Blue");
        cat2.setAge(1);
        Cat.count ++;
        System.out.println(cat2.name + " " + cat2.age);
        System.out.println("We have " + Cat.count + " cats!");
    }
}
