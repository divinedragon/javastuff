package jdk8.lynda.chap02;

public class Topic05__Person {

	private String name;

	private int age;

	public Topic05__Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	public static int compareAges(Topic05__Person p1, Topic05__Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}
}
