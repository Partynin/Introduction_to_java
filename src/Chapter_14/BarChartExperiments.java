package Chapter_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BarChartExperiments extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BarChart Experiments");

        CategoryAxis xAxis = new CategoryAxis();


        //xAxis.setLabel("Devices");

        NumberAxis yAxis = new NumberAxis();

        //yAxis.setLabel("Visits");

        BarChart barChart = new BarChart(xAxis, yAxis);
        barChart.setHorizontalGridLinesVisible(false);
        barChart.setVerticalGridLinesVisible(false);
        barChart.setLegendVisible(false);


        XYChart.Series dataSeries1 = new XYChart.Series();
        //dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data("Desktop", 178));
        dataSeries1.getData().add(new XYChart.Data("Phone", 65));
        dataSeries1.getData().add(new XYChart.Data("Tablet", 23));
        dataSeries1.getData().add(new XYChart.Data("Tablet1", 23));
        dataSeries1.getData().add(new XYChart.Data("Tablet2", 23));
        dataSeries1.getData().add(new XYChart.Data("Tablet3", 23));

        barChart.getData().add(dataSeries1);

        Pane vbox = new Pane(barChart);

        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        //primaryStage.setHeight(300);
       //primaryStage.setWidth(1200);
        primaryStage.show();
    }
}
