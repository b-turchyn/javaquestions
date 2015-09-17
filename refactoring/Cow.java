public class Cow {
    private String name;
    
    public Cow( String name ) {
        this.name = name;
    }

    public String getName( ) {
        return name;
    }

    
    public void setName( String name ) {
        this.name = name;
    }
    public int getLegs( ) {
        return 4;
    }
    
    public String speak( ) {
        return "Mooooo!";
    }
    
    public boolean isMammal( ) {
        return true;
    }
    
    public boolean isBird( ) {
        return false;
    }
    
    public boolean isHousepet( ) {
        return false;
    }
}