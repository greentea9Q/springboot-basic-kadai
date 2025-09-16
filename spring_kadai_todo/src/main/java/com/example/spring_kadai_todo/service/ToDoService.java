package com.example.spring_kadai_todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_kadai_todo.entity.ToDo;
import com.example.spring_kadai_todo.repository.ToDoRepository;

@Service 
public class ToDoService {
	private final ToDoRepository todoRepository;
	public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
	
	public List<ToDo> getAllTodos() {
        return todoRepository.findAll();
    }
}
