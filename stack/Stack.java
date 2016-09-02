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
}
