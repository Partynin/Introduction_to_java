package Chapter_14;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class RandomTimeClockPane extends ClockPane {
    private static boolean hourHandVisible = true;
    private static boolean minuteHandVisible = true;
    private static boolean secondHandVisible = true;

    public static boolean isHourHandVisible() {
        return hourHandVisible;
    }

    public static void setHourHandVisible(boolean hourHandVisible) {
        RandomTimeClockPane.hourHandVisible = hourHandVisible;
    }

    public static boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }

    public static void setMinuteHandVisible(boolean minuteHandVisible) {
        RandomTimeClockPane.minuteHandVisible = minuteHandVisible;
    }

    public static boolean isSecondHandVisible() {
        return secondHandVisible;
    }

    public static void setSecondHandVisible(boolean secondHandVisible) {
        RandomTimeClockPane.secondHandVisible = secondHandVisible;
    }

    @Override
    protected void paintClock() {
        // Initialize clock parameters
        double clockRadius = Math.min(getW(), getH()) * 0.8 * 0.5;
        double centerX = getW() / 2;
        double centerY = getH() / 2;

        getChildren().clear();

        // Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

        getChildren().addAll(circle, t1, t2, t3, t4);

        // Draw second hand
        if (secondHandVisible) {
            double sLength = clockRadius * 0.8;
            double secondX = centerX + sLength * Math.sin(getSecond() * (2 * Math.PI / 60));
            double secondY = centerY - sLength * Math.cos(getSecond() * (2 * Math.PI / 60));
            Line sLine = new Line(centerX, centerY, secondX, secondY);
            sLine.setStroke(Color.RED);
            getChildren().add(sLine);
        }

        // Draw minute hand
        if (minuteHandVisible) {
            double mLength = clockRadius * 0.65;
            double xMinute = centerX + mLength * Math.sin(getMinute() * (2 * Math.PI / 60));
            double minuteY = centerY - mLength * Math.cos(getMinute() * (2 * Math.PI / 60));
            Line mLine = new Line(centerX, centerY, xMinute, minuteY);
            mLine.setStroke(Color.BLUE);
            mLine.setStrokeWidth(2);
            getChildren().add(mLine);
        }

        // Draw hour hand
        if (hourHandVisible) {
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((getHour() % 12 + getMinute() / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((getHour() % 12 + getMinute() / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);
        hLine.setStrokeWidth(3);
        getChildren().add(hLine);
        }

        getChildren().add(new Text(100, 240, getHour() + ":" + getMinute()+ ":"
                + getSecond()));
    }
}
