package com.example.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class ContactPerson implements Serializable {
    private String personName;
    private String phoneNumber;
    private String status;
    private int img;
    private String sex;

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson(String personName, String phoneNumber, String status, int img) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.img = img;
    }
    public ContactPerson(String personName, String phoneNumber, String status, int img, String sex) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.img = img;
        this.sex = sex;
    }

    public ContactPerson(String personName, String phoneNumber, int img) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.img = img;
    }

    public ContactPerson() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<ContactPerson>getAllperson(){
        ArrayList<ContactPerson> persons = new ArrayList<>();
        persons.add(new ContactPerson("Adan","012232333","available",R.drawable.male_profile));
        persons.add(new ContactPerson("Aziz","012232333","busy",R.drawable.male_profile));
        persons.add(new ContactPerson("Raz","012232333","busy",R.drawable.male_profile));
        persons.add(new ContactPerson("RAHIMA","012232333","offline",R.drawable.female_profile));
        persons.add(new ContactPerson("fafuk","012232333","offline",R.drawable.male_profile));
        persons.add(new ContactPerson("rehman","012232333","offline",R.drawable.male_profile));
        persons.add(new ContactPerson("rahima","012232333","available",R.drawable.female_profile));
        persons.add(new ContactPerson("rjaj","012232333","available",R.drawable.male_profile));
        persons.add(new ContactPerson("rfique","012232333","available",R.drawable.male_profile));
        persons.add(new ContactPerson("rahman","012232333","busy",R.drawable.male_profile));
        persons.add(new ContactPerson("roishi","012232333","busy",R.drawable.female_profile));
        persons.add(new ContactPerson("robroba","012232333","offline",R.drawable.female_profile));
        persons.add(new ContactPerson("fuck","012232333","busy",R.drawable.male_profile));
        persons.add(new ContactPerson("fuck you chudbo tmke","012232333","available",R.drawable.female_profile));
        persons.add(new ContactPerson("Banna Riya","012232333","busy",R.drawable.female_profile));

        return persons;
    }
}
