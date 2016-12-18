package src.SimplePractice;


public class FlowControlRelated 
{
    public static void main( String[] args )
      {
       String[] toppings = {"Beyonce (f)", "David Bowie (m)", "Elvis Costello (m)","Madonna (f)","Elton John (m)","Charles Aznavour (m)"};
       int female=0;
       int male=0; 

        for (int i = 0; i < toppings.length; i++) { 
        if (toppings[i].contains("(m)")) 
        	male++;
        
        else 
            female++;
        }
        System.out.println("Number of males are" + " " + male);
        System.out.println("Number of females are" + " " + female);
  
    }   
    
    
}
