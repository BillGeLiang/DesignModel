package ProxyPattern.staticProxy;

public class Printer implements Printable{
	private String name;
	
	
	public Printer(){
		super();
	}
	
	public Printer(String name) {
		super();
		this.name = name;
		doHeavyWork();
		System.out.println("生成打印机实例成功");
		
		
	}
	
	private void doHeavyWork(){
		System.out.println("当前打印机名称："+name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setPrinterName(String name) {
		this.name=name;
		
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String mesg) {
		//进行打印工作
		System.out.println("开始打印----------------->");
		System.out.println(mesg);
		System.out.println("打印成功----------------->");
		
	}

}
