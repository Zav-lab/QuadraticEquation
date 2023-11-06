import java.util.*;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        if (a == 0 && b == 0 && c == 0)
            return "Не квадратное уравнение";
        else if (a == 0) {
            if (b == 0) return "c = " + c;
            else return "bx + c = " + c + " где b = " + b;
        } else {
            double discriminant = Math.pow(b, 2) - (4 * a * c);
            StringBuilder result = new StringBuilder();
            result.append("ax^2 + bx + c = 0, где a = ").append(a);
            if (b != 0) result.append(" , b = ").append(b);
            result.append(", а c = ").append(c);
            if (discriminant < 0)
                result.append(" Нет корней");
            else if (discriminant == 0)
                result.append(" Один корень");
            else
                result.append(" Два корня");
            return result.toString();
        }
    }

    public boolean isQuadratic() {
        return a != 0;
    }
}

