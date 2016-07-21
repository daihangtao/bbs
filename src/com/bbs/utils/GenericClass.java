package com.bbs.utils;

import java.lang.reflect.ParameterizedType;

public class GenericClass {

	/**
	 * ��ȡ����ķ�������
	 * @param clazz
	 * @return
	 */
	public static Class getGenericClass(Class clazz) {
		
		ParameterizedType  type=(ParameterizedType)clazz.getGenericSuperclass();
	
		
		Class entityClass=(Class) type.getActualTypeArguments()[0];
		
		//cn.itcast.crm.domain.SysUserGroup
		//System.out.println("entityClass  "+entityClass);
		
		return entityClass;
	}


}
