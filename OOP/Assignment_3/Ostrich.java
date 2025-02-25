
public class Ostrich extends Bird
{
    boolean isTall;
    boolean hasThinLongLegs;
    
    public Ostrich() 
    {
        super();
        flies = false;
        isTall = true;
        hasThinLongLegs = true;
    }
    
    /**
     * getter method for the isTall field
     */
    public boolean isTall(){
        return isTall;
    }
    
    /**
     * getter method for the hasThinLongLegs field
     */
    public boolean hasThinLongLegs(){
        return hasThinLongLegs;
    }
    
    /**
     * toString method returns a String representation of the bird
     */
    @Override
    public String toString(){
        String strng ="-----------\n";
        strng+= "OSTRICH\n";
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
        strng+= "Thin Long Legs: ";
        strng+= hasThinLongLegs+"\n";
        strng+= "Tall: ";
        strng+= isTall+"\n";
        return strng;
    }
    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Ostrich class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Ostrich object
     */
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Ostrich)
        {
            Ostrich ostrich2 = (Ostrich)obj;
            if(this.colour == ostrich2.colour && this.hasWings == ostrich2.hasWings && this.hasFeathers == ostrich2.hasFeathers && this.isTall == ostrich2.isTall)
            {
                if(this.flies == ostrich2.flies && this.breathes == ostrich2.breathes && this.hasSkin == ostrich2.hasSkin && this.hasThinLongLegs == ostrich2.hasThinLongLegs)
                {
                    return true;
                }
            }
        }
        
        return false; //default equals
    }
}
