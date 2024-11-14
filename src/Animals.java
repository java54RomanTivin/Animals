public abstract class Animals {
    protected String name;
    protected String breed;
    protected int age;
    protected Gender gender;
    protected Owner owner;

    public String getBreed() {
        return breed;
    }

    public Animals(String name, String breed, int age, Gender gender, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract String display();
    public void notice() {
        if (this instanceof DangerAnimal) System.out.println("Опасное животное");
        else System.out.println("Доброе животное");
    }



}


