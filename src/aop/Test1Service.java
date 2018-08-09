package aop;

public class Test1Service implements TestServiceInter,TestServiceInter2 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayhello() {
		// TODO Auto-generated method stub
		System.out.println("hi "+name);
	}
	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("bye "+name);
//異常通知測試使用		
//		int i=9/0;
	}

}
