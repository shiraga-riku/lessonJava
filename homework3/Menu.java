import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String menu;
	private String type;
	private List<Recipe> recipes;

	public Menu(String menu, String type, List<Recipe> recipes) {
		this.menu = menu;
		this.type = type;
		this.recipes = recipes;
	}

	public String getName() {
		return this.menu;
	}

	public String getType() {
		return this.type;
	}

	public List<Recipe> getRecipes() {
		return this.recipes;
	}

	public double getCal() {
		double cal = 0;
		for (int i = 0; i < this.recipes.size(); i++) {
			cal += this.recipes.get(i).getCal();
		}
		return cal;
	}
}