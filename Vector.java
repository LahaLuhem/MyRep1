/**
 * Implementation of a mathematical vector with possible functions
 * @author (Mehul A.)
 * @version (a version number or a date)
 */
public class Vector {
  Point pos;
  double leng;
  
    public Vector (double x, double y, double z) {
      pos = new Point (x, y, z);
      leng = pos.distance (new Point (0, 0, 0));
    }
    
    public Vector (double x, double y) {
      pos = new Point (x, y, 0);
      leng = pos.distance (new Point (0, 0, 0));
    }
  
    public Vector (Point point) {
      pos = point;
      leng = pos.distance (new Point (0, 0, 0));
    }
    
   @Override
    public String toString () {
      return "[" + pos.x + "î + " + pos.y + "ĵ + " + pos.z + "k̂]";
    }
    
    public boolean equals (Vector vecB) {
      return pos.equals (vecB.pos);
    }
    
    public double magnitude () {
      return leng;
    }
    
    public double angle (boolean inRadians) {
      return (new Point (0, 0, 0)).angle (pos, inRadians);
    }
    
    public double angle (Vector vecB, boolean inRadians) {
      return pos.angle (vecB.pos, inRadians);
    }
    
    public Vector add (Vector vecB) {
      return new Vector (pos.x + vecB.pos.x, pos.y + vecB.pos.y, pos.z + vecB.pos.z);
    }
    
    public double dot (Vector vecB, double theta, boolean inRadians) {
      return inRadians ? leng*vecB.leng*Math.cos (theta) : leng*vecB.leng*Math.cos (theta*Math.PI/180.0);
    }
    
    public Vector dot (Vector vecB, double theta, boolean inRadians, boolean returnVec) {
      return new Vector (pos.x*vecB.pos.x, pos.y*vecB.pos.y, pos.z*vecB.pos.z);
    }
    
    public double cross (Vector vecB, double theta, boolean inRadians) {
      return inRadians ? leng*vecB.leng*Math.sin (theta) : leng*vecB.leng*Math.sin (theta*Math.PI/180.0);
    }
}