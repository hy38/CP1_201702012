class Reversing { //Reversing class �ۼ�
	public static String s; //�Ű����� s ����

	public static String reverse(String s) { //reverse �޼ҵ� �ۼ�

		String reversedS = ""; //�������� �̷���� ���ڿ��� �������� ����
		for (int k = s.length() - 1; k >= 0; k--) { //for���� �̿��Ͽ� ������ reversedS�� s�� ���ڿ��� �ڿ������� �ϳ��� ����
			reversedS = reversedS + s.charAt(k);
		}
		return reversedS; //������ ���� reversedS �� �� ��ȯ
	}
}
