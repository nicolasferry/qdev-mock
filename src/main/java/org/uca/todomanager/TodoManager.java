package org.uca.todomanager;

import java.util.ArrayList;

public class TodoManager {
    private String name;
    private TodoRepo myRepo;

    public TodoManager(String name, TodoRepo myRepo){
        this.name = name;
        this.myRepo = myRepo;
    }

    public void printAllTodos(){
        ArrayList<Todo> allTodos =  this.myRepo.getAllTodos();
        for(int i = 0; i < allTodos.size(); i++){
            Todo currentTodo = allTodos.get(i);
            System.out.println("Title: "+currentTodo.getName()+" \n Content: "+currentTodo.getContent()+" \n Priority: "+currentTodo.getPriority());
        }
    }

    public Todo searchTodo(String name){
        ArrayList<Todo> allTodos =  this.myRepo.getAllTodos();
        for(int i = 0; i < allTodos.size(); i++) {
            Todo currentTodo = allTodos.get(i);
            if(currentTodo.getName() == name){
                return currentTodo;
            }
        }
        return null;
    }

    public boolean updateTodo(String name, Todo newTodo){
	return true;
    }

}
