package com.example.springbootredistodoapp.cache;

public interface ICache {
	
	public Object getItem(String key, Class type);
    public Object setItem(String key, Object item);
    public boolean deleteItem(String key);
}
