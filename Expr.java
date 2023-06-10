sealed interface Expr {
    public record Constant(int i) implements Expr {}
    public record Add(Expr left, Expr right) implements Expr {}

    static int eval(Expr expr) {
        return switch(expr) {
            case Constant c -> c.i;
            case Add add -> eval(add.left) + eval(add.right);
        };
    }

    static void main(String[] args) {
        var expr = new Add(new Constant(1), new Add(new Constant(20), new Constant(21)));
        System.out.println(String.format("%s = %d", expr.toString(), eval(expr)));
    }
}
