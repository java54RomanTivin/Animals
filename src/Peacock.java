public class Peacock extends Animals {
    protected AnimalGroup animalGroup;

    public Peacock(String name, String breed, int age, Gender gender, Owner owner, AnimalGroup animalGroup) {
        super(name, breed, age, gender, owner);
        this.animalGroup = AnimalGroup.Birds;
    }

    @Override
    public String display() {
        return this.name + " " + this.age + "лет " + " это павлин" + "\n";
    }
}
