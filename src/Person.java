public class Person {
    private String name;

    public Person(String PersonName){
        name=PersonName;
    }
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String newName){
        name=newName;
//TODO: change the name property to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello "+ name+"!");
    }

    public void main(String[] args) {
        Person person1=new Person("Jimmie");

        System.out.println(person1.getName());
        person1.setName("James");
        System.out.println("New name is: "+person1);
        person1.sayHello();


    }
}
