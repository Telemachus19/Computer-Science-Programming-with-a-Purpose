/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Huntingtons {
    public static int maxRepeats(String dna) {
        int len = dna.length();
        int i = dna.indexOf("CAG");
        if (i == -1)
            return 0;
        int max = 0, cnt = 0;
        String cmp;
        while (i < len - 2) {
            cmp = dna.substring(i, i + 3);
            if (cmp.equals("CAG")) {
                cnt++;
                i += 2;
            }
            else {
                max = (cnt >= max) ? cnt : max;
                cnt = 0;
            }
            i++;
        }
        max = (cnt >= max) ? cnt : max;
        return max;
    }

    public static String removeWhitespace(String s) {
        String output = s.replace(" ", "");
        output = output.replace("\n", "");
        output = output.replace("\t", "");
        return output;
    }

    public static String diagnose(int maxRepeats) {
        if (maxRepeats <= 35 && maxRepeats >= 10) {
            return "normal";
        }
        else if (maxRepeats <= 39 && maxRepeats >= 36) {
            return "high risk";
        }
        else if (maxRepeats <= 180 && maxRepeats >= 40) {
            return "Huntington’s";
        }
        return "not human";
    }

    public static void main(String[] args) {
        In intputStream = new In(args[0]);
        String s = intputStream.readAll();
        s = removeWhitespace(s);
        int repates = maxRepeats(s);
        StdOut.println("max repeats = " + repates);
        StdOut.println(diagnose(repates));
    }
}
