import javax.microedition.lcdui.Graphics;

public final class ag
{
  public static long[] a;
  public static byte[][] a;
  private static long a;
  
  public static void a(Graphics paramGraphics)
  {
    if (jdField_a_of_type_ArrayOfLong == null) {
      return;
    }
    int i = 52;
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
      if (jdField_a_of_type_ArrayOfLong[j] != 0L)
      {
        Graphics localGraphics = paramGraphics;
        int m = i;
        int k = j;
        if (jdField_a_of_type_ArrayOfLong[k] != 0L)
        {
          f.a(localGraphics, e.a(13), 3, m, 38 + jdField_a_of_type_Array2dOfByte[k][4] * 19, 0, 19, 18, 0);
          f.a(localGraphics, e.a(0), 22, m, 62, 12, 24, 5, 0);
          if (jdField_a_of_type_Array2dOfByte[k][4] != 2)
          {
            localGraphics.setColor(jdField_a_of_type_Array2dOfByte[k][4] == 0 ? 16352670 : 12807801);
            localGraphics.fillRect(22, m + 1, jdField_a_of_type_Array2dOfByte[k][2], 1);
            localGraphics.setColor(jdField_a_of_type_Array2dOfByte[k][4] == 0 ? 13184308 : 7484212);
            localGraphics.fillRect(22, m + 2, jdField_a_of_type_Array2dOfByte[k][2], 2);
          }
          f.a(localGraphics, e.a(0), 22, m + 5, 62, 12, 24, 5, 0);
          if (jdField_a_of_type_Array2dOfByte[k][4] != 2)
          {
            localGraphics.setColor(jdField_a_of_type_Array2dOfByte[k][4] == 0 ? 8373754 : 7442871);
            localGraphics.fillRect(22, m + 6, jdField_a_of_type_Array2dOfByte[k][3], 1);
            localGraphics.setColor(jdField_a_of_type_Array2dOfByte[k][4] == 0 ? 2590191 : 3230086);
            localGraphics.fillRect(22, m + 7, jdField_a_of_type_Array2dOfByte[k][3], 2);
          }
          if (jdField_a_of_type_Array2dOfByte[k][4] != 2) {
            ad.a(localGraphics, 6, m + 3, jdField_a_of_type_Array2dOfByte[k][0] + 5);
          } else {
            ad.a(localGraphics, 6, m + 3, jdField_a_of_type_Array2dOfByte[k][0] + 13);
          }
          ad.a(localGraphics, e.a(3), jdField_a_of_type_Array2dOfByte[k][1], 20, m + 11, 3);
          if (jdField_a_of_type_ArrayOfLong[k] == jdField_a_of_type_Long) {
            f.a(localGraphics, e.a(0), 3, m + 11, 86, 13, 7, 7, 0);
          }
        }
        i += 21;
      }
    }
    if (e.a.jdField_a_of_type_Long == jdField_a_of_type_Long) {
      f.a(paramGraphics, e.a(0), 17, 22, 86, 13, 7, 7, 0);
    }
  }
  
  public static void a(long paramLong)
  {
    jdField_a_of_type_Long = paramLong;
  }
  
  public static void a(long paramLong, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    if (jdField_a_of_type_ArrayOfLong == null)
    {
      jdField_a_of_type_ArrayOfLong = new long[3];
      jdField_a_of_type_Array2dOfByte = new byte[3][5];
    }
    int i = -1;
    do
    {
      i++;
      if (i >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
    } while (jdField_a_of_type_ArrayOfLong[i] != paramLong);
    return;
    i = -1;
    do
    {
      i++;
      if (i >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
    } while (jdField_a_of_type_ArrayOfLong[i] != 0L);
    jdField_a_of_type_ArrayOfLong[i] = paramLong;
    jdField_a_of_type_Array2dOfByte[i][0] = paramByte1;
    jdField_a_of_type_Array2dOfByte[i][1] = paramByte2;
    jdField_a_of_type_Array2dOfByte[i][2] = paramByte3;
    jdField_a_of_type_Array2dOfByte[i][3] = paramByte4;
    jdField_a_of_type_Array2dOfByte[i][4] = paramByte5;
    return;
  }
  
  public static void a(long paramLong, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    if (jdField_a_of_type_ArrayOfLong == null) {
      return;
    }
    int i = -1;
    do
    {
      i++;
      if (i >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
    } while (jdField_a_of_type_ArrayOfLong[i] != paramLong);
    jdField_a_of_type_Array2dOfByte[i][1] = paramByte3;
    jdField_a_of_type_Array2dOfByte[i][2] = paramByte1;
    jdField_a_of_type_Array2dOfByte[i][3] = paramByte2;
    jdField_a_of_type_Array2dOfByte[i][4] = paramByte4;
    return;
  }
  
  public static void b(long paramLong)
  {
    int i = -1;
    do
    {
      i++;
      if (i >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
    } while (jdField_a_of_type_ArrayOfLong[i] != paramLong);
    jdField_a_of_type_ArrayOfLong[i] = 0L;
    return;
  }
  
  public static boolean a()
  {
    if ((jdField_a_of_type_ArrayOfLong == null) || (jdField_a_of_type_Array2dOfByte == null)) {
      return false;
    }
    if (jdField_a_of_type_Long == e.a.jdField_a_of_type_Long) {
      return false;
    }
    return n.a(e.a.jdField_a_of_type_ArrayOfByte, 15) == 1;
  }
  
  public static boolean a(long paramLong)
  {
    if ((jdField_a_of_type_ArrayOfLong == null) || (jdField_a_of_type_Array2dOfByte == null)) {
      return false;
    }
    int i = -1;
    do
    {
      i++;
      if (i >= jdField_a_of_type_ArrayOfLong.length) {
        break;
      }
    } while (jdField_a_of_type_ArrayOfLong[i] != paramLong);
    return true;
    return false;
  }
  
  static
  {
    jdField_a_of_type_ArrayOfLong = null;
    jdField_a_of_type_Array2dOfByte = null;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */