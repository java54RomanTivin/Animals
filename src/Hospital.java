import java.util.ArrayList;
import java.util.Objects;

public class Hospital {

    private final String name;
    private final ArrayList<Record> list = new ArrayList<Record>();


    private Hospital(Builder builder) {
        this.name = builder.name;

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
        result.append("Hospital name: " + name + "\n");
        for (int i = 0; i < this.list.size(); i++) {
            result.append(i + 1).append(". ").append(list.get(i).animal.display()).append("\n");
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

public static class Builder {

    String name;

    public Builder(String name) {
        this.name = name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Hospital build() {
        return new Hospital(this);
    }

}
}

