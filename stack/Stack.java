import java.util.EmptyStackException;

public class Stack<T>
{
   private static class StackNode<T> 
   {
      private T data;
      private StackNode<T> next;

      public StackNode (T data)
      {
         this.data = data;
      }
   }

   StackNode<T> top;

   public T pop()
   {  
      if(top == null)
         throw new EmptyStackException();

      T dataReturn = top.data;
      top = top.next;
      return dataReturn;
   }

   public void push(T item)
   {
      StackNode<T> temp = new StackNode<T>(item);
      temp.next = top;
      top = temp;
   }

   public T peek()
   {
      if(top == null)
         throw new EmptyStackException();
      return top.data;
   }

   public boolean isEmpty()
   {
      return top == null;
   }

   
   static Stack<Integer> sortStack(Stack<Integer> s)
   {
      
      Stack<Integer> r = new Stack<>();
      while(!s.isEmpty())
      {
         int temp = s.pop();
         while(!r.isEmpty() && r.peek() > temp)
         {
            s.push(r.pop());
         }
         r.push(temp);
      }

      while(!r.isEmpty())
      {
         s.push(r.pop());
      }
      return s;
   }


   public static void main(String argd[])
   {
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(19);
      s.push(2);
      s.push(19);
      s.push(1);
      s.push(0);
      s.push(22);
      Stack<Integer> s2 = new Stack<>();
      //Sort
      s2 = sortStack(s);
      //Print 
      while(!s2.isEmpty())
         System.out.println(s2.pop());
   }
}
