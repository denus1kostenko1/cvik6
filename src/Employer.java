class Employee implements Person {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Name: " + name + ", Surname " + surname + ", Years to retire: " + (62 - age);
    }

}