
public class Shark extends Fish
{
    boolean canBite;
    boolean isDangerous;
    
    public Shark() 
    {
        super();
        canBite = true;
        isDangerous = true;
    }
    
    /**
     * getter method for the canBite field
     */
    public boolean canBite(){
        return canBite;
    }
    
    /**
     * getter method for the isDangerous field
     */
    public boolean isDangerous(){
        return isDangerous;
    }
    
    /**
     * toString method returns a String representation of the fish
     */
    @Override
    public String toString(){
        String strng ="-----------\n";
        strng+= "SHARK\n";
        strng+= "Colour: ";
        strng+= colour+"\n";
        strng+= "Fins: ";
        strng+= hasFins+"\n";
        strng+= "Gills: ";
        strng+= hasGills+"\n";
        strng+= "Swims: ";
        strng+= swims+"\n";
        strng+= "Breathes: ";
        strng+= breathes+"\n";
        strng+= "Skin: ";
        strng+= hasSkin+"\n";
        strng+= "Bites: ";
        strng+= canBite+"\n";
        strng+= "Dangerous: ";
        strng+= isDangerous+"\n";
        return strng;
    }
    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Shark class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Shark object
     */
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Shark)
        {
            Shark shark2 = (Shark)obj;
            if(this.colour == shark2.colour && this.hasFins == shark2.hasFins && this.hasGills == shark2.hasGills && this.isDangerous == shark2.isDangerous)
            {
                if(this.swims == shark2.swims && this.breathes == shark2.breathes && this.hasSkin == shark2.hasSkin && this.canBite == shark2.canBite)
                {
                    return true;
                }
            }
        }
        
        return false; //default equals
    }
}
