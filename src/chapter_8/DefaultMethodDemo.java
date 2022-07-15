package chapter_8;

public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		System.out.println("Идентификатор пользователя: " + obj.getUserID());
		
		System.out.println("Идентификатор администратора: " + obj.getAdminID());
		
		System.out.println();
		
		MyIFImp2 obj2 = new MyIFImp2();
		
		System.out.println("Идентификатор пользователя: " + obj2.getUserID());
		
		System.out.println("Идентификатор администратора: " + obj2.getAdminID());
	}
}
