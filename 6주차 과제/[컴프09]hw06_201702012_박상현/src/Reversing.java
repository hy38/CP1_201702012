class Reversing { //Reversing class 작성
	public static String s; //매개변수 s 생성

	public static String reverse(String s) { //reverse 메소드 작성

		String reversedS = ""; //역순으로 이루어진 문자열을 공백으로 생성
		for (int k = s.length() - 1; k >= 0; k--) { //for문을 이용하여 공백인 reversedS에 s의 문자열을 뒤에서부터 하나씩 대입
			reversedS = reversedS + s.charAt(k);
		}
		return reversedS; //대입이 끝난 reversedS 의 값 반환
	}
}
