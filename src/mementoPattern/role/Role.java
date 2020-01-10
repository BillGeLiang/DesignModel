package mementoPattern.role;

import mementoPattern.memento.RoleMemento;

/**
 * 角色
 * 
 * @author BillGL
 *
 */
public class Role {
	// 血量
	private int hp;
	// 魔量
	private int mp;
	// 防御
	private int defence;
	// 状态
	private String state;

	public Role(int hp, int mp, int defence, String state) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.defence = defence;
		this.state = state;
	}
	
	
	public void fightWithBoss(){
		System.out.println("与BOSS激烈拼杀");
		this.hp=0;
		this.mp=0;
		this.defence=34;
		this.state="虚弱不堪";
		
	}
	

	/**
	 * 通过备份还原
	 * 
	 * @param memento
	 */
	public void restoreMemento(RoleMemento memento) {
		this.hp = memento.getHp();
		this.mp = memento.getMp();
		this.defence = memento.getDefence();
		this.state = memento.getState();
	}

	/**
	 * 创建备份
	 * 
	 * @return
	 */
	public RoleMemento createMemento() {
		return new RoleMemento(hp, mp, defence, state);
	}


	/**
	 * 检查状态
	 * @return
	 */
	public void checkState() {
		System.out.println( "Role [hp=" + hp + ", mp=" + mp + ", defence=" + defence
				+ ", state=" + state + "]");
	}
	
	
}
