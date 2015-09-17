public class Pig {
    private String name;
    
    public Pig( String name ) {
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
        return "Oink!";
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