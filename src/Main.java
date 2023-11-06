public class Main {
    public static void main(String[] args) {
        demoQuadraticEquation();
    }

    static void demoQuadraticEquation() {
        QuadraticEquation equation1 = new QuadraticEquation(4, 1, 3);
        System.out.println(equation1);
        if (equation1.isQuadratic()) {
            System.out.println("Уравнение квадратное");
        } else {
            System.out.println("Уравнение не квадратное");
        }

        QuadraticEquation equation2 = new QuadraticEquation(-7, 0, 2);
        System.out.println(equation2);
        if (equation2.isQuadratic())
            System.out.println("Уравнение квадратное");
        else
            System.out.println("Уравнение не квадратное");

        QuadraticEquation equation3 = new QuadraticEquation(0, 9, 0);
        System.out.println(equation3);
        if (equation3.isQuadratic())
            System.out.println("Уравнение квадратное");
        else
            System.out.println("Уравнение не квадратное");

    }
}