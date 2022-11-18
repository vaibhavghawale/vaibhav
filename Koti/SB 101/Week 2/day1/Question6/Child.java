package day1.Question6;

public class Child extends Parent{
	Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Parent parent = null;
		try {
			parent = new Parent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		parent.fun1();
	}



	
}
