class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int squareSand = 0;
        int circleSand = 0;

        int cnt[] = new int[2];
        for(int i = 0; i< n;i++){
          cnt[students[i]]++;
        }
        System.out.println("circleSand"+circleSand+"squareSand"+squareSand);
        int temp = n;
        for(int i = 0; i< n; i++){
            if(cnt[sandwiches[i]] > 0){
              cnt[sandwiches[i]]--;
              temp--;
            }else{
                break;
            }
        }

        return temp;
    }
}