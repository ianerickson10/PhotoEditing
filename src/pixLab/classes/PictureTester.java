package pixLab.classes;

import java.awt.Color;
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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.zeroRed();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testReverseMirrorVertical()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.reverseMirrorVertical();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testFilter()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.filter();
	  beach.exposureUp();
	  beach.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture mountain = new Picture("SnowyMountains.JPG");
	  mountain.explore();
	  mountain.mirrorHorizontal();
	  mountain.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testMessedUpCollage()
  {
	  Picture cumber = new Picture("CumberlandIsland.jpg");
	  cumber.explore();
	  cumber.messedUpCollage();
	  cumber.explore();
  }
  
  public static void testChromakey()
  {
	  Picture source = new Picture("Merc.JPG");
	  Picture background = new Picture("SnowyMountains.JPG");
	  source.explore();
	  background.explore();
	  source.chromakey(background, Color.gray);
	  source.explore();
  }
  
  public static void testShiftLeftRight()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.shiftLeftRight(10);
	  beach.explore();
  }
  
  public static void testHeckinMessUp()
  {
	  Picture eclipse = new Picture("EclipseSmall.JPG");
	  Picture snow = new Picture("SnowyMountains.JPG");
	  eclipse.explore();
	  eclipse.heckinMessUp(snow);
	  eclipse.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("EclipseSmall.JPG");
	  
	  Picture hide = new Picture("SmallWall.JPG");
	  source.explore();
	  hide.explore();
	  source.hidePicture(hide);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    //to run
//    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorTemple();
    //testMirrorArms();
//    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
//    testReverseMirrorVertical();
//    testZeroRed();
//    testFilter();
//    testMirrorHorizontal();
//    testMessedUpCollage();
//	  testChromakey();
//	  testShiftLeftRight();
	  testHeckinMessUp();
//	  testSteganography();
  }
}