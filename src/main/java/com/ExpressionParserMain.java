package com;

public class ExpressionParserMain {

    public static void main(String[] args) throws Exception {
        com.compiler.Lexer lexer = new com.compiler.Lexer();
        com.compiler.ExpressionParser parser = new com.compiler.ExpressionParser(lexer);
        com.compiler.ast.ASTExprNode expr = parser.parseExpression("0 ? (38*4+2) : 30 + 12");
        int result = expr.eval();
        System.out.println(result);
    }

}
