public class Cat extends Animals {

    public Cat(String name, String breed, int age, Gender gender, Owner owner) {
        super(name, breed, age, gender, owner);

    }

    @Override
    public String display() {
        return this.name + " " + this.age + "лет " + " это кот" + "\n";
    }

}
