import java.util.ArrayList;

public class Barnyard {
    private static final ArrayList animals = buildAnimals();
    public static void main (String[] args) {
        int housepets = 0;
        int mammals = 0;
        int birds = 0;
        int withFourLegs = 0;
        int withTwoLegs = 0;
        
        for( int i = 0; i < animals.size( ); i++ ) {
            Object animal = animals.get( i );
            
            if ( animal instanceof Cat ) {
                Cat cat = (Cat)animal;
                System.out.println( cat.getName( ) + " the Cat says " + cat.speak( ) + "; " +
                        "legs = " + cat.getLegs( ) + "; " +
                		"mammal = " + cat.isMammal( ) + "; " +
                        "bird = " + cat.isBird( ) + "; " +
                        "housepet = " + cat.isHousepet( ) );
                housepets++;
                mammals++;
                withFourLegs++;
            } else if ( animal instanceof Chicken ) {
                Chicken chicken = (Chicken)animal;
                System.out.println( chicken.getName( ) + " the Chicken says " + chicken.speak( ) + "; " +
                        "legs = " + chicken.getLegs( ) + "; " +
                		"mammal = " + chicken.isMammal( ) + "; " +
                        "bird = " + chicken.isBird( ) + "; " +
                        "housepet = " + chicken.isHousepet( ) );
                birds++;
                withTwoLegs++;
            } else if ( animal instanceof Cow ) {
                Cow cow = (Cow)animal;
                System.out.println( cow.getName( ) + "the Cow says " + cow.speak( ) + "; " +
                		"legs = " + cow.getLegs( ) + "; " +
                		"mammal = " + cow.isMammal( ) + "; " +
                        "bird = " + cow.isBird( ) + "; " +
                        "housepet = " + cow.isHousepet( ) );
                mammals++;
                withFourLegs++;
            } else if ( animal instanceof Dog ) {
                Dog dog = (Dog)animal;
                System.out.println( dog.getName( ) + " the Dog says " + dog.speak( ) + "; " +
                		"legs = " + dog.getLegs( ) + "; " +
                		"mammal = " + dog.isMammal( ) + "; " +
                        "bird = " + dog.isBird( ) + "; " +
                        "housepet = " + dog.isHousepet( ) );
                housepets++;
                mammals++;
                withFourLegs++;
            } else if ( animal instanceof Duck ) {
                Duck duck = (Duck)animal;
                System.out.println( duck.getName( ) + " the Duck says " + duck.speak( ) + "; " +
                		"legs = " + duck.getLegs( ) + "; " +
                		"mammal = " + duck.isMammal( ) + "; " +
                        "bird = " + duck.isBird( ) + "; " +
                        "housepet = " + duck.isHousepet( ) );
                birds++;
                withTwoLegs++;
            } else if ( animal instanceof Pig ) {
                Pig pig = (Pig)animal;
                System.out.println( pig.getName( ) + "the Pig says " + pig.speak( ) + "; " +
                		"legs = " + pig.getLegs( ) + "; " +
                		"mammal = " + pig.isMammal( ) + "; " +
                        "bird = " + pig.isBird( ) + "; " +
                        "housepet = " + pig.isHousepet( ) );
                mammals++;
                withFourLegs++;
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
     * @return a new {@link ArrayList} of various animals
     */
    private static ArrayList buildAnimals( ) {
        final ArrayList result = new ArrayList( );
        
        result.add( new Pig( "Babe" ) );
        result.add( new Cat( "Nova" ) );
        result.add( new Dog( "Daisy" ) );
        result.add( new Duck( "Hank" ) );
        result.add( new Cow( "Phil" ) );
        result.add( new Chicken( "Cluckers" ) );
        
        return result;
    }
}