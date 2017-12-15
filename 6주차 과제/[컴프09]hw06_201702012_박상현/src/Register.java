import java.util.Scanner; //Scanner class import
class Register { //Register class 작성
	Scanner input = new Scanner(System.in); //Scanner class 생성
	String ID1, ID2, PW1, PW2; //회원가입할 ID, PW와 로그인할 ID, PW 변수를 각각 String형으로 생성
	
	public void getInformations(){ //getInformations 메소드 생성
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오: ");
		ID1 = input.next();
		System.out.print("비밀번호를 입력하시오: ");
		PW1 = input.next();

		System.out.println("<로그인>");
		System.out.print("아이디를 입력하시오: ");
		ID2 = input.next();
		System.out.print("비밀번호를 입력하시오: ");
		PW2 = input.next();
	}
	
	public void isEqual(){ //isEqual 메소드 생성
		if(ID1.equals(ID2) && PW1.equals(PW2)) //if문을 사용하여 ID1과 ID2, PW1과 PW2 비교
			System.out.println("로그인에 성공하였습니다.");
		else //둘다 같을 경우에만 로그인이 성공하도록 함.
			System.out.println("로그인에 실패하였습니다.");
		
	}
}
