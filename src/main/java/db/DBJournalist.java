package db;

import models.Article;
import models.Category;
import models.Journalist;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBJournalist {

    private static Session session;
    private static Transaction transaction;

    //Database returns existing articles by given Journalist
    public static List<Article> getArticlesByJournalist(Journalist journalist){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Article> journalistArticles = null;
        try{
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Article.class);
            cr.add(Restrictions.eq("journalist", journalist));
            journalistArticles = cr.list();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        } return journalistArticles;
    }
}
