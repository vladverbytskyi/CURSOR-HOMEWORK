package FirstHomeWork;

public class TestMySkill {

    static byte b;
    static short s;
    static long l;
    static double d;
    static float f;
    static int i;

    public static void main (String [] args) {
        i = 33564;
        int addInt = i + i;
        int subInt = (int) (i - i);
        int divInt = (int) (i / i);
        int multInt = (int) (i * i);

        System.out.println("Addition " + addInt);
        System.out.println("Subtraction " + subInt);
        System.out.println("Division " + divInt);
        System.out.println("Multiplication " + multInt);
        System.out.println(" ");

        b = 9;
        byte addByte = (byte) (b + b);
        byte subByte = (byte) (b - b);
        byte divByte = (byte) (b / b);
        byte multByte = (byte) (b * b);

        System.out.println("Addition " + addByte);
        System.out.println("Subtraction " + subByte);
        System.out.println("Division " + divByte);
        System.out.println("Multiplication " + multByte);
        System.out.println(" ");

        s = 526;
        short addShort = (short) (s + s);
        short subShort = (short) (s - s);
        short divShort = (short) (s / s);
        short multShort = (short) (s * s);

        System.out.println("Addition " + addShort);
        System.out.println("Subtraction " + subShort);
        System.out.println("Division " + divShort);
        System.out.println("Multiplication " + multShort);
        System.out.println(" ");

        l = 854775807L;
        long addLong = (long) (l + l);
        long subLong = (long) (l - l);
        long divLong = (long) (l / l);
        long multLong = (long) (l * l);

        System.out.println("Addition " + addLong);
        System.out.println("Subtraction " + subLong);
        System.out.println("Division " + divLong);
        System.out.println("Multiplication " + multLong);
        System.out.println(" ");

        d = 4.62351653;
        double addDouble = (double) (d + d);
        double subDouble = (double) (d - d);
        double divDouble = (double) (d / d);
        double multDouble = (double) (d *d);

        System.out.println("Addition " + addDouble);
        System.out.println("Subtraction " + subDouble);
        System.out.println("Division " + divDouble);
        System.out.println("Multiplication " + multDouble);
        System.out.println(" ");

        f = 5.656565f;
        float addFloat = (float) (f + f);
        float subFloat = (float) (f - f);
        float divFloat = (float) (f / f);
        float multFloat = (float) (f * f);

        System.out.println("Addition " + addFloat);
        System.out.println("Subtraction " + subFloat);
        System.out.println("Division " + divFloat);
        System.out.println("Multiplication " + multFloat);






    }

}
