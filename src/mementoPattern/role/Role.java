package mementoPattern.role;

import mementoPattern.memento.RoleMemento;

/**
 * ��ɫ
 * 
 * @author BillGL
 *
 */
public class Role {
	// Ѫ��
	private int hp;
	// ħ��
	private int mp;
	// ����
	private int defence;
	// ״̬
	private String state;

	public Role(int hp, int mp, int defence, String state) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.defence = defence;
		this.state = state;
	}
	
	
	public void fightWithBoss(){
		System.out.println("��BOSS����ƴɱ");
		this.hp=0;
		this.mp=0;
		this.defence=34;
		this.state="��������";
		
	}
	

	/**
	 * ͨ�����ݻ�ԭ
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
	 * ��������
	 * 
	 * @return
	 */
	public RoleMemento createMemento() {
		return new RoleMemento(hp, mp, defence, state);
	}


	/**
	 * ���״̬
	 * @return
	 */
	public void checkState() {
		System.out.println( "Role [hp=" + hp + ", mp=" + mp + ", defence=" + defence
				+ ", state=" + state + "]");
	}
	
	
}
