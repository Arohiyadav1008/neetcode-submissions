class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                //open
                stk.push(c);
            }
            else{
                //close
                if(stk.isEmpty()){
                    return false;
                }
                else{
                    if((c==')' && stk.peek()=='(')|| (c=='}' && stk.peek()=='{') || (c==']' && stk.peek()=='[')){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stk.isEmpty();   
    }
}