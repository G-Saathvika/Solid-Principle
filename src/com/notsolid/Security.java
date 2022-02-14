package com.notsolid;

class Security extends Staff{
    //violates Liskov Principle
    @Override
    public void loginAndLogout() {
        System.out.println("Security can't login and logout of system");
    }

    @Override
    public void manageApplications() {

    }
}
