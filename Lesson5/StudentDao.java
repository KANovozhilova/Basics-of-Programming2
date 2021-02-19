package javaRepeat.Lesson5;

// DAO-класс к базе данных Student с полями id, name, mark (из основного задания), позволяющий выполнить CRUD-операции

public class StudentDao {
    SessionFactory sessionFactory;

    public StudentDao() {
        sessionFactory = sessionFactoryGetter.getSessionFactory();
    }

    public Student save (Student student) {
        Session session = sessionFactory.openSession();
        int id = (int) session.save(student);
        session.close();
        return new Student(id, Student.getName(), student.getMark());
    }

    public void update (Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        Transaction.begin();
        session.update(student);
        transaction.commit();
        session.close();
    }

    public void remove (Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        Transaction.begin();
        session.remove(student);
        transaction.commit();
        session.close();
    }

    public Optional<Student> findById (int id) {
        Session session = sessionFactory.openSession();
        Student student = session.find(Student.class, id);
        session.close();
        return Optional.ofNullable(student);
    }

    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        List<Student> students = (List<Student>) session.createQuery("from class Student").list();
        session.close();
        return students;
    }
}
