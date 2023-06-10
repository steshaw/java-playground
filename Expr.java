sealed interface Expr {
    public record Constant(int i) implements Expr {}
    public record Add(Expr left, Expr right) implements Expr {}

    static int eval(Expr expr) {
        return switch(expr) {
            case Constant(var i) -> i;
            case Add(var l, var r) -> eval(l) + eval(r);
        };
    }

    static void main(String[] args) {
        var expr = new Add(new Constant(1), new Add(new Constant(20), new Constant(21)));
        System.out.println(String.format("%s = %d", expr.toString(), eval(expr)));
    }
}
