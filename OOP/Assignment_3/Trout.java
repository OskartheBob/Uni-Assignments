
public class Trout extends Fish
{
    boolean hasSpikes;
    boolean isEdible;
    
    public Trout() 
    {
        super();
        hasSpikes = true;
        isEdible = true;
        colour = "brown";
    }
    
    /**
     * getter method for the hasSpikes field
     */
    public boolean hasSpikes(){
        return hasSpikes;
    }
    
    /**
     * getter method for the isEdible field
     */
    public boolean isEdible(){
        return isEdible;
    }
    
    /**
     * getter method for the laysEggsUpRiver field
     */
    public void laysEggsUpRiver(){
        System.out.println("I am swimming up river to lay eggs");
    }
    
    /**
     * toString method returns a String representation of the fish
     */
    @Override
    public String toString(){
        String strng ="-----------\n";
        strng+= "TROUT \n";
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
        strng+= "Spikes: ";
        strng+= hasSpikes+"\n";
        strng+= "Edible: ";
        strng+= isEdible+"\n";
        return strng;
    }
    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Trout class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Trout object
     */
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Trout)
        {
            Trout trout2 = (Trout)obj;
            if(this.colour == trout2.colour && this.hasFins == trout2.hasFins && this.hasGills == trout2.hasGills && this.isEdible == trout2.isEdible)
            {
                if(this.swims == trout2.swims && this.breathes == trout2.breathes && this.hasSkin == trout2.hasSkin && this.hasSpikes == trout2.hasSpikes)
                {
                    return true;
                }
            }
        }
        
        return false; //default equals
    }
}
