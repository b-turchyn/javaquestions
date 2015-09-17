public class Duck {
    private String name;
    
    public Duck( String name ) {
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
        return "Quack!";
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