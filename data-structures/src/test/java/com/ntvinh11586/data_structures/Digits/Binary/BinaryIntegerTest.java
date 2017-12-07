package com.ntvinh11586.data_structures.Digits.Binary;

import junit.framework.Assert;

import org.junit.Test;

public class BinaryIntegerTest {

    @Test
    public void shouldPrintCorrectPositiveIntegerString() {
        BinaryInteger binary = new BinaryInteger(10);
        String binaryStr = binary.toString();
        Assert.assertEquals("1010", binaryStr);
    }

    @Test
    public void shouldPrintCorrectNegativeBinaryIntegerString() {
        BinaryInteger binary = new BinaryInteger(-142342);
        String binaryStr = binary.toString();
        Assert.assertEquals("11111111111111011101001111111010", binaryStr);
    }

    @Test
    public void shouldPrintCorrectZeroBinaryIntegerString() {
        BinaryInteger binary = new BinaryInteger(0);
        String binaryStr = binary.toString();
        Assert.assertEquals("0", binaryStr);
    }

    @Test
    public void shouldPrintCorrectPositiveFullBinaryIntegerString() throws Exception {
        BinaryInteger binary = new BinaryInteger(10);
        String binaryStr = binary.toFullString();
        Assert.assertEquals("00000000000000000000000000001010", binaryStr);
    }

    @Test
    public void shouldPrintCorrectNegativeFullBinaryIntegerString() throws Exception {
        BinaryInteger binary = new BinaryInteger(-324343);
        String binaryStr = binary.toFullString();
        Assert.assertEquals("11111111111110110000110100001001", binaryStr);
    }

    @Test
    public void shouldPrintCorrectZeroFullBinaryIntegerString() throws Exception {
        BinaryInteger binary = new BinaryInteger(0);
        String binaryStr = binary.toFullString();
        Assert.assertEquals("00000000000000000000000000000000", binaryStr);
    }

    @Test
    public void shouldGetBitOne() throws Exception {
        BinaryInteger binary = new BinaryInteger(33634);
        boolean bit = binary.getBitAt(1);
        Assert.assertEquals(true, bit);
    }

    @Test
    public void shouldGetBitZero() throws Exception {
        BinaryInteger binary = new BinaryInteger(23422);
        boolean bit = binary.getBitAt(10);
        Assert.assertEquals(false, bit);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAssigningNegativePosition() throws Exception {
        BinaryInteger binary =  new BinaryInteger(234234);
        boolean bit = binary.getBitAt(-1);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAssigningOutOfRangedPosition() throws Exception {
        BinaryInteger binary =  new BinaryInteger(234234);
        boolean bit = binary.getBitAt(32);
    }
}