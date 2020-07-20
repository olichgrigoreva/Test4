import java.io.PrintStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        char c = 'S';
        PrintStream ps = new PrintStream(System.out);
        ps.append(c);
        ps.append('u');
        ps.append('n');
    }
}
