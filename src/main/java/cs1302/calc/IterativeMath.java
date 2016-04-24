package main.java.cs1302.calc;

/**
 * Implements various mathematical operations over non-negative integers using iterative methods.
 *
 * @author TRINITY KEY & NATHAN SU
 */
public class IterativeMath implements Math {

    /**
     * Returns the result of the binary addition operation
     * <code>lhs + rhs</code>.
     *
     * <p>
     * The default implementation does not need to be overrident in
     * implementing classes.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */

    public int add(int lhs, int rhs) {
        while(rhs != 0){
         lhs = inc(lhs);
         rhs = dec(rhs);
        }
        return lhs;
    } // add
    
    /**
     * Returns the result of the binary subtraction operation
     * <code>lhs - rhs</code>.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */

    public int sub(int lhs, int rhs) {
        while(rhs != 0){
         lhs = dec(lhs);
         rhs = dec(rhs);
        }
        return lhs;
    } // sub

    /**
     * Returns the result of the binary multiplication operation
     * <code>lhs * rhs</code>.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */

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

    /**
     * Returns the result of the binary division operation
     * <code>lhs / rhs</code>. This method should throw a
     * <code>ArithmeticException</code> if the second operand is equal to zero.
     *
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     * @throws ArithmeticException  when <code>rhs == 0</code>
     */

    public int div(int lhs, int rhs) {
        if(rhs == 0){
         throw new ArithmeticException();
        }
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

    /**
     * Returns the result of the unary factorial operation <code>num !</code>.
     *
     * @param num  the operand
     * @return the result of the operation
     */

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

    /**
     * Returns the result of the binary exponentiation operation
     * <code>lhs ^ rhs</code>. Please note that this is not equivalent to the
     * <code>^</code> operator in Java, which represents the bitwise
     * exclusive-or.
     *
     * @see <a href="https://mitpress.mit.edu/sicp/chapter1/node15.html">SICP 1.2.4 Exponentiation</a>
     * @param lhs  the first operand
     * @param rhs  the second operand
     * @return the result of the operation
     */

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
