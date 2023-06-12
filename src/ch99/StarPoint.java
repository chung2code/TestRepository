package ch99;



	
		import java.util.Scanner;

		public class StarPoint {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("정삼각형의 마지막 칸의 캣수를 입력하세요: ");
		        int n = sc.nextInt();
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n - i; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 0; k <= i; k++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		}

	


