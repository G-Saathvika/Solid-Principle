package com.notsolid;

interface ManageBooks{
    //violates Interface Segregation Principle
    public void addBook(String name);
    public void removeBook(String name);
}