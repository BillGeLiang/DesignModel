package mementoPattern.careTaker;

import mementoPattern.memento.RoleMemento;

/**
 * 备份文件管理员（读档文件）
 * @author BillGL
 *
 */
public class RoleCareTaker {
	private RoleMemento memento;

	public RoleMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleMemento memento) {
		this.memento = memento;
	}
	
	
}
