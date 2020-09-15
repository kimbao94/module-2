public class Reverser {
    public static void main(String[] args) {
        String input = "foo(bar)test";
        int openParentheses = input.indexOf('(');
        int closeParentheses = input.indexOf(')');
        String substring = "";
        String processed = "";
        int lastIndex = 0;
        if (openParentheses >-1 && closeParentheses > -1 && openParentheses < closeParentheses){
            lastIndex = closeParentheses;
            
            substring = input.substring(openParentheses + 1, closeParentheses);
            for (int i = substring.length() -1 ; i >= 0 ; i--) {
                processed += substring.charAt(i);
            }
        }

        processed = input.substring(0, openParentheses) + processed + input.substring(closeParentheses + 1);
        System.out.println(processed);
    }
}
