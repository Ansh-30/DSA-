public class patterns {
    static void main() {
//       pattern1();
//       pattern2();
//        pattern3();
//         pattern4();
//         pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
//        pattern9();
        pattern10();
    }

    static void pattern1() {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        int n = 4;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern3() {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7() {
        int n = 5;
        for (int i = 0; i < n ; i++) {
            System.out.print(" ");

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void pattern8(){
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern9() {
        int n = 4;

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n ; j++) {
                if((i+j)%2==0) {
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
    static void pattern10(){
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i; j++) {
                    if((i+j)%2==0){
                        System.out.print("* ");
                    }

            }
            System.out.println();

        }
    }
}

