import com.sarath.Employee;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello");
        Employee e1 = new Employee();
        e1.setEmp_id(1);
        e1.setEmp_name("Sarath");

        System.out.println(e1.hashcode());
    }
}
