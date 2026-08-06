class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n; 
        while (true) {
            int num = temp;
            int mul = 1;
            while (num > 0) {
                mul *= (num % 10);
                num /= 10;
            }
            if (mul % t == 0) {
                return temp;
            }
            
            temp++;
        }
    }
}