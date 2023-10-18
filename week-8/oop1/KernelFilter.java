/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.awt.Color;

public class KernelFilter {

    private static Picture kernel(Picture picture, double[][] weights) {
        int pictureWidth = picture.width();
        int pictureHeight = picture.height();
        Picture newPic = new Picture(pictureWidth, pictureHeight);
        Color newColor;
        double[] doubleColors = new double[3];
        int[] intColors = new int[3];
        int filterLimit = weights.length / 2, filterLength = weights.length - filterLimit;
        for (int col = 0; col < pictureWidth; col++) {
            for (int row = 0; row < pictureHeight; row++) {
                for (int i = -filterLimit; i < filterLength; i++) {
                    for (int j = -filterLimit; j < filterLength; j++) {
                        Color color = picture.get((pictureWidth + i + col) % pictureWidth,
                                                  (pictureHeight + j + row) % pictureHeight);
                        doubleColors[0] += color.getRed() * weights[i + filterLimit][j
                                + filterLimit];
                        doubleColors[1] += color.getGreen() * weights[i + filterLimit][j
                                + filterLimit];
                        doubleColors[2] += color.getBlue() * weights[i + filterLimit][j
                                + filterLimit];
                    }
                }
                for (int x = 0; x < 3; x++) {
                    intColors[x] = (int) Math.round(doubleColors[x]);
                    if (intColors[x] > 255) intColors[x] = 255;
                    if (intColors[x] < 0) intColors[x] = 0;
                }
                newColor = new Color(intColors[0], intColors[1], intColors[2]);
                newPic.set(col, row, newColor);
                for (int x = 0; x < 3; x++) doubleColors[x] = 0;
            }
        }
        return newPic;
    }

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        return picture;
    }


    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture) {
        double[][] weights = {
                { 1.0 / 16.0, 2.0 / 16.0, 1.0 / 16.0 },
                { 2.0 / 16.0, 4.0 / 16.0, 2.0 / 16.0 },
                { 1.0 / 16.0, 2.0 / 16.0, 1.0 / 16.0 }
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        double[][] weights = {
                { 0.0, -1.0, 0 },
                { -1.0, 5.0, -1.0 },
                { 0.0, -1.0, 0.0 }
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        double[][] weights = {
                { -1.0, -1.0, -1.0 },
                { -1.0, 8.0, -1.0 },
                { -1.0, -1.0, -1.0 }
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        double[][] weights = {
                { -2.0, -1.0, 0.0 },
                { -1.0, 1.0, 1.0 },
                { 0.0, 1.0, 2.0 }
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        double[][] weights = new double[9][9];
        for (int i = 0; i < 9; i++) weights[i][i] = 1.0 / 9.0;
        return kernel(picture, weights);
    }

    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);

        Picture identity = identity(pic);
        identity.show();

        Picture gaussian = gaussian(pic);
        gaussian.show();

        Picture sharpen = sharpen(pic);
        sharpen.show();

        Picture laplacian = laplacian(pic);
        laplacian.show();

        Picture emboss = emboss(pic);
        emboss.show();

        Picture motionBlur = motionBlur(pic);
        motionBlur.show();
    }
}
