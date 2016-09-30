package jdk8.lynda.chap02;

public interface Topic06__PersonInterface {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
}
