package ProxyPattern.staticProxy;

public class Proxy implements Printable{
	Printer printer=null;
	String printerName=null;
	@Override
	public synchronized void setPrinterName(String name) {
		//�������Լ���ɵĹ����Լ���
		if(printer!=null)
			printer.setPrinterName(name);
		
		printerName=name;
	}

	@Override
	public String getPrinterName() {
		//�����Լ�����ɵĹ����Լ���
		
		return printerName;
	}

	@Override
	public void print(String mesg) {
		//�������������ӡ��Ϣ
		check();
		printer.print(mesg);
		
	}
	
	public void check(){
		if(printer==null){
			System.out.println("�������ɴ�ӡ��ʵ��");
			printer=new Printer(printerName);
		}
		else
			System.out.println("���ڴ�ӡ��ʵ��");
			
	}

}
