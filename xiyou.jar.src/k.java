import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class k
{
  int jdField_a_of_type_Int;
  public int b;
  public int c = 0;
  a[] jdField_a_of_type_ArrayOfA;
  int[][] jdField_a_of_type_Array2dOfInt;
  int[][] b;
  int[][] c;
  int[][] jdField_d_of_type_Array2dOfInt;
  Image jdField_a_of_type_JavaxMicroeditionLcduiImage;
  boolean jdField_a_of_type_Boolean = false;
  int jdField_d_of_type_Int;
  int jdField_e_of_type_Int;
  int f;
  int g = 80;
  int[][] jdField_e_of_type_Array2dOfInt;
  
  public k()
  {
    this.d = 0;
    this.e = 0;
  }
  
  public final void a()
  {
    if (this.jdField_a_of_type_Boolean) {
      return;
    }
    this.jdField_a_of_type_Boolean = true;
    this.f = (ad.a(100) % 2 + 1);
    this.d = ad.a(30, 50);
    this.e = ad.a(25, 50);
  }
  
  public final void b()
  {
    try
    {
      e.a(36);
      e.a(37);
      e.a(38);
      e.a(39);
      e.a(40);
      e.a(41);
      this.jdField_a_of_type_JavaxMicroeditionLcduiImage = Image.createImage("/cursor.png");
      return;
    }
    catch (IOException localIOException) {}
  }
  
  static int[][] a(int[][] paramArrayOfInt, int paramInt)
  {
    
    while (paramInt > 0)
    {
      paramArrayOfInt[0][0] += paramArrayOfInt[paramInt][0];
      paramArrayOfInt[paramInt][0] = (paramArrayOfInt[0][0] - paramArrayOfInt[paramInt][0]);
      paramArrayOfInt[0][0] -= paramArrayOfInt[paramInt][0];
      paramInt--;
    }
    return paramArrayOfInt;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */