public class TurtleDraw {
    static boolean is_zero(double x) {
        return Math.abs(x - 0) < 1e-6;
    }

    public static void main(String args[]) {
        Turtle turtle = new Turtle();
        turtle.fillColor("red");
        turtle.penColor("yellow");
        while (true) {
            turtle.forward(310);
            turtle.left(190);
            if (is_zero(turtle.getX()) && is_zero(turtle.getY())) {
                break;
            }
        }
    }
}
