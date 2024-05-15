class demo {
    public void AlizasPUBLIC(){ // no return type kyun k void agaya
    System.out.println("public function hai object banaoge toh call hoga");
    }

    static void AlizasSTATIC(){
    System.out.println("Static method hai no need to create object");
    }

    public void OOPMARKS(int marks){
    System.out.println("OOP MARKS" + marks);
    }

    public static void main (String[] args){
    demo myobj = new demo();
    myobj.AlizasPUBLIC(); //public functions hein isslye object banaya
    myobj.OOPMARKS(78);
    demo.AlizasSTATIC(); //static method tha issylye object k naam se call nhi
    kiya
    //although, static method ko hum class k naam se call krskte hein
    }

    // CONSTRUCTORS
    int x;
    int y;
    demo(int y){
    x = y; //x nikaal rahe hein
    }

    public static void main(String[] args) {
    demo myobj1 = new demo(6);
    System.out.println(myobj1.y); //y=0
    System.out.println(myobj1.x); //x=6
    }

    int x;
    int y;

    demo(int x) {
        x = y; // x nikaal rahe hein
    }
    public static void main(String[] args) {
        demo myobj1 = new demo(6);
        System.out.println(myobj1.y); // y=0
        System.out.println(myobj1.x); // x=0
    }
}






