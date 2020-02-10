package builderPattern.product;

/**
 * 改进后的建造者版本v.2
 * 
 * @author BillGL
 *
 */
public class BikeV2 {
	private String frame;
	private String tire;
	private String seat;

	private BikeV2(BikeBuilder builder) {
		frame = builder.frame;
		tire = builder.tire;
		seat = builder.seat;
	}

	@Override
	public String toString() {
		return "BikeV2 [frame=" + frame + ", tire=" + tire + ", seat=" + seat
				+ "]";
	}

	public static final class BikeBuilder {
		private String frame;
		private String tire;
		private String seat;

		public BikeBuilder() {

		}

		/**
		 * 建造各种元素
		 */
		public BikeBuilder frame(String val) {
			frame = val;
			return this;
		}

		public BikeBuilder tire(String val) {
			tire = val;
			return this;
		}

		public BikeBuilder seat(String val) {
			seat = val;
			return this;
		}

		public BikeV2 build() {
			return new BikeV2(this);//将自身对象载入bike中作为bike的属性使用
		}
	}
}
