class Solution {
    public String removeStars(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        StringBuilder ans=new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch!='*'){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            ans=ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}