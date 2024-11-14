import java.util.Scanner;

public class DangerDog extends Dog implements DangerAnimal {
    String description;

    public DangerDog(String name, String breed, int age, Gender gender, Owner owner) {
        super(name, breed, age, gender, owner);
        this.description = description();
    }

    @Override
    public String display() {
        return this.name + " " + this.age + "лет " + " это собака." + description + "\n";

    }

    @Override
    public String description() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите описание: ");
        return scanner.nextLine();
    }
}
