package Patterens;

public class pattern1 {

    public static void main(String[] args) {
        pattern(5);
    }
    static  void pattern(int n){
        for (int i = 0; i <2*n; i++) {
            int totalCols=i>n?2*n-i:i;
            int totalSpace=n-totalCols;
            for(int s=0; s<totalSpace;s++){
                System.out.print(" ");
            }
            for (int j = 0; j <totalCols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    static  void pattern(int n){
//        for (int i = 0; i <2*n; i++) {
//            int totalCols=i>n?2*n-i:i;
//            for (int j = 0; j <totalCols ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
}
