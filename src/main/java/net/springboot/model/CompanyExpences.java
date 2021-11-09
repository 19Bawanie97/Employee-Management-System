package net.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyExpences {
	@Id
	private int id;
	private String name;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "CompanyExpences [id="+id+", name="+name+",amount="+amount+"]";
	}
	
}
