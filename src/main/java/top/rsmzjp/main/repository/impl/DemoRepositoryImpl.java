package top.rsmzjp.main.repository.impl;

import top.rsmzjp.main.repository.custom.DemoRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DemoRepositoryImpl implements DemoRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    public int updateStatusById(String id) {
        String update = "UPDATE DemoEntity d " +
                "SET d.status = 2 " +
                "WHERE d.status = 1 " +
                "AND d.id = :id";
        return em.createQuery(update).setParameter("id", id).executeUpdate();
    }
}
