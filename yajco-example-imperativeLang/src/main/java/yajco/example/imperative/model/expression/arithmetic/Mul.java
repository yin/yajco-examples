package yajco.example.imperative.model.expression.arithmetic;

import yajco.annotation.Before;
import yajco.annotation.Operator;
import yajco.example.imperative.model.expression.BinaryOperation;
import yajco.example.imperative.model.expression.Expression;

public final class Mul extends BinaryOperation {
    @Operator(priority = 12)
    public Mul(Expression expression1, @Before("STAR") Expression expression2) {
        super(expression1, expression2);
    }

    public long eval() {
        return getExpression1().eval() * getExpression2().eval();
    }
}
