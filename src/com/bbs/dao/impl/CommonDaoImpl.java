package com.bbs.dao.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bbs.dao.inter.ICommonDao;
import com.bbs.utils.GenericClass;
import com.bbs.utils.Global;

/**
 * 通用方法的实现类
 * @author wjh
 *
 */
@SuppressWarnings("unchecked")
public  class CommonDaoImpl<T> implements ICommonDao<T> {

	@Autowired
	SessionFactory sessionFactory;
	/**获取父类的泛型类型***/
	@SuppressWarnings("rawtypes")
	private Class entityClass=GenericClass.getGenericClass(this.getClass());
	
	@Override
	public void save(T entity) {
		this.sessionFactory.getCurrentSession().save(entity);
		this.sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void update(T entity) {
		
		this.sessionFactory.getCurrentSession().update(entity);
		this.sessionFactory.getCurrentSession().flush();
	}
	//通过id查询
	@Override
	public T findObjectById(Serializable id) {
		if(id==null){
			throw new RuntimeException("您要查找的["+id+"]不能为空");
		}
		return (T)this.sessionFactory.getCurrentSession().get(entityClass, id);
	}
	//批量删除，通过多个id批量删除多条记录
	@Override
	public void deleteObjectByIds(Serializable ... ids) {
		for(Serializable id :ids){
			Object obj = this.sessionFactory.getCurrentSession().get(entityClass, id);
			if(obj==null){
				throw new RuntimeException("您要删除的["+id+"]不能为空");
			}
			this.sessionFactory.getCurrentSession().delete(obj);
		}
	}

	//批量删除
	@Override
	public void deleteObjectByCollection(Collection<T> entities) {
		for (T t : entities) {
			this.sessionFactory.getCurrentSession().delete(t);
		}
		
	}

	/**
	 * 设置hql语句需要的参数
	 * @param query
	 * @param params
	 */
	public void setParams(Query query, Object[] params) {
		if(params!=null&&params.length>0){
			for(int i=0;i<params.length;i++){
				query.setParameter(i, params[i]);
			}
		}
	}
	
	
	/*
	 *  组织排序条件
	 *  orderby.put("o.id", "asc");
		orderby.put("o.name", "desc");
	 */
	public String buildOrderBy(LinkedHashMap<String, String> orderby) {
		StringBuffer buf=new StringBuffer("");
		if(orderby!=null&&!orderby.isEmpty()){
			buf.append("  order by ");
			for(Map.Entry<String, String> em:orderby.entrySet()){
				buf.append(em.getKey()+"  "+em.getValue()+",");
			}
			//去掉最后一个","
			buf.deleteCharAt(buf.length()-1);
		}
		return buf.toString();
	}
	
	//查询
	public  List<T> findObjectsByConditionWithNoPage(String whereHql, final Object[] params, 
			   LinkedHashMap<String, String> orderby) {
		
		//产生select语句 SELECT * FROM SysUserGroup o WHERE 
		String hql="from "+entityClass.getSimpleName() +"  o  where 1=1  ";
		//System.out.println("hql  "+hql);
		
		//在select语句的后面这查询条件
		if(StringUtils.isNotBlank(whereHql)){
			hql=hql+whereHql;
		}
		//处理排序
		String orderbystr=buildOrderBy(orderby);
		//System.out.println("orderbystr  "+orderbystr);
		hql=hql+orderbystr;
		//System.out.println("hql  "+hql);
		
		final String fhql=hql;
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(fhql);
		//设置参数 
		setParams(query,params);
		
		List<T>  list= query.list();
		return list;
	}

	//方法重载
	@Override
	public List<T> findObjectsByConditionWithNoPage(String whereHql,
			Object[] params) {
		return this.findObjectsByConditionWithNoPage(whereHql, params,null);
	}

	
	@Override
	public List<T> findObjectsByConditionWithNoPage(
			LinkedHashMap<String, String> orderby) {
		return this.findObjectsByConditionWithNoPage(null, null, orderby);
	}

	@Override
	public List<T> findObjectsByConditionWithNoPage() {
		return this.findObjectsByConditionWithNoPage(null, null, null);
	}

	
	//带分页的查询
	@Override
	public List<T> findObjectsByConditionWithPage(Integer currentPage,
			String whereHql, Object[] params,
			LinkedHashMap<String, String> orderby) {
		//产生select语句 SELECT * FROM SysUserGroup o WHERE 
		String hql="from "+entityClass.getSimpleName() +"  o  where 1=1  ";
		//System.out.println("hql  "+hql);
		
		//在select语句的后面这查询条件
		if(StringUtils.isNotBlank(whereHql)){
			hql=hql+whereHql;
		}
		//处理排序
		String orderbystr=buildOrderBy(orderby);
		//System.out.println("orderbystr  "+orderbystr);
		hql=hql+orderbystr;
		//System.out.println("hql  "+hql);
		
		final String fhql=hql;
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(fhql);
		//设置参数 
		setParams(query,params);
		
		//设置分页显示
		query.setFirstResult((currentPage-1)*Global.H_SHOW_NUM);
		query.setMaxResults(Global.H_SHOW_NUM);
		List<T>  list= query.list();
		return list;
	}

	@Override
	public List<T> findObjectsByConditionWithPage(Integer currentPage,
			String whereHql, Object[] params) {
		return this.findObjectsByConditionWithPage(currentPage,whereHql,params,null);
	}

	@Override
	public List<T> findObjectsByConditionWithPage(
			Integer currentPage,LinkedHashMap<String, String> orderby) {
		return this.findObjectsByConditionWithPage(currentPage,null,null,orderby);
	}

	@Override
	public List<T> findObjectsByConditionWithPage(Integer currentPage) {
		return this.findObjectsByConditionWithPage(currentPage,null,null,null);
	}

	/**
	 * 可以设置返回的条数
	 */
	@Override
	public List<T> findObjectsByConditionWithNum(Integer num) {
		return this.findObjectsByConditionWithNum(null,null,null,num);
	}

	@Override
	public List<T> findObjectsByConditionWithNum(String whereHql,
			Object[] params, LinkedHashMap<String, String> orderby, Integer num) {
		//产生select语句 SELECT * FROM SysUserGroup o WHERE 
		String hql="from "+entityClass.getSimpleName() +"  o  where 1=1  ";
		//System.out.println("hql  "+hql);
		
		//在select语句的后面这查询条件
		if(StringUtils.isNotBlank(whereHql)){
			hql=hql+whereHql;
		}
		//处理排序
		String orderbystr=buildOrderBy(orderby);
		//System.out.println("orderbystr  "+orderbystr);
		hql=hql+orderbystr;
		//System.out.println("hql  "+hql);
		
		final String fhql=hql;
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(fhql);
		//设置参数 
		setParams(query,params);
		//设置分页显示
		query.setMaxResults(num);
		List<T>  list= query.list();
		return list;
	}

	@Override
	public List<T> findObjectsByConditionWithNum(String whereHql,
			Object[] params, Integer num) {
		return this.findObjectsByConditionWithNum(whereHql,params,null,num);
	}

	@Override
	public List<T> findObjectsByConditionWithNum(
			LinkedHashMap<String, String> orderby, Integer num) {
		return this.findObjectsByConditionWithNum(null,null,orderby,num);
	}

	//无条件的返回数目
	@Override
	public int findObjectsCount() {
		return this.findObjectsCount(null, null, null);
	}

	//带有条件查询的
	@Override
	public int findObjectsCount(String whereHql, Object[] params,
			LinkedHashMap<String, String> orderby) {
		//产生select语句 SELECT * FROM SysUserGroup o WHERE 
		String hql="select count(*) from "+entityClass.getSimpleName() +"  o  where 1=1  ";
		//System.out.println("hql  "+hql);
		
		//在select语句的后面这查询条件
		if(StringUtils.isNotBlank(whereHql)){
			hql=hql+whereHql;
		}
		//处理排序
		String orderbystr=buildOrderBy(orderby);
		//System.out.println("orderbystr  "+orderbystr);
		hql=hql+orderbystr;
		//System.out.println("hql  "+hql);
		
		final String fhql=hql;
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(fhql);
		//设置参数 
		setParams(query,params);
		//返回条数
		int count = ((Long) query.iterate().next()).intValue();
		int pagenum = 0;
		if(count%Global.H_SHOW_NUM == 0){
			pagenum = count/Global.H_SHOW_NUM;
		}else {
			pagenum = count/Global.H_SHOW_NUM + 1;
		}
		System.out.println(pagenum);
		return pagenum;
	}

	@Override
	public int findObjectsCount(String whereHql, Object[] params) {
		return this.findObjectsCount(whereHql, params, null);
	}

	@Override
	public int findObjectsCount(LinkedHashMap<String, String> orderby) {
		return this.findObjectsCount(null, null, orderby);
	}

	/**
	 * 根据条件更新
	 */
	@Override
	public void updatebyCondition(String whereHql, Object[] params) {
		String hql="update "+entityClass.getSimpleName() +"  o set ";
		//System.out.println("hql  "+hql);
		
		//在select语句的后面这查询条件
		if(StringUtils.isNotBlank(whereHql)){
			hql=hql+whereHql;
		}
		
		final String fhql=hql;
		
		Query query=this.sessionFactory.getCurrentSession().createQuery(fhql);
		//设置参数 
		setParams(query,params);
		//设置分页显示
		query.executeUpdate();
	}
}
