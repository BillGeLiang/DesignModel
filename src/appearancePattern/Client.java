package appearancePattern;

import appearancePattern.facade.ElectronicsFacade;
import appearancePattern.subSystemComponent.Amplifier;
import appearancePattern.subSystemComponent.DvdPlayer;
import appearancePattern.subSystemComponent.Projector;

public class Client {
	public static void main(String[] args){
		ElectronicsFacade facade=new ElectronicsFacade(new Projector(),new Amplifier(), new DvdPlayer());
		facade.watchFilm("kill Bill");
		System.out.println("========·Ö½çÏß==========");
		facade.endFilm();
	}
}
