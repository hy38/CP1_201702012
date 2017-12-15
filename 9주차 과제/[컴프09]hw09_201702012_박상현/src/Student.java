class Student {
	public String name;
	public int hak_bun;
	public String 소속_학과;
	public int gradeLevel;
	public int 이수_학점수; //모든 학생은 이름, 학번 ,소속학고, 학년, 이수학점수를 가진다.

	public Student(){
		name = "박상현";
		hak_bun =201702012;
		소속_학과 = "컴퓨터공학과";
		gradeLevel = 1;
		이수_학점수 = 35; //적절한 생성자 작성(1).
	}

	public Student(String name, int hak_bun, int gradeLevel){
		this.name = name;
		this.hak_bun = hak_bun;
		소속_학과 = "선박공학과";
		this.gradeLevel = gradeLevel;
		이수_학점수 = 35; //적절한 생성자 작성(2).
	}
	
	public String toString(){ //객체의 모든 정보 출력 메소드.
		return name + "\n학번 : " + hak_bun + "\n" + 소속_학과 + "\n" + gradeLevel + "학년\n" + 이수_학점수 + "학점";
	}
	
	public void setName(String name) { this.name = name; }
	public void setHak_Bun(int hak_bun) { this.hak_bun = hak_bun; }
	public void set소속_학과(String 소속_학과) { this.소속_학과 = 소속_학과; }
	public void setGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
	public void set이수_학점수(int 이수_학점수) { this.이수_학점수 = 이수_학점수; } //적절한 변경자 메소드 작성.

	public String getName() {	return name; }
	public int getHak_Bun() { return hak_bun; }
	public String get소속_학과() { return 소속_학과;	}
	public int getGradeLevel() { return gradeLevel; }
	public int get이수_학점수() { return 이수_학점수; } //적절한 접근자 메소드 작성.

}
