public class HelloWorld {

    public static void main(String[]args){
        System.out.println("Hello World");

        int input[] = {3,4,48,0};
        int a = input[2]-input[1];
        int b = input[1]*input[2];
        int c = b/a;
        int d = b%a;
        b = ++c * a++ + d--;
        int[]output = new int[4];
        output[2]=b;
    }
}
