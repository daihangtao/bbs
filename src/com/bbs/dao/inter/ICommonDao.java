package com.bbs.dao.inter;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;




/*
 * 通用方法声明接口
 */
public interface ICommonDao<T> {
	  void save(T entity);	
	  void update(T entity);
	  //根据条件更新
	  void updatebyCondition(String  whereHql,Object[] params);
	  T findObjectById(Serializable id);
	  //通过id数组来删除数组中的所有id
	  void deleteObjectByIds(Serializable ... ids);
	  //通过集合批量删除对象
	  void deleteObjectByCollection(Collection<T> entities);
	  
	  //查询条件
	  List<T> findObjectsByConditionWithNoPage(String whereHql,Object[] params, LinkedHashMap<String, String> orderby);
	  //没有排序的查询条件
	  List<T> findObjectsByConditionWithNoPage(String whereHql,Object[] params);
	  //只有排序，查出所有然后排序
	  List<T> findObjectsByConditionWithNoPage(LinkedHashMap<String, String> orderby);
	 //没有查询条件的查询，查询所有
	  List<T> findObjectsByConditionWithNoPage();
	  
	  //带分页的查询
	  List<T> findObjectsByConditionWithPage(Integer currentPage,String whereHql,Object[] params, LinkedHashMap<String, String> orderby);
	//带分页的查询
	  List<T> findObjectsByConditionWithPage(Integer currentPage,String whereHql,Object[] params);
	//带分页的查询
	  List<T> findObjectsByConditionWithPage(Integer currentPage,LinkedHashMap<String, String> orderby);
	//带分页的查询
	  List<T> findObjectsByConditionWithPage(Integer currentPage);
	  
	  
	  //查询条件
	  List<T> findObjectsByConditionWithNum(String whereHql,Object[] params, LinkedHashMap<String, String> orderby,Integer num);
	  //没有排序的查询条件
	  List<T> findObjectsByConditionWithNum(String whereHql,Object[] params,Integer num);
	  //只有排序，查出所有然后排序
	  List<T> findObjectsByConditionWithNum(LinkedHashMap<String, String> orderby,Integer num);
	  //可以设置返回的条数
	  List<T> findObjectsByConditionWithNum(Integer num);
	  
	  //返回当前的记录总数,带有条件查询
	  int findObjectsCount(String whereHql,Object[] params, LinkedHashMap<String, String> orderby);
	  int findObjectsCount(String whereHql,Object[] params);
	  int findObjectsCount(LinkedHashMap<String, String> orderby);
	  int findObjectsCount();
}
