public class Fraction {

    public static class Simplify {
        int num;
        int deno;

        Simplify(int num, int deno) {
            this.num = num;
            this.deno = deno;
        }

        public static int gcd(int num, int deno) {
            int min = Math.min(num, deno);
            for (int i = min; i >= 1; i--) {
                if (num % i == 0 && deno % i == 0)
                    return i;
            }
            return min;
        }

        public void simple() {
            int hcf = gcd(num, deno);
            num /= hcf;
            deno /= hcf;
        }
        public static Simplify add( Simplify f1 ,  Simplify f2){
            int numerator = f1.num*f2.deno + f2.num*f1.deno;
            int denominator = f1.deno*f2.deno;
           Simplify f3 = new Simplify(numerator , denominator);
            return f3;



        }

    }

    public static void main(String[] args) {
        Simplify f1 = new Simplify(21, 7);
        Simplify f2 = new Simplify(35, 7);
        System.out.println("Fraction is: ");
        System.out.println(f1.num + "/" + f1.deno);
        System.out.println("after simplification: ");
        f1.simple();
        System.out.println(f1.num + "/" + f1.deno);
        System.out.println("after Addition: ");
        Simplify f3 = add(f1,f2);
        System.out.println(f3.num + "/" + f3.deno);

    }
}


//lkjhgfdkjhgfkjhg