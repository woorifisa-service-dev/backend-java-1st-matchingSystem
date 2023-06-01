package User;
import User.Student.StudentInfo;
public class User {
	private String name;
	private int age;
	private String gender;
	private String preferred_programming_language;
	private int hourly_wage;

	public User(String name, int age, String gender, String preferred_programming_language, int hourly_wage) {
	    this.name = name;
	    this.age = age;
	    this.gender = gender;
	    this.preferred_programming_language = preferred_programming_language;
	    this.hourly_wage = hourly_wage;
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

	public String getGender() {
	    return gender;
	}

	public void setGender(String gender) {
	    this.gender = gender;
	}

	public String getPreferred_programming_language() {
	    return preferred_programming_language;
	}

	public void setPreferred_programming_language(String preferred_programming_language) {
	    this.preferred_programming_language = preferred_programming_language;
	}

	public int getHourly_wage() {
	    return hourly_wage;
	}

	public void setHourly_wage(int hourly_wage) {
	    this.hourly_wage = hourly_wage;
	}


	@Override
	public String toString() {
	    return "User{" +
	            "name='" + name + '\'' +
	            ", age=" + age +
	            ", gender='" + gender + '\'' +
	            ", preferred_programming_language='" + preferred_programming_language + '\'' +
	            ", hourly_wage=" + hourly_wage +
	            '}';
	}
}
