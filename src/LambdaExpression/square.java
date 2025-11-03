package LambdaExpression;

class square implements Shape{
    public void printName(){
        System.out.println("I am Square");
    }

    public static void main(String[] args) {
        Shape s1 = new square();
        s1.printName();

        //lamda -> para->fxn body;
        Shape s2 = () -> System.out.println("I am Triangle");
        Shape s3 = () -> {
            System.out.println("I am Rectangle");
            System.out.println("I am Hexagon");
            System.out.println("I am Rhombus");
        };
        s2.printName();
        s3.printName();
    }
}
