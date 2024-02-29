class Box{
int height;
int width;
int breadth;
int v;
int a;

Box(int h,int w,int b){
height=h;
width=w;
breadth=b;
}

public static void main(String arhs[]){

Box obj= new Box(10,10,10);
Box obj2= new Box(5,5,10);
obj.getVolume();
obj.getArea();
obj2.getArea();
obj2.getVolume();

}

void getVolume(){
v=height+width+breadth;
System.out.print("Volume is " +v);
}

void getArea(){
a=height*width*breadth;
System.out.println("Area is " +a);
}

}