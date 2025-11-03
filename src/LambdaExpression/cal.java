package LambdaExpression;

public class cal implements Calculator{
    public int solve(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        //multiplication lambda
        Calculator c = (a,b) -> {
            return a*b;
        };
        System.out.println("Multiplication : "  + c.solve(2,5));
        Calculator sum = (a,b) -> {
            return a+b;
        };
        System.out.println("Addition : " + sum.solve(2,9));
        Calculator sub = (a,b) -> a-b;      // without return type
        System.out.println("Subtraction : " + sub.solve( 6,3));
        Number n1 = (n) -> {
          if(n % 2  == 0){
              System.out.println("Even number");
          }else{
              System.out.println("Odd number");
          }
        };
       n1.printType(6);
    }

}
