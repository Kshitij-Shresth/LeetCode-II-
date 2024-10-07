class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
//Initialize the product and sum variables        
             
        while (n > 0) {
            int digit = n % 10;  
            product *= digit;    
            sum += digit;       
            n /= 10;        
        }
//Loop repeats with the new n value 1 digit short   
        
        return product - sum;  
    }
}
