package persistence.entities;
import java.util.Date;
import java.util.ArrayList;

public class Day{
  private Double weight;
	private String date;
	private String wenttogym;
	private ArrayList<Exercises> exercises;
  //Dagur extendar Exercises SKOÐA BETUR


	public Day (Double weight, String date, String wenttogym, ArrayList<Exercises> exercises){
	    this.weight=weight;
	    this.date=date;
	    this.wenttogym=wenttogym;
	    this.exercises=exercises;

	}

	public Double getWeight(){
		return weight;
	}

	public String getDate(){
		return date;
	}

	public String getWentToGym(){
		return wenttogym;
	}

	public ArrayList<Exercises> getExercises(){
		return exercises;
	}
}
