package mementoPattern.memento;

import java.beans.FeatureDescriptor;

/**
 * 角色备份文件
 * @author BillGL
 *
 */
public class RoleMemento {
	private int hp;
	private int mp;
	private int defence;
	private String state;
	

	public RoleMemento(int hp, int mp, int defence, String state) {
		this.hp=hp;
		this.mp=mp;
		this.defence=defence;
		this.state=state;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getDefence() {
		return defence;
	}


	public void setDefence(int defence) {
		this.defence = defence;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
