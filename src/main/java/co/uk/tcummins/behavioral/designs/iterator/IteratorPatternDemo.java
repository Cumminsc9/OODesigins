package co.uk.tcummins.behavioral.designs.iterator;

/**
 * Created by Tom on 20/09/2016.
 *
 * https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
 */
public class IteratorPatternDemo
{
    public static void main( String[] args )
    {
        NameRepository namesRepository = new NameRepository();

        for( Iterator iter = namesRepository.getIterator(); iter.hasNext(); )
        {
            String name = (String) iter.next();
            System.out.println( "Name : " + name );
        }
    }
}

//    Iterator pattern is very commonly used design pattern in Java and .Net programming environment. This pattern is
//    used to get a way to access the elements of a collection object in sequential manner without any need to
//    know its underlying representation.
//
//    Iterator pattern falls under behavioral pattern category.
//
//    Implementation
//    We're going to create a Iterator interface which narrates navigation method and a Container interface which
//    returns the iterator . Concrete classes implementing the Container interface will be responsible to implement
//    Iterator interface and use it
//
//    IteratorPatternDemo, our demo class will use NamesRepository, a concrete class implementation to print a
//    Names stored as a collection in NamesRepository.
