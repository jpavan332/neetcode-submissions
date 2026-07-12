class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        int sum = 0;
        for(String curr : operations){
            switch(curr){
                case "+" -> {
                    int firstTop = st.pop();
                    int secondTop = st.peek();
                    int tempSum = firstTop + secondTop;
                    st.push(firstTop);
                    st.push(tempSum);
                    sum+=tempSum;

                }
                case "D" -> {
                    int mul = 2 * st.peek();
                    st.push(mul);
                    sum+=mul;
                }
                case "C" ->{
                    int invalidNum = st.pop();
                    sum-=invalidNum;
                }
                default -> {
                    int num = Integer.parseInt(curr);
                    st.push(num);
                    sum+=num;

                }
            }
        }

        return sum;
    }
}