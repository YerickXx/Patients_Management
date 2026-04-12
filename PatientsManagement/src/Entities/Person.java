
package Entities;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String gender;
    private String Id;
    
    public Person()
    {
        this.name = "";
        this.lastName = "";
        this.age = 0;
        this.gender = "";
        this.Id = "";
    }
    
    public Person(String pName, String pLastName, 
            int pAge, String pGender, String pId)
    {
        this.name = pName;
        this.lastName = pLastName;
        this.age = pAge;
        this.gender = pGender;
        this.Id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+this.name+", Last name: "+this.lastName+
                ", Age: "+this.age+", Gender: "+this.gender+", ID: "+this.Id;
    }
    
}
