package day2.Question4;

import java.util.ArrayList;
import java.util.List;

public class Main {

		public static void main(String[] args) {
			
		List<String> city = new ArrayList<>();
			
			city.add("Nandigama");
			city.add("Nuzvid");
			city.add("Krishna");
			city.add("Amaravti");
			city.add("Hyderabad");

			Main c1=new Main();
			c1.display(city);
		}
		private void display(List<String> city) {
			
			System.out.println(city);

		}

	}

