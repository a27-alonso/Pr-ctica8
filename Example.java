public class Example {
    private static char CharPrimitive;

    public static void main(String[] args){

        boolean booleanPrimitive = true;
        boolean myInt = false;
        Boolean booleanClass = Boolean.valueOf(myInt);
        booleanPrimitive = booleanClass.booleanValue();

        byte bytePrimitive = 10;
        Byte byteClass = Byte.valueOf(bytePrimitive);
        bytePrimitive = byteClass.byteValue();

        short shortPrimitive = 100;
        Short shortClass = Short.valueOf(shortPrimitive);
        shortPrimitive = shortClass.shortValue();

        char charPrimitive = 'A';
        Character charClass = Character.valueOf(CharPrimitive);
        charPrimitive = charClass.charValue();

        int intPrimitive = 1000;
        Integer intClass = Integer.valueOf(intPrimitive);
        intPrimitive = intClass.intValue();

        long longPrimitive = 1000000000000L;
        Long longClass = Long.valueOf(longPrimitive);
        longPrimitive = longClass.longValue();

        float floatPrimitive = 3.141592F;
        Float floatClass = Float.valueOf(floatPrimitive);
        floatPrimitive = floatClass.floatValue();

        double doublePrimitive = 10.123456789;
        Double doubleClass = Double.valueOf(doublePrimitive);
        doublePrimitive = doubleClass.doubleValue();
    }
}
