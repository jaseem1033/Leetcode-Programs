class Solution {
    private String repeat(String s, int count) {
        StringBuilder temp = new StringBuilder();
        for(int i = 1; i <= count; i++) {
            temp.append(s);
        }
        return temp.toString();
    }

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c != ']') stack.push(c+ "");
            else {
                StringBuilder temp = new StringBuilder();

                while(!(stack.peek() + "").equals("["))
                    temp.insert(0, stack.pop());

                stack.pop();

                StringBuilder count = new StringBuilder();

                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    count.insert(0, stack.pop());
                }
                int p = Integer.parseInt(count.toString());
                stack.push(repeat(temp.toString(), p));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}