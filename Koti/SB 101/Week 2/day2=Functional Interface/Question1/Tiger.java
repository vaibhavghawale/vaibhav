package day2.Question1;

public class Tiger extends Animal {

	@Override
	void eat() {
		System.out.println("Tigeris eating !!");
		
	}
	public static void main(String[] args) {
		try {
			Animal a1=new Tiger();
			a1.eat();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
