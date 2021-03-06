package OOP.LAB03_WORKING_WITH_ABSTRACTION.L02_PointInRectangle;

public class Rectangle {

    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point2D point) {
        return point.isGreaterOrEqualByX(bottomLeft)
                && point.isLessOrEqualByX(topRight)
                && point.isGreaterOrEqualByY(bottomLeft)
                && point.isLessOrEqualByY(topRight);
    }

}
