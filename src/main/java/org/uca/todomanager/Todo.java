package org.uca.todomanager;

public class Todo {

    public enum PriorityLevel {
        HIGH, MEDIUM, LOW
    }

    private String name;
    private String content;
    private PriorityLevel priority;

    public Todo(String name){
        this.name=name;
        this.content = "";
        this.priority=PriorityLevel.LOW;
    }

    public Todo(String name, String content){
        this.name=name;
        this.content = content;
        this.priority=PriorityLevel.LOW;
    }

    public Todo(String name, String content, PriorityLevel priority){
        this.name=name;
        this.content = content;
        this.priority=priority;
    }

    public String getContent() {
        return this.content;
    }

    public String getName(){
        return this.name;
    }

    public PriorityLevel getPriority() {
        return this.priority;
    }
}
