package com.pjatk.example.mathutils.tests;

import com.pjatk.example.mathutils.MathUtils;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MathUtilsTest {

    @Test
    public void test_if_utils_properly_counts_factorial(){
        int result = MathUtils.factorial(5);
        assertThat(result, is(120));
        result = MathUtils.factorialRecursive(5);
        assertThat(result, is(120));
        result = MathUtils.factorial(6);
        assertThat(result, is(720));
        result = MathUtils.factorialRecursive(6);
        assertThat(result, is(720));
    }

    @Test
    public void test_integrals(){
        double[] polynomial = new double[3];
        polynomial[0] = -1;
        polynomial[1] = 0;
        polynomial[2] = 1;

        double result = MathUtils.integralOfPolynomial(polynomial, -1,1);
        assertThat(result, lessThan(1.34));
        assertThat(result, greaterThan(1.33));
    }

    @Test
    public void test_fractions(){
        String result = MathUtils.simplifyFractionInString(1,2);
        assertThat(result, equalTo("1/2"));
        result = MathUtils.simplifyFractionInString(15,20);
        assertThat(result, equalTo("3/4"));
        result = MathUtils.simplifyFractionInString(120,5);
        assertThat(result,equalTo("24"));
        result = MathUtils.simplifyFractionInString(6,4);
        assertThat(result, equalTo("3/2"));

    }

}
