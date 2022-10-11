public class Main {

    public static void main(String[] args)  {
        //  task1 ex1 = new task1();
        //  System.out.println(ex1.fac1(2));
        // System.out.println(Math.exp(1));

        // task2 ex2 = new task2();
        // System.out.println(ex2.fac2(0.03, 1));
        //System.out.println(Math.exp(0.03));

        // task3 ex3 = new task3();
        // System.out.println(ex3.fac3(4, 6));
        //System.out.println(Math.sin(4));

        // task4 ex4 = new task4();
        // System.out.println(ex4.fac4(0.2, 5));
        // System.out.println(Math.cos(0.2));

        // task5 ex5 = new task5();
        // System.out.println(ex5.fac5(0.1, 8));
        //System.out.println(Math.log(1.1));

        // task6 ex6 = new task6();
        // System.out.println((ex6.fac6(0.01, 1)));
        // System.out.println(Math.atan(0.01));

        // task7 ex7 = new task7();
        // System.out.println((ex7.fac7(1, 1)));
        // System.out.println(Math.asin(1));

        //task8 ex8 = new task8();
        // System.out.println(ex8.fac8(0.01, 5));
        // System.out.println(Math.sqrt(1.01));

        // task11 ex11 = new task11();
        // System.out.println(ex11.fac11(4));

        //  task12 ex12= new task12();
        // System.out.println(ex12.fac12(3));

        // task13 ex13 = new task13();
        //System.out.println(ex13.fac13(34));

        // task14 ex14 = new task14();
        //  System.out.println(ex14.fac14(4));

        //task15 ex15 = new task15();
        // System.out.println(ex15.fac15(4));

        // task16 ex16 = new task16();
        //System.out.println(ex16.fac16(2, 3));

        // task17 ex17 = new task17();
        // System.out.println(ex17.fac17(3));


    }

    public static int factorial(int n) {
        if (n==1) return n;
        return n * factorial(n-1);
    }
    public static class task1 {
        public double fac1(int n){
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp += 1.0/factorial(i);
            }
            return temp;
        }
    }

    public static class task2 {
        public double fac2(double x, int n){
            double sum = 1;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(x, i)/factorial(i);
            }
            return sum;
        }
    }

    public static class task3 {
        public double fac3(double x, int n){
            double temp = x;
            for (int i = 1; i <= n; i++) {
                temp += (Math.pow(-1, i) * Math.pow(x, (2*i+1)))/factorial(2*i+1);
            }
            return temp;
        }
    }

    public static class task4 {
        public double fac4(double x, int n){
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            }
            return temp;
        }
    }

    public static class task5 {
        public double fac5(double x, int n){
            double temp = 0;
            for (int i = 1; i <= n; i++) {
                int sign = (int) Math.pow(-1, (i - 1));
                temp += (sign * Math.pow(x, i)) / i;
            }
            return temp;
        }
    }

    public static class task6 {
        public double fac6(double x, int n){
            double temp = x;
            for (int i = 1; i <= n; i++) {
                temp +=  Math.pow(-1, i) * Math.pow(x, (2*i+1)) / (2*i+1);
            }
            return temp;
        }
    }

    public static class task7 {
        public double fac7(double x,int n) {
            double temp = x;

            for (int i = 1; i <= n; i++) {
                temp += ((2 * i - 1) * Math.pow(x, 2 * i + 1)) / ((2 * i) * (2 * i + 1));
            }
            return temp;
        }

    }

    public static class task8 {
        public double fac8(double x, int n) {
            double temp = 1;
            for (int i = 1; i <= n; i++) {
                temp -= Math.pow(-1, i-1) *(2*i - 3 )* (Math.pow(x, i) )/ (2 * i);
            }
            return temp;

        }
    }

    public static class task11 {
        public char fac11(int n) {
            double[] A = new double[n+1];
            A[0]=2;
            for (int i =1; i < n+1; i++) {
                A[i]=2+1/A[i-1];
                System.out.println(A[i]);
            }
            return 0;
        }
    }

    public static class task12 {
        public char fac12(int n) {
            double[] A = new double[n+1];
            A[0]=1;
            for (int i =1; i < n+1; i++) {
                A[i]=(A[i-1]+1)/i;
                System.out.println(A[i]);
            }
            return 0;
        }
    }

    public static class task13 {
        public char fac13(int n) {
            int[] F = new int[n+1];
            F[1]=1;
            F[2]=1;
            System.out.println(F[1]);
            System.out.println(F[2]);
            for (int i =3; i < n+1; i++) {
                F[i]=F[i-2]+F[i-1];
                System.out.println(F[i]);
            }
            return 0;
        }
    }

    public static class task14 {
        public char fac14(int n) {
            int[] A = new int[n];
            A[0]=1;
            A[1]=2;
            System.out.println(A[0]);
            System.out.println(A[1]);
            for (int i =2; i < n; i++) {
                A[i]=(A[i-2]+2*A[i-1])/3;
                System.out.println(A[i]);
            }
            return 0;
        }
    }

    public static class task15 {
        public char fac15(int n) {
            double[] A = new double[n+1];
            A[1]=1;
            A[2]=2;
            A[3]=3;
            System.out.println(A[1]);
            System.out.println(A[2]);
            System.out.println(A[3]);
            for (int i =4; i < n+1; i++) {
                A[i]=A[i-1]+A[i-2]-2*A[i-3];
                System.out.println(A[i]);
            }
            return 0;
        }
    }

    public static class task16 {
        public double fac16(int n, int k) {
            double temp = 0;
            for (int i =1; i <= n; i++) {
                temp += Math.pow(i, k);
            }
            return temp;
        }
    }

    public static class task17 {
        public double fac17(double n) {
            double temp = 0;
            for (int i =1; i <= n; i++) {
                temp += Math.pow(i, i);
            }
            return temp;
        }
    }


}
