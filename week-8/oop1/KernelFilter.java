/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class KernelFilter {

    // private static Picture kernel(Picture picture, double[][] weights){
    //
    // }
    // Returns a new picture that applies the identity filter to the given picture.
    // public static Picture identity(Picture picture) {
    //     return picture;
    // }


    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    // public static Picture gaussian(Picture picture){}

    // Returns a new picture that applies a sharpen filter to the given picture.
    // public static Picture sharpen(Picture picture) {
    //     int width = picture.width();
    //     int height = picture.height();
    //     int[][] weights = {
    //             { 0, -1, 0 },
    //             { -1, 5, -1 },
    //             { 0, -1, 0 }
    //     };
    //     Picture newPicture = new Picture(width, height);
    //     // Loop over pixels of Image
    //     for (int col = 0; col < width; col++) {
    //         for (int row = 0; row < height; row++) {
    //
    //             // Looping over filter
    //
    //         }
    //     }
    // }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    // public static Picture laplacian(Picture picture){}

    // Returns a new picture that applies an emboss filter to the given picture.
    // public static Picture emboss(Picture picture){}

    // Returns a new picture that applies a motion blur filter to the given picture.
    // public static Picture motionBlur(Picture picture){}
    public static void main(String[] args) {
        int[][] weights = {
                { 0, -1, 0 },
                { -1, 5, -1 },
                { 0, -1, 0 }
        };
        int[][] pic = {
                { 255, 45, 0, 0, 0, 0 },  // 0
                { 23, 66, 10, 50, 40, 78 }, // 1
                { 45, 22, 120, 60, 70, 67 }, // 2
                { 79, 34, 100, 30, 20, 56 }, // 3
                { 61, 45, 33, 66, 43, 160 } // 4
                // 0   1   2   3   4   5
        };
        int x = Math.floorMod(-1, 6);
        int y = Math.floorMod(-1, 5);
        System.out.println(pic[y][x]);

    }
}
