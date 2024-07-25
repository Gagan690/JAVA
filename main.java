public class RightAnglePyramid{
    public static void main(String[] args){
        Pyramid();
    }

    static void Pyramid(){
        int num = 4;
        for (int q = 1; q <= num ; q++){
            for (int w = q; w < num; w++){
            }
            for (int e = 1; e <= q ; e++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}