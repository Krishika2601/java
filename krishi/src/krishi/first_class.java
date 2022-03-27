package krishi;

public class first_class {

	public static void main(String[] args) {
	student f1=new student(12,"kamini" ,78);
	student f2=new student(50,"shinu",84);
	System.out.println(student.count);
	//f1.name="krishika";
	//f1.rollno=129;
	//f1.percentage=(float) 74.6;
//	f2.name="shashank";
	//f2.rollno=136;
	//f2.percentage=(float)83.4;
	
f1.display();
f2.display();

	}

}
 class student {
String name;
int rollno;
float percentage;
static int count=0;
student(int a,String x,float y){
	name=x;
	rollno=a;
	percentage=y;
	count++;
}
void display() {
	System.out.println("My name is "+name+ " and my rollno is "+rollno+" and i m having "+percentage+ " percentage");
}
}
