class Dog {
	private String name; //강아지의 이름, 종류, 나이의 필드를 각각의 접근지정자를 사용하여 선언
	public static String breed;
	private int age;

	public void setValue(String name, String breed, int age) { //데이터를 설정하는 setValue 메소드 작성
		this.name = name;
		Dog.breed = breed;
		this.age = age;
	}

	public Dog(String name, int age) { //강아지 이름과 나이를 초기화하는 생성자 메소드 선언
		setValue(name, "시츄", age);
	}

	public Dog(String name, String breed, int age) { //강아지의 이름, 종류, 나이를 초기화하는 생성자 메소드 선언
		setValue(name, breed, age);
	}

	public void print() { //강아지의 정보를 출력하는 메소드 선언
		System.out.println("이름:" + name + "\n종류: " + breed + "\n나이: " + age);
	}
}