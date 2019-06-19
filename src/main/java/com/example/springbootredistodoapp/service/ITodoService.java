package com.example.springbootredistodoapp.service;

import com.example.springbootredistodoapp.model.Todo;

public interface ITodoService {
	
	public Todo createTodo(Todo todo);
	public Todo getTodoById(Long todoId);
	public boolean deleteTodo(Long todoId); 
}
