package ProxyPattern.staticProxy;
/**
 * 服务器与代理共同实现的接口
 * @author BillGL
 *
 */
public interface Printable {
	public void setPrinterName(String name);
	public String getPrinterName();
	public void print(String mesg);
}
