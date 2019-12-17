package builderPattern.product;
/**
 * 自行车产品
 * @author BillGL
 *
 */
public class Bike {
	/**
	 * 内容可以为各种部件（类）
	 */
	private String tire;
	private String seat;
	private String frame;
	public String getTire() {
		return tire;
	}
	public void setTire(String tire) {
		this.tire = tire;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getFrame() {
		return frame;
	}
	public void setFrame(String frame) {
		this.frame = frame;
	}
	@Override
	public String toString() {
		return "Bike [tire=" + tire + ", seat=" + seat + ", frame=" + frame
				+ "]";
	}
	
	
	
}
