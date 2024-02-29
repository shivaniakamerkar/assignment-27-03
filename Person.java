class Person{
int age;
double height;
char weight;

Person(int a){
age=a;

}

Person(double h){
height=h;
}

Person(char w){
weight=w;

}

public static void main(String args[]){

Person obj= new Person(5);
Person objj=new Person(6.90);
Person objjj=new Person('S');
obj.display();
 
}
void display(){
System.out.println(age);
System.out.println(height);
System.out.println(weight);
}
}
