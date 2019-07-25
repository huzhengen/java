public class Main{
	public static void main(String[] args){
		Person ming = new Person();
		ming.setName("xiao ming");
		ming.setAge(11);
		System.out.println(ming.getName() + ", " + ming.getAge());
	}
}

class Person{
	private String name;
	private int age;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		if(age<0 || age>100){
			throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
	}
}