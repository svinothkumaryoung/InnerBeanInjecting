package com.iisn.innerBean;



public class StudentName {
    private StudentDetails sharan;
    private StudentDetails Gokul;
    private StudentDetails Sharanish;
    private StudentDetails Vinoth;


    public StudentDetails getSharan() {
        return sharan;
    }

    public void setSharan(StudentDetails sharan) {
        this.sharan = sharan;
    }

    public StudentDetails getGokul() {
        return Gokul;
    }

    public void setGokul(StudentDetails gokul) {
        Gokul = gokul;
    }

    public StudentDetails getSharanish() {
        return Sharanish;
    }

    public void setSharanish(StudentDetails sharanish) {
        Sharanish = sharanish;
    }

    public StudentDetails getVinoth() {
        return Vinoth;
    }

    public void setVinoth(StudentDetails vinoth) {
        Vinoth = vinoth;
    }
    void printData()
    {
        System.out.println("First Student Details");
        System.out.println("Register No is "+getSharan().getRegisterNo());
        System.out.println("Name is "+getSharan().getName());
        System.out.println("Address "+getSharan().getAddress());
        System.out.println("Mobile Number is "+getSharan().getMobileNo());

        System.out.println("***********************");

        System.out.println("Second Student Details");
        System.out.println("Register No is "+getGokul().getRegisterNo());
        System.out.println("Name is "+getGokul().getName());
        System.out.println("Address "+getGokul().getAddress());
        System.out.println("Mobile Number is "+getGokul().getMobileNo());

        System.out.println("***********************");

        System.out.println("Thrid Student Details");
        System.out.println("Register No is "+getSharanish().getRegisterNo());
        System.out.println("Name is "+getSharanish().getName());
        System.out.println("Address "+getSharanish().getAddress());
        System.out.println("Mobile Number is "+getSharanish().getMobileNo());
        System.out.println("***********************");

        System.out.println("Fourth Student Details");
        System.out.println("Register No is "+getVinoth().getRegisterNo());
        System.out.println("Name is "+getVinoth().getName());
        System.out.println("Address "+getVinoth().getAddress());
        System.out.println("Mobile Number is "+getVinoth().getMobileNo());
    }
}