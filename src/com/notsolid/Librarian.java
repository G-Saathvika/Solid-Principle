package com.notsolid;

class Librarian extends Staff{

    @Override
    public void loginAndLogout() {
        System.out.println("Login and logout of system");
    }

    @Override
    public void manageApplications() {
        System.out.println("Mange applications of members");
    }
}