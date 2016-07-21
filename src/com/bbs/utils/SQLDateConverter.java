package com.bbs.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cglib.core.Converter;

/**
 * sql����ת����
 * @author wjh
 *
 */
public class SQLDateConverter implements Converter {
	
	public Object convert(Class type, Object value) {
		if(value==null){
			return null;
		}
		
		if(type==null){
			return null;
		}
		
		if(type!=java.sql.Date.class){
			return null;
		}
		
		if(value instanceof java.lang.String){
			String str=(String)value;
			if(StringUtils.isNotBlank(str)){
			   return java.sql.Date.valueOf((String)value);
			}
		}
		
		return null;
	}

	@Override
	public Object convert(Object arg0, Class arg1, Object arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
