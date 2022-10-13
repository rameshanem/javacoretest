
class ThrowKeyWord{

 void run (int a){

if (a==18){

throw new ArithmeticException ("you are entered right  pin");

}
else {
System.out.println("your phone is opened");

}


}

public static void main(String[] args){

ThrowKeyWord mn = new ThrowKeyWord();
mn.run(18);

System.out.println("hii successfully completed this program");

}

}
