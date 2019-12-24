package ProxyPattern.staticProxy;

public class Proxy implements Printable{
	Printer printer=null;
	String printerName=null;
	@Override
	public synchronized void setPrinterName(String name) {
		//代理能自己完成的工作自己做
		if(printer!=null)
			printer.setPrinterName(name);
		
		printerName=name;
	}

	@Override
	public String getPrinterName() {
		//代理自己能完成的工作自己做
		
		return printerName;
	}

	@Override
	public void print(String mesg) {
		//交由真正对象打印消息
		check();
		printer.print(mesg);
		
	}
	
	public void check(){
		if(printer==null){
			System.out.println("正在生成打印机实例");
			printer=new Printer(printerName);
		}
		else
			System.out.println("存在打印机实例");
			
	}

}
