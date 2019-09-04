public class FirstTry {

    public static void main(String[] args) {
    /*int i = 1;
    int j = 2;
    while (i<=100)
        System.out.println(i+j);*/

        /*for (int k = 1; k <= 100; k++) {
            System.out.println(k);


        }



     for (int h=10; h>= -10; h--) {
         System.out.println(h);
     }

    }

         */
        int i = 1;
        int j = i++; //post increment
        System.out.println(i);
        System.out.println(j);


        int a =1;
        int b = ++a; //pre increment
        System.out.println(a);
        System.out.println(b);

        int m =1;
        int n = m--;// post decrement
        System.out.println(m);
        System.out.println(n);


        int p = 2;
        int q = --p; // pre decrement
        System.out.println(p);
        System.out.println(q);

    }
}

