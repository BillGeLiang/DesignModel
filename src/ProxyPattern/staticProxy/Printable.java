package ProxyPattern.staticProxy;
/**
 * �����������ͬʵ�ֵĽӿ�
 * @author BillGL
 *
 */
public interface Printable {
	public void setPrinterName(String name);
	public String getPrinterName();
	public void print(String mesg);
}
