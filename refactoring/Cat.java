public class Cat {
    private String name;
    
    public Cat( String name ) {
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
        return "Meow!";
    }
    
    public boolean isMammal( ) {
        return true;
    }
    
    public boolean isBird( ) {
        return false;
    }
    
    public boolean isHousepet( ) {
        return true;
    }
}