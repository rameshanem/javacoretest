public class StackOverflowErrorExample {
    public void print(int myInteger) {
        System.out.println(myInteger);
        print(myInteger);
       
    }

    public static void main(String[] args) {
        StackOverflowErrorExample soee = new StackOverflowErrorExample();
        soee.print(1);
    }
}
