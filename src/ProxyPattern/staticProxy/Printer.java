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
		System.out.println("���ɴ�ӡ��ʵ���ɹ�");
		
		
	}
	
	private void doHeavyWork(){
		System.out.println("��ǰ��ӡ�����ƣ�"+name);
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
		//���д�ӡ����
		System.out.println("��ʼ��ӡ----------------->");
		System.out.println(mesg);
		System.out.println("��ӡ�ɹ�----------------->");
		
	}

}
