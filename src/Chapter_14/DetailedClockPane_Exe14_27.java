package Chapter_14;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class DetailedClockPane_Exe14_27 extends ClockPane {
    @Override /** Paint the clock */
    protected void paintClock() {
        // Initialize clock parameters
        double clockRadius = Math.min(getW(), getH()) * 0.8 * 0.5;
        double centerX = getW() / 2;
        double centerY = getH() / 2;

        // Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        ArrayList<Text> listText = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            // Draw numbers
            double sLength = clockRadius * 0.8;
            double distantX = centerX - 4 + sLength * Math.sin((5 * i) * (2 * Math.PI / 60));
            double distantY = centerY + 5 - sLength * Math.cos((5 * i) * (2 * Math.PI / 60));
            listText.add(new Text(distantX, distantY, i + ""));
        }

        // Draw lines
        ArrayList<Line> listLines = new ArrayList<>();
        for (int i = 1; i < 61; i++) {
            double lineEnd = clockRadius;
            double lineEndX = centerX + lineEnd * Math.sin(i * (2 * Math.PI / 60));
            double lineEndY = centerY - lineEnd * Math.cos(i * (2 * Math.PI / 60));

            double lineSt = clockRadius * 0.95;
            if (i % 5 == 0)
                lineSt *= 0.93;
            double lineStX = centerX + lineSt * Math.sin(i * (2 * Math.PI / 60));
            double lineStY = centerY - lineSt * Math.cos(i * (2 * Math.PI / 60));
            listLines.add(new Line(lineEndX, lineEndY, lineStX, lineStY));
        }

        // Draw second hand
        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(getSecond() * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(getSecond() * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        // Draw minute hand
        double mLength = clockRadius * 0.65;
        double xMinute = centerX + mLength * Math.sin(getMinute() * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(getMinute() * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, minuteY);
        mLine.setStroke(Color.BLUE);
        mLine.setStrokeWidth(2);

        // Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((getHour() % 12 + getMinute() / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((getHour() % 12 + getMinute() / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);
        hLine.setStrokeWidth(3);

        getChildren().clear();
        getChildren().add(circle);
        for (Text tx : listText) {
            getChildren().add(tx);
        }
        for (Line line : listLines) {
            getChildren().add(line);
        }
        getChildren().addAll(sLine, mLine, hLine);
        getChildren().add(new Text(100, 240, getHour() + ":" + getMinute()+ ":"
        + getSecond()));
    }
}
