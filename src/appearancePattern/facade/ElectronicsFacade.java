package appearancePattern.facade;

import appearancePattern.subSystemComponent.Amplifier;
import appearancePattern.subSystemComponent.DvdPlayer;
import appearancePattern.subSystemComponent.Projector;

/**
 * 电子台外观类
 * 
 * @author BillGL
 *
 */
public class ElectronicsFacade {
	private Projector projector;
	private Amplifier amp;
	private DvdPlayer dvd;

	public ElectronicsFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicsFacade(Projector projector, Amplifier amp, DvdPlayer dvd) {
		super();
		this.projector = projector;
		this.amp = amp;
		this.dvd = dvd;
	}

	public void watchFilm(String movie) {
			projector.on();
			projector.wideScreenMode();
			amp.on();
			amp.setSurroundSound();
			amp.setVolume(6);
			dvd.on();
			dvd.play(movie);
	}
	
	
	public void endFilm(){
		System.out.println("shutting now ......");
		projector.off();
		amp.off();
		dvd.stop();
		dvd.off();
	}
}
