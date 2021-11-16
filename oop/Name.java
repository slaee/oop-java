package oop;

public class Name{
    private String firstName;
    private char middleName;
    private String lastName;
    
    public Name(){}

    public Name(String firstName, char middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleInitial(char middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + middleName + ". " + lastName;
    }

    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name = (Name)obj;
            return this.firstName == name.firstName && this.middleName == name.middleName && this.lastName == name.lastName;
        }
        return false;
    }
}