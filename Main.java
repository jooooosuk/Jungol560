package package_20201105;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int min = 1001;
		int input;
		while(cnt<10) {
			input = sc.nextInt();
			if(input<min) {
				min = input;
			}
			cnt++;
		}
		sc.close();
		System.out.println(min);

	}

}
