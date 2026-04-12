
package Entities;

public class Medics extends Person{
    private String workID = "";
    private String especialization = "";
    private String department = "";
    
    public Medics()
    {
        this.workID = "";
        this.especialization = "";
        this.department = "";
    }
    
    public Medics(String name, String lastName, int age, String gender, String Id, 
            String WorkID, String Especialization, String Department)
    {
        super(name,lastName,age,gender,Id);
        this.workID = WorkID;
        this.especialization = Especialization;
        this.department = Department;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getEspecialization() {
        return especialization;
    }

    public void setEspecialization(String especialization) {
        this.especialization = especialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+this.getName()+" LastName: "+this.getLastName()+
                " Gender "+this.getGender()+" Age "+this.getAge()+" ID: "+this.getId()+
                " State "+workID+" Description "+especialization+" Situation "+department;
    }
    
}
