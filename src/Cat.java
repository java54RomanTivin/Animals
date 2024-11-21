public class Cat extends Animals {

    public Cat(String name, String breed, int age, Gender gender, Owner owner) {
        super(name, breed, age, gender, owner);

    }

    @Override
    public String display() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append(" ").append(this.age).append(" это кот").append(". Хозяин: ").append(this.owner.name).append("\n");
        return result.toString();
    }

}
