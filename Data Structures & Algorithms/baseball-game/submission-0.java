class Solution {
    public int calPoints(String[] operations) {
        int res[] = new int[operations.length];
        int sum = 0;
        for(int i = 0,j=0; i< operations.length; i++){
            try {
                res[j] = Integer.parseInt(operations[i]); //[1] j = 1; [1,2] j = 2; [1,2,5]
                sum+= res[j]; // sum = 8
                j++; // j = 3

            }catch(Exception e){
                if(operations[i].equals("+")){
                    res[j] = res[j-2] + res[j-1]; // 1,2,3
                    sum+= res[j]; // 6
                    j++; // j = 3
                }
                if(operations[i].equals("C")){
                    sum-=res[j-1]; // sum = 3
                    j = j -1; // j = 2
                }
                if(operations[i].equals("D")){
                    res[j] = res[j-1] * 2; // 1,2,5,10
                    sum+=res[j]; // sum = 18
                    j++;
                }
            }
        }

        return sum;
        
    }
}