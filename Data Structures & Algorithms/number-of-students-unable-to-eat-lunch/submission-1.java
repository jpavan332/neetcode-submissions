class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int squareSand = 0;
        int circleSand = 0;
        for(int i = 0; i< n;i++){
           if(students[i] == 0)
                circleSand++;
            if(students[i] == 1)
                squareSand++;
        }
        System.out.println("circleSand"+circleSand+"squareSand"+squareSand);
        int temp = n;
        for(int i = 0; i< n; i++){
            if(sandwiches[i] == 0 && circleSand > 0){
              circleSand--;
              temp--;
            }
            else if(sandwiches[i] == 1 && squareSand > 0 ){
             squareSand--;
             temp--;
            }
            else
                break;
        }

        return temp;
    }
}