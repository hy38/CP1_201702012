class Plane {
	private String maker; //제작사, 모델, 최대 승객의 수를 전용멤버필드 선언
	private String model;
	private int max_pass;

	public String getMaker() { //모든 필드의 접근자와 설정자 메소드를 작성(Line6~Line29)
		return maker;
	}

	public void setMaker(String m) {
		maker = m;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String n) {
		model = n;
	}

	public int getMax_Pass() {
		return max_pass;
	}

	public void setMax_Pass(int p) {
		max_pass = p;
	}

	public Plane(String maker, String model, int max_pass) { //Plane 클래스의 생성자를 3개 중복정의(Line30~Line40)
		setValue(maker, model, max_pass);
	}

	public Plane() {
		setValue("S사", "비행기100", 100);
	}

	public Plane(int max_pass) {
		setValue("A사", "비행기1", max_pass);
	}

	static int planes = 0; //생성된 비행기 수를 나타내는 정적변수 planes 추가

	public static int getPlanes() { //정적변수 planes를 반환하는 정적 메소드 getPlanes() 추가
		return planes;
	}

	public void setValue(String maker, String model, int max_pass) { //데이터를 설정하는 setValue 메소드 작성
		this.maker = maker;
		this.model = model;
		this.max_pass = max_pass;
		planes++; //**이부분**
	}

	public void print() { //print() 메소드 추가
		System.out.println(maker + "\t" + model + "\t" + max_pass);
	}

}	