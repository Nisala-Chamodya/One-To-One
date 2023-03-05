package lk.onetoone.util;


import lk.onetoone.entity.Laptop;
import lk.onetoone.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguaration {
        private static  FactoryConfiguaration factoryConfiguaration;
        private final SessionFactory sessionFactory;
        private FactoryConfiguaration(){
                Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                        .addAnnotatedClass(Laptop.class);//xml file eka loard karagannawa
                sessionFactory= configuration.buildSessionFactory();
        }

        public static FactoryConfiguaration getInstance(){
                return (factoryConfiguaration==null) ? factoryConfiguaration=new FactoryConfiguaration()
                        :  factoryConfiguaration;
        }
  public Session getSession() {
                return sessionFactory.openSession();
  }






}
