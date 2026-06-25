//2798. Number of Employees Who Met the Target
//https://leetcode.com/problems/number-of-employees-who-met-the-target/

public class NoOfEmpMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }
}
