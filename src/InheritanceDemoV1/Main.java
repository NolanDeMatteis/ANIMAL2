package InheritanceDemoV1;
//
public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();


        // getters and setters can "protect" variables, and avoid null objects/variables
        cat.setDiet("Omnivore");

        // If diet is null getter give's a warning
        System.out.print(cat.getDiet());

        cat.getDiet();
    }
}
