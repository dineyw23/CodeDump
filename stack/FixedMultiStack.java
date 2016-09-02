import java.util.EmptyStackException;

class FixedMultiStack 
{
   private int nums = 3;
   private int stackSize;
   private int[] array;
   private int[] sizeOfStacks;

   public FixedMultiStack(int stackSizeUser)
   {
      stackSize = stackSizeUser;
      array = new int[stackSizeUser * nums];
      sizeOfStacks = new int[nums];
   }

   public boolean isEmpty(int num)
   {
      return sizeOfStacks[num] == 0;
   }
   
   public boolean isFull(int num)
   {
      return sizeOfStacks[num] == stackSize;
   }

   public int indexOfTop(int num)
   {
      int offset = stackSize * num;
      return offset + sizeOfStacks[num] - 1; 
   }
   
   public void push(int num,int data)
   {
      if(isFull(num))
      {
         System.out.println("Stack full!");
      }
      sizeOfStacks[num]++;
      array[indexOfTop(num)] = data;
   }

   public int pop(int num)
   {
      if(isEmpty(num))
         throw new EmptyStackException();
      int temp = indexOfTop(num);
      int val = array[temp];
      sizeOfStacks[num]--;
      array[temp] = 0;
      return val;
   }

   public int peek(int num)
   {  
      if(isEmpty(num))
         throw new EmptyStackException();

      return array[indexOfTop(num)];
   }

   public static void main(String args[])
   {
      FixedMultiStack arrStack = new FixedMultiStack(10); 
      
      arrStack.push(1,12);
      arrStack.push(1,12);
      arrStack.push(1,1);
      arrStack.push(2,14);
      arrStack.push(2,14);
      arrStack.push(2,12);
      arrStack.push(0,13);
      arrStack.push(0,3);
      
      System.out.println(arrStack.pop(1));
      System.out.println(arrStack.pop(2));
      System.out.println(arrStack.pop(0));
   }
}
   
