package lesson7;

public class videoWork {

    public class Employee {

        private String name;
        private String empId;
        private int pay;

        public Employee() {
            name = null;
            empId = null;
            pay = 0;

        }

        public Employee(String nm, String id, int py) {
            name = nm;
            empId = id;
            pay = py;

        }

        Employee person1 = new Employee("Simon", "7628", 60000);

        Employee person2 = new Employee();

    }

}
