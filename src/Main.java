public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Denys", "Kostenko", 19);
        Employee employee = new Employee("Illia", "Tkachuk", 18);

        System.out.println(student.getInfo());

        System.out.println(employee.getInfo());

    }
}