package com.lugowoy.tasks.core.calculateDistanceFromPointToSingleCircleWithCenterAtGivenPoint;

import com.lugowoy.helper.calculating.CalculableOnTheTwoVariables;
import com.lugowoy.helper.factory.creator.Creator;
import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Main {

    public static void main(String[] args) {

        Point<Double> pointM = getPoint("M");
        Point<Double> pointC = getPoint("C");

        System.out.println(pointM);
        System.out.println(pointC);

        System.out.println();

        double distance = calculatingDistanceFromPointToSingleCircle.calculate(pointM, pointC);

        System.out.printf("If we assume that the point C(%.2f, %.2f) is the center of the unit circle, " +
                        "\n then the distance from the point M(%.2f, %.2f) to the unit circle is %.2f .", pointC.getCoordinateX(), pointC.getCoordinateY(),
                pointM.getCoordinateX(), pointM.getCoordinateY(), distance);

    }

    private static Point<Double> getPoint(String pointName) {
        Reader reader = new Reader(new ReadingDataUserInputInConsole());
        Creator<Point<Double>> creator = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates());

        System.out.println("Enter coordinates for the point " + pointName + " .");
        Point<Double> point = creator.create();

        System.out.println("x : ");
        point.setCoordinateX(reader.readDouble());
        System.out.println("y : ");
        point.setCoordinateY(reader.readDouble());

        return point;
    }

    private static CalculableOnTheTwoVariables<Double, Point<Double>, Point<Double>> calculatingDistanceFromPointToSingleCircle = (firstPoint, secondPoint) ->
            sqrt(pow(firstPoint.getCoordinateX() - (secondPoint.getCoordinateX() + 1.0), 2)) + pow(firstPoint.getCoordinateY() - (secondPoint.getCoordinateY() + 1.0), 2);

}