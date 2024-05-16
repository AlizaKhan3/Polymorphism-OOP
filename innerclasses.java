class OuterM{
    public void display(){
        System.out.println("Outer class ");
    }
    private class Inner1{              //Inner class declared as private only accessible within class
        public void show(){
            System.out.println("Inner Output Accessed in same class");
        }
    }

    public static void main(String[] args) {
        OuterM obj = new OuterM();
        OuterM.Inner1 obj1 = obj.new Inner1();

        obj1.show();
        obj.display();
    }
}

// public class test{                                    //Error, because inner class is private
//     public static void main(String[] args) {
//         OuterM obj = new OuterM();
//         OuterM.Inner1 obj1 = obj.new Inner1();        //Error, because inner class is private

//         obj1.show();                                  //Error, Cant access inner class (hidden data)
//     }
// }
//----------------------------------------------------------



//Staic Inner Class Example
class OuterM{
    public void display(){
        System.out.println("Outer class ");
    }
    static class Inner1{              //Inner class declared as STATIC 
        public void show(){
            System.out.println("Inner Output ");
        }
    }

    public static void main(String[] args) {
        // OuterM obj = new OuterM();                   //No need to create object 
        OuterM.Inner1 innerobj = new Inner1();

        // OuterM.show();
        innerobj.show();
    }
}
