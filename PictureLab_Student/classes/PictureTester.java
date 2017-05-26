/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("../images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture vl2r = new Picture("../images/redMotorcycle.jpg");
    Picture vr2l = new Picture("../images/redMotorcycle.jpg");
    vl2r.explore();
    vl2r.mirrorVertical();
    vl2r.explore();
    vr2l.mirrorVerticalRightToLeft();
    vr2l.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("../images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("../images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("../images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
   /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("../images/beach.jpg");
    //beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
   /** Method to test negate() */
  public static void testNegate()
  {
    Picture beach = new Picture("../images/beach.jpg");
    //beach.explore();
    beach.negate();
    beach.explore();
  }
    /** Method to test grayscale() */
  public static void testGrayscale()
  {
    Picture beach = new Picture("../images/beach.jpg");
    //beach.explore();
    beach.grayscale();
    beach.explore();
  }
   /** Method to test fixUnderwater() */
  public static void testFixUnderwater()
  {
    Picture water = new Picture("../images/water.jpg");
    water.explore();
    water.fixUnderwater(100,10,40);
    water.explore();
    water.fixUnderwater(40,0,0);
    water.explore();
    water.fixUnderwater(0,0,-60);
    water.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorHorizontal()
  {
    Picture vl2r = new Picture("../images/redMotorcycle.jpg");
    Picture vr2l = new Picture("../images/redMotorcycle.jpg");
    vl2r.explore();
    vl2r.mirrorHorizontalTopToBottom();
    vl2r.explore();
    vr2l.mirrorHorizontalBottomToTop();
    vr2l.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorDiagonal()
  {
    Picture vl2r = new Picture("../images/beach.jpg");
    vl2r.explore();
    vl2r.mirrorDiagonal();
    vl2r.explore();
  }
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture sm = new Picture("../images/snowman.jpg");
    sm.explore();
    sm.mirrorArms();
    sm.explore();
  }
  /** Method to test mirrorArms */
  public static void testMirrorSeagull()
  {
    Picture sm = new Picture("../images/seagull.jpg");
    sm.explore();
    sm.mirrorSeagull();
    sm.explore();
  }
  
  /** Method to test partial copy */
  public static void testPartialCopy()
  {
    Picture f1 = new Picture("../images/flower1.jpg");
    Picture destination = new Picture();
    destination.copy(f1, 2, 26, 33, 67, 0, 0);
    destination.copy(f1, 33, 20, 83, 75, 50, 0);
    destination.copy(f1, 2, 26, 33, 67, 100, 50);
    destination.mirrorVertical();
    destination.mirrorHorizontalTopToBottom();
    destination.explore();
  }
  /** Method to test the collage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("../images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection2()
  {
    Picture swan1 = new Picture("../images/swan.jpg");
    Picture swan2 = new Picture("../images/swan.jpg");
    Picture swan3 = new Picture("../images/swan.jpg");
    swan1.edgeDetection(9,11);
    swan1.explore();
    swan2.edgeDetection(6,7);
    swan2.explore();
    swan3.edgeDetection(12,16);
    swan3.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorSeagull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testPartialCopy();
    //testMyCollage();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}