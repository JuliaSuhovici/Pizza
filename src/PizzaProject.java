
public class PizzaProject {

	public static void main(String[] args) {
		Pizza simplePizza = new Pizza("thick","halit","olive")
                .with("cheese")
                .with("tomato")
                .with("mushrooms")
                .with("meat")
                .with("cheese");
		

		System.out.println( "IS pizza complete? " + simplePizza.isComplete() );
		System.out.println( simplePizza );
	}

}
