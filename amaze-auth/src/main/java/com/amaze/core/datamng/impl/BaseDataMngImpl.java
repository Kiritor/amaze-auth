package com.amaze.core.datamng.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amaze.core.datamng.BaseDataMng;
import com.amaze.core.po.Root;
import com.amaze.core.utils.TemplateFactory;

@Repository("baseDataMng")
@Transactional
public class BaseDataMngImpl implements BaseDataMng {

	public BaseDataMngImpl() {

	}

	protected HibernateTemplate getHibernateTemplate() {
		return TemplateFactory.getHibernateTemplateById("hibernateTemplate");
	}

	protected Session getSession() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}

	@Override
	public String saveObj(Root root) throws Exception {
		return (String) getHibernateTemplate().save(root);
	}

	@Override
	public void saveOrUpdate(Root root) throws Exception {
        getHibernateTemplate().saveOrUpdate(root);
	}

	@Override
	public void updateObj(Root root) throws Exception {
        getHibernateTemplate().update(root);
	}

	@Override
	public Root getObj(String className, String id) {
		return (Root) getHibernateTemplate().get(className, id);
	}
    @Override
	public Root getObj(Class<?> className, String id) {
		return (Root)getHibernateTemplate().get(className, id);
	}

	@Override
	public void deleteObj(String className, String id) throws Exception {
		Root root = getObj(className, id);
	    getHibernateTemplate().delete(root);
	}

	@Override
	public void deleteObj(Class<?> className, String id) throws Exception {
		Root root = getObj(className, id);
		getHibernateTemplate().delete(root);
	}

	@Override
	public Root getObjByCondition(String className, String condition) {
        List<Root> list = getObjListByCondition(className, condition);
        return  (list!=null&&list.size()>0?list.get(0):null);
	}

	@Override
	public Root getObjByCondition(Class<?> className, String condition) {
		return getObjByCondition(className.getSimpleName(), condition);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Root> getObjListByCondition(String className, String condition) {
		String queryString = "";
		if(condition!=null&&!condition.trim().isEmpty()){
			queryString = (new StringBuffer(" from ")).append(className)
					.append(" as obj where 1=1 and ( ").append(condition)
					.append(" )").toString();
		}
		Query query = getSession().createQuery(queryString);
		return query.list();
	}

	@Override
	public List<Root> getObjListByCondition(Class<?> className, String condition) {
		return getObjListByCondition(className.getSimpleName(),condition);
	}

	@Override
	public List<?> getPagedObjListWithCondition(String className,
			String condition, int firstRow, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getPagedObjListWithCondition(Class<?> className,
			String condition, int firstRow, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}


}
