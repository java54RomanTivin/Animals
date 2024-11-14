
public class Main {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Roman", 47, 533500614);

        Animals dog1 = new Dog("Richi", "Cavalier King", 4, Gender.male, owner1);
        System.out.println(dog1.display()+ " "+ dog1.owner);
        Owner owner2 = new Owner("Daniel", 19, 533500654);

        DangerDog dog2 = new DangerDog("Salma", "Shepherd dog", 8, Gender.female, owner2);
        System.out.println(dog2.display()+ " "+ dog2.owner);


        Hospital hospital1 = new Hospital("Дружок");

        hospital1.addRecord(new Hospital.Record(dog1));
        hospital1.addRecord(new Hospital.Record(dog2));
        System.out.println(hospital1);
        dog2.notice();


    }
}