class Student{
String name;
int maths;
int sci;
int eng;
int avg;


Student(String nam,int m, int s, int e){
name= nam;
maths=m;
sci=s;
eng=e;
}

public static void main(String args[]){

Student obj = new Student("Shivani",7,6,5);


obj.marks();
obj.display();


}

void marks(){
avg=(maths+sci+eng)/3;
}

void display(){
System.out.println(name);
System.out.println(avg);
}

}