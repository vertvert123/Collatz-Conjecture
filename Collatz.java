public class Collatz {

    public int Rule(int a) {
        while (a != 1) {
            if (a % 2 == 1) {
                a = (a * 3) + 1;
            } else if (a == 1) {
                break;
            } else {
                a = a / 2;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        
        

    }
}