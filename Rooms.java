class Rooms{
int height=10;
int breadth=5;
int width=20;

public static void main(String args[]){

Rooms obj= new Rooms();
int k= obj.volume();
System.out.println(k);

}

int volume(){
int j=height*breadth*width;
return j;
}
}
