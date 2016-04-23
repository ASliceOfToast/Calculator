package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * Implements various mathematical operations over non-negative integers using iterative methods.
 *
 * @author TRINITY KEY & NATHAN SU
 */
public class IterativeMath implements Math {

    /*public int inc(int n) {
        throw new UnsupportedOperationException();
    } // inc

    public int dec(int n) {
        throw new UnsupportedOperationException();
    } // dec
   */
    public int add(int lhs, int rhs) {
        while(rhs != 0){
         lhs = inc(lhs);
         rhs = dec(rhs);
        }
        return lhs;
    } // add

    public int sub(int lhs, int rhs) {
        while(rhs != 0){
         lhs = dec(lhs);
         rhs = dec(rhs);
        }
        return lhs;
    } // sub

    public int mul(int lhs, int rhs) {
        if(lhs == 0 || rhs == 0){
         return 0;
        }
        else if(lhs == 1){
         return rhs;
        }
        else if(rhs == 1){
         return lhs;
        }
        else{
         int bs = 0;
         for(int i = rhs;i > 0;i = dec(i)){
           
           bs = add(bs,lhs);
           
         }
         return bs;
        }
    } // mul

    public int div(int lhs, int rhs) {
        if(rhs == 1){
         return lhs;
        }
        else if(lhs == rhs){
         return 1;
        }
        else if(lhs < rhs){
         return 0;
        }
        else{
         int c = 0;
         while(lhs >= rhs){
            lhs = sub(lhs,rhs);
            c = inc(c);
         }
         return c;
        }
    } // div

    public int fac(int n) {
        if(n == 0){
         return 1;
        }
        else if(n == 1){
         return 1;
        }
        else{
         for(int i = n - 1; i > 0; i = dec(i)){
          n = mul(n,i);
         }
         return n;
        }
    } // fac

    public int pow(int lhs, int rhs) {
        if(rhs == 0){
         return 1;
        }
        else if(rhs == 1){
         return lhs;
        }
        else{
         int bs = lhs;
         while(rhs > 1){
            lhs = mul(lhs,bs);
            rhs = dec(rhs);
         }
         return lhs;
        }
    } // pow

} // IterativeMath
