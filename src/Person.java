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

    public static void main(String[] args) {
//        Person person1=new Person("Jimmie");
//        System.out.println(person1.getName());
//        person1.setName("James");
//        System.out.println("New name is: "+ person1.name);
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
