package persistence.entities;
import java.util.Date;

public class Set{
  private int rep;
	private Double weight;
	private int number;


	public Set (int rep, Double weight, int number){
    this.rep=rep;
    this.weight=weight;
    this.number=number;

	}

	public int getRep(){
		return rep;
	}

	public Double getWeight(){
		return weight;
	}

	public int getNumber(){
		return number;
	}
}
