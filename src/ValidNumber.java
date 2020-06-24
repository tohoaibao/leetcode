import org.junit.Assert;
import org.junit.Test;

public class ValidNumber {

    // https://leetcode.com/problems/valid-number/
    public boolean isNumber(String s) {
        s = s.trim();
        return s.matches("([+-])?(\\d+(\\.\\d*)?|\\.\\d+)(e([+-])?\\d+)?");
    }


    @Test
    public void test01() {
        String s = "0";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test02() {
        String s = " 0.1 ";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test03() {
        String s = "abc";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test04() {
        String s = "1 a";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test05() {
        String s = "2e10";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test06() {
        String s = " -90e3   ";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test07() {
        String s = " -90e3   ";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test08() {
        String s = "1e";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test09() {
        String s = "e3";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test10() {
        String s = " 6e-1";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test11() {
        String s = " 99e2.5 ";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test12() {
        String s = "53.5e93";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

    @Test
    public void test13() {
        String s = " --6 ";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test14() {
        String s = "-+3";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test15() {
        String s = "95a54e53";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test16() {
        String s = ".";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test17() {
        String s = " ";
        Assert.assertFalse(new ValidNumber().isNumber(s));
    }

    @Test
    public void test18() {
        String s = ".1";
        Assert.assertTrue(new ValidNumber().isNumber(s));
    }

}
