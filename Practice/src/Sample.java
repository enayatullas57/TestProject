
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;

		for (int i = 1; i < 1000; i++) {

			count = 0;
			for (int j = 2; j < i / 2; j++) {

				if (i % 2 == 0) {

					count = 1;

					break;
					
					

				}

			}
			if (count == 0) {
				System.out.println(i);

			}
			
			if (count == 1) {
				System.out.println(i +"This is primenumber values");

			}


		}

	}

}
