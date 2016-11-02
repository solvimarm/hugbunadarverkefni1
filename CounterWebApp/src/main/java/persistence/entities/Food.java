package persistence.entities;
import java.util.Date;

public class Food{
  private String name;
	private String gategory;
	private String typeofmeal;


	public Food (String name, String category, String typeofmeal){
    this.name=name;
    this.category=category;
    this.typeofmeal=typeofmeal;

	}

	public String getName(){
		return name;
	}

	public String getCategory(){
		return category;
	}

	public String getTypeOfMeal(){
		return typeofmeal;
	}
}
