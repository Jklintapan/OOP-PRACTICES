package Person;

public class PersonMain {
   public static void main(String[] args) {
      Person p1 = new Person ("saigad", 18); 
      Person p2 = new Person ("Jargib", 19); 
    System.out.println(p1.getName() + " is " +  p1.getAge() + "Yearsnold");
    System.out.println(p2.getName() + " is " +  p1.getAge() + "Yearsnold");


    p1.setName("Brix");
    p1.setAge(19);
    System.out.println("Yuor name is :" +  p1.getName() +  "" + "Age :" + p1.getAge());
    p1.setName("Brayan");
    p1.setAge(20);
    System.out.println("Yuor name is :" +  p1.getName() +  "" + "Age :" + p1.getAge());



} 
}
