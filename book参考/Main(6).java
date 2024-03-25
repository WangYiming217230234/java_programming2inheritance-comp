import  java.util.Scanner;


//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Please enter an expression using only parentheses: ");
        Scanner reader = new Scanner(System.in);

        String expression = reader.nextLine();

        BalanceParentheses balance = new BalanceParentheses();
        balance.balanceParentheses(expression);
        reader.close();
    }

}