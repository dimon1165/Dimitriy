package learn.java.javacode.SupportClasses;

/**
 * Support class for Stream operations
 */
public class Person {
    private String name;
    private String sureName;
    private String email;
    private String address;
    private String age;
    private String weight;

    public Person() {
    }

    public Person(String name, String sureName, String email, String address, String age, String weight) {
        this.name = name;
        this.sureName = sureName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
