package _5FactorialZeros;


class FactorialZeros{
    public static int trailingZeroes(int n) {
        if(n == 0){
            return 0;
        }   
        return n/5 + trailingZeroes(n/5);
    }
}