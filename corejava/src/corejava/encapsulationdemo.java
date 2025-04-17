package corejava;

public class encapsulationdemo {
	int serialnum;
	String name;
	int age;
	
	public void show() {
		System.out.println("serialnumber:"+serialnum+"\nname:"+name+"\nage: "+age);
	}
	public static void main(String[] args) {
		encapsulationdemo e=new encapsulationdemo();
		e.serialnum=20;
		e.name="Deep";
		e.age=20;
		e.show();
		}
}
