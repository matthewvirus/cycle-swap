package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        try {
            int buf = array[array.length-1];
            System.arraycopy(array, 0, array, 1, array.length-1);
            array[0] = buf;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            array = array;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        try {
            if (shift < array.length) {
                int[] buf = new int[array.length];
                System.arraycopy(array, 0, buf, shift, array.length-shift);
                System.arraycopy(array, array.length-shift, buf, 0, shift);
                for (int i = 0; i < array.length; i++) {
                    array[i] = buf[i];
                }
            }
            else {
                array = array;
            }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            array = array;
        }
    }
}
