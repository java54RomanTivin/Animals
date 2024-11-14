public class Owner {
    protected String name;
    protected int age;
    protected long telephone;

    public Owner(String name, int age, long telephone) {

        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }
    @Override
    public String toString() {
        return   this.name + " " + this.age + " " + this.telephone;
    }
}

