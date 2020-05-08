package com.HanXiao;

import com.github.javafaker.Faker;
import com.github.javafaker.idnumbers.CnIdNumber;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Hanxiao
 * the test that generate valid cn idnumber
 * */
public class CnIdNumberTest {

    Faker f = new Faker();
    CnIdNumber cnid = new CnIdNumber();

    @Test
    public void test_cnEncoding1() {
        assertEquals("9",cnid.cnEncoding("510623-19990118-701"));
    }
    @Test
    public void test_cnEncoding2() {
        assertEquals("3",cnid.cnEncoding("510502-19981211-073"));
    }

    @Test
    public void test_getmainstr1() {
        String s = cnid.getmainstr(f);
        assertNotNull(s);
        System.out.println(s);
    }
    @Test
    public void test_getmainstr2() {
        String s = cnid.getmainstr(f);
        assertNotNull(s);
        System.out.println(s);
    }

    @Test
    public void test_getValidCn1() {
        String s = cnid.getValidCn(f);
        assertNotNull(s);
        System.out.println(s);
    }
    @Test
    public void test_getValidCn2() {
        String s = cnid.getValidCn(f);
        assertNotNull(s);
        System.out.println(s);
    }
}
