public class EmployeeApp {
    private final static int OLDER_THEN = 40;
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Sergey Sorokin",
                "backend developer",
                "kikimarik@inbox.ru",
                "+79216479264",
                "100000 rubles",
                25
        );
        //employee.preview();
        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = new Employee(
                "Wayne Rooney",
                "footballer",
                "wayne.rooney@man-utd.com",
                "+447911999999",
                "xxxxxx pounds",
                35
        );
        employees[2] = new Employee(
                "Keira Knightley",
                "actress",
                "kira.knightley@hollywood.com",
                "+1-541-754-3011",
                "xxxxxx american dollars",
                35
        );
        employees[3] = new Employee(
                "Donald Trump",
                "U.S. President",
                "make.america.great.again@realdonaldtrump.com",
                "+1-541-754-3010",
                "xxxxxx gold bars",
                74
        );
        employees[4] = new Employee(
                "Michael Gerard Tyson",
                "professional boxer IRON MIKE",
                "iron.mike@gmail.com",
                "+1-541-754-3012",
                "The championship belt and ladies",
                54
        );

        for (Employee employeeObj : employees) {
            if (employeeObj.isOlder(EmployeeApp.OLDER_THEN)) {
                employeeObj.preview();
            }
        }
    }
}
