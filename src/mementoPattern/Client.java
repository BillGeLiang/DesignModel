package mementoPattern;

import mementoPattern.careTaker.RoleCareTaker;
import mementoPattern.role.Role;

public class Client {
	public static void main(String[] args){
		
		
		/**
		 * 结果：
		 * Role [hp=100, mp=200, defence=244, state=精力充沛]
			存档成功....
			==============>
			与BOSS激烈拼杀
			Role [hp=0, mp=0, defence=34, state=虚弱不堪]
			================>读取存档
			Role [hp=100, mp=200, defence=244, state=精力充沛]
			再战一次。。。。。

		 */
		
		//备份文件管理器
		RoleCareTaker taker=new RoleCareTaker();
		
		/**
		 * 创建一个角色，并给出初始状态
		 */
		Role euonyMusRole=new Role(100, 200, 244, "精力充沛");
		euonyMusRole.checkState();
		//先在备份文件管理器中存个档,提高成功率
		taker.setMemento(euonyMusRole.createMemento());
		System.out.println("存档成功....");
		System.out.println("==============>");
		//跟BOSS战斗
		euonyMusRole.fightWithBoss();
		euonyMusRole.checkState();
		System.out.println("================>读取存档");
		//发觉打不过，从存档管理器中恢复存档
		euonyMusRole.restoreMemento(taker.getMemento());
		//检查状态
		euonyMusRole.checkState();
		System.out.println("再战一次。。。。。");
	}
}
