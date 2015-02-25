package com.ksoft.wpm.common.session;


public interface ISessionHolder <T>{

	T getValue(String key);
	void putObject(String key, T obj);
}
