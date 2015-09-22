import java.util.ArrayList;

import animals.Animal;
import animals.Cat;
import animals.Chicken;
import animals.Cow;
import animals.Dog;
import animals.Duck;
import animals.Pig;

public class Barnyard {
    private static final ArrayList< ? extends Animal > animals = buildAnimals();
    public static void main (String[] args) {
        int housepets = 0;
        int mammals = 0;
        int birds = 0;
        int withFourLegs = 0;
        int withTwoLegs = 0;
        
        for ( Animal animal : animals ) {
            System.out.println( animal );
            if ( animal.isHousepet( ) ) {
                housepets++;
            }
            if ( animal.isMammal( ) ) {
                mammals++;
            }
            if ( animal.isBird( ) ) {
                birds++;
            }
            if ( animal.getLegs( ).equals( 4 ) ) {
                withFourLegs++;
            } else if ( animal.getLegs( ).equals( 2 ) ) {
                withTwoLegs++;
            }
        }
        
        System.out.println( "-----------------------------" );
        System.out.println( "Total: " + animals.size( ) );
        System.out.println( "Mammals: " + mammals );
        System.out.println( "Birds: " + birds );
        System.out.println( "House pets: " + housepets );
        System.out.println( "With Two Legs: " + withTwoLegs );
        System.out.println( "With Four Legs: " + withFourLegs );
    }
    
    
    /**
     * This method is only used to initially populate the data used
     * for this test. Feel free to ignore this when going through
     * your refactoring. Assume that this is the equivalent of pulling
     * the animals out of the database in some nice, clean fashion.
     * 
     * @return a new {@link Vector} of various animals
     */
    private static ArrayList< Animal > buildAnimals( ) {
        final ArrayList< Animal > result = new ArrayList< Animal >( );
        
        result.add( new Pig( "Babe" ) );
        result.add( new Cat( "Nova" ) );
        result.add( new Dog( "Daisy" ) );
        result.add( new Duck( "Hank" ) );
        result.add( new Cow( "Phil" ) );
        result.add( new Chicken( "Cluckers" ) );
        
        return result;
    }
}