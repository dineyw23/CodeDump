public class QueueAsStack<T>
{
   Stack<T> old,newStack;

   public QueueAsStack()
   {
      old = new Stack<>();
      newStack = new Stack<>();
   }

   public void shift()
   {
      if(old.isEmpty())
      {
         while(!newStack.isEmpty())
         {
            old.push(newStack.pop());
         }
      }
   }

   public void add(T val)
   {
      newStack.push(val);
   }

   public T remove()
   {
      shift();
      return old.pop();
   }
   
   public T peek()
   {
      shift();
      return old.peek();
   }
   
   
   public static void main(String agrs[])
   {  
      test();
   }

   public static void test()
   {
      QueueAsStack<Integer> q = new QueueAsStack<>();
      q.add(1);
      q.add(100);
      q.add(2);
      System.out.println(q.peek());
      q.remove();
      System.out.println(q.peek());
      q.add(2);
      q.remove();
      q.remove();
      System.out.println(q.peek());
      System.out.println(q.peek());
   }
}

