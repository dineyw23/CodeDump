class unique 
{
        public boolean checkUnique(String s)
        {
           if(s.length() > 128)
              return false;
            
           int check = 0;
           int value;
           for(int i = 0; i < s.length(); i++)
           {   
               value = s.charAt(i) - 'a';
               if((check & (1 << value)) > 0)
                  return false;
               check |= (1 << value);
           }
            
            return true;
        }

        public static void main(String args[])
        {
           String s = new String("HELLO");
           unique Obj = new unique();
           System.out.println(Obj.checkUnique(s));
        }

}


