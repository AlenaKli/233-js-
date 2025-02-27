public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }

    public double distanceTo(Point3d point3d){
        return Math.sqrt(Math.pow(point3d.getX()-xCoord,2) + Math.pow(point3d.getY()-yCoord,2)
                + Math.pow(point3d.getZ()-zCoord,2));
    }

    public boolean equalsTo(Point3d point3d){
        return ((point3d.getX() == xCoord) && (point3d.getY() == yCoord) && (point3d.getY() == yCoord));
    }

    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
}
