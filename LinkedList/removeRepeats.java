import java.util.HashSet;

class Node 
{
        int data;
        Node next;      
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        } 
}
class LinkedList
{
   Node head;

   LinkedList(int data)
   {
      head = new Node(data);
   }
   
   void add(int data)
   {  
      Node cur = head;
      while(cur.next != null)
         cur = cur.next;

      cur.next = new Node(data);
   }

   void print()
   {
      Node cur = head;
      while(cur != null)
      {
         System.out.println(cur.data);
         cur = cur.next;
      }
   }
   
}

class removeRepeats
{
   public static LinkedList list;
   
   public static void main(String args[])
   {
      list = new LinkedList(1);
      list.add(0);
      list.add(1);
      list.add(0);
      list.add(0);
      list.add(0);
      list.add(0);
      list.add(0);
      list.add(0);
      list.add(0);
      list.add(5);
      list.add(0);
      list.add(2);
      
      list.print();
      System.out.println("=====================");
      System.out.println("Kth to Last Node is: " + kthToLastNode(3).data);
      System.out.println("=====================");
      removeRepeats();
      System.out.println("=====================");
      list.print();
      System.out.println("=====================");
      Node temp = findIfLoop();
      if(temp == null)
         System.out.println("No Loop in the linked list.");
      else
         System.out.println("The starting of the loop is: " + temp.data);
      System.out.println("=====================");
   }

   public static void removeRepeats()
   {
      HashSet<Integer> s = new HashSet<>();
      Node n = list.head;
      Node current = null;
         
      while(n != null)
      {
         if(s.contains(n.data))
         {
            current.next = n.next;
         }
         else
         {  
            s.add(n.data);
            current = n;
         }
         n = n.next;
      }
   }
   
   public static Node findIfLoop()
   {
      Node s = list.head;
      Node f = list.head;

      if(s == null)  
         return null;

      while(f != null && f.next != null)
      {
         s = s.next;
         f = f.next.next;
         if(s == f)
            break;
      }

      if(f == null || f.next == null)
      {
         return null; //No Loop/Cycle found.
      }

      //Finding the start of the cycle.
      
      s = list.head;
      while(s != f)
      {
         s = s.next;
         f = f.next;
      }
      return f;
   }

   public static Node kthToLastNode(int k)
   {
      //Make sure no cycle.

      Node p1 = list.head;
      Node p2 = list.head;

      for(int i = 0; i < k; i++)
      {
         if(p1 == null)
            return null;

         p1 = p1.next;
      }

      while(p1 != null)
      {
         p1 = p1.next;
         p2 = p2.next;
      }
      return p2;
   }
}
