package persistence.entities;
import java.util.Date;
import java.util.ArrayList;

public class Exercises{
  private String name;
	private String category;
	private ArrayList<Set> set;
  //Exercises extendar set SKOÐA BETUR


	public Exercises (String name, String category, ArrayList<Set> set){
	    this.name=name;
	    this.category=category;
	    this.set=set; // Skoða betur!!!

	}

	public String getName(){
		return name;
	}

	public String getCategory(){
		return category;
	}

	public ArrayList<Set> getSet(){
		return set;// SKOÐA
	}
}
