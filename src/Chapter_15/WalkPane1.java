package Chapter_15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.util.Duration;

public class WalkPane1 extends Pane {
    // Lattice size is 16 by 16
    private int cell = 16;
    private double widthX = cell * 10;
    private double heightY = cell * 10;
    private Polyline polyline = new Polyline();
    private ObservableList<Double> list = polyline.getPoints();
    private int countStep = 0;
    private Timeline animation;
    private int stepWalk = 0;
    private int countDedEnds = 0;

    public WalkPane1() {
        for (int i = 1; i <= cell; i++) {
            Line lineH = new Line(10 * i, 0, 10 * i, heightY);
            lineH.setStroke(Color.LIGHTBLUE);
            Line lineV = new Line(0, 10 * i, widthX, 10 * i);
            lineV.setStroke(Color.LIGHTBLUE);
            getChildren().addAll(lineH, lineV);
        }
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public int getCountDedEnds() {
        return countDedEnds;
    }

    public void setCountDedEnds(int countDedEnds) {
        this.countDedEnds = countDedEnds;
    }

    public double getWidthX() {
        return widthX;
    }

    public void setWidthX(double widthX) {
        this.widthX = widthX;
    }

    public double getHeightY() {
        return heightY;
    }

    public void setHeightY(double heightY) {
        this.heightY = heightY;
    }

    /** Start self-avoiding random walk */
    public void startWalk() {
        getChildren().add(getRandomWalk());
    }

    /** Reset walk */
    public void resetWalk() {
        getChildren().remove(getRandomWalk());
        countStep = 0;
        list.clear();
    }

    /** Compute polyline as random walk */
    public Polyline getRandomWalk() {
        list.add(0, 80.0);
        list.add(1, 80.0);
        int countDedEnd = 0;

        while (!isSideEnd()) {
            // For computing loops
            countDedEnd++;

            // Random direction for X
            int randomX = 0;
            int random = (int) (Math.random() * 3);
            if (random == 0)
                randomX = -1;
            else if (random == 1)
                randomX = 1;

            // Random direction for Y
            int randomY = 0;
            int random1 = (int) (Math.random() * 3);
            if (random1 == 0)
                randomY = -1;
            else if (random1 == 1)
                randomY = 1;

            if (randomX != 0) {
                double x = list.get(0 + countStep) + (10 * randomX);
                double y = list.get(1 + countStep);

                // Getting dead-dnd paths
                if (countDedEnd > 20) {
                    countDedEnds++;
                    return polyline;
                }

                if (!isPointExists(x, y)) {
                    list.add(2 + countStep, x);
                    list.add(3 + countStep, y);
//                        System.out.println("x" + countStep + " = " + x + " y" + countStep
//                        + " = " + y);
                } else continue;
            } else if (randomY != 0) {
                double x = list.get(0 + countStep);
                double y = list.get(1 + countStep) + (10 * randomY);

                // Getting dead-dnd paths
                if (countDedEnd > 20) {
                    countDedEnds++;
                    return polyline;
                }

                if (!isPointExists(x, y)) {
                    list.add(2 + countStep, x);
                    list.add(3 + countStep, y);
//                        System.out.println("x" + countStep + " = " + x + " y" + countStep
//                                + " = " + y);
                } else continue;
            } else continue;

            countStep += 2;
            countDedEnd = 0;
            // System.out.println("countStep = " + countStep);
        }

        return polyline;
    }

    /** Find if walker get side */
    public boolean isSideEnd() {
        if (list.get(countStep) >= widthX || list.get(countStep) <= 0 ||
                list.get(countStep + 1) >= heightY || list.get(countStep + 1) <= 0)
            return true;

        return false;
    }

    /** Is this point already exists */
    public boolean isPointExists(double x, double y) {
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) == x && list.get(i + 1) == y)
                return true;
        }

        return false;
    }

    public void startAnimation() {
        animationWalk(getRandomWalk());
        System.out.println(list);
    }

    public void animationWalk(Polyline polyline) {
        // Create an animation for moving the walk
        animation = new Timeline(new KeyFrame(Duration.millis(100),
                e -> moveWalk()));
        animation.setCycleCount(list.size() / 2 - 1);
        animation.play();
    }

    public void moveWalk() {
        getChildren().add(new Line(list.get(stepWalk), list.get(1 + stepWalk),
                list.get(2 + stepWalk), list.get(3 + stepWalk)));
        stepWalk += 2;
    }
}

