import lk.onetoone.entity.Laptop;
import lk.onetoone.entity.Student;
import lk.onetoone.util.FactoryConfiguaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {


        Student student = new Student("s001","Nisala");

        Laptop laptop = new Laptop("l001","Asus",student);


        Student student2 = new Student("s002","Chamodya");

        Laptop laptop2 = new Laptop("l002","Mac Book",student2);

        Session session = FactoryConfiguaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student2);
        session.save(laptop2);

        transaction.commit();
        session.close();

    }
}
