public class privacy_test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);

        Person person1 = new Person();
        person1.setName("Carlos Soto");

        Person person2 = new Person();
        person2.setPhone(80922120);

        
        System.out.println(person.getAge());
        System.out.println(person1.getName());
        System.out.println(person2.getPhone());

        

    } 
}

class Person {
    private int Age;
    private String Name;
    private int Phone;

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return this.Age;
    }

    public void setName( String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setPhone (int Phone) {
        this.Phone = Phone;
    }

    public int getPhone() {
        return this.Phone;
    } 

}