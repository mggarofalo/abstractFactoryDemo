import java.util.*;

public class factoryProductionDemo {
	public static void main ( String[] args ) {
		// Set factory types
		String[] factories = new String[] {"Shape", "Color"};

		// Set item types for each factory
		ArrayList<String[]> alItems = new ArrayList<String[]>();
		alItems.add ( new String[] {"Rectangle", "Square", "Circle"} );
		alItems.add ( new String[] {"Blue", "Red", "Yellow"} );

		// For each factory, get its items
		for ( int i = 0; i < factories.length; i++ ) {
			AbstractFactory f = FactoryProducer.getFactory ( factories[i] );
			String[] items = alItems.get ( i );

			// For each item a factory will make, instantiate it and initialize its method
			for ( int j = 0; j < items.length ; j++ ) {
				if ( factories[i].equalsIgnoreCase ( "Shape" ) ) {
					Shape s = f.getShape ( items[j] );
					s.draw();
				} else if ( factories[i].equalsIgnoreCase ( "Color" ) ) {
					Color c = f.getColor ( items[j] );
					c.fill();
				}
			}
		}
	}
}