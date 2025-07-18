package taxi_management_system;

public class Driver {
    private String name;
    private int age;
    private String licenseNumber;

    public Driver(String name, int age, String licenseNumber){
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getLicenseNumber(){
        return  licenseNumber;
    }

    public void setLicenseNumber(){
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString(){
        return "Driver: {\n" +
                "name: " + this.name + "\n" +
                "age: " + this.age + "\n" +
                "lisenceNumber : " + licenseNumber + "\n" +
                "}";
    }
}
