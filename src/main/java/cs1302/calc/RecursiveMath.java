package main.java.cs1302.calc;

/**
 * Implements various mathematical operations over non-negative integers using recursive methods.
 *
 * @author TRINITY KEY & NATHAN SU
 */
public class RecursiveMath implements Math {

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
        
        if(rhs == 0){
         return lhs; 
        }
        return add(inc(lhs),dec(rhs)); 
        
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
        if(rhs == 0){
         return lhs; 
        }
        if(rhs > lhs){
         return 0; 
        }
        return sub(dec(lhs),dec(rhs)); 
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
        if(rhs > lhs){
         return 0;
        }
        if(rhs == lhs){
         return 1;
        }
        return 1 + div(sub(lhs,rhs),rhs);
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
        return mul(n, fac(dec(n)));
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
        if(rhs == 1){
         return lhs;
        }
        return mul(lhs, pow(lhs,dec(rhs)));
    } // pow

} // RecursiveMath
