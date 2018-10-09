/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Node
{
    Scanner kb = new Scanner(System.in);
    private String activity ="";
    private int duration = 0;
    private String predecessor = "";

    /**
     * Constructor for objects of class Node
     *  The first node shouldnt have a predecessor
     */
    public Node(String activity, int duration)
    {
        System.out.println("What is the name of this activity? \n"); //Read in the users input and store it
        activity = kb.nextLine();
        this.activity = activity;
        try     //Error checking, duration must be an Int
        {
            System.out.println("What is the duration of this activity? \n");
            duration = kb.nextInt();
            this.duration = duration;
        }
        catch (NumberFormatException a)
        {
            System.out.println("You must enter a number.");
        }
    }

    /**
     * Constructor for objects of class Node
     *  Every other node aside from the first one
     */
    public Node(String activity, int duration, String Predecessor)
    {
        System.out.println("What is the name of this activity? \n");
        activity = kb.nextLine();
        this.activity = activity;

        System.out.println("What is the predecessor to this activity? \n");
        predecessor = kb.nextLine();  
        this.predecessor = predecessor;   

        try
        {
            System.out.println("What is the duration of this activity? \n");
            duration = kb.nextInt();
            this.duration = duration;
        }
        catch (NumberFormatException a)
        {
            System.out.println("You must enter a number.");
        }        

    }

    /**
     *  Im not really sure if we will need the setter methods but just incase.
     *  Getter methods will be used to retrieve the data.
     */
    public void setActivity()
    {
        this.activity = activity;
    }

    public void setDuration()
    {
        this.duration = duration;
    }  

    public void setPredecessor()
    {
        this.predecessor = predecessor;
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
         */
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
         */
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
        for(Node aNode: x)
        {

            System.out.println(" "+aNode.getActivity() + "\t  \t  "+aNode.getDuration()+" \t  "+aNode.getPredecessor());
        }

    }
}
