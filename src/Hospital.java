import java.util.ArrayList;
import java.util.Objects;

public class Hospital {

    String name;
    private final ArrayList<Hospital.Record> list = new ArrayList<Record>();


    public Hospital(String name) {
        this.name = name;

    }

    public void addRecord(Record record) {
        this.list.add(record);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.list.size(); i++) {
            result.append(i + 1).append(". ").append(this.list.get(i).animal.name).append(" ").append(this.list.get(i).animal.age).append(". Хозяин: ").append(this.list.get(i).animal.owner.name).append("\n");
        }
        return result.toString();
    }


    void search(Animals animals) {
        for (int i = 0; i < this.list.size(); i++) {
            if (Objects.equals(this.list.get(i).animal.name, animals.name)) {
                System.out.println("Запись № " + i);
                animals.notice();

            }
        }
    }



    public static class Record {
        protected Animals animal;

        public Record(Animals animal) {
            this.animal = animal;
        }

        @Override
        public String toString() {
            return this.animal.getName() + "\n";
        }
    }
}
