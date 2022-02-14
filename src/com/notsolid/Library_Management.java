package com.notsolid;

class Library_Management implements ManageBooks{
    //violates single responsibility
    @Override
    public void addBook(String name) {
        System.out.println("Add book : "+name);
    }

    @Override
    public void removeBook(String name) {
        System.out.println("Remove book : "+name);
    }
}
