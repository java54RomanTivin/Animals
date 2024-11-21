
public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Roman", 47, 533500614);
        Animals dog1 = new Dog("Richi", "Cavalier King", 4, Gender.male, owner1);
        Owner owner2 = new Owner("Daniel", 19, 533500654);
        DangerDog dog2 = new DangerDog("Salma", "Shepherd dog", 8, Gender.female, owner2);

        Owner owner3 = new Owner("Fedor", 27, 53650062);
        Animals cat1 = new Cat("Petya", "Siberian", 10, Gender.female, owner3);
        Owner owner4 = new Owner("Igor", 37, 53350664);
        DangerCat cat2 = new DangerCat("Sharik", "No breed", 5, Gender.male, owner4);


        Hospital hospital1 = new Hospital.Builder("Дружок")
                .build();

        hospital1.addRecord(new Hospital.Record(dog1));
        hospital1.addRecord(new Hospital.Record(dog2));
        hospital1.addRecord(new Hospital.Record(cat1));
        hospital1.addRecord(new Hospital.Record(cat2));
        System.out.println(hospital1);
        dog2.notice();


    }
}