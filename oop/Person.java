package oop;

// declare Person class with Name object as a field
public class Person{
    private Name name;
    private int age;
    private char gender;

    public Person(){}
    
    public Person(Name name, int age, char gender){
        this.name = name;
        this.age = age;
        setGender(gender);
    }

    public Person(Name name, char gender){
        this.name = name;
        age = 25;
        setGender(gender);
    }

    public void setName(Name name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        switch(gender){
            case 'M':
            case 'F':
                this.gender = gender;
                break;
            default:
                this.gender = 'M';
                break;
        }
    }
    
    public String toString(){
        return "Name:"+ name + "\nAge:" + age + "\nGender:" + gender;
    }
}