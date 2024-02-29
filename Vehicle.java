class Vehicle{

int price;
String colors;
int model;

Vehicle(int p, String c,int m)
{
price=p;
colors=c;
model=m;
}


public static void main(String args[]){
Vehicle obj= new Vehicle(25,"Pink",123);
obj.display();
}

void display(){
System.out.println(price+colors+model);
}
}