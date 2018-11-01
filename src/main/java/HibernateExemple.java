import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HibernateExemple {

    SessionFactory sessionFactoryBean;

    public HibernateExemple(SessionFactory sessionFactoryBean) {
        this.sessionFactoryBean = sessionFactoryBean;
    }

    void sessionFactoryDemo() {
        String sql = "SELECT COUNT(*) FROM user";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println(((org.hibernate.query.Query) query).uniqueResult());
    }
}