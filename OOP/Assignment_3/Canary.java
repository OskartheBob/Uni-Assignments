
public class Canary extends Bird
{
    
    String name; // the name of this Canary

    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name)
    {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird
        
    }
    
    /**
     * getter method for the name field
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
    
    /**
     * toString method returns a String representation of the bird
     */
    @Override
    public String toString(){
        String strng ="-----------\n";
        strng+= "CANARY\n";
        strng+= "Name: ";
        strng+= name+"\n";
        strng+= "Colour: ";
        strng+= colour+"\n";
        strng+= "Wings: ";
        strng+= hasWings+"\n";
        strng+= "Feathers: ";
        strng+= hasFeathers+"\n";
        strng+= "Flies: ";
        strng+= flies+"\n";
        strng+= "Breathes: ";
        strng+= breathes+"\n";
        strng+= "Skin: ";
        strng+= hasSkin+"\n";
        return strng;
    }

    /**
     * equals method defines how equality is defined between 
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Canary object
     */
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)//Checks to make sure the object isn't of type null
        {
            return false;
        }
        if(obj instanceof Canary)//Check if the object is a Canary
        {
            Canary canary2 = (Canary)obj;
            if(this.name == canary2.name && this.colour == canary2.colour && this.hasWings == canary2.hasWings && this.hasFeathers == canary2.hasFeathers)
            {
                if(this.flies == canary2.flies && this.breathes == canary2.breathes && this.hasSkin == canary2.hasSkin)//Compare fields to check if the object is the same canary
                {
                    return true;
                }
            }
        }
        
        return false; //default equals
    }
}
