package org.uca.todomanager;

import java.util.ArrayList;

public interface TodoRepo {

    public ArrayList<Todo> getAllTodos();
    public Todo getLastTodo();
    public boolean deleteTodo(String name);
    public boolean addTodo(Todo newTodo);

}
