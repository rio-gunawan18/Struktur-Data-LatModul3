package latmodul3;

public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        theStack.push(9);
        theStack.push(30);
        theStack.push(10);
        theStack.push(100);

        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
