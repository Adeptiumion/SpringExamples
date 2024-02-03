package Tests;

import Entity.Employee;
import com.mysql.cj.util.SaslPrep;
import com.sun.jdi.IntegerType;
import com.sun.jdi.LongType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.logging.Logger;

public class Test24 {

    private static final Logger test24Logger = Logger.getLogger(Test24.class.getName());

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration()
                        .configure("Resources/hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employeeList = session
                    .createNativeQuery("select * from employees", Employee.class)
                    .list();

            employeeList.forEach(System.out::println);

            session.getTransaction().commit();
        } finally {
            factory.close();
            test24Logger.info("Session is closed!");
        }

    }
}
