public class ArithmeticCalculator {
    private int num1;
    private int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void calculate (Operation op) {
        if (op == Operation.ADD) {
            System.out.println(num1 + num2);
        } else if (op == Operation.SUBTRACT) {
            System.out.println(num1 - num2);
        } else if (op == Operation.MULTIPLY) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Такой команды ещё нет");
        }

    }
}
