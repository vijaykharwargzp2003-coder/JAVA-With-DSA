public class Pattern {

    public static void hollow_rectangle(int totRows, int totCols) {
        // Outer loop
        for (int i = 1; i <= totRows; i++) {
            //Inner loop - column
            for (int j = 1; j <= totCols; j++) {

                //cell (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void inverted_half_pyramid_withNumbers(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }

    public static void floyds_tringle(int n) {

        //outer
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            //inner
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();


        }
    }

    public static void Zero_one_trangle(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {//even
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");

                }
            }
            System.out.println();
        }

    }

    public static void Butterfly(int n) {
        //first Half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //star-1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //space-2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            System.out.print("*");

            //star-1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //space-2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //hollow rectangle-stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void Diamond (int n){
        //1st half
        //outer loop
        for(int i =1; i<=n; i++){
            //space
            for(int j=1;j<=(n-1);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half

        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-1);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }





        public static void main (String [] args){
            //hollow_rectangle(4,5);
            // inverted_rotated(4);
            // inverted_half_pyramid_withNumbers(5);
           // floyds_tringle(5);
            //Zero_one_trangle(5);
            //Butterfly(5);
            //solid_rhombus(5);
            //hollow_rhombus(5);
            Diamond(4);
        }
    }

