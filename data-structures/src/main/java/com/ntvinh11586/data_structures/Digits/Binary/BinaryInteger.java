package com.ntvinh11586.data_structures.Digits.Binary;

public class BinaryInteger implements BinaryAssignment {
    int bits;

    public BinaryInteger(int bits) {
        this.bits = bits;
    }

    public boolean getBitAt(int position) throws Exception {
        if (position < 0 || position > 31) {
            throw new Exception();
        }

        return ((this.bits & (1 << position)) != 0);
    }

    @Override
    public String toString() {
        return Integer.toBinaryString(bits);
    }

    public String toFullString() throws Exception {
        char[] binaryStrBuffer = new char[32];

        for (int position = 0; position < 32; position++) {
            binaryStrBuffer[Math.abs((position - 31) % 32)]
                    = getBitAt(position) ? '1' : '0' ;
        }

        return new String(binaryStrBuffer);
    }
}
