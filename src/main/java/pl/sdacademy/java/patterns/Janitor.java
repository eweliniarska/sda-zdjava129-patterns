package pl.sdacademy.java.patterns;

class Janitor implements HasPerson {
    private String shiftType;
    private int numberOfKeys;
    private Person person;


    public Janitor(String shiftType, int numberOfKeys, Person person) {
        this.shiftType = shiftType;
        this.numberOfKeys = numberOfKeys;
        this.person = person;
    }

    @Override
    public Person getPerson() {
        return person;
    }

    public String getShiftType() {
        return shiftType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }


}
