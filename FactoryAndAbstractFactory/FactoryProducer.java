public class FactoryProducer {
	public static AbstractFactory getFactory ( String choice ) {
		if ( choice.equalsIgnoreCase ( "Shape" ) ) {
			System.out.println("Making a shape factory.");
			return new shapeFactory();
		} else if ( choice.equalsIgnoreCase ( "Color" ) ) {
			System.out.println("Making a color factory.");
			return new colorFactory();
		}

		return null;
	}
}