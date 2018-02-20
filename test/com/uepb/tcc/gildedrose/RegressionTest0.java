package com.uepb.tcc.gildedrose;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose1.itens;
        try {
            gildedRose1.atualizaQualidade();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNull(item_array3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        gildedRose5.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose1.itens;
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNull(item_array3);
        org.junit.Assert.assertNull(item_array4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        gildedRose9.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose9.itens;
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array8 = null;
        gildedRose7.itens = item_array8;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose7.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose6.itens = item_array13;
        gildedRose6.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array4 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose8.itens;
        gildedRose5.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose17.itens;
        gildedRose14.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose5.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose3.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose17.itens = item_array21;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose26.itens;
        gildedRose26.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        gildedRose32.itens = item_array34;
        gildedRose26.itens = item_array34;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose40.itens;
        gildedRose40.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose46.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose46.itens = item_array48;
        gildedRose40.itens = item_array48;
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose26.itens = item_array48;
        gildedRose17.itens = item_array48;
        gildedRose6.itens = item_array48;
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose6.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array56);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        gildedRose6.itens = item_array8;
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose15.itens;
        gildedRose11.itens = item_array18;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose22.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array26 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        gildedRose22.itens = item_array26;
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose31.itens;
        gildedRose31.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array36 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array36);
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose37.itens;
        com.uepb.tcc.gildedrose.Item[] item_array39 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array39);
        gildedRose37.itens = item_array39;
        gildedRose31.itens = item_array39;
        com.uepb.tcc.gildedrose.Item[] item_array43 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose44 = new com.uepb.tcc.gildedrose.GildedRose(item_array43);
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array43);
        com.uepb.tcc.gildedrose.Item[] item_array46 = gildedRose45.itens;
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose45.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose45.itens;
        gildedRose45.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array50 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose51 = new com.uepb.tcc.gildedrose.GildedRose(item_array50);
        com.uepb.tcc.gildedrose.Item[] item_array52 = gildedRose51.itens;
        com.uepb.tcc.gildedrose.Item[] item_array53 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose54 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        gildedRose51.itens = item_array53;
        gildedRose45.itens = item_array53;
        com.uepb.tcc.gildedrose.GildedRose gildedRose57 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        gildedRose31.itens = item_array53;
        gildedRose22.itens = item_array53;
        gildedRose11.itens = item_array53;
        gildedRose2.itens = item_array53;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array46);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array53);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose5.itens;
        gildedRose5.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item item10 = null;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] { item10 };
        gildedRose5.itens = item_array11;
        gildedRose1.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        gildedRose2.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose17.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose21.itens;
        gildedRose17.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array26 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose28.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose28.itens = item_array30;
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        gildedRose28.itens = item_array32;
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose37.itens;
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose37.itens;
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose37.itens;
        gildedRose37.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array42 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose43 = new com.uepb.tcc.gildedrose.GildedRose(item_array42);
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose43.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        gildedRose43.itens = item_array45;
        gildedRose37.itens = item_array45;
        com.uepb.tcc.gildedrose.Item[] item_array49 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose50 = new com.uepb.tcc.gildedrose.GildedRose(item_array49);
        com.uepb.tcc.gildedrose.GildedRose gildedRose51 = new com.uepb.tcc.gildedrose.GildedRose(item_array49);
        com.uepb.tcc.gildedrose.Item[] item_array52 = gildedRose51.itens;
        com.uepb.tcc.gildedrose.Item[] item_array53 = gildedRose51.itens;
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose51.itens;
        gildedRose51.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array56 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose57 = new com.uepb.tcc.gildedrose.GildedRose(item_array56);
        com.uepb.tcc.gildedrose.Item[] item_array58 = gildedRose57.itens;
        com.uepb.tcc.gildedrose.Item[] item_array59 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose60 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        gildedRose57.itens = item_array59;
        gildedRose51.itens = item_array59;
        com.uepb.tcc.gildedrose.GildedRose gildedRose63 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        gildedRose37.itens = item_array59;
        gildedRose28.itens = item_array59;
        gildedRose17.itens = item_array59;
        gildedRose2.itens = item_array59;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array49);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array53);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array58);
        org.junit.Assert.assertNotNull(item_array59);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose25.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        gildedRose25.itens = item_array29;
        gildedRose22.itens = item_array29;
        gildedRose9.itens = item_array29;
        gildedRose9.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array9 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose10.itens = item_array16;
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose1.itens = item_array16;
        gildedRose1.atualizaQualidade();
        gildedRose1.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose9.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose18.itens;
        gildedRose18.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose24.itens;
        com.uepb.tcc.gildedrose.Item[] item_array26 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        gildedRose24.itens = item_array26;
        gildedRose18.itens = item_array26;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose32.itens;
        gildedRose32.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array37 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose38 = new com.uepb.tcc.gildedrose.GildedRose(item_array37);
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose38.itens;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        gildedRose38.itens = item_array40;
        gildedRose32.itens = item_array40;
        com.uepb.tcc.gildedrose.GildedRose gildedRose44 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        gildedRose18.itens = item_array40;
        gildedRose9.itens = item_array40;
        gildedRose2.itens = item_array40;
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array40);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose17.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose21.itens;
        gildedRose21.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose21.itens;
        gildedRose17.itens = item_array25;
        gildedRose2.itens = item_array25;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array29);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNull(item_array8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        gildedRose6.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        gildedRose6.itens = item_array8;
        gildedRose2.itens = item_array8;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose16.itens = item_array18;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose16.itens = item_array20;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose25.itens;
        gildedRose25.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose31.itens = item_array33;
        gildedRose25.itens = item_array33;
        com.uepb.tcc.gildedrose.Item[] item_array37 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose38 = new com.uepb.tcc.gildedrose.GildedRose(item_array37);
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array37);
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose39.itens;
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose39.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose39.itens;
        gildedRose39.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array44 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        com.uepb.tcc.gildedrose.Item[] item_array46 = gildedRose45.itens;
        com.uepb.tcc.gildedrose.Item[] item_array47 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        gildedRose45.itens = item_array47;
        gildedRose39.itens = item_array47;
        com.uepb.tcc.gildedrose.GildedRose gildedRose51 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        gildedRose25.itens = item_array47;
        gildedRose16.itens = item_array47;
        com.uepb.tcc.gildedrose.Item[] item_array54 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose55 = new com.uepb.tcc.gildedrose.GildedRose(item_array54);
        com.uepb.tcc.gildedrose.GildedRose gildedRose56 = new com.uepb.tcc.gildedrose.GildedRose(item_array54);
        com.uepb.tcc.gildedrose.Item[] item_array57 = gildedRose56.itens;
        com.uepb.tcc.gildedrose.Item[] item_array58 = gildedRose56.itens;
        com.uepb.tcc.gildedrose.Item[] item_array59 = gildedRose56.itens;
        gildedRose16.itens = item_array59;
        com.uepb.tcc.gildedrose.GildedRose gildedRose61 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        gildedRose2.itens = item_array59;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array46);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array57);
        org.junit.Assert.assertNotNull(item_array58);
        org.junit.Assert.assertNotNull(item_array59);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose9.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose9.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose8.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array12);
        gildedRose10.itens = item_array12;
        gildedRose6.itens = item_array12;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose19.itens;
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        gildedRose25.itens = item_array27;
        gildedRose19.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array36 = gildedRose33.itens;
        gildedRose33.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose39.itens;
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose39.itens = item_array41;
        gildedRose33.itens = item_array41;
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose19.itens = item_array41;
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose19.itens;
        gildedRose6.itens = item_array48;
        gildedRose3.itens = item_array48;
        com.uepb.tcc.gildedrose.Item[] item_array51 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose53.itens = item_array55;
        com.uepb.tcc.gildedrose.Item[] item_array57 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose58 = new com.uepb.tcc.gildedrose.GildedRose(item_array57);
        gildedRose53.itens = item_array57;
        gildedRose53.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array61 = gildedRose53.itens;
        gildedRose3.itens = item_array61;
        com.uepb.tcc.gildedrose.Item[] item_array63 = gildedRose3.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array57);
        org.junit.Assert.assertNotNull(item_array61);
        org.junit.Assert.assertNotNull(item_array63);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item item16 = null;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] { item16 };
        gildedRose11.itens = item_array17;
        gildedRose7.itens = item_array17;
        gildedRose1.itens = item_array17;
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array22 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array22);
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose23.itens;
        com.uepb.tcc.gildedrose.Item[] item_array25 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array25);
        gildedRose23.itens = item_array25;
        com.uepb.tcc.gildedrose.Item[] item_array28 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose29.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose33.itens;
        gildedRose33.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item item38 = null;
        com.uepb.tcc.gildedrose.Item[] item_array39 = new com.uepb.tcc.gildedrose.Item[] { item38 };
        gildedRose33.itens = item_array39;
        gildedRose29.itens = item_array39;
        gildedRose23.itens = item_array39;
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose23.itens;
        gildedRose21.itens = item_array43;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array43);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        gildedRose13.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose2.itens = item_array16;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose10.itens;
        gildedRose6.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item item16 = null;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] { item16 };
        gildedRose11.itens = item_array17;
        gildedRose7.itens = item_array17;
        gildedRose1.itens = item_array17;
        com.uepb.tcc.gildedrose.Item[] item_array21 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose26.itens;
        gildedRose22.itens = item_array29;
        gildedRose1.itens = item_array29;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose17.itens = item_array21;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose26.itens;
        gildedRose26.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        gildedRose32.itens = item_array34;
        gildedRose26.itens = item_array34;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose40.itens;
        gildedRose40.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose46.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose46.itens = item_array48;
        gildedRose40.itens = item_array48;
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose26.itens = item_array48;
        gildedRose17.itens = item_array48;
        gildedRose6.itens = item_array48;
        com.uepb.tcc.gildedrose.GildedRose gildedRose56 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose3.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        gildedRose3.itens = item_array5;
        com.uepb.tcc.gildedrose.Item[] item_array8 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        gildedRose13.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item item18 = null;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] { item18 };
        gildedRose13.itens = item_array19;
        gildedRose9.itens = item_array19;
        gildedRose3.itens = item_array19;
        gildedRose1.itens = item_array19;
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        gildedRose11.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose25.itens;
        gildedRose25.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose31.itens = item_array33;
        gildedRose25.itens = item_array33;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose11.itens = item_array33;
        gildedRose2.itens = item_array33;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose42.itens;
        gildedRose2.itens = item_array45;
        com.uepb.tcc.gildedrose.Item[] item_array47 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array51 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array53 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose54 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        com.uepb.tcc.gildedrose.GildedRose gildedRose55 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose55.itens;
        com.uepb.tcc.gildedrose.Item[] item_array57 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose55.itens = item_array57;
        com.uepb.tcc.gildedrose.Item[] item_array59 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose60 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        gildedRose55.itens = item_array59;
        gildedRose52.itens = item_array59;
        gildedRose2.itens = item_array59;
        com.uepb.tcc.gildedrose.GildedRose gildedRose64 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array53);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array57);
        org.junit.Assert.assertNotNull(item_array59);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        gildedRose9.atualizaQualidade();
        gildedRose9.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array6;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item item16 = null;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] { item16 };
        gildedRose11.itens = item_array17;
        gildedRose7.itens = item_array17;
        gildedRose1.itens = item_array17;
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose24.itens;
        com.uepb.tcc.gildedrose.Item[] item_array26 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        gildedRose24.itens = item_array26;
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        gildedRose29.atualizaQualidade();
        gildedRose29.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose29.itens;
        gildedRose21.itens = item_array32;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array32);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose6.itens;
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        gildedRose6.itens = item_array14;
        gildedRose2.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose22.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array12);
        gildedRose10.itens = item_array12;
        gildedRose6.itens = item_array12;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose19.itens;
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        gildedRose25.itens = item_array27;
        gildedRose19.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array36 = gildedRose33.itens;
        gildedRose33.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose39.itens;
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose39.itens = item_array41;
        gildedRose33.itens = item_array41;
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose19.itens = item_array41;
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose19.itens;
        gildedRose6.itens = item_array48;
        gildedRose3.itens = item_array48;
        gildedRose3.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose8.itens;
        gildedRose8.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose14.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose14.itens = item_array16;
        gildedRose8.itens = item_array16;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose22.itens;
        gildedRose22.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose28.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        gildedRose28.itens = item_array30;
        gildedRose22.itens = item_array30;
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        gildedRose8.itens = item_array30;
        com.uepb.tcc.gildedrose.Item[] item_array36 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array36);
        com.uepb.tcc.gildedrose.GildedRose gildedRose38 = new com.uepb.tcc.gildedrose.GildedRose(item_array36);
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose38.itens;
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose38.itens;
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose42.itens = item_array44;
        gildedRose38.itens = item_array44;
        gildedRose8.itens = item_array44;
        gildedRose5.itens = item_array44;
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose5.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array50);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array18);
        gildedRose16.itens = item_array18;
        gildedRose10.itens = item_array18;
        com.uepb.tcc.gildedrose.Item[] item_array22 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array22);
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array22);
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose24.itens;
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose24.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose24.itens;
        gildedRose24.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        gildedRose30.itens = item_array32;
        gildedRose24.itens = item_array32;
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        gildedRose10.itens = item_array32;
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose10.itens;
        gildedRose2.itens = item_array38;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        gildedRose2.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose17.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose21.itens;
        gildedRose21.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose21.itens;
        gildedRose17.itens = item_array25;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        gildedRose2.itens = item_array27;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array27);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose8.itens;
        gildedRose5.itens = item_array11;
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        gildedRose2.itens = item_array11;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        com.uepb.tcc.gildedrose.Item[] item_array36 = gildedRose35.itens;
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose35.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose35.itens;
        gildedRose35.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose41.itens;
        com.uepb.tcc.gildedrose.Item[] item_array43 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose44 = new com.uepb.tcc.gildedrose.GildedRose(item_array43);
        gildedRose41.itens = item_array43;
        gildedRose35.itens = item_array43;
        com.uepb.tcc.gildedrose.Item[] item_array47 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array51 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array52 = gildedRose49.itens;
        gildedRose49.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array54 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose55 = new com.uepb.tcc.gildedrose.GildedRose(item_array54);
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose55.itens;
        com.uepb.tcc.gildedrose.Item[] item_array57 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose58 = new com.uepb.tcc.gildedrose.GildedRose(item_array57);
        gildedRose55.itens = item_array57;
        gildedRose49.itens = item_array57;
        com.uepb.tcc.gildedrose.GildedRose gildedRose61 = new com.uepb.tcc.gildedrose.GildedRose(item_array57);
        gildedRose35.itens = item_array57;
        com.uepb.tcc.gildedrose.Item[] item_array63 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose64 = new com.uepb.tcc.gildedrose.GildedRose(item_array63);
        com.uepb.tcc.gildedrose.GildedRose gildedRose65 = new com.uepb.tcc.gildedrose.GildedRose(item_array63);
        com.uepb.tcc.gildedrose.Item[] item_array66 = gildedRose65.itens;
        com.uepb.tcc.gildedrose.Item[] item_array67 = gildedRose65.itens;
        com.uepb.tcc.gildedrose.Item[] item_array68 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose69 = new com.uepb.tcc.gildedrose.GildedRose(item_array68);
        com.uepb.tcc.gildedrose.Item[] item_array70 = gildedRose69.itens;
        com.uepb.tcc.gildedrose.Item[] item_array71 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose72 = new com.uepb.tcc.gildedrose.GildedRose(item_array71);
        gildedRose69.itens = item_array71;
        gildedRose65.itens = item_array71;
        gildedRose35.itens = item_array71;
        com.uepb.tcc.gildedrose.GildedRose gildedRose76 = new com.uepb.tcc.gildedrose.GildedRose(item_array71);
        gildedRose2.itens = item_array71;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array57);
        org.junit.Assert.assertNotNull(item_array63);
        org.junit.Assert.assertNotNull(item_array66);
        org.junit.Assert.assertNotNull(item_array67);
        org.junit.Assert.assertNotNull(item_array68);
        org.junit.Assert.assertNotNull(item_array70);
        org.junit.Assert.assertNotNull(item_array71);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose3.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        gildedRose3.itens = item_array5;
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        gildedRose9.itens = item_array15;
        gildedRose1.itens = item_array15;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose7.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        gildedRose7.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose30.itens;
        gildedRose30.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose36.itens = item_array38;
        gildedRose30.itens = item_array38;
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose16.itens = item_array38;
        gildedRose7.itens = item_array38;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose7.itens;
        gildedRose2.itens = item_array45;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array45);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        gildedRose1.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        gildedRose8.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose8.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array12 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array12);
        gildedRose8.itens = item_array12;
        gildedRose5.itens = item_array12;
        gildedRose5.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose17.itens = item_array21;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose26.itens;
        gildedRose26.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        gildedRose32.itens = item_array34;
        gildedRose26.itens = item_array34;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose40.itens;
        gildedRose40.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose46.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose46.itens = item_array48;
        gildedRose40.itens = item_array48;
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose26.itens = item_array48;
        gildedRose17.itens = item_array48;
        gildedRose6.itens = item_array48;
        com.uepb.tcc.gildedrose.Item[] item_array56 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose57 = new com.uepb.tcc.gildedrose.GildedRose(item_array56);
        com.uepb.tcc.gildedrose.GildedRose gildedRose58 = new com.uepb.tcc.gildedrose.GildedRose(item_array56);
        com.uepb.tcc.gildedrose.Item[] item_array59 = gildedRose58.itens;
        com.uepb.tcc.gildedrose.Item[] item_array60 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose61 = new com.uepb.tcc.gildedrose.GildedRose(item_array60);
        com.uepb.tcc.gildedrose.Item[] item_array62 = gildedRose61.itens;
        com.uepb.tcc.gildedrose.Item[] item_array63 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose64 = new com.uepb.tcc.gildedrose.GildedRose(item_array63);
        gildedRose61.itens = item_array63;
        com.uepb.tcc.gildedrose.Item[] item_array66 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose67 = new com.uepb.tcc.gildedrose.GildedRose(item_array66);
        com.uepb.tcc.gildedrose.Item[] item_array68 = gildedRose67.itens;
        com.uepb.tcc.gildedrose.Item[] item_array69 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose70 = new com.uepb.tcc.gildedrose.GildedRose(item_array69);
        com.uepb.tcc.gildedrose.GildedRose gildedRose71 = new com.uepb.tcc.gildedrose.GildedRose(item_array69);
        com.uepb.tcc.gildedrose.Item[] item_array72 = gildedRose71.itens;
        com.uepb.tcc.gildedrose.Item[] item_array73 = gildedRose71.itens;
        gildedRose71.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array75 = gildedRose71.itens;
        com.uepb.tcc.gildedrose.Item item76 = null;
        com.uepb.tcc.gildedrose.Item[] item_array77 = new com.uepb.tcc.gildedrose.Item[] { item76 };
        gildedRose71.itens = item_array77;
        gildedRose67.itens = item_array77;
        gildedRose61.itens = item_array77;
        com.uepb.tcc.gildedrose.GildedRose gildedRose81 = new com.uepb.tcc.gildedrose.GildedRose(item_array77);
        gildedRose58.itens = item_array77;
        gildedRose6.itens = item_array77;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array59);
        org.junit.Assert.assertNotNull(item_array60);
        org.junit.Assert.assertNotNull(item_array62);
        org.junit.Assert.assertNotNull(item_array63);
        org.junit.Assert.assertNull(item_array68);
        org.junit.Assert.assertNotNull(item_array69);
        org.junit.Assert.assertNotNull(item_array72);
        org.junit.Assert.assertNotNull(item_array73);
        org.junit.Assert.assertNotNull(item_array75);
        org.junit.Assert.assertNotNull(item_array77);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        gildedRose2.itens = item_array6;
        try {
            gildedRose2.atualizaQualidade();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose7.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        gildedRose7.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose30.itens;
        gildedRose30.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose36.itens = item_array38;
        gildedRose30.itens = item_array38;
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose16.itens = item_array38;
        gildedRose7.itens = item_array38;
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.GildedRose gildedRose47 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose47.itens;
        com.uepb.tcc.gildedrose.Item[] item_array49 = gildedRose47.itens;
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose47.itens;
        gildedRose7.itens = item_array50;
        gildedRose7.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array53 = gildedRose7.itens;
        gildedRose4.itens = item_array53;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array49);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array53);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        gildedRose5.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array10 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose15.itens;
        gildedRose15.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item item20 = null;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] { item20 };
        gildedRose15.itens = item_array21;
        gildedRose11.itens = item_array21;
        gildedRose5.itens = item_array21;
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose2.itens = item_array21;
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        try {
            gildedRose27.atualizaQualidade();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose10.itens;
        gildedRose6.itens = item_array14;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose17.atualizaQualidade();
        gildedRose17.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        gildedRose8.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        gildedRose32.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        gildedRose32.itens = item_array34;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.GildedRose gildedRose38 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose38.itens;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose38.itens = item_array44;
        gildedRose2.itens = item_array44;
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array48);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose5.itens;
        gildedRose1.itens = item_array8;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array18);
        gildedRose16.itens = item_array18;
        gildedRose12.itens = item_array18;
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose12.itens;
        gildedRose1.itens = item_array22;
        com.uepb.tcc.gildedrose.Item[] item_array24 = null;
        gildedRose1.itens = item_array24;
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array9 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose10.itens = item_array16;
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose1.itens = item_array16;
        gildedRose1.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose1.itens;
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array21);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item item9 = null;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] { item9 };
        gildedRose7.itens = item_array10;
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose4.itens = item_array10;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        gildedRose7.itens = item_array9;
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        gildedRose2.itens = item_array9;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose9.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose13.itens = item_array15;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        gildedRose13.itens = item_array17;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose22.itens;
        gildedRose22.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose28.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        gildedRose28.itens = item_array30;
        gildedRose22.itens = item_array30;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose36.itens;
        gildedRose36.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose42.itens = item_array44;
        gildedRose36.itens = item_array44;
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose22.itens = item_array44;
        gildedRose13.itens = item_array44;
        com.uepb.tcc.gildedrose.Item[] item_array51 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose53.itens;
        gildedRose13.itens = item_array56;
        gildedRose9.itens = item_array56;
        com.uepb.tcc.gildedrose.Item[] item_array59 = gildedRose9.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array59);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item item4 = null;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] { item4 };
        gildedRose2.itens = item_array5;
        try {
            gildedRose2.atualizaQualidade();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose9.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose2.itens = item_array13;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose9.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose19.itens;
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        gildedRose25.itens = item_array27;
        gildedRose19.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array36 = gildedRose33.itens;
        gildedRose33.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array40 = gildedRose39.itens;
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose39.itens = item_array41;
        gildedRose33.itens = item_array41;
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        gildedRose19.itens = item_array41;
        com.uepb.tcc.gildedrose.Item[] item_array47 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array51 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array52 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array52);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose56 = new com.uepb.tcc.gildedrose.GildedRose(item_array55);
        gildedRose53.itens = item_array55;
        gildedRose49.itens = item_array55;
        gildedRose19.itens = item_array55;
        com.uepb.tcc.gildedrose.Item[] item_array60 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose61 = new com.uepb.tcc.gildedrose.GildedRose(item_array60);
        com.uepb.tcc.gildedrose.GildedRose gildedRose62 = new com.uepb.tcc.gildedrose.GildedRose(item_array60);
        com.uepb.tcc.gildedrose.Item[] item_array63 = gildedRose62.itens;
        com.uepb.tcc.gildedrose.Item[] item_array64 = gildedRose62.itens;
        gildedRose62.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array66 = gildedRose62.itens;
        com.uepb.tcc.gildedrose.Item item67 = null;
        com.uepb.tcc.gildedrose.Item[] item_array68 = new com.uepb.tcc.gildedrose.Item[] { item67 };
        gildedRose62.itens = item_array68;
        gildedRose19.itens = item_array68;
        gildedRose6.itens = item_array68;
        com.uepb.tcc.gildedrose.Item[] item_array72 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose73 = new com.uepb.tcc.gildedrose.GildedRose(item_array72);
        com.uepb.tcc.gildedrose.Item[] item_array74 = gildedRose73.itens;
        com.uepb.tcc.gildedrose.Item[] item_array75 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose76 = new com.uepb.tcc.gildedrose.GildedRose(item_array75);
        gildedRose73.itens = item_array75;
        com.uepb.tcc.gildedrose.GildedRose gildedRose78 = new com.uepb.tcc.gildedrose.GildedRose(item_array75);
        gildedRose78.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array80 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose81 = new com.uepb.tcc.gildedrose.GildedRose(item_array80);
        com.uepb.tcc.gildedrose.GildedRose gildedRose82 = new com.uepb.tcc.gildedrose.GildedRose(item_array80);
        com.uepb.tcc.gildedrose.Item[] item_array83 = gildedRose82.itens;
        com.uepb.tcc.gildedrose.Item[] item_array84 = gildedRose82.itens;
        com.uepb.tcc.gildedrose.Item[] item_array85 = gildedRose82.itens;
        gildedRose78.itens = item_array85;
        gildedRose6.itens = item_array85;
        com.uepb.tcc.gildedrose.Item[] item_array88 = gildedRose6.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array60);
        org.junit.Assert.assertNotNull(item_array63);
        org.junit.Assert.assertNotNull(item_array64);
        org.junit.Assert.assertNotNull(item_array66);
        org.junit.Assert.assertNotNull(item_array68);
        org.junit.Assert.assertNotNull(item_array72);
        org.junit.Assert.assertNotNull(item_array74);
        org.junit.Assert.assertNotNull(item_array75);
        org.junit.Assert.assertNotNull(item_array80);
        org.junit.Assert.assertNotNull(item_array83);
        org.junit.Assert.assertNotNull(item_array84);
        org.junit.Assert.assertNotNull(item_array85);
        org.junit.Assert.assertNotNull(item_array88);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose10.itens;
        gildedRose6.itens = item_array14;
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose18.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose31.itens;
        gildedRose31.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array36 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array36);
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose37.itens;
        com.uepb.tcc.gildedrose.Item[] item_array39 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array39);
        gildedRose37.itens = item_array39;
        gildedRose31.itens = item_array39;
        com.uepb.tcc.gildedrose.Item[] item_array43 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose44 = new com.uepb.tcc.gildedrose.GildedRose(item_array43);
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array43);
        com.uepb.tcc.gildedrose.Item[] item_array46 = gildedRose45.itens;
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose45.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose45.itens;
        gildedRose45.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array50 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose51 = new com.uepb.tcc.gildedrose.GildedRose(item_array50);
        com.uepb.tcc.gildedrose.Item[] item_array52 = gildedRose51.itens;
        com.uepb.tcc.gildedrose.Item[] item_array53 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose54 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        gildedRose51.itens = item_array53;
        gildedRose45.itens = item_array53;
        com.uepb.tcc.gildedrose.GildedRose gildedRose57 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        gildedRose31.itens = item_array53;
        com.uepb.tcc.gildedrose.Item[] item_array59 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array60 = gildedRose31.itens;
        gildedRose18.itens = item_array60;
        gildedRose6.itens = item_array60;
        com.uepb.tcc.gildedrose.Item[] item_array63 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose64 = new com.uepb.tcc.gildedrose.GildedRose(item_array63);
        com.uepb.tcc.gildedrose.Item[] item_array65 = gildedRose64.itens;
        com.uepb.tcc.gildedrose.Item[] item_array66 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose67 = new com.uepb.tcc.gildedrose.GildedRose(item_array66);
        gildedRose64.itens = item_array66;
        com.uepb.tcc.gildedrose.Item[] item_array69 = gildedRose64.itens;
        gildedRose6.itens = item_array69;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array46);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array53);
        org.junit.Assert.assertNotNull(item_array59);
        org.junit.Assert.assertNotNull(item_array60);
        org.junit.Assert.assertNotNull(item_array63);
        org.junit.Assert.assertNotNull(item_array65);
        org.junit.Assert.assertNotNull(item_array66);
        org.junit.Assert.assertNotNull(item_array69);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array9 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose10.itens = item_array16;
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose1.itens = item_array16;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose21.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose25.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        gildedRose25.itens = item_array29;
        gildedRose22.itens = item_array29;
        gildedRose9.itens = item_array29;
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        gildedRose34.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose9.atualizaQualidade();
        gildedRose9.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose5.itens;
        gildedRose1.itens = item_array8;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose13.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array18);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose19.itens = item_array21;
        gildedRose13.itens = item_array21;
        com.uepb.tcc.gildedrose.Item[] item_array25 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array25);
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array25);
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose27.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose27.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose27.itens;
        gildedRose27.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        gildedRose33.itens = item_array35;
        gildedRose27.itens = item_array35;
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        gildedRose13.itens = item_array35;
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose43 = new com.uepb.tcc.gildedrose.GildedRose(item_array42);
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose43.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        gildedRose43.itens = item_array45;
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array51 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose56 = new com.uepb.tcc.gildedrose.GildedRose(item_array55);
        gildedRose49.itens = item_array55;
        gildedRose13.itens = item_array55;
        gildedRose13.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array60 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose61 = new com.uepb.tcc.gildedrose.GildedRose(item_array60);
        gildedRose1.itens = item_array60;
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array60);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose6.itens;
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        gildedRose6.itens = item_array14;
        gildedRose2.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose9.itens;
        gildedRose9.atualizaQualidade();
        gildedRose9.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose2.itens = item_array14;
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        gildedRose3.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose7.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        gildedRose7.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose30.itens;
        gildedRose30.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose36.itens = item_array38;
        gildedRose30.itens = item_array38;
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        gildedRose16.itens = item_array38;
        gildedRose7.itens = item_array38;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose7.itens;
        gildedRose3.itens = item_array45;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array45);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.Item[] item_array6 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item item16 = null;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] { item16 };
        gildedRose11.itens = item_array17;
        gildedRose7.itens = item_array17;
        gildedRose1.itens = item_array17;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose23.itens;
        gildedRose23.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose23.itens;
        gildedRose1.itens = item_array26;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose30.itens = item_array32;
        gildedRose1.itens = item_array32;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        gildedRose11.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose25.itens;
        gildedRose25.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose31.itens = item_array33;
        gildedRose25.itens = item_array33;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose11.itens = item_array33;
        gildedRose2.itens = item_array33;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose42.itens;
        gildedRose2.itens = item_array45;
        com.uepb.tcc.gildedrose.Item[] item_array47 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array47);
        com.uepb.tcc.gildedrose.Item[] item_array50 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.Item[] item_array51 = gildedRose49.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array53 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose54 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        com.uepb.tcc.gildedrose.GildedRose gildedRose55 = new com.uepb.tcc.gildedrose.GildedRose(item_array53);
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose55.itens;
        com.uepb.tcc.gildedrose.Item[] item_array57 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose55.itens = item_array57;
        com.uepb.tcc.gildedrose.Item[] item_array59 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose60 = new com.uepb.tcc.gildedrose.GildedRose(item_array59);
        gildedRose55.itens = item_array59;
        gildedRose52.itens = item_array59;
        gildedRose2.itens = item_array59;
        com.uepb.tcc.gildedrose.Item[] item_array64 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose65 = new com.uepb.tcc.gildedrose.GildedRose(item_array64);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array50);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array53);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array57);
        org.junit.Assert.assertNotNull(item_array59);
        org.junit.Assert.assertNotNull(item_array64);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        gildedRose11.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose25.itens;
        gildedRose25.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose31.itens = item_array33;
        gildedRose25.itens = item_array33;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose11.itens = item_array33;
        gildedRose2.itens = item_array33;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.Item[] item_array9 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose11.itens;
        gildedRose11.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        gildedRose11.itens = item_array19;
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose25.itens;
        gildedRose25.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = gildedRose31.itens;
        com.uepb.tcc.gildedrose.Item[] item_array33 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose31.itens = item_array33;
        gildedRose25.itens = item_array33;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array33);
        gildedRose11.itens = item_array33;
        gildedRose2.itens = item_array33;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose42.itens;
        gildedRose2.itens = item_array45;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array48 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array48);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose5.itens;
        gildedRose1.itens = item_array8;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose13.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array18);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose19.itens = item_array21;
        gildedRose13.itens = item_array21;
        com.uepb.tcc.gildedrose.Item[] item_array25 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array25);
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array25);
        com.uepb.tcc.gildedrose.Item[] item_array28 = gildedRose27.itens;
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose27.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose27.itens;
        gildedRose27.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        gildedRose33.itens = item_array35;
        gildedRose27.itens = item_array35;
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        gildedRose13.itens = item_array35;
        gildedRose1.itens = item_array35;
        org.junit.Assert.assertNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose6.itens;
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        gildedRose6.itens = item_array14;
        gildedRose2.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose23.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        gildedRose19.itens = item_array26;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array26);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose5.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        gildedRose5.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array10 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose11.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose15.itens;
        gildedRose15.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose15.itens;
        com.uepb.tcc.gildedrose.Item item20 = null;
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] { item20 };
        gildedRose15.itens = item_array21;
        gildedRose11.itens = item_array21;
        gildedRose5.itens = item_array21;
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        gildedRose2.itens = item_array21;
        com.uepb.tcc.gildedrose.GildedRose gildedRose27 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose5.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose1.itens;
        gildedRose1.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        gildedRose2.itens = item_array9;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose2.itens;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose32 = new com.uepb.tcc.gildedrose.GildedRose(item_array31);
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose32.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        gildedRose32.itens = item_array34;
        com.uepb.tcc.gildedrose.GildedRose gildedRose37 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.GildedRose gildedRose38 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose38.itens;
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose38.itens = item_array44;
        gildedRose2.itens = item_array44;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array49 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose50 = new com.uepb.tcc.gildedrose.GildedRose(item_array49);
        com.uepb.tcc.gildedrose.GildedRose gildedRose51 = new com.uepb.tcc.gildedrose.GildedRose(item_array49);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array49);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array10 = null;
        gildedRose9.itens = item_array10;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.uepb.tcc.gildedrose.Item[] item_array0 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array2);
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose4.itens;
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose4.itens;
        gildedRose1.itens = item_array7;
        com.uepb.tcc.gildedrose.Item[] item_array9 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array9);
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array16 = gildedRose13.itens;
        gildedRose10.itens = item_array16;
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        gildedRose1.itens = item_array16;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose1.itens;
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array6 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose10.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array18);
        gildedRose16.itens = item_array18;
        gildedRose10.itens = item_array18;
        gildedRose7.itens = item_array18;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose9.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose9.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        gildedRose9.itens = item_array13;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose18.itens;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose18.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.GildedRose gildedRose26 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        com.uepb.tcc.gildedrose.Item[] item_array27 = gildedRose26.itens;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose26.itens = item_array28;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        gildedRose26.itens = item_array30;
        gildedRose23.itens = item_array30;
        gildedRose6.itens = item_array30;
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array30);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item item4 = null;
        com.uepb.tcc.gildedrose.Item[] item_array5 = new com.uepb.tcc.gildedrose.Item[] { item4 };
        gildedRose2.itens = item_array5;
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array5);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose3 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array4 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose8.itens;
        gildedRose5.itens = item_array11;
        com.uepb.tcc.gildedrose.Item[] item_array13 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose14 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array15);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array20 = gildedRose17.itens;
        gildedRose14.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose5.itens = item_array20;
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        gildedRose3.itens = item_array20;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array8 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array12 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose10.itens;
        gildedRose6.itens = item_array13;
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array13);
        com.uepb.tcc.gildedrose.Item[] item_array16 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array16);
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose17.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        gildedRose17.itens = item_array19;
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array23 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array23);
        com.uepb.tcc.gildedrose.Item[] item_array26 = gildedRose25.itens;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose25.itens = item_array27;
        com.uepb.tcc.gildedrose.Item[] item_array29 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array29);
        gildedRose25.itens = item_array29;
        gildedRose22.itens = item_array29;
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose22.itens;
        gildedRose15.itens = item_array33;
        gildedRose15.atualizaQualidade();
        gildedRose15.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array12);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array16);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array26);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose5 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array4);
        com.uepb.tcc.gildedrose.Item[] item_array7 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose6.itens;
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose6.itens;
        gildedRose6.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        gildedRose6.itens = item_array14;
        gildedRose2.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose19 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose19.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = gildedRose19.itens;
        com.uepb.tcc.gildedrose.Item[] item_array22 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose23 = new com.uepb.tcc.gildedrose.GildedRose(item_array22);
        com.uepb.tcc.gildedrose.GildedRose gildedRose24 = new com.uepb.tcc.gildedrose.GildedRose(item_array22);
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose24.itens;
        gildedRose19.itens = item_array25;
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose29.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose29.itens;
        gildedRose29.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose29.itens;
        com.uepb.tcc.gildedrose.Item item34 = null;
        com.uepb.tcc.gildedrose.Item[] item_array35 = new com.uepb.tcc.gildedrose.Item[] { item34 };
        gildedRose29.itens = item_array35;
        gildedRose19.itens = item_array35;
        com.uepb.tcc.gildedrose.Item[] item_array38 = null;
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array40 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose41 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array40);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array45 = gildedRose42.itens;
        gildedRose39.itens = item_array45;
        com.uepb.tcc.gildedrose.GildedRose gildedRose47 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        gildedRose19.itens = item_array45;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array40);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array45);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose9.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.GildedRose gildedRose13 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array14 = gildedRose13.itens;
        com.uepb.tcc.gildedrose.Item[] item_array15 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose13.itens = item_array15;
        com.uepb.tcc.gildedrose.Item[] item_array17 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose18 = new com.uepb.tcc.gildedrose.GildedRose(item_array17);
        gildedRose13.itens = item_array17;
        com.uepb.tcc.gildedrose.Item[] item_array20 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array20);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose22.itens;
        gildedRose22.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array27 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array27);
        com.uepb.tcc.gildedrose.Item[] item_array29 = gildedRose28.itens;
        com.uepb.tcc.gildedrose.Item[] item_array30 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        gildedRose28.itens = item_array30;
        gildedRose22.itens = item_array30;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array39 = gildedRose36.itens;
        gildedRose36.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array41 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose42 = new com.uepb.tcc.gildedrose.GildedRose(item_array41);
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose42.itens;
        com.uepb.tcc.gildedrose.Item[] item_array44 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose42.itens = item_array44;
        gildedRose36.itens = item_array44;
        com.uepb.tcc.gildedrose.GildedRose gildedRose48 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose22.itens = item_array44;
        gildedRose13.itens = item_array44;
        com.uepb.tcc.gildedrose.Item[] item_array51 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose52 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array51);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array56 = gildedRose53.itens;
        gildedRose13.itens = item_array56;
        gildedRose9.itens = item_array56;
        gildedRose9.atualizaQualidade();
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array15);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array20);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array27);
        org.junit.Assert.assertNotNull(item_array29);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array44);
        org.junit.Assert.assertNotNull(item_array51);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array56);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array2 = gildedRose1.itens;
        com.uepb.tcc.gildedrose.Item[] item_array3 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose4 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        gildedRose1.itens = item_array3;
        com.uepb.tcc.gildedrose.GildedRose gildedRose6 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array3);
        com.uepb.tcc.gildedrose.Item[] item_array8 = gildedRose7.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose9 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.GildedRose gildedRose10 = new com.uepb.tcc.gildedrose.GildedRose(item_array8);
        com.uepb.tcc.gildedrose.Item[] item_array11 = gildedRose10.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array2);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array8);
        org.junit.Assert.assertNotNull(item_array11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose31 = new com.uepb.tcc.gildedrose.GildedRose(item_array30);
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        com.uepb.tcc.gildedrose.Item[] item_array34 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose33.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array35);
        gildedRose36.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose40.itens = item_array42;
        com.uepb.tcc.gildedrose.Item[] item_array44 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose45 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose40.itens = item_array44;
        com.uepb.tcc.gildedrose.GildedRose gildedRose47 = new com.uepb.tcc.gildedrose.GildedRose(item_array44);
        gildedRose36.itens = item_array44;
        gildedRose31.itens = item_array44;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array44);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array5 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array7 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose8 = new com.uepb.tcc.gildedrose.GildedRose(item_array7);
        com.uepb.tcc.gildedrose.Item[] item_array9 = gildedRose8.itens;
        com.uepb.tcc.gildedrose.Item[] item_array10 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose11 = new com.uepb.tcc.gildedrose.GildedRose(item_array10);
        gildedRose8.itens = item_array10;
        gildedRose2.itens = item_array10;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.GildedRose gildedRose16 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        com.uepb.tcc.gildedrose.Item[] item_array17 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array18 = gildedRose16.itens;
        com.uepb.tcc.gildedrose.Item[] item_array19 = gildedRose16.itens;
        gildedRose16.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array21 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose22 = new com.uepb.tcc.gildedrose.GildedRose(item_array21);
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose22.itens;
        com.uepb.tcc.gildedrose.Item[] item_array24 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose25 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose22.itens = item_array24;
        gildedRose16.itens = item_array24;
        com.uepb.tcc.gildedrose.GildedRose gildedRose28 = new com.uepb.tcc.gildedrose.GildedRose(item_array24);
        gildedRose2.itens = item_array24;
        com.uepb.tcc.gildedrose.Item[] item_array30 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose2.itens;
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array33 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array34 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose35 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.GildedRose gildedRose36 = new com.uepb.tcc.gildedrose.GildedRose(item_array34);
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose36.itens;
        com.uepb.tcc.gildedrose.Item[] item_array38 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose39 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array38);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array43 = gildedRose40.itens;
        gildedRose40.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array45 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose46 = new com.uepb.tcc.gildedrose.GildedRose(item_array45);
        com.uepb.tcc.gildedrose.Item[] item_array47 = gildedRose46.itens;
        com.uepb.tcc.gildedrose.Item[] item_array48 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose49 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose46.itens = item_array48;
        gildedRose40.itens = item_array48;
        gildedRose36.itens = item_array48;
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array48);
        gildedRose53.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array55 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array56 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose57 = new com.uepb.tcc.gildedrose.GildedRose(item_array56);
        com.uepb.tcc.gildedrose.GildedRose gildedRose58 = new com.uepb.tcc.gildedrose.GildedRose(item_array56);
        com.uepb.tcc.gildedrose.Item[] item_array59 = gildedRose58.itens;
        gildedRose53.itens = item_array59;
        com.uepb.tcc.gildedrose.Item[] item_array61 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose62 = new com.uepb.tcc.gildedrose.GildedRose(item_array61);
        com.uepb.tcc.gildedrose.GildedRose gildedRose63 = new com.uepb.tcc.gildedrose.GildedRose(item_array61);
        com.uepb.tcc.gildedrose.Item[] item_array64 = gildedRose63.itens;
        com.uepb.tcc.gildedrose.Item[] item_array65 = gildedRose63.itens;
        gildedRose63.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array67 = gildedRose63.itens;
        com.uepb.tcc.gildedrose.Item item68 = null;
        com.uepb.tcc.gildedrose.Item[] item_array69 = new com.uepb.tcc.gildedrose.Item[] { item68 };
        gildedRose63.itens = item_array69;
        gildedRose53.itens = item_array69;
        gildedRose2.itens = item_array69;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array5);
        org.junit.Assert.assertNotNull(item_array7);
        org.junit.Assert.assertNotNull(item_array9);
        org.junit.Assert.assertNotNull(item_array10);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array17);
        org.junit.Assert.assertNotNull(item_array18);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array21);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array24);
        org.junit.Assert.assertNotNull(item_array30);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array33);
        org.junit.Assert.assertNotNull(item_array34);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array38);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array43);
        org.junit.Assert.assertNotNull(item_array45);
        org.junit.Assert.assertNotNull(item_array47);
        org.junit.Assert.assertNotNull(item_array48);
        org.junit.Assert.assertNotNull(item_array55);
        org.junit.Assert.assertNotNull(item_array56);
        org.junit.Assert.assertNotNull(item_array59);
        org.junit.Assert.assertNotNull(item_array61);
        org.junit.Assert.assertNotNull(item_array64);
        org.junit.Assert.assertNotNull(item_array65);
        org.junit.Assert.assertNotNull(item_array67);
        org.junit.Assert.assertNotNull(item_array69);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.uepb.tcc.gildedrose.Item[] item_array0 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose1 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.GildedRose gildedRose2 = new com.uepb.tcc.gildedrose.GildedRose(item_array0);
        com.uepb.tcc.gildedrose.Item[] item_array3 = gildedRose2.itens;
        com.uepb.tcc.gildedrose.Item[] item_array4 = new com.uepb.tcc.gildedrose.Item[] {};
        gildedRose2.itens = item_array4;
        com.uepb.tcc.gildedrose.Item[] item_array6 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose7 = new com.uepb.tcc.gildedrose.GildedRose(item_array6);
        gildedRose2.itens = item_array6;
        gildedRose2.atualizaQualidade();
        gildedRose2.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array11 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose12 = new com.uepb.tcc.gildedrose.GildedRose(item_array11);
        com.uepb.tcc.gildedrose.Item[] item_array13 = gildedRose12.itens;
        com.uepb.tcc.gildedrose.Item[] item_array14 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose15 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose12.itens = item_array14;
        com.uepb.tcc.gildedrose.GildedRose gildedRose17 = new com.uepb.tcc.gildedrose.GildedRose(item_array14);
        gildedRose17.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array19 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose20 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.GildedRose gildedRose21 = new com.uepb.tcc.gildedrose.GildedRose(item_array19);
        com.uepb.tcc.gildedrose.Item[] item_array22 = gildedRose21.itens;
        com.uepb.tcc.gildedrose.Item[] item_array23 = gildedRose21.itens;
        gildedRose21.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array25 = gildedRose21.itens;
        gildedRose17.itens = item_array25;
        gildedRose2.itens = item_array25;
        com.uepb.tcc.gildedrose.Item[] item_array28 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose29 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.GildedRose gildedRose30 = new com.uepb.tcc.gildedrose.GildedRose(item_array28);
        com.uepb.tcc.gildedrose.Item[] item_array31 = gildedRose30.itens;
        com.uepb.tcc.gildedrose.Item[] item_array32 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose33 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        com.uepb.tcc.gildedrose.GildedRose gildedRose34 = new com.uepb.tcc.gildedrose.GildedRose(item_array32);
        com.uepb.tcc.gildedrose.Item[] item_array35 = gildedRose34.itens;
        com.uepb.tcc.gildedrose.Item[] item_array36 = gildedRose34.itens;
        com.uepb.tcc.gildedrose.Item[] item_array37 = gildedRose34.itens;
        gildedRose34.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array39 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose40 = new com.uepb.tcc.gildedrose.GildedRose(item_array39);
        com.uepb.tcc.gildedrose.Item[] item_array41 = gildedRose40.itens;
        com.uepb.tcc.gildedrose.Item[] item_array42 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose43 = new com.uepb.tcc.gildedrose.GildedRose(item_array42);
        gildedRose40.itens = item_array42;
        gildedRose34.itens = item_array42;
        gildedRose30.itens = item_array42;
        com.uepb.tcc.gildedrose.GildedRose gildedRose47 = new com.uepb.tcc.gildedrose.GildedRose(item_array42);
        gildedRose47.atualizaQualidade();
        com.uepb.tcc.gildedrose.Item[] item_array49 = gildedRose47.itens;
        com.uepb.tcc.gildedrose.GildedRose gildedRose50 = new com.uepb.tcc.gildedrose.GildedRose(item_array49);
        gildedRose2.itens = item_array49;
        com.uepb.tcc.gildedrose.Item[] item_array52 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose53 = new com.uepb.tcc.gildedrose.GildedRose(item_array52);
        com.uepb.tcc.gildedrose.Item[] item_array54 = gildedRose53.itens;
        com.uepb.tcc.gildedrose.Item[] item_array55 = new com.uepb.tcc.gildedrose.Item[] {};
        com.uepb.tcc.gildedrose.GildedRose gildedRose56 = new com.uepb.tcc.gildedrose.GildedRose(item_array55);
        gildedRose53.itens = item_array55;
        com.uepb.tcc.gildedrose.GildedRose gildedRose58 = new com.uepb.tcc.gildedrose.GildedRose(item_array55);
        com.uepb.tcc.gildedrose.GildedRose gildedRose59 = new com.uepb.tcc.gildedrose.GildedRose(item_array55);
        gildedRose2.itens = item_array55;
        org.junit.Assert.assertNotNull(item_array0);
        org.junit.Assert.assertNotNull(item_array3);
        org.junit.Assert.assertNotNull(item_array4);
        org.junit.Assert.assertNotNull(item_array6);
        org.junit.Assert.assertNotNull(item_array11);
        org.junit.Assert.assertNotNull(item_array13);
        org.junit.Assert.assertNotNull(item_array14);
        org.junit.Assert.assertNotNull(item_array19);
        org.junit.Assert.assertNotNull(item_array22);
        org.junit.Assert.assertNotNull(item_array23);
        org.junit.Assert.assertNotNull(item_array25);
        org.junit.Assert.assertNotNull(item_array28);
        org.junit.Assert.assertNotNull(item_array31);
        org.junit.Assert.assertNotNull(item_array32);
        org.junit.Assert.assertNotNull(item_array35);
        org.junit.Assert.assertNotNull(item_array36);
        org.junit.Assert.assertNotNull(item_array37);
        org.junit.Assert.assertNotNull(item_array39);
        org.junit.Assert.assertNotNull(item_array41);
        org.junit.Assert.assertNotNull(item_array42);
        org.junit.Assert.assertNotNull(item_array49);
        org.junit.Assert.assertNotNull(item_array52);
        org.junit.Assert.assertNotNull(item_array54);
        org.junit.Assert.assertNotNull(item_array55);
    }
}

