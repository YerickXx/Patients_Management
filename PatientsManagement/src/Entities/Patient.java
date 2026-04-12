
package Entities;


public class Patient extends Person {
    private String state;
    private String description;
    private String situation;
    
    public Patient()
    {
        this.state = "";
        this.description = "";
        this.situation = "";
    }
    
    public Patient(String name,String lastName, int age, String gender, String Id,
            String State, String Description, String Situation)
    {
        super(name,lastName,age,gender,Id);
        this.state = State;
        this.description = Description;
        this.situation = Situation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+this.getName()+" LastName: "+this.getLastName()+
                " Gender "+this.getGender()+" Age "+this.getAge()+" ID: "+this.getId()+
                " State "+state+" Description "+description+" Situation "+situation;
    }
}
