import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner class 생성
		Reversing r = new Reversing(); // Reversing class 생성

		String str; //입력받은 문자열을 저장할 변수 str 생성

		System.out.println("문자열을 입력하시오: "); 
		str = input.next(); //입력받은 문자열을 str에 저장

		System.out.println(r.reverse(str)); //reverse 클래스에 str 값 입력
	}

}
