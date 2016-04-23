package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * Implements various mathematical operations over non-negative integers using recursive methods.
 *
 * @author TRINITY KEY & NATHAN SU
 */
public class RecursiveMath implements Math {

    /*public int inc(int n) {
        throw new UnsupportedOperationException();
    } // inc

    public int dec(int n) {
        throw new UnsupportedOperationException();
    } // dec
*/
    public int add(int lhs, int rhs) {
        
        if(rhs == 0){
         return lhs; 
        }
        return add(inc(lhs),dec(rhs)); 
        
    } // add

    public int sub(int lhs, int rhs) {
        if(rhs == 0){
         return lhs; 
        }
        if(rhs > lhs){
         return 0; 
        }
        return sub(dec(lhs),dec(rhs)); 
    } // sub

    public int mul(int lhs, int rhs) {
        if(lhs == 0 || rhs ==0){
         return 0; 
        }
        if(lhs == 1){
         return rhs;
        }
        if(rhs == 1){
         return lhs; 
        }
        return add(lhs, mul(lhs, dec(rhs))); 
    } // mul

    public int div(int lhs, int rhs) {
        if(rhs == 1){
         return lhs;
        }
        if(rhs > lhs){
         return 0;
        }
        if(rhs == lhs){
         return 1;
        }
        return 1 + div(sub(lhs,rhs),rhs);
    } // div

    public int fac(int n) {
        if(n == 0){
         return 1;
        }
        return mul(n, fac(dec(n)));
    } // fac

    public int pow(int lhs, int rhs) {
        if(rhs == 0){
         return 1;
        }
        if(rhs == 1){
         return lhs;
        }
        return mul(lhs, pow(lhs,dec(rhs)));
    } // pow

} // RecursiveMath
