class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        for(int i = 0; i< n;i++){
            int count = 0;
            int sand = sandwiches[i];
            for(int j = 0; j<n; j++){
                if(sand == students[j]){
                    students[j] = -1;
                    count++;
                   break;
                }
            }
            if(count == 0)
                return n-i;
        }

        return 0;
    }
}