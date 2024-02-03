package Tests;

import Entity.Employee;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.logging.Logger;

public class Test25 {
    private static final Logger test25Logger = Logger.getLogger(Test25.class.getName());

    // Изменение одного Entity
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, 7);
            employee.setSalary(1500);
            employee.setName("Andrej ");
            employee.setDepartment("Senior Developer");
            employee.setSurname("Weis");

            transaction.commit();
        }
    }
}
