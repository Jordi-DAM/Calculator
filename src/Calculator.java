
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){if (b==0){
        System.out.println("Error, no es pot dividir entre 0 "); return 0;
    } else return a/b;
    }
    public int modulus(int a, int b){
        return a%b;
    }

    public double sqrt (double a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 6));
    }
}