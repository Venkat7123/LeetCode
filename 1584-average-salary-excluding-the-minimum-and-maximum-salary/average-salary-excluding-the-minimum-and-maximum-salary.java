class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0];
        double sum = 0;
        for(int i : salary){
            sum += i;
            if(i < min) min = i;
            else if(i > max) max = i;
        }
        sum -= (min + max);
        double avg = sum / (salary.length - 2);
        return avg;
    }

}