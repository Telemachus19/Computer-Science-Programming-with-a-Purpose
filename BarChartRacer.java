/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.util.Arrays;

public class BarChartRacer {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();
        String fileName = args[0];
        int k = Integer.parseInt(args[1]);
        In in = new In(fileName);
        String title = in.readLine();
        String xAxis = in.readLine();
        String source = in.readLine();
        in.readLine();
        BarChart chart = new BarChart(title, xAxis, source);
        while (in.hasNextLine()) {
            int n = Integer.parseInt(in.readLine());
            Bar[] bars = new Bar[n];
            String caption = "";
            for (int i = 0; i < n; i++) {
                String record = in.readLine();
                String[] recordArr = record.split(",");
                caption = recordArr[0];
                String name = recordArr[1];
                int value = Integer.parseInt(recordArr[3]);
                String category = recordArr[4];
                bars[i] = new Bar(name, value, category);
            }
            Arrays.sort(bars);
            chart.setCaption(caption);
            for (int i = n - 1; i > n - 1 - k; i--) {
                if (bars[i].getValue() <= 0) continue;
                chart.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());
            }
            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(55);
            chart.reset();
            in.readLine();
        }
        chart.reset();
    }
}
