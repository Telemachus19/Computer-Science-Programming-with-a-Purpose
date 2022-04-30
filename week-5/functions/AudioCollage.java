/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int m = a.length, n = b.length;
        if (m == n) {
            double[] c = new double[m];
            for (int i = 0; i < m; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        }
        if (m > n) {
            double[] c = new double[m];
            for (int i = 0; i < n; i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = n; i < m; i++) {
                c[i] = a[i];
            }
            return c;
        }
        double[] c = new double[n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = m; i < n; i++) {
            c[i] = b[i];
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int resampledSize = (int) Math.floor(a.length / alpha);
        int ialpha;
        double[] b = new double[resampledSize];
        for (int i = 0; i < resampledSize; i++) {
            ialpha = (int) (Math.floor(i * alpha));
            b[i] = a[ialpha];
        }
        return b;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        // double[] a = { -0.25, -0.25 };
        // double[] b = { 0.125, -0.3125, 0.3125 };
        // double[] c = mix(a, b);
        // for (int i = 0; i < c.length; i++) {
        //     StdOut.printf("%f ", c[i]);
        // }
        double[] chimes = StdAudio.read("chimes.wav");
        // // double[] beatbox = StdAudio.read("beatbox.wav");
        // // double[] buzzer = StdAudio.read("buzzer.wav");
        // // double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");
        double[] exposure = StdAudio.read("exposure.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] singer = StdAudio.read("singer.wav");
        // double[] silence = StdAudio.read("silence.wav");
        // double[] scratch = StdAudio.read("scratch.wav");
        // StdAudio.play(harp);
        // StdAudio.play(reverse(harp));
        // StdAudio.play(chimes);
        // StdAudio.play(beatbox);
        // StdAudio.play(buzzer);
        // StdAudio.play(cow);
        // StdAudio.play(dialup);
        // StdAudio.play(exposure);
        // StdAudio.play(reverse(exposure));
        // StdAudio.play(merge(reverse(dialup), reverse(exposure)));
        StdAudio.play(merge(piano, reverse(harp)));
        StdAudio.play(merge(reverse(dialup), amplify(reverse(changeSpeed(exposure, 2)), 2)));
        StdAudio.play(merge(changeSpeed(chimes, 2), reverse(singer)));
        // for (int i = 0; i < chimes.length; i++) {
        //     StdOut.println(chimes[i]);
        // }

        // double[] chimesAmplified = amplify(chimes, 5);
        // double[] chimesReversed = reverse(chimes);
        // double[] chimesappended = merge(chimesAmplified, chimesReversed);
        // for (int i = 0; i < chimesAmplified.length; i++) {
        //     StdOut.println(chimesAmplified[i]);
        // }
        // for (int i = 0; i < chimesReversed.length; i++) {
        //     StdOut.println(chimesReversed[i]);
        // }
        // double[] doubleSpeed = changeSpeed(chimes, 2);
        // StdAudio.play(chimes);
        // StdAudio.play(chimesAmplified);
        // StdAudio.play(chimesReversed);
        // StdAudio.play(chimesappended);
        // StdAudio.play(doubleSpeed);
        StdAudio.close();

    }
}
