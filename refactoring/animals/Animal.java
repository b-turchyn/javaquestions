package animals;


public abstract class Animal {
    private String name;
    
    public Animal ( String name ) {
        this.name = name;
    }

    public String toString( ) {
        return getName( ) + " the Cat says " + speak( ) + "; " +
                        "legs = " + getLegs( ) + "; " +
                		"mammal = " + isMammal( ) + "; " +
                        "bird = " + isBird( ) + "; " +
                        "housepet = " + isHousepet( );
    }
    
    public String getName( ) {
        return name;
    }

    public abstract String speak( );
    public abstract Integer getLegs( );
    
    // I would super() the toString and move these inside, but for now I also want
    // them to return false. Totally doable, but a bit too much coupling. Perhaps
    // a bad example.
    
    public Boolean isMammal( ) {
        return this instanceof Mammal;
    }

    public Boolean isBird( ) {
        return this instanceof Bird;
    }

    public Boolean isHousepet( ) {
        return this instanceof Housepet;
    }
}
