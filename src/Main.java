public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client_1 = new Client("Коля", 22, "aviasales");
        client_1.season();
        client_1.print();

        Employee employee_1 = new Employee("Ваня",24,"инженер");
        employee_1.season();
        employee_1.print();
    }
}
