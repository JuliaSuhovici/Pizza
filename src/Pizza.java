import java.util.List;
import java.util.ArrayList;

public class Pizza {
	private List<String> ingredients;

    public Pizza(){
        this.ingredients = new ArrayList<>();
    }

    public Pizza(String dough, String salt, String oil){
    	this();
    	if(dough.equals("thin") ||dough.equals("thick") ) 
    		ingredients.add(dough);
    	if(salt.equals("iodized") ||salt.equals("halit"))
    		ingredients.add(salt);
    	if(oil.equals("sunflower") ||oil.equals("olive"))
    		ingredients.add(oil);
    				
    	}
        
    public Boolean isComplete(){
    	try {
    	if(ingredients.get(0).equals("thin")||ingredients.get(0).equals("thick")) {
    		if(ingredients.get(1).equals("iodized")||ingredients.get(1).equals("halit"))
    			if(ingredients.get(2).equals("sunflower")||ingredients.get(2).equals("olive"))
    				if(ingredients.get(3) != null)
    					return true;
    		}
    	}catch(IndexOutOfBoundsException e) {
    		return false;
    	}	
    	return false;	
    }

    // CHAINING METHODS
    public Pizza with(String ingredient){   
    	if(!checkIfExists(ingredient))
    		ingredients.add(ingredient);
    	else
    		System.err.println("Pizza already contains " + ingredient + "!");
		return this;
    }

    public Pizza without(String ingredient){
    	if(!ingredient.equals(ingredients.get(0)) &&  !ingredient.equals(ingredients.get(1)) && !ingredient.equals(ingredients.get(2)))
    		ingredients.remove(ingredient);
    	else
    		System.err.println("You can't remove first three ingredients!");
    	return this;
    }

    public String toString() {
        return "Pizza = "+ingredients;
    }
    
    private boolean checkIfExists(String ingredient) {
    	if(ingredients.contains(ingredient))
    		return true; 
    	else
    		return false;	
    }
}
