package flyWeightPattern;

public abstract class ChessAbsFlyWeight {
	private String color;
	private String local;

	public ChessAbsFlyWeight(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public abstract void chess_state();

}
