public class RightAnglePyramid{
    public static void main(String[] args){
        ReversePyramid();
    }

    static void ReversePyramid() {
        int num = 8;
        for (int i = num; i >= 1; i--) {
            for (int h = 1; h <= i; h++) {
                System.out.print("* ");
            }
            for (int o = i; o < num; o++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}