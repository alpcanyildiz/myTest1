package com.emusicstore.dao.impl;

import com.emusicstore.dao.BenimDao;
import com.emusicstore.model.Kullanici;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import java.util.List;


@Repository
@Transactional
public class BenimDaoImpl implements BenimDao {


    @Autowired
    SessionFactory sessionFactory;

    public List getAllKullanici() {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("from Kullanici");
        List<Kullanici> kullanici=query.list();


        return kullanici;

    }

    @Override
    public void silById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Kullanici kullanici = (Kullanici) session.get(Kullanici.class,id);
        session.delete(kullanici);

    }
}
