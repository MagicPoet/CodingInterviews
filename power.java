/**
 * Created by user on 2017/4/9.
 */
public class power {
    public static double PowerWithExponent(double base, int exponent) {
        if(exponent == 0) {
            return 0;
        }
        if(exponent == 1) {
            return base;
        }
        if(exponent >> 1 ==0) {
            int exponent_1 = exponent>>1;
            double temp = PowerWithExponent(base, exponent_1);
            return temp*temp;
        } else {
            int exponent_2 = exponent-1;
            double temp = PowerWithExponent(base,exponent_2);
            return temp*base;
        }
    }
}
