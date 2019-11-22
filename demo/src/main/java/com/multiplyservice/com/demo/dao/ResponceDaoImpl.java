package com.multiplyservice.com.demo.dao;

import com.multiplyservice.com.demo.model.Responce;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ResponceDaoImpl implements ResponceDao {
    private static final Logger logger = LoggerFactory.getLogger(ResponceDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addResponce(Responce responce) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(responce);
        logger.info("responce save"+responce);
    }

    @Override
    public void updateResponce(Responce responce) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(responce);
    logger.info("responce uodate"+ responce);
    }

    @Override
    public void removeResponce(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Responce responce = (Responce) session.load(Responce.class, new Integer(id));
    if (responce!=null){
        session.delete(responce);

    }
    logger.info("responce removed"+responce);
    }

    @Override
    public Responce getResponceById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Responce responce = (Responce) session.load(Responce.class, new Integer(id));
        logger.info("Responce is load"+responce);
        return responce;
    }

    @Override
    public List<Responce> listResponce() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Responce> responceList = session.createQuery("from  Responce").list();
        for (Responce responce: responceList){
            logger.info("Responce list:"+responce);
        }
        return responceList;
    }
}
