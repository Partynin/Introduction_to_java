package Chapter_18;

import Chapter_10.MyPoint;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GameKnightTourAnimation_Exe18_33 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ChessBoardPane pane = new ChessBoardPane();


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chess Board");
        primaryStage.show();
    }

    class ChessBoardPane extends Pane {
        ChessSquare[][] squares = new ChessSquare[8][8];
        boolean[][] isTaken = new boolean[8][8];
        Polyline polyline = new Polyline();
        int[] currentP = new int[2];
        int firstX;
        int firstY;
        boolean isFirstMove = true;
        ArrayList<MyPoint> availablePath = new ArrayList<>(8);
        ImageView imageView;
        PathTransition pt = new PathTransition();

        PathTransition path = new PathTransition();
        Line line = new Line();

        Button btnSolve = new Button("Solve");
        Button btnReset = new Button("Reset");

        ChessBoardPane() {
            GridPane gridPane = new GridPane();
            gridPane.setPadding(new Insets(10));


            for (int i = 0; i < squares.length; i++) {
                for (int j = 0; j < squares[i].length; j++) {
                    gridPane.add(squares[i][j] = new ChessSquare(), j, i);
                    squares[i][j].setPrefSize(80, 80);
                    int x = j;
                    int y = i;
                    squares[i][j].setOnMouseClicked(e -> {

                        if (isFirstMove) {
                            firstX = x;
                            firstY = y;
                            currentP[0] = x;
                            currentP[1] = y;
                            isFirstMove = false;
                            setPoint(x, y);
                        } else {
                            playerMove(x, y);
                        }

                    });
                }
            }

            btnSolve.setOnMouseClicked(e-> completeReset());
            btnReset.setOnMouseClicked(e-> completeReset());
            BorderPane borderPane = new BorderPane(gridPane);
            HBox hBox = new HBox(5, btnSolve, btnReset);
            hBox.setAlignment(Pos.BASELINE_CENTER);
            hBox.setPadding(new Insets(10));
            borderPane.setBottom(hBox);

            getChildren().addAll(borderPane, polyline);
        }

        private void completeReset() {
            resetChessBoard();
            isFirstMove = true;
        }

        private void resetChessBoard() {
            isTaken = new boolean[8][8];
            for (ChessSquare[] square : squares) {
                for (ChessSquare aSquare : square) {
                    aSquare.reset();
                }
            }
            polyline.getPoints().clear();
        }

        private void solve() {
            resetChessBoard();
            setPoint(firstX, firstY); // draw first point
            boolean isSuccess = false;

            while (!isSuccess) {
                isSuccess = move(firstX, firstY);
                if (!isSuccess) {
                    resetChessBoard();
                }
            }

        }

        private boolean move(int x, int y) {

            availablePath.clear();
            if (x >= 1 && y >= 2 && !isTaken[y - 2][x - 1]) // 2 up 1 left
                availablePath.add(new MyPoint(x - 1, y - 2));
            if (x >= 2 && y >= 1 && !isTaken[y - 1][x - 2]) // 1 up 2 left
                availablePath.add(new MyPoint(x - 2, y - 1));
            if (x <= 6 && y >= 2 && !isTaken[y - 2][x + 1]) // 2 up 1 right
                availablePath.add(new MyPoint(x + 1, y - 2));
            if (x <= 5 && y >= 1 && !isTaken[y - 1][x + 2]) // 1 up 2 right
                availablePath.add(new MyPoint(x + 2, y - 1));
            if (x >= 1 && y <= 5 && !isTaken[y + 2][x - 1]) // 2 down 1 left
                availablePath.add(new MyPoint(x - 1, y + 2));
            if (x >= 2 && y <= 6 && !isTaken[y + 1][x - 2]) // 1 down 2 left
                availablePath.add(new MyPoint(x - 2, y + 1));
            if (x <= 5 && y <= 6 && !isTaken[y + 1][x + 2]) // 1 down 2 right
                availablePath.add(new MyPoint(x + 2, y + 1));
            if (x <= 6 && y <= 5 && !isTaken[y + 2][x + 1]) // 2 down 1 right
                availablePath.add(new MyPoint(x + 1, y + 2));

            if (availablePath.size() > 0) {
                MyPoint p = availablePath.get((int)(Math.random() * availablePath.size()));
                setPoint((int)p.x, (int)p.y);
                return move((int)p.x, (int)p.y);

            }

            return isSuccess();
        }

        private boolean isSuccess() {

            boolean isSuccess = true;
            for (int i = 0; i < isTaken.length; i++) {
                for (int j = 0; j < isTaken[i].length; j++) {
                    if (!isTaken[i][j]) {
                        isSuccess = false;
                    }
                }
            }

            return isSuccess;
        }

        private void setPoint(int x, int y) {
            double x1 = x * 80.0 + 50;
            double y1 = y * 80.0 + 50;
            squares[y][x].placeKnight();
            polyline.getPoints().addAll(x1, y1);
            isTaken[y][x] = true;
        }

        private void playerMove(int x, int y) {
            if (isValidMove(x, y)) {
                squares[currentP[1]][currentP[0]].leavePathMark();
                setPoint(x, y);
                currentP[0] = x;
                currentP[1] = y;
            }

        }

        private boolean isValidMove(int x, int y) {
            return (!isTaken[y][x] && (currentP[1] == y - 2 && x == currentP[0] - 1 ||  // 2 up 1 left
                    currentP[1] == y - 1 && currentP[0] == x - 2 || // 1 up 2 left
                    currentP[1] == y - 2 && currentP[0] == x - 1 || // 2 up 1 right
                    currentP[1] == y - 1 && currentP[0] == x + 2 || // 1 up 2 right
                    currentP[1] == y + 2 && currentP[0] == x - 1 || // 2 down 1 left
                    currentP[1] == y + 1 && currentP[0] == x - 2 || // 1 down 2 left
                    currentP[1] == y + 1 && currentP[0] == x + 2 || // 1 down 2 right
                    currentP[1] == y + 2 && currentP[0] == x + 1));  // 2 down 1 right
        }
    }

    class ChessSquare extends Pane {
        ChessSquare() {
            reset();
        }

        private void reset() {
            setStyle("-fx-border-color: black; -fx-background-color: gray");
        }

        private void placeKnight() {
            setStyle("-fx-border-color: black;");
            setBackground(
                    new Background(
                            new BackgroundImage(
                                    new Image("file:/C:/Users/Konstantin/IdeaProjects/Introduction_to_java/book/image/horse.jpg"), null, null, null,
                                    new BackgroundSize(100, 100, true, true, true, true))));
        }

        private void leavePathMark() {
            setStyle("-fx-border-color: black; -fx-background-color: blue");
        }
    }
}
