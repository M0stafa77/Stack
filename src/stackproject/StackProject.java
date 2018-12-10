
package stackproject;


public class StackProject {

    
    public static void main(String[] args) {
       stack s = new stack();
       s.push(5);
       s.push(6);
       s.push(7);
        System.out.println(s.pop() + " popped form stack");
        System.out.println(s.isEmpty());
       s.getsize();
        System.out.println(s.peek() + " The first element ");
    }
        
}
class stack {
    static final int max=1000;
    int top;
    int a[] = new int[max];
    
    boolean isEmpty()
     { 
        return (top == 0); 
    } 
    stack() 
    { 
        top = 0; 
    }  

    boolean push(int x){
        if (top >= (max-1))
        {
            System.out.println("satck over flow");
            return false;
        }
        else {
            a[++top]= x;
            System.out.println(x + " pushed into stack ");
            return true;   
        }
    
    }
    
    int pop()
    {
        if (top < 0){
            System.out.println("satck unerflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
    int getsize(){
        System.out.println(top + "is the size of Sack");
        return 0;
    }
  
    int peek(){
        int x = a[top];
        return x;
    }




}

