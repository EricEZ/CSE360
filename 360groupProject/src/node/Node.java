package node;
import java.util.ArrayList;
import java.util.List;

public class Node
{
	
    
    public String activity;
    public int duration = 0;
    public String predecessor;

    
   

    /**
     * Constructor for objects of class Node
     *  Every other node aside from the first one
     */
    public Node(String activity1, int duration1, String predecessor1)
    {
    	
    	 this.activity = activity1;
         this.duration = duration1;
         this.predecessor = predecessor1; 
    

    }

    /**
     *  Im not really sure if we will need the setter methods but just incase.
     *  Getter methods will be used to retrieve the data.
     */
    public void setActivity(String activity1)
    {
        this.activity = activity1;
    }

    public void setDuration(int duration1)
    {
        this.duration = duration1;
    }  

    public void setPredecessor(String predecessor1)
    {
        this.predecessor = predecessor1;
    } 

    public String getActivity()
    {
        return activity;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getPredecessor()
    {
        return predecessor;
    }        
    
    public String toString()
    {
    	
    	return activity + " | " + duration + " | " + predecessor ;
    }
}
/*
    public static void main(String[] someargs)
    {
        Scanner kb = new Scanner(System.in);
        String answer = "";
        String rply = "";
        //int size = 0;
        //Node[] x = new Node[size]; // did not work. Couldnt add more nodes to the array dynamically
        List<Node> x = new ArrayList<Node>();
        boolean createNew = false;
        boolean isString = false;

        /**
         * Asks if the user wants to create the first Node
         
        do
        {
            System.out.println("Would you like to create a new node? y/n ");
            answer = kb.nextLine();
            rply = answer.toLowerCase();
            if(rply.equals("y") || rply.equals("yes"))
            {
                createNew = true;
                isString = true;
            }
            else if(rply.equals("n") || rply.equals("no"))
            {
                createNew = false;
                isString = true;
            }
            else
            {
                System.out.println("Please try again: ");
                isString = false;
            }
        }
        while(isString == false); 

        /**
         * Creates first node
         * Asks if the user wants to create more nodes
         * 
         
        if(createNew == true)
        {
            Node first = new Node("",0); //The first Node shouldnt have a predecessor            
            x.add(first);

            while(rply.equals("y") || rply.equals("yes"))
            {
                System.out.println("Would you like to create a new node? y/n ");
                answer = kb.nextLine();
                rply = answer.toLowerCase();

                if(rply.equals("y" )|| rply.equals("yes"))
                {
                    Node aNode = new Node("",0,"");
                    x.add(aNode);
                }
                else if( rply.equals("n") || rply.equals ("no"))
                {

                }
                else
                {
                    System.out.println("please try again");
                    System.out.println("Would you like to create a new node? y/n ");
                    answer = kb.nextLine();
                    rply = answer.toLowerCase();

                }

            }
        }
        System.out.println("|Activity|   |Duration|   |Predecessor|");
       
        

    }
}
*/