package com.ksoft.wpm.common.session;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.INTERFACES)
public class SessionHolder<T> implements ISessionHolder<T>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String,T> map = new HashMap<String,T>();
	
	@Override
	public T getValue(String key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}

	@Override
	public void putObject(String key, T obj) {
		// TODO Auto-generated method stub
		map.put(key, obj);
	}

}
