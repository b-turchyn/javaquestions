public class Chicken {
    private String name;
    
    public Chicken( String name ) {
        this.name = name;
    }

    public String getName( ) {
        return name;
    }

    
    public void setName( String name ) {
        this.name = name;
    }
    public int getLegs( ) {
        return 2;
    }
    
    public String speak( ) {
        return "Buk buk!";
    }
    
    public boolean isMammal( ) {
        return false;
    }
    
    public boolean isBird( ) {
        return true;
    }
    
    public boolean isHousepet( ) {
        return false;
    }
}