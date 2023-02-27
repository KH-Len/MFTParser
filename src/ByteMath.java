import java.util.Arrays;

public class ByteMath {

    public static int toDecimal(byte[] input, int start, int end) {
        return toDecimal(Arrays.copyOfRange(input, start, end));
    }
    public static int toDecimal(byte[] input) {
        int out = 0;
        for (int i = 0; i < input.length; i++) {
            int asInt = input[i] & 0xff;
            out += (asInt * pow(16, (i*2)));
        }
        return out;
    }
    private static int pow(int base, int exp) {
        // Special Cases
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        // Regular Case
        int output = base;
        for (int i = 1; i < exp; i++) {
            output += base;
        }
        return output;
    }
}
