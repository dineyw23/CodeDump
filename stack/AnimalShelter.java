import java.util.LinkedList;

abstract class Animal
{
   private int order;
   protected String name;

   public Animal(String n)
   {
      name = n;
   }
   public int getOrder()
   {
      return order;
   }
   public void setOrder(int o)
   {
      order = o;
   }
   public boolean isOlder(Animal a)
   {
      if(this.order < a.getOrder())
         return true;
      else 
         return false;
   }
}

class Dog extends Animal 
{
   public Dog(String n)
   {
      super(n);
   }
}
class Cat extends Animal
{
   public Cat(String n)
   {
      super(n);
   }
}
public class AnimalShelter
{
   LinkedList<Dog> dogs = new LinkedList<Dog>();
   LinkedList<Cat> cats = new LinkedList<Cat>();
   private int order = 0;

   public void enqueue(Animal a)
   {
      a.setOrder(order);
      order++;

      if(a instanceof Dog)
         dogs.addLast((Dog) a);
      else if(a instanceof Cat)
         cats.addLast((Cat) a);

   }
   
   public Dog dequeueDog()
   {
      return dogs.poll();
   }
   public Cat dequeueCat()
   {
      return cats.poll();
   }
  
   public Animal dequeAny()
   {
      if(dogs.size() == 0)
         return dequeueCat();
      else if (cats.size() == 0)
         return dequeueDog();

      Dog d = dogs.peek();
      Cat c = cats.peek();

      if(d.isOlder(c))
         return dequeueDog();
      else
         return dequeueCat();
   }

}
