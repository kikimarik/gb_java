public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;

    public Employee(
            String name,
            String position,
            String email,
            String phone,
            String salary,
            int age
    ) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void preview() {
        String id = this.toString();
        String[] fields = {
                this.name,
                this.position,
                this.email,
                this.phone,
                this.salary,
                String.valueOf(this.age)
        };
        System.out.println("START OBJECT " + id + " OUTPUT");
        for (String field : fields) {
            System.out.println(field);
        }
        System.out.println("END OBJECT " + id + " OUTPUT");
    }

    public boolean isOlder(int age) {
        return this.age > age;
    }
}
