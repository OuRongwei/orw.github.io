import engine.Ancient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.TimeZone;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class e
{
  public static g a;
  public static String a;
  public static String b;
  public static bg a;
  public static int a;
  public static short a;
  private static String[] jdField_b_of_type_ArrayOfJavaLangString;
  public static final StringBuffer a;
  public static final n a;
  public static boolean a;
  public static ad a;
  public static q a;
  private static String jdField_g_of_type_JavaLangString;
  public static String c;
  public static byte[] a;
  public static c a;
  public static String[] a;
  public static int b;
  private static k jdField_a_of_type_K;
  private static int jdField_c_of_type_Int;
  private static String[] jdField_c_of_type_ArrayOfJavaLangString;
  private static a jdField_a_of_type_A;
  private static Image[] jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage;
  private static Image[] jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage;
  private static int d;
  private static TimeZone jdField_a_of_type_JavaUtilTimeZone = TimeZone.getDefault();
  private static int e;
  private static int f;
  public static ah a;
  public static byte a;
  public static byte b;
  public static bc a;
  public static String d;
  public static String e;
  private static String h;
  private static String i;
  public static String f;
  public static boolean b;
  private static int jdField_g_of_type_Int;
  
  public static final void a()
  {
    jdField_g_of_type_JavaLangString = "socket://221.130.10.103:30000";
    try
    {
      (jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = a("/t", jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, 0))[15] = null;
      int[] arrayOfInt = new int[d.jdField_a_of_type_Int * 10];
      for (int j = 0; j < arrayOfInt.length; j++) {
        arrayOfInt[j] = -1303557810;
      }
      jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[15] = Image.createRGBImage(arrayOfInt, d.jdField_a_of_type_Int, 10, true);
      (jdField_a_of_type_K = new k()).b();
      return;
    }
    catch (Exception localException) {}
  }
  
  public static final void b() {}
  
  public static final void c()
  {
    if (jdField_b_of_type_Int == 0)
    {
      if (d.jdField_c_of_type_Int > 20) {
        jdField_b_of_type_Int += 1;
      }
    }
    else
    {
      Object localObject = "/a";
      String str = "/i";
      Ancient.jdField_a_of_type_D.a();
      jdField_a_of_type_Ad = new ad((String)localObject, str);
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      localObject = new int[] { 0, 1, 2, 3 };
      jdField_a_of_type_Ad.a((int[])localObject);
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      jdField_a_of_type_Ad.c((int[])localObject);
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      a(0, "user");
      a(2, "gameset");
      if (jdField_a_of_type_Short == 0) {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x7E);
      }
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      t.jdField_a_of_type_ArrayOfJavaLangString = a("/pkinfo.dat");
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      jdField_a_of_type_ArrayOfJavaLangString = a("/npcdia.dat");
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      d.a();
      d.a((byte)1, 0);
      d.d();
    }
  }
  
  public static final void a(Graphics paramGraphics)
  {
    int j = d.jdField_b_of_type_Int / 30;
    String str;
    if (jdField_b_of_type_Int == 0)
    {
      paramGraphics.setFont(bg.a);
      paramGraphics.setColor(6644831);
      paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
      paramGraphics.setColor(-1);
      if (a(42) != null) {
        if (d.jdField_b_of_type_Int < 320) {
          f.a(paramGraphics, a(42), d.jdField_a_of_type_Int - a(42).getWidth() >> 1, 20, 0, 0, 136, 58, 0);
        } else {
          f.a(paramGraphics, a(42), d.jdField_a_of_type_Int - a(42).getWidth() >> 1, 40, 0, 0, 136, 58, 0);
        }
      }
      if (d.jdField_b_of_type_Int < 320) {
        i1 = 80 + (d.jdField_b_of_type_Int - 80 - (4 * paramGraphics.getFont().getHeight() + 6) >> 1);
      } else {
        i1 = 100 + (d.jdField_b_of_type_Int - 100 - (4 * paramGraphics.getFont().getHeight() + 6) >> 1);
      }
      str = "适当游戏";
      n = paramGraphics.getFont().stringWidth(str);
      paramGraphics.setColor(0);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) + 1, i1, 20);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) - 1, i1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 + 1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 - 1, 20);
      paramGraphics.setColor(-1);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1, 20);
      str = "慎防沉迷";
      n = paramGraphics.getFont().stringWidth(str);
      i1 += 2 + paramGraphics.getFont().getHeight();
      paramGraphics.setColor(0);
      paramGraphics.setColor(0);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) + 1, i1, 20);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) - 1, i1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 + 1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 - 1, 20);
      paramGraphics.setColor(-1);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1, 20);
      str = "合理安排时间";
      n = paramGraphics.getFont().stringWidth(str);
      i1 += 2 + paramGraphics.getFont().getHeight();
      paramGraphics.setColor(0);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) + 1, i1, 20);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) - 1, i1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 + 1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 - 1, 20);
      paramGraphics.setColor(-1);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1, 20);
      str = "享受健康生活";
      n = paramGraphics.getFont().stringWidth(str);
      i1 += 2 + paramGraphics.getFont().getHeight();
      paramGraphics.setColor(0);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) + 1, i1, 20);
      paramGraphics.drawString(str, (d.jdField_a_of_type_Int - n >> 1) - 1, i1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 + 1, 20);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1 - 1, 20);
      paramGraphics.setColor(-1);
      paramGraphics.drawString(str, d.jdField_a_of_type_Int - n >> 1, i1, 20);
      return;
    }
    int m = d.jdField_b_of_type_Int - 45;
    paramGraphics.setColor(6644831);
    paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    paramGraphics.drawImage(a(40), (d.jdField_a_of_type_Int - 170) / 2, str << 3, 0);
    f.a(paramGraphics, a(41), d.jdField_a_of_type_Int - 62 >> 1, str * 23, 0, 11, 60, 23, 0);
    int n = d.jdField_a_of_type_Int - 70 >> 1;
    f.a(paramGraphics, a(41), n, str * 25 + 13, 0, 0, 69, 11, 0);
    f.a(paramGraphics, a(41), n, str * 25 + 3, 69, 0, 19, 9, 0);
    f.a(paramGraphics, a(41), n + 19, str * 25 + 3, 19, 0, 50, 11, 0);
    int k = d.jdField_a_of_type_Int - 140 >> 1;
    paramGraphics.setColor(59, 56, 60);
    m += 12;
    paramGraphics.fillRect(k, m, 140, 13);
    paramGraphics.setColor(7236463);
    paramGraphics.drawLine(k, m, k + 140, m);
    paramGraphics.drawLine(k, m + 12, k + 140, m + 12);
    f.a(paramGraphics, a(0), k - 4, m, 28, 0, 4, 13, 0);
    f.a(paramGraphics, a(0), k + 140, m, 28, 0, 4, 13, 2);
    int i1 = 144 * jdField_b_of_type_Int / 10;
    ad.a(paramGraphics, a(3), jdField_b_of_type_Int * 10 > 100 ? 100 : jdField_b_of_type_Int * 10, (d.jdField_a_of_type_Int >> 1) - 12, d.jdField_b_of_type_Int - 45, 5);
    ad.b(paramGraphics, jdField_b_of_type_Int * 10 >= 100 ? (d.jdField_a_of_type_Int >> 1) + 6 : (d.jdField_a_of_type_Int >> 1) + 2, d.jdField_b_of_type_Int - 45);
    paramGraphics.setFont(bg.a);
    paramGraphics.setColor(14941449);
    paramGraphics.setClip(k - 2, m, i1, 13);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(k, m + 1, 140, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(k - 1, m + 2, 142, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(k - 2, m + 3, 144, 2);
    paramGraphics.setColor(4036603);
    paramGraphics.fillRect(k - 2, m + 5, 144, 5);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(k - 1, m + 10, 142, 2);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(k, m + 10, 140, 2);
    f.a(paramGraphics, a(0), k - 2, m + 2, 32, 0, 2, 9, 0);
  }
  
  public static final Image[] a(String paramString, Image[] paramArrayOfImage, int[] paramArrayOfInt, int paramInt)
  {
    String str = 0;
    try
    {
      DataInputStream localDataInputStream;
      paramString = (localDataInputStream = new DataInputStream(Ancient.jdField_a_of_type_EngineAncient.getClass().getResourceAsStream(paramString))).readUnsignedShort();
      if (paramArrayOfImage == null) {
        paramArrayOfImage = new Image[paramString];
      }
      int k = 0;
      for (str = 0; str < paramString; str++)
      {
        int j = localDataInputStream.readInt();
        byte[] arrayOfByte;
        if (str == paramArrayOfInt[k])
        {
          int m = paramInt == 0 ? str : k;
          if (paramArrayOfImage[m] == null)
          {
            arrayOfByte = new byte[j];
            localDataInputStream.readFully(arrayOfByte, 0, arrayOfByte.length);
            paramArrayOfImage[m] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
          }
          else
          {
            localDataInputStream.skipBytes(arrayOfByte);
          }
          k++;
          if (k == paramArrayOfInt.length) {
            break;
          }
        }
        else
        {
          localDataInputStream.skipBytes(arrayOfByte);
        }
      }
      localDataInputStream.close();
    }
    catch (Exception localException) {}
    return paramArrayOfImage;
  }
  
  public static final void d() {}
  
  public static final void e()
  {
    d.a();
    d.a((byte)3, 48);
  }
  
  public static final void f()
  {
    jdField_a_of_type_Boolean = false;
    if (jdField_a_of_type_K == null) {
      (jdField_a_of_type_K = new k()).b();
    }
    k localk1;
    (localk1 = jdField_a_of_type_K).b();
    k localk2 = localk1;
    if (d.jdField_b_of_type_Int >= 250)
    {
      j = d.jdField_a_of_type_Int / 88 + 2;
      localk2.jdField_b_of_type_Array2dOfInt = new int[j][3];
      for (k = 0; k < j; k++)
      {
        localk2.jdField_b_of_type_Array2dOfInt[k][0] = (d.jdField_a_of_type_Int - (k + 1) * 88);
        localk2.jdField_b_of_type_Array2dOfInt[k][1] = 0;
        localk2.jdField_b_of_type_Array2dOfInt[k][2] = 2;
      }
    }
    localk2 = localk1;
    int j = d.jdField_a_of_type_Int / 240 + 2;
    localk2.jdField_d_of_type_Array2dOfInt = new int[j][3];
    for (int k = 0; k < j; k++)
    {
      localk2.jdField_d_of_type_Array2dOfInt[k][0] = (d.jdField_a_of_type_Int - (k + 1) * 240);
      localk2.jdField_d_of_type_Array2dOfInt[k][1] = (d.jdField_b_of_type_Int - 160);
      localk2.jdField_d_of_type_Array2dOfInt[k][2] = 2;
    }
    localk2 = localk1;
    j = d.jdField_a_of_type_Int / 50 + 2;
    localk2.jdField_c_of_type_Array2dOfInt = new int[j][2];
    for (k = 0; k < j; k++)
    {
      localk2.jdField_c_of_type_Array2dOfInt[k][0] = (d.jdField_a_of_type_Int - (k + 1) * 50);
      localk2.jdField_c_of_type_Array2dOfInt[k][1] = (d.jdField_b_of_type_Int - 37);
    }
    localk2 = localk1;
    localk1.jdField_e_of_type_Array2dOfInt = new int[13][8];
    localk2.jdField_e_of_type_Array2dOfInt[0][0] = 10;
    localk2.jdField_e_of_type_Array2dOfInt[0][1] = (d.jdField_b_of_type_Int - 200);
    localk2.jdField_e_of_type_Array2dOfInt[0][2] = 1;
    localk2.jdField_e_of_type_Array2dOfInt[0][3] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[0][4] = 62;
    localk2.jdField_e_of_type_Array2dOfInt[0][5] = 57;
    localk2.jdField_e_of_type_Array2dOfInt[0][6] = 35;
    localk2.jdField_e_of_type_Array2dOfInt[0][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[1][0] = (d.jdField_a_of_type_Int - 90);
    localk2.jdField_e_of_type_Array2dOfInt[1][1] = (d.jdField_b_of_type_Int / 10 + 60);
    localk2.jdField_e_of_type_Array2dOfInt[1][2] = 1;
    localk2.jdField_e_of_type_Array2dOfInt[1][3] = 120;
    localk2.jdField_e_of_type_Array2dOfInt[1][4] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[1][5] = 90;
    localk2.jdField_e_of_type_Array2dOfInt[1][6] = '';
    localk2.jdField_e_of_type_Array2dOfInt[1][7] = 38;
    localk2.jdField_e_of_type_Array2dOfInt[2][0] = '';
    localk2.jdField_e_of_type_Array2dOfInt[2][1] = (d.jdField_b_of_type_Int - 180);
    localk2.jdField_e_of_type_Array2dOfInt[2][2] = 2;
    localk2.jdField_e_of_type_Array2dOfInt[2][3] = 53;
    localk2.jdField_e_of_type_Array2dOfInt[2][4] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[2][5] = 95;
    localk2.jdField_e_of_type_Array2dOfInt[2][6] = 34;
    localk2.jdField_e_of_type_Array2dOfInt[2][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[3][0] = 20;
    localk2.jdField_e_of_type_Array2dOfInt[3][1] = (d.jdField_b_of_type_Int - 165);
    localk2.jdField_e_of_type_Array2dOfInt[3][2] = 2;
    localk2.jdField_e_of_type_Array2dOfInt[3][3] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[3][4] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[3][5] = 120;
    localk2.jdField_e_of_type_Array2dOfInt[3][6] = '';
    localk2.jdField_e_of_type_Array2dOfInt[3][7] = 38;
    localk2.jdField_e_of_type_Array2dOfInt[4][0] = 100;
    localk2.jdField_e_of_type_Array2dOfInt[4][1] = (d.jdField_b_of_type_Int - 140);
    localk2.jdField_e_of_type_Array2dOfInt[4][2] = 2;
    localk2.jdField_e_of_type_Array2dOfInt[4][3] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[4][4] = 38;
    localk2.jdField_e_of_type_Array2dOfInt[4][5] = 48;
    localk2.jdField_e_of_type_Array2dOfInt[4][6] = 24;
    localk2.jdField_e_of_type_Array2dOfInt[4][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[5][0] = 5;
    localk2.jdField_e_of_type_Array2dOfInt[5][1] = (d.jdField_b_of_type_Int - 40);
    localk2.jdField_e_of_type_Array2dOfInt[5][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[5][3] = 84;
    localk2.jdField_e_of_type_Array2dOfInt[5][4] = 109;
    localk2.jdField_e_of_type_Array2dOfInt[5][5] = 30;
    localk2.jdField_e_of_type_Array2dOfInt[5][6] = 13;
    localk2.jdField_e_of_type_Array2dOfInt[5][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[6][0] = 30;
    localk2.jdField_e_of_type_Array2dOfInt[6][1] = (d.jdField_b_of_type_Int - 60);
    localk2.jdField_e_of_type_Array2dOfInt[6][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[6][3] = 120;
    localk2.jdField_e_of_type_Array2dOfInt[6][4] = 32;
    localk2.jdField_e_of_type_Array2dOfInt[6][5] = 30;
    localk2.jdField_e_of_type_Array2dOfInt[6][6] = 24;
    localk2.jdField_e_of_type_Array2dOfInt[6][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[7][0] = '?';
    localk2.jdField_e_of_type_Array2dOfInt[7][1] = (d.jdField_b_of_type_Int - 36);
    localk2.jdField_e_of_type_Array2dOfInt[7][2] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[7][3] = '';
    localk2.jdField_e_of_type_Array2dOfInt[7][4] = 50;
    localk2.jdField_e_of_type_Array2dOfInt[7][5] = 30;
    localk2.jdField_e_of_type_Array2dOfInt[7][6] = 7;
    localk2.jdField_e_of_type_Array2dOfInt[7][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[8][0] = 65;
    localk2.jdField_e_of_type_Array2dOfInt[8][1] = (d.jdField_b_of_type_Int - 90);
    localk2.jdField_e_of_type_Array2dOfInt[8][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[8][3] = '';
    localk2.jdField_e_of_type_Array2dOfInt[8][4] = 60;
    localk2.jdField_e_of_type_Array2dOfInt[8][5] = 45;
    localk2.jdField_e_of_type_Array2dOfInt[8][6] = 65;
    localk2.jdField_e_of_type_Array2dOfInt[8][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[9][0] = 105;
    localk2.jdField_e_of_type_Array2dOfInt[9][1] = (d.jdField_b_of_type_Int - 70);
    localk2.jdField_e_of_type_Array2dOfInt[9][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[9][3] = '';
    localk2.jdField_e_of_type_Array2dOfInt[9][4] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[9][5] = 35;
    localk2.jdField_e_of_type_Array2dOfInt[9][6] = 45;
    localk2.jdField_e_of_type_Array2dOfInt[9][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[10][0] = '¾';
    localk2.jdField_e_of_type_Array2dOfInt[10][1] = (d.jdField_b_of_type_Int - 98);
    localk2.jdField_e_of_type_Array2dOfInt[10][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[10][3] = 58;
    localk2.jdField_e_of_type_Array2dOfInt[10][4] = 39;
    localk2.jdField_e_of_type_Array2dOfInt[10][5] = 64;
    localk2.jdField_e_of_type_Array2dOfInt[10][6] = 56;
    localk2.jdField_e_of_type_Array2dOfInt[10][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[11][0] = '?';
    localk2.jdField_e_of_type_Array2dOfInt[11][1] = (d.jdField_b_of_type_Int - 42);
    localk2.jdField_e_of_type_Array2dOfInt[11][2] = 20;
    localk2.jdField_e_of_type_Array2dOfInt[11][3] = 84;
    localk2.jdField_e_of_type_Array2dOfInt[11][4] = 96;
    localk2.jdField_e_of_type_Array2dOfInt[11][5] = 21;
    localk2.jdField_e_of_type_Array2dOfInt[11][6] = 14;
    localk2.jdField_e_of_type_Array2dOfInt[11][7] = 37;
    localk2.jdField_e_of_type_Array2dOfInt[12][0] = '';
    localk2.jdField_e_of_type_Array2dOfInt[12][1] = (d.jdField_b_of_type_Int - 54);
    localk2.jdField_e_of_type_Array2dOfInt[12][2] = 3;
    localk2.jdField_e_of_type_Array2dOfInt[12][3] = 0;
    localk2.jdField_e_of_type_Array2dOfInt[12][4] = 96;
    localk2.jdField_e_of_type_Array2dOfInt[12][5] = 85;
    localk2.jdField_e_of_type_Array2dOfInt[12][6] = 27;
    localk2.jdField_e_of_type_Array2dOfInt[12][7] = 37;
    localk2 = localk1;
    if (d.jdField_a_of_type_Int >= 320) {
      localk2.jdField_g_of_type_Int = 120;
    }
    int[] arrayOfInt = { 5, 6, 7 };
    jdField_a_of_type_Ad.a(arrayOfInt);
    jdField_a_of_type_Ad.c(arrayOfInt);
    localk2.jdField_a_of_type_ArrayOfA = new a[3];
    for (k = 0; k < localk2.jdField_a_of_type_ArrayOfA.length; k++)
    {
      localk2.jdField_a_of_type_ArrayOfA[k] = new a();
      localk2.jdField_a_of_type_ArrayOfA[k].a(k + 5);
    }
    localk2.jdField_a_of_type_Array2dOfInt = new int[3][2];
    for (k = 0; k < localk2.jdField_a_of_type_Array2dOfInt.length; k++)
    {
      localk2.jdField_a_of_type_Array2dOfInt[k][0] = 0;
      localk2.jdField_a_of_type_Array2dOfInt[k][1] = (localk2.jdField_g_of_type_Int + k * 50);
    }
    localk1.jdField_b_of_type_Int = 100;
  }
  
  public static final void g()
  {
    if (jdField_a_of_type_K != null)
    {
      k localk = jdField_a_of_type_K;
      int j = -1;
      for (;;)
      {
        j++;
        if (j >= localk.jdField_a_of_type_ArrayOfA.length) {
          break;
        }
        int k = localk.jdField_a_of_type_ArrayOfA[j].jdField_a_of_type_Int;
        ad localad;
        if ((localad = jdField_a_of_type_Ad).jdField_a_of_type_ArrayOfB[k] != null)
        {
          int[] arrayOfInt1 = new int[20];
          int n;
          int[] arrayOfInt2 = new int[n = ad.a(localad.jdField_a_of_type_ArrayOfB[k], arrayOfInt1, 0)];
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, n);
          int m = -1;
          for (;;)
          {
            m++;
            if (m >= arrayOfInt2.length) {
              break;
            }
            if (localad.b[arrayOfInt2[m]] != d.jdField_c_of_type_Int)
            {
              localad.b[(localad.b.length - 1)] -= (localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[arrayOfInt2[m]].getWidth() * localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[arrayOfInt2[m]].getHeight() << 1);
              localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[arrayOfInt2[m]] = null;
              localad.b[arrayOfInt2[m]] = 0;
            }
          }
          localad.jdField_a_of_type_ArrayOfInt[(localad.jdField_a_of_type_ArrayOfInt.length - 1)] -= 1;
          localad.jdField_a_of_type_ArrayOfInt[k] = 0;
          localad.jdField_a_of_type_ArrayOfB[k].a();
          localad.jdField_a_of_type_ArrayOfB[k] = null;
        }
        localk.jdField_a_of_type_ArrayOfA[j] = null;
      }
      localk.jdField_a_of_type_ArrayOfA = null;
      localk.jdField_a_of_type_Array2dOfInt = null;
      localk.jdField_b_of_type_Array2dOfInt = null;
      localk.jdField_c_of_type_Array2dOfInt = null;
      localk.jdField_d_of_type_Array2dOfInt = null;
      jdField_a_of_type_K = null;
    }
    I();
  }
  
  public static final void h()
  {
    if (jdField_a_of_type_K == null) {
      return;
    }
    k localk1;
    (localk1 = jdField_a_of_type_K).jdField_a_of_type_Int += 1;
    localk1.jdField_a_of_type_Int %= 100;
    k localk2 = localk1;
    if (localk1.jdField_c_of_type_Array2dOfInt[0][0] >= d.jdField_a_of_type_Int) {
      localk2.jdField_c_of_type_Array2dOfInt = k.a(localk2.jdField_c_of_type_Array2dOfInt, localk2.jdField_c_of_type_Array2dOfInt.length);
    }
    localk2.jdField_c_of_type_Array2dOfInt[0][0] += 3 + localk2.jdField_a_of_type_Array2dOfInt[0][0];
    for (int k = 0; k < localk2.jdField_c_of_type_Array2dOfInt.length - 1; k++) {
      localk2.jdField_c_of_type_Array2dOfInt[(k + 1)][0] = (localk2.jdField_c_of_type_Array2dOfInt[k][0] - 50);
    }
    localk2 = localk1;
    if ((d.jdField_b_of_type_Int >= 250) && (localk2.jdField_a_of_type_Int % localk2.jdField_b_of_type_Array2dOfInt[0][2] == 0))
    {
      if (localk2.jdField_b_of_type_Array2dOfInt[0][0] >= d.jdField_a_of_type_Int) {
        localk2.jdField_b_of_type_Array2dOfInt = k.a(localk2.jdField_b_of_type_Array2dOfInt, localk2.jdField_b_of_type_Array2dOfInt.length);
      }
      localk2.jdField_b_of_type_Array2dOfInt[0][0] += 1 + localk2.jdField_a_of_type_Array2dOfInt[0][0];
      for (k = 0; k < localk2.jdField_b_of_type_Array2dOfInt.length - 1; k++) {
        localk2.jdField_b_of_type_Array2dOfInt[(k + 1)][0] = (localk2.jdField_b_of_type_Array2dOfInt[k][0] - 88);
      }
    }
    localk2 = localk1;
    if (localk1.jdField_a_of_type_Int % localk2.jdField_d_of_type_Array2dOfInt[0][2] == 0)
    {
      if (localk2.jdField_d_of_type_Array2dOfInt[0][0] >= d.jdField_a_of_type_Int) {
        localk2.jdField_d_of_type_Array2dOfInt = k.a(localk2.jdField_d_of_type_Array2dOfInt, localk2.jdField_d_of_type_Array2dOfInt.length);
      }
      localk2.jdField_d_of_type_Array2dOfInt[0][0] += 1 + localk2.jdField_a_of_type_Array2dOfInt[0][0];
      for (k = 0; k < localk2.jdField_d_of_type_Array2dOfInt.length - 1; k++) {
        localk2.jdField_d_of_type_Array2dOfInt[(k + 1)][0] = (localk2.jdField_d_of_type_Array2dOfInt[k][0] - 240);
      }
    }
    localk2 = localk1;
    if (localk1.jdField_a_of_type_Boolean)
    {
      if (localk2.jdField_d_of_type_Int != 0)
      {
        localk2.jdField_a_of_type_Array2dOfInt[localk2.f][1] += 2;
        localk2.jdField_a_of_type_Array2dOfInt[localk2.f][0] = 0;
        if (localk2.f == 1)
        {
          localk2.jdField_a_of_type_Array2dOfInt[2][0] = 1;
          localk2.jdField_a_of_type_Array2dOfInt[0][0] = 1;
        }
        else
        {
          localk2.jdField_a_of_type_Array2dOfInt[1][0] = 1;
          localk2.jdField_a_of_type_Array2dOfInt[0][0] = 1;
        }
        localk2.jdField_d_of_type_Int -= 1;
      }
      if (localk2.jdField_d_of_type_Int < 0) {
        localk2.jdField_d_of_type_Int = 0;
      }
      if ((localk2.jdField_d_of_type_Int == 0) && (localk2.jdField_e_of_type_Int != 0))
      {
        localk2.jdField_a_of_type_Array2dOfInt[localk2.f][1] -= 2;
        localk2.jdField_a_of_type_Array2dOfInt[localk2.f][0] = 1;
        if (localk2.f == 1)
        {
          localk2.jdField_a_of_type_Array2dOfInt[2][0] = 0;
          localk2.jdField_a_of_type_Array2dOfInt[0][0] = 0;
        }
        else
        {
          localk2.jdField_a_of_type_Array2dOfInt[1][0] = 0;
          localk2.jdField_a_of_type_Array2dOfInt[0][0] = 0;
        }
        localk2.jdField_e_of_type_Int -= 1;
      }
      if (localk2.jdField_e_of_type_Int < 0) {
        localk2.jdField_e_of_type_Int = 0;
      }
      if ((localk2.jdField_d_of_type_Int == 0) && (localk2.jdField_e_of_type_Int == 0))
      {
        localk2.jdField_a_of_type_Array2dOfInt[0][0] = 0;
        localk2.jdField_a_of_type_Array2dOfInt[1][0] = 0;
        localk2.jdField_a_of_type_Array2dOfInt[2][0] = 0;
        localk2.jdField_a_of_type_Boolean = false;
      }
    }
    localk2.jdField_a_of_type_ArrayOfA[0].jdField_a_of_type_J.a(localk2.jdField_a_of_type_Array2dOfInt[0][0]);
    localk2.jdField_a_of_type_ArrayOfA[1].jdField_a_of_type_J.a(localk2.jdField_a_of_type_Array2dOfInt[1][0]);
    localk2.jdField_a_of_type_ArrayOfA[2].jdField_a_of_type_J.a(localk2.jdField_a_of_type_Array2dOfInt[2][0]);
    localk2 = localk1;
    for (k = 0; k < localk2.jdField_e_of_type_Array2dOfInt.length; k++) {
      if (localk2.jdField_e_of_type_Array2dOfInt[k][0] != 55537)
      {
        localk2.jdField_e_of_type_Array2dOfInt[k][0] += localk2.jdField_e_of_type_Array2dOfInt[k][2] + localk2.jdField_a_of_type_Array2dOfInt[0][0];
        if (localk2.jdField_e_of_type_Array2dOfInt[k][0] > d.jdField_a_of_type_Int) {
          localk2.jdField_e_of_type_Array2dOfInt[k][0] = (0 - localk2.jdField_e_of_type_Array2dOfInt[k][5]);
        }
      }
    }
    if (d.a(0) == 1)
    {
      jdField_a_of_type_K.jdField_c_of_type_Int = ((jdField_a_of_type_K.jdField_c_of_type_Int + jdField_c_of_type_Int - 1) % jdField_c_of_type_Int);
      jdField_a_of_type_K.a();
    }
    else if (d.a(1) == 1)
    {
      jdField_a_of_type_K.jdField_c_of_type_Int = ((jdField_a_of_type_K.jdField_c_of_type_Int + 1) % jdField_c_of_type_Int);
      jdField_a_of_type_K.a();
    }
    else if (d.a(4) > 0)
    {
      d(jdField_a_of_type_K.jdField_c_of_type_Int);
    }
    if (d.e() > 0)
    {
      int j = jdField_a_of_type_K.jdField_b_of_type_Int - 2;
      d((d.f() < 0) || (d.f() > d.jdField_a_of_type_Int) || (d.h() < j) || (d.h() > jdField_a_of_type_K.jdField_b_of_type_Int + 110) ? -1 : jdField_a_of_type_K == null ? -1 : (d.h() - j) / 25);
      d.f();
    }
  }
  
  private static void d(int paramInt)
  {
    if (paramInt == -1) {
      return;
    }
    if ((jdField_a_of_type_K == null) || (jdField_a_of_type_K.jdField_c_of_type_Int != paramInt))
    {
      jdField_a_of_type_K.jdField_c_of_type_Int = paramInt;
      return;
    }
    jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
    switch (paramInt)
    {
    case 0: 
      d.a();
      paramInt = "login";
      jdField_a_of_type_Bc.c(paramInt);
      d.b();
      return;
    case 1: 
      jdField_a_of_type_N.a();
      if (u.a("data", 1, jdField_a_of_type_N))
      {
        jdField_d_of_type_JavaLangString = jdField_a_of_type_N.a();
        jdField_e_of_type_JavaLangString = jdField_a_of_type_N.a();
        jdField_b_of_type_Byte = 1;
        jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
        d.a();
        d.a((byte)4, 0);
        d.b();
        return;
      }
      d("目前没有登录记录,请正常登陆!");
      return;
    case 2: 
      d.a();
      paramInt = "reg";
      jdField_a_of_type_Bc.c(paramInt);
      d.b();
      return;
    case 3: 
      d.a();
      paramInt = "about";
      jdField_a_of_type_Bc.c(paramInt);
      d.b();
      return;
    case 4: 
      d.e();
    }
  }
  
  private static void i(Graphics paramGraphics)
  {
    paramGraphics.setFont(bg.a);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
  }
  
  public static final void b(Graphics paramGraphics)
  {
    paramGraphics.setFont(bg.a);
    i(paramGraphics);
    paramGraphics.setColor(-1);
    if (jdField_a_of_type_K != null)
    {
      Graphics localGraphics1 = paramGraphics;
      paramGraphics = jdField_a_of_type_K;
      localGraphics1.setClip(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
      localGraphics1.setColor(235, 245, 255);
      localGraphics1.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
      Graphics localGraphics3 = localGraphics1;
      Graphics localGraphics2 = paramGraphics;
      if (d.jdField_b_of_type_Int >= 250) {
        for (m = 0; m < localGraphics2.jdField_b_of_type_Array2dOfInt.length; m++) {
          f.a(localGraphics3, a(36), localGraphics2.jdField_b_of_type_Array2dOfInt[m][0], localGraphics2.jdField_b_of_type_Array2dOfInt[m][1], 240, 0, 88, 113, 0);
        }
      }
      localGraphics3 = localGraphics1;
      localGraphics2 = paramGraphics;
      for (int m = 0; m < localGraphics2.jdField_d_of_type_Array2dOfInt.length; m++) {
        f.a(localGraphics3, a(36), localGraphics2.jdField_d_of_type_Array2dOfInt[m][0], localGraphics2.jdField_d_of_type_Array2dOfInt[m][1], 0, 0, 240, 142, 0);
      }
      localGraphics3 = localGraphics1;
      localGraphics2 = paramGraphics;
      for (m = 0; m < localGraphics2.jdField_e_of_type_Array2dOfInt.length; m++) {
        if (localGraphics2.jdField_e_of_type_Array2dOfInt[m][0] == 55537) {
          f.a(localGraphics3, a(localGraphics2.jdField_e_of_type_Array2dOfInt[m][7]), localGraphics2.jdField_e_of_type_Array2dOfInt[(m - 1)][0] + localGraphics2.jdField_e_of_type_Array2dOfInt[m][2], localGraphics2.jdField_e_of_type_Array2dOfInt[m][1], localGraphics2.jdField_e_of_type_Array2dOfInt[m][3], localGraphics2.jdField_e_of_type_Array2dOfInt[m][4], localGraphics2.jdField_e_of_type_Array2dOfInt[m][5], localGraphics2.jdField_e_of_type_Array2dOfInt[m][6], 0);
        } else {
          f.a(localGraphics3, a(localGraphics2.jdField_e_of_type_Array2dOfInt[m][7]), localGraphics2.jdField_e_of_type_Array2dOfInt[m][0], localGraphics2.jdField_e_of_type_Array2dOfInt[m][1], localGraphics2.jdField_e_of_type_Array2dOfInt[m][3], localGraphics2.jdField_e_of_type_Array2dOfInt[m][4], localGraphics2.jdField_e_of_type_Array2dOfInt[m][5], localGraphics2.jdField_e_of_type_Array2dOfInt[m][6], 0);
        }
      }
      localGraphics3 = localGraphics1;
      localGraphics2 = paramGraphics;
      for (m = 0; m < localGraphics2.jdField_c_of_type_Array2dOfInt.length; m++) {
        f.a(localGraphics3, a(37), localGraphics2.jdField_c_of_type_Array2dOfInt[m][0], localGraphics2.jdField_c_of_type_Array2dOfInt[m][1], 0, 0, 50, 37, 0);
      }
      localGraphics3 = localGraphics1;
      localGraphics2 = paramGraphics;
      paramGraphics.jdField_a_of_type_ArrayOfA[0].jdField_a_of_type_J.a(localGraphics3, localGraphics2.jdField_a_of_type_Array2dOfInt[0][1], d.jdField_b_of_type_Int - 28, localGraphics2.jdField_a_of_type_ArrayOfA[0].jdField_b_of_type_ArrayOfByte);
      localGraphics2.jdField_a_of_type_ArrayOfA[1].jdField_a_of_type_J.a(localGraphics3, localGraphics2.jdField_a_of_type_Array2dOfInt[1][1], d.jdField_b_of_type_Int - 28, localGraphics2.jdField_a_of_type_ArrayOfA[1].jdField_b_of_type_ArrayOfByte);
      localGraphics2.jdField_a_of_type_ArrayOfA[2].jdField_a_of_type_J.a(localGraphics3, localGraphics2.jdField_a_of_type_Array2dOfInt[2][1], d.jdField_b_of_type_Int - 26, localGraphics2.jdField_a_of_type_ArrayOfA[2].jdField_b_of_type_ArrayOfByte);
      localGraphics1.drawImage(a(40), (d.jdField_a_of_type_Int - 170) / 2, 10, 0);
      f.a(localGraphics1, a(43), (d.jdField_a_of_type_Int - 40 >> 1) - 43, d.jdField_b_of_type_Int - 15, 0, 0, 43, 13, 0);
      f.a(localGraphics1, a(41), d.jdField_a_of_type_Int - 40 >> 1, d.jdField_b_of_type_Int - 15, 0, 11, 61, 13, 0);
      int j = (localGraphics1.getFont().charWidth('.') << 1) + 23 + 18 + 2;
      f.a(localGraphics1, a(41), d.jdField_a_of_type_Int - j - 4, d.jdField_b_of_type_Int - 14, 61, 12, 23, 12, 0);
      int k = d.jdField_a_of_type_Int - j - 4 + 23;
      j = Ancient.jdField_a_of_type_Byte / 100 % 10;
      k++;
      f.a(localGraphics1, a(3), k, d.jdField_b_of_type_Int - 9, j * 6, 25, 6, 7, 0);
      k += 7;
      localGraphics1.setColor(991540);
      localGraphics1.drawChar('.', k, d.jdField_b_of_type_Int - localGraphics1.getFont().getHeight() + 2, 0);
      j = Ancient.jdField_a_of_type_Byte / 10 % 10;
      k += 4;
      f.a(localGraphics1, a(3), k, d.jdField_b_of_type_Int - 9, j * 6, 25, 6, 7, 0);
      k += 7;
      localGraphics1.setColor(991540);
      localGraphics1.drawChar('.', k, d.jdField_b_of_type_Int - localGraphics1.getFont().getHeight() + 2, 0);
      j = Ancient.jdField_a_of_type_Byte % 10;
      k += 4;
      f.a(localGraphics1, a(3), k, d.jdField_b_of_type_Int - 9, j * 6, 25, 6, 7, 0);
      for (j = 0; j < 5; j++) {
        if (paramGraphics.jdField_c_of_type_Int == j)
        {
          f.a(localGraphics1, a(39), 15, paramGraphics.jdField_b_of_type_Int + j * 19 + j * 6, 0, j * 19, 76, 19, 0);
          f.a(localGraphics1, paramGraphics.jdField_a_of_type_JavaxMicroeditionLcduiImage, 95, paramGraphics.jdField_b_of_type_Int + j * 19 + j * 6, 61, 0, 14, 17, 0);
        }
        else
        {
          f.a(localGraphics1, a(39), 5, paramGraphics.jdField_b_of_type_Int + j * 19 + j * 6, 0, j * 19, 76, 19, 0);
        }
      }
    }
  }
  
  public static final void i()
  {
    jdField_b_of_type_Int = 0;
    if (jdField_a_of_type_A != null)
    {
      a.a(jdField_a_of_type_A);
      jdField_a_of_type_A = null;
    }
    if (jdField_a_of_type_A == null) {
      (jdField_a_of_type_A = a.a()).a(ad.a(5, 7));
    }
    jdField_c_of_type_ArrayOfJavaLangString = a(a("/tips.dat", ad.a(1, 41)), 148, Font.getFont(0, 0, 8));
    d.b();
    d.f();
  }
  
  public static final void j()
  {
    if (jdField_a_of_type_A != null)
    {
      a.a(jdField_a_of_type_A);
      jdField_a_of_type_A = null;
    }
    d.c();
    jdField_c_of_type_ArrayOfJavaLangString = null;
    I();
  }
  
  public static final void k()
  {
    if ((f.jdField_a_of_type_ArrayOfInt == null) || (d.b() == 13)) {
      return;
    }
    if (jdField_b_of_type_Int < f.jdField_a_of_type_ArrayOfInt.length + 1)
    {
      f.a();
      jdField_b_of_type_Int += 1;
      Ancient.jdField_a_of_type_D.a();
      d.a((byte)8, 0);
      d.a((byte)7, 64);
      return;
    }
    if (jdField_b_of_type_Int <= 90)
    {
      jdField_b_of_type_Int += (100 - jdField_b_of_type_Int) / 2;
      return;
    }
    if ((jdField_b_of_type_Int >= 90) && (jdField_b_of_type_Int < 100))
    {
      jdField_b_of_type_Int += 1;
      return;
    }
    d.a();
    ab.a();
    if (d.b() == 8)
    {
      if (jdField_a_of_type_G.z != -1) {
        ad.b(jdField_a_of_type_G.jdField_a_of_type_ArrayOfInt[(jdField_a_of_type_G.z * 3 + 1)], jdField_a_of_type_G.jdField_a_of_type_ArrayOfInt[(jdField_a_of_type_G.z * 3 + 2)]);
      }
      if (t.d)
      {
        t.c();
        t.d = false;
      }
    }
  }
  
  public static final void c(Graphics paramGraphics)
  {
    int j = jdField_b_of_type_Int;
    int k = j > 100 ? 100 : j;
    String[] arrayOfString = jdField_c_of_type_ArrayOfJavaLangString;
    paramGraphics = paramGraphics;
    int m = paramGraphics.getClipX();
    int n = paramGraphics.getClipY();
    int i1 = paramGraphics.getClipWidth();
    int i2 = paramGraphics.getClipHeight();
    paramGraphics.setColor(5065038);
    paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    int i3 = d.jdField_b_of_type_Int - 96 >> 1;
    if (d.jdField_b_of_type_Int < 240) {
      i3 -= 42;
    }
    int i4 = d.jdField_a_of_type_Int / 53;
    i4 += 3;
    if (d.jdField_a_of_type_Int > 240)
    {
      i5 = d.jdField_a_of_type_Int / 240;
      i5++;
      for (i6 = 0; i6 < i5; i6++) {
        if (i6 % 2 == 0) {
          f.a(paramGraphics, a(35), 0 + i6 * 240, i3, 0, 0, 240, 96, 0);
        } else {
          f.a(paramGraphics, a(35), 0 + i6 * 240, i3, 0, 0, 240, 96, 2);
        }
      }
    }
    else
    {
      f.a(paramGraphics, a(35), 0, i3, 0, 23, 240, 96, 0);
    }
    int i5 = d.jdField_c_of_type_Int % 53;
    for (int i6 = 0; i6 < i4; i6++) {
      f.a(paramGraphics, a(32), d.jdField_a_of_type_Int - i6 * 53 + i5, i3 + 96 - 14, 0, 0, 53, 14, 0);
    }
    if (jdField_a_of_type_A != null)
    {
      jdField_a_of_type_A.jdField_a_of_type_J.a(0);
      jdField_a_of_type_A.jdField_a_of_type_J.a(paramGraphics, (d.jdField_a_of_type_Int - jdField_a_of_type_A.jdField_a_of_type_J.jdField_e_of_type_Int) / 2, i3 + 90 - jdField_a_of_type_A.jdField_a_of_type_J.f, null);
    }
    i3 += 96;
    i3 += 8;
    if (k / 100 > 0) {
      i4 = d.jdField_a_of_type_Int - 18 >> 1;
    } else if (k / 10 > 0) {
      i4 = d.jdField_a_of_type_Int - 12 >> 1;
    } else {
      i4 = d.jdField_a_of_type_Int - 6 >> 1;
    }
    ad.a(paramGraphics, a(3), k, i4, i3, 5);
    if (k / 100 > 0) {
      i4 += 18;
    } else if (k / 10 > 0) {
      i4 += 12;
    } else {
      i4 += 6;
    }
    ad.b(paramGraphics, i4, i3);
    paramGraphics.setColor(59, 56, 60);
    i4 = d.jdField_a_of_type_Int - 140 >> 1;
    i3 += 12;
    paramGraphics.fillRect(i4, i3, 140, 13);
    paramGraphics.setColor(7236463);
    paramGraphics.drawLine(i4, i3, i4 + 140, i3);
    paramGraphics.drawLine(i4, i3 + 12, i4 + 140, i3 + 12);
    f.a(paramGraphics, a(0), i4 - 4, i3, 28, 0, 4, 13, 0);
    f.a(paramGraphics, a(0), i4 + 140, i3, 28, 0, 4, 13, 2);
    paramGraphics.setClip(i4 - 2, i3, k * 144 / 100, 13);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(i4, i3 + 1, 140, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(i4 - 1, i3 + 2, 142, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(i4 - 2, i3 + 3, 144, 2);
    paramGraphics.setColor(4036603);
    paramGraphics.fillRect(i4 - 2, i3 + 5, 144, 5);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(i4 - 1, i3 + 10, 142, 2);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(i4, i3 + 10, 140, 2);
    f.a(paramGraphics, a(0), i4 - 2, i3 + 2, 32, 0, 2, 9, 0);
    paramGraphics.setClip(m, n, i1, i2);
    paramGraphics.setFont(Font.getFont(0, 0, 8));
    if (arrayOfString != null)
    {
      i3 += 14;
      for (i6 = 0; i6 < arrayOfString.length; i6++)
      {
        a.a(paramGraphics, i4, i3, arrayOfString[i6], -1, 20);
        i3 += bg.a.getHeight() + 1;
      }
    }
  }
  
  public static final void l() {}
  
  public static final void m()
  {
    f.jdField_g_of_type_Int = 0;
    z.a(1);
    jdField_a_of_type_C.a(jdField_a_of_type_G);
    if (!d.a((byte)13))
    {
      f.a(jdField_a_of_type_G, false);
      if ((t.jdField_c_of_type_Int > 0) && (t.jdField_b_of_type_Boolean) && (++t.jdField_b_of_type_Int % 10 == 0)) {
        t.jdField_c_of_type_Int -= 1;
      }
      g.h();
    }
    if ((d.e() > 0) && (ad.a(d.f(), d.jdField_d_of_type_Int)) && (ad.a(d.h(), d.jdField_e_of_type_Int)) && (d.h() > d.jdField_b_of_type_Int - 40))
    {
      String str;
      if (d.jdField_a_of_type_Int > 330)
      {
        if (ad.a(d.f(), d.h(), 0, d.jdField_b_of_type_Int - 30, 60, 50))
        {
          if (jdField_a_of_type_G.jdField_b_of_type_Boolean)
          {
            d.f();
            return;
          }
          str = "sysMenu";
          jdField_a_of_type_Bc.c(str);
          d.f();
          return;
        }
        if (ad.a(d.f(), d.h(), d.jdField_a_of_type_Int - 60, d.jdField_b_of_type_Int - 30, 60, 50))
        {
          if ((ag.a()) || (jdField_a_of_type_G.jdField_b_of_type_Boolean))
          {
            d.f();
            return;
          }
          h.b("vm:memo");
          d.f();
        }
      }
      else
      {
        if (ad.a(d.f(), d.h(), 0, d.jdField_b_of_type_Int - 30, 40, 30))
        {
          if (jdField_a_of_type_G.jdField_b_of_type_Boolean)
          {
            d.f();
            return;
          }
          str = "sysMenu";
          jdField_a_of_type_Bc.c(str);
          d.f();
          return;
        }
        if (ad.a(d.f(), d.h(), d.jdField_a_of_type_Int - 40, d.jdField_b_of_type_Int - 30, 40, 30))
        {
          if ((ag.a()) || (jdField_a_of_type_G.jdField_b_of_type_Boolean))
          {
            d.f();
            return;
          }
          h.b("vm:memo");
          d.f();
        }
      }
    }
  }
  
  public static final void d(Graphics paramGraphics)
  {
    if (d.a()) {
      return;
    }
    paramGraphics.setFont(bg.a);
    if (!t.d)
    {
      f.a(paramGraphics);
      f.b(paramGraphics);
    }
    int j = 15;
    Graphics localGraphics = paramGraphics;
    int m;
    if (jdField_a_of_type_G != null)
    {
      g localg1;
      if ((localg1 = jdField_a_of_type_G) != null)
      {
        localGraphics.drawImage(a(5), 15, 1, 0);
        g localg2 = localg1;
        f.a(localGraphics, a(8), 18, 4, localg2.m * 20, 0, 20, 19, 0);
        localGraphics.setColor(16352670);
        localGraphics.fillRect(55, 3, n.a(localg1.jdField_a_of_type_ArrayOfByte, 2), 1);
        localGraphics.setColor(15482724);
        localGraphics.fillRect(55, 4, n.a(localg1.jdField_a_of_type_ArrayOfByte, 2), 2);
        localGraphics.setColor(13184308);
        localGraphics.fillRect(55, 6, n.a(localg1.jdField_a_of_type_ArrayOfByte, 2), 2);
        localGraphics.setColor(8373754);
        localGraphics.fillRect(55, 12, n.a(localg1.jdField_a_of_type_ArrayOfByte, 3), 2);
        localGraphics.setColor(4303353);
        localGraphics.fillRect(55, 13, n.a(localg1.jdField_a_of_type_ArrayOfByte, 3), 2);
        localGraphics.setColor(2590191);
        localGraphics.fillRect(55, 15, n.a(localg1.jdField_a_of_type_ArrayOfByte, 3), 2);
        ad.a(localGraphics, 41, 21);
        ad.a(localGraphics, a(3), n.a(localg1.jdField_a_of_type_ArrayOfByte, 0), 53, 21, 6);
        m = n.a(localg1.jdField_a_of_type_ArrayOfByte);
        ad.a(localGraphics, a(3), m, 73, 20, 5);
        ad.b(localGraphics, 73 + 6 * String.valueOf(m).length(), 20);
        if (n.a(localg1.jdField_a_of_type_ArrayOfByte, 9) == 1)
        {
          f.a(localGraphics, a(13), 15, 31, 19, 0, 19, 18, 0);
          f.a(localGraphics, a(0), 34, 31, 62, 12, 24, 5, 0);
          f.a(localGraphics, a(0), 34, 37, 62, 12, 24, 5, 0);
          ad.a(localGraphics, 18, 34, 17);
          localGraphics.setColor(16352670);
          localGraphics.fillRect(33, 32, n.a(localg1.jdField_a_of_type_ArrayOfByte, 10), 1);
          localGraphics.setColor(13184308);
          localGraphics.fillRect(33, 33, n.a(localg1.jdField_a_of_type_ArrayOfByte, 10), 2);
          localGraphics.setColor(8373754);
          localGraphics.fillRect(33, 38, n.a(localg1.jdField_a_of_type_ArrayOfByte, 11), 1);
          localGraphics.setColor(2590191);
          localGraphics.fillRect(33, 39, n.a(localg1.jdField_a_of_type_ArrayOfByte, 11), 2);
          ad.a(localGraphics, a(3), n.a(localg1.jdField_a_of_type_ArrayOfByte, 12), 32, 43, 3);
        }
      }
      j += 65;
      j += 2;
      if (jdField_a_of_type_ArrayOfByte[4] == 1)
      {
        ad.a(localGraphics, 82, 1, 4);
        j += 16;
      }
      if (jdField_a_of_type_ArrayOfByte[1] == 1)
      {
        ad.a(localGraphics, j, 1, 1);
        j += 16;
      }
      if (jdField_a_of_type_ArrayOfByte[2] == 1)
      {
        ad.a(localGraphics, j, 1, 2);
        j += 16;
      }
      if (jdField_a_of_type_ArrayOfByte[3] == 1)
      {
        ad.a(localGraphics, j, 1, 3);
        j += 16;
      }
      if (jdField_a_of_type_ArrayOfByte[0] == 1) {
        ad.a(localGraphics, j, 1, 0);
      }
      ag.a(localGraphics);
    }
    if (d.jdField_a_of_type_Int < 190)
    {
      f.a(paramGraphics, a(0), 2, d.jdField_b_of_type_Int - 15, 335, 0, 11, 15, 0);
      f.a(paramGraphics, a(0), d.jdField_a_of_type_Int - 13, d.jdField_b_of_type_Int - 15, 404, 0, 11, 15, 0);
    }
    else
    {
      f.a(paramGraphics, a(0), 2, d.jdField_b_of_type_Int - 15, 335, 0, 40, 15, 0);
      f.a(paramGraphics, a(0), d.jdField_a_of_type_Int - 42, d.jdField_b_of_type_Int - 15, 375, 0, 40, 15, 0);
    }
    af.a(paramGraphics);
    ae.a(paramGraphics);
    ae.b(paramGraphics);
    localGraphics = paramGraphics;
    int k;
    if (d.jdField_a_of_type_Int > 330)
    {
      j = a(12).getWidth();
      k = a(12).getHeight();
      m = d.jdField_a_of_type_Int - 120 - j >> 1;
      j = -1;
      for (;;)
      {
        j++;
        if (j >= 7) {
          break;
        }
        f.a(localGraphics, a(12), m + (j << 4) + j * 20, d.jdField_b_of_type_Int - k - 1, j << 4, 0, 16, 14, 0);
      }
    }
    else
    {
      j = a(12).getWidth();
      k = a(12).getHeight();
      m = d.jdField_a_of_type_Int - 24 - j >> 1;
      j = -1;
      for (;;)
      {
        j++;
        if (j >= 7) {
          break;
        }
        f.a(localGraphics, a(12), m + j * 20, d.jdField_b_of_type_Int - k - 1, j << 4, 0, 16, 14, 0);
      }
    }
    ab.a(paramGraphics);
    ab.b(paramGraphics);
  }
  
  public static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    bc.a(paramGraphics, paramInt1, paramInt2, paramString);
    ae.a(paramGraphics, paramInt1 + 4, paramInt2, paramString, paramInt3, 0, 20);
  }
  
  public static final void n()
  {
    jdField_b_of_type_Int = 0;
  }
  
  public static final void o()
  {
    I();
    System.gc();
  }
  
  public static final void p()
  {
    if (jdField_b_of_type_Int > 300)
    {
      jdField_b_of_type_Int = -1;
      if (jdField_b_of_type_Byte == 1)
      {
        d("无法快速登陆，请正常登陆！");
        return;
      }
      d(null);
      return;
    }
    jdField_b_of_type_Int += 1;
  }
  
  public static final void e(Graphics paramGraphics)
  {
    paramGraphics.setFont(bg.a);
    i(paramGraphics);
    j(paramGraphics);
    k(paramGraphics);
  }
  
  public static final void q()
  {
    d.b();
    d.f();
    if (Ancient.jdField_a_of_type_JavaxMicroeditionLcduiDisplay.getCurrent() != Ancient.jdField_a_of_type_D) {
      Ancient.jdField_a_of_type_JavaxMicroeditionLcduiDisplay.setCurrent(Ancient.jdField_a_of_type_D);
    }
    bc.i();
    t.jdField_a_of_type_Boolean = true;
    if (jdField_a_of_type_G.jdField_b_of_type_Boolean) {
      jdField_a_of_type_G.A = 0;
    }
    if ((g.x != jdField_a_of_type_G.jdField_b_of_type_Int) || (g.y != jdField_a_of_type_G.jdField_c_of_type_Int)) {
      jdField_a_of_type_G.i();
    }
  }
  
  public static final void r()
  {
    t.jdField_a_of_type_Boolean = false;
    I();
  }
  
  public static final void s() {}
  
  public static final void f(Graphics paramGraphics)
  {
    paramGraphics.setFont(bg.a);
    t.a(paramGraphics);
    ae.b(paramGraphics);
  }
  
  public static Image a(int paramInt)
  {
    if (paramInt < jdField_d_of_type_Int) {
      return jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[paramInt];
    }
    int j = paramInt - jdField_d_of_type_Int;
    if (jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[j] != null) {
      return jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[j];
    }
    try
    {
      jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[j] = Image.createImage("/" + paramInt + ".png");
    }
    catch (IOException localIOException)
    {
      localIOException;
    }
    return jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[j];
  }
  
  private static void I()
  {
    for (int j = 0; j < jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage.length; j++) {
      jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[j] = null;
    }
  }
  
  public static void a(int paramInt)
  {
    a(paramInt);
  }
  
  public static final void a(int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramString = RecordStore.openRecordStore(paramString, true);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      int j = paramString.getNumRecords();
      switch (paramInt1)
      {
      case 0: 
        localDataOutputStream.writeUTF(null);
        localDataOutputStream.writeUTF(null);
        break;
      case 2: 
        localDataOutputStream.writeShort(paramInt2);
        break;
      case 3: 
      case 4: 
        localDataOutputStream.writeByte(paramInt2);
      }
      if (j == 0) {
        paramString.addRecord(localByteArrayOutputStream.toByteArray(), 0, localByteArrayOutputStream.toByteArray().length);
      } else {
        paramString.setRecord(1, localByteArrayOutputStream.toByteArray(), 0, localByteArrayOutputStream.toByteArray().length);
      }
      paramString.closeRecordStore();
      localByteArrayOutputStream.close();
      localDataOutputStream.close();
      return;
    }
    catch (RecordStoreException localRecordStoreException) {}catch (IOException localIOException) {}
  }
  
  private static boolean a(int paramInt, String paramString)
  {
    try
    {
      if ((paramString = RecordStore.openRecordStore(paramString, true)).getNumRecords() == 0)
      {
        paramString.closeRecordStore();
        return false;
      }
      Object localObject = paramString.getRecord(1);
      localObject = new ByteArrayInputStream((byte[])localObject);
      localObject = new DataInputStream((InputStream)localObject);
      switch (paramInt)
      {
      case 0: 
        jdField_b_of_type_ArrayOfJavaLangString[0] = ((DataInputStream)localObject).readUTF();
        jdField_b_of_type_ArrayOfJavaLangString[1] = ((DataInputStream)localObject).readUTF();
        break;
      case 2: 
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | ((DataInputStream)localObject).readShort() & 0xFFF);
        break;
      case 3: 
      case 4: 
        ((DataInputStream)localObject).readByte();
      }
      paramString.closeRecordStore();
      return true;
    }
    catch (Exception localException)
    {
      localException;
    }
    return false;
  }
  
  public static final void b(int paramInt)
  {
    n localn;
    if (jdField_a_of_type_G != null)
    {
      localn = null;
      if (jdField_a_of_type_G.c) {}
    }
    else
    {
      return;
    }
    if (d.b() != paramInt) {
      return;
    }
    if (d.jdField_c_of_type_Int % 300 == 0)
    {
      (localn = jdField_a_of_type_Q.b()).a(65);
      paramInt = Calendar.getInstance(jdField_a_of_type_JavaUtilTimeZone);
      localn.a(paramInt.get(12));
      localn.a(paramInt.get(13));
      jdField_a_of_type_Q.c();
    }
    if (d.jdField_c_of_type_Int % 9000 == 0)
    {
      jdField_e_of_type_Int = (paramInt = Calendar.getInstance(jdField_a_of_type_JavaUtilTimeZone)).get(11);
      f = paramInt.get(12);
      return;
    }
    if (d.jdField_c_of_type_Int % 600 == 0)
    {
      if (++f >= 60)
      {
        jdField_e_of_type_Int += 1;
        f = 0;
      }
      if (jdField_e_of_type_Int >= 24) {
        jdField_e_of_type_Int = 0;
      }
    }
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    ad.a(paramGraphics, a(3), paramInt2, paramInt1, 20, 1);
  }
  
  public static final boolean a(int paramInt1, int paramInt2, a parama)
  {
    int m = parama == jdField_a_of_type_G ? 1 : 4;
    int k = parama == jdField_a_of_type_G ? 1 : 4;
    int j = parama.jdField_c_of_type_Int - paramInt2;
    paramInt1 = parama.jdField_b_of_type_Int - paramInt1;
    parama = d.jdField_b_of_type_Int;
    paramInt2 = d.jdField_a_of_type_Int;
    return (paramInt1 >= 0) && (paramInt2 >= paramInt1 + k) && (j >= 0) && (parama >= j + m);
  }
  
  public static final boolean a(int paramInt1, int paramInt2)
  {
    return f.b(paramInt1, paramInt2) != 0;
  }
  
  public static final void a(a parama)
  {
    int j = parama.h >> 4;
    int k = parama.i >> 4;
    ar localar3 = parama.jdField_b_of_type_Int >> 4;
    ar localar4 = parama.jdField_c_of_type_Int >> 4;
    if ((j == localar3) && (k == localar4))
    {
      parama.f = parama.h;
      parama.jdField_g_of_type_Int = parama.i;
      return;
    }
    if ((parama.jdField_b_of_type_Int != (localar3 << 4) + 8) || (parama.jdField_c_of_type_Int != (localar4 << 4) + 12))
    {
      parama.f = ((localar3 << 4) + 8);
      parama.jdField_g_of_type_Int = ((localar4 << 4) + 12);
      return;
    }
    if (parama.jdField_a_of_type_Ar == null) {
      return;
    }
    ar localar1;
    ar localar2;
    if (parama.jdField_a_of_type_Ar.jdField_a_of_type_Ar != null)
    {
      localar2 = (localar1 = parama.jdField_a_of_type_Ar).jdField_a_of_type_Ar;
      localar1.jdField_a_of_type_Ar = null;
      i.a(localar1);
      parama.jdField_a_of_type_Ar = localar2;
      parama.f = ((parama.jdField_a_of_type_Ar.jdField_e_of_type_Int << 4) + 8);
      parama.jdField_g_of_type_Int = ((parama.jdField_a_of_type_Ar.f << 4) + 12);
      return;
    }
    if ((localar1 != localar3) || (localar2 != localar4)) {
      i.a(parama);
    }
  }
  
  public static final void t()
  {
    a(4, "isProxy", 1);
  }
  
  public static final void u()
  {
    if (jdField_a_of_type_Ah == null)
    {
      jdField_a_of_type_Ah = new ah();
      jdField_a_of_type_Q.b().a(34);
      jdField_a_of_type_Q.c();
      jdField_a_of_type_Byte = 1;
      return;
    }
    if ((jdField_a_of_type_Ah != null) && (jdField_a_of_type_Byte == 0)) {
      jdField_a_of_type_Ah.a();
    }
  }
  
  public static final int a(int paramInt)
  {
    paramInt ^= paramInt << 11;
    return 0x45EDF26 ^ paramInt ^ paramInt >> 8;
  }
  
  public static void a(String paramString)
  {
    jdField_a_of_type_Bc.c(paramString);
  }
  
  public static void v()
  {
    jdField_a_of_type_Bc.a("<form nm='lock' type='sm' bt='-1'></form>");
    jdField_b_of_type_Boolean = true;
  }
  
  public static void w()
  {
    bb localbb;
    if ((localbb = (bb)jdField_a_of_type_Bc.a("lock")) != null) {
      jdField_a_of_type_Bc.b(localbb);
    }
    jdField_b_of_type_Boolean = false;
  }
  
  public static void x()
  {
    jdField_b_of_type_Boolean = false;
  }
  
  public static void y()
  {
    jdField_b_of_type_Boolean = true;
  }
  
  public static void a(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer;
    (localStringBuffer = new StringBuffer()).append("<form nm='tip' mtl='");
    localStringBuffer.append(paramString1).append("' w ='160' ");
    paramString1 = a(paramString2, bg.a);
    localStringBuffer.append(" h='" + (paramString1 * bg.a.getHeight() + 54) + "' ");
    localStringBuffer.append(" type='any' bt='-1'><tb bt='32' h='96%'><tr><td>");
    localStringBuffer.append(paramString2);
    localStringBuffer.append("</td></tr></tb></form>");
    jdField_a_of_type_Bc.a(localStringBuffer.toString());
  }
  
  public static void b(String paramString)
  {
    Object localObject = bg.a;
    String str1 = paramString;
    String str2 = 0;
    int j = 0;
    label160:
    for (int k = 0; k < str1.length(); k++)
    {
      char c1;
      if ((c1 = str1.charAt(k)) == '#')
      {
        for (int m = 1; m < 7; m++) {
          if ((k + m >= str1.length()) || ((c1 = str1.charAt(k + m)) < '0') || (c1 > 'f')) {
            break label160;
          }
        }
        k += 6;
      }
      else
      {
        j += ((Font)localObject).charWidth(c1);
        if (c1 == '\n')
        {
          str2++;
          j = 0;
        }
        else if (c1 == '`')
        {
          str2++;
          j = 0;
        }
        else if (j >= 160)
        {
          str2++;
          j = 0;
        }
      }
    }
    str1 = str1 == null ? 1 : str2;
    str1 = bc.a(bc.a("fightaccount"), "_replace1", "h='" + (str1 * bg.a.getHeight() + 54) + "'");
    localObject = "<tb bt='32' h='100%'><tr><td><a>";
    localObject = (String)localObject + paramString;
    localObject = (String)localObject + "</a></td></tr></tb>";
    jdField_a_of_type_Bc.a(bc.a(str1, "_replace2", (String)localObject));
  }
  
  public static void c(String paramString)
  {
    a("信息提示", paramString);
  }
  
  public static final void z()
  {
    jdField_a_of_type_Bc.h();
    jdField_b_of_type_Boolean = false;
    I();
  }
  
  public static final void A()
  {
    if ((jdField_a_of_type_G == null) || ((jdField_a_of_type_G != null) && (!jdField_a_of_type_G.jdField_b_of_type_Boolean)))
    {
      jdField_a_of_type_Bc.e();
      return;
    }
    if ((jdField_a_of_type_G != null) && (jdField_a_of_type_G.jdField_b_of_type_Boolean))
    {
      if (d.a(15) == 1)
      {
        if (ag.a())
        {
          d.b();
          return;
        }
        jdField_a_of_type_G.jdField_b_of_type_Boolean = (!jdField_a_of_type_G.jdField_b_of_type_Boolean);
        if (!jdField_a_of_type_G.jdField_b_of_type_Boolean) {
          jdField_a_of_type_G.A = 0;
        }
      }
      z.a(1);
    }
  }
  
  public static final void g(Graphics paramGraphics)
  {
    paramGraphics.setFont(bg.a);
    jdField_a_of_type_Bc.a(paramGraphics);
    ae.a(paramGraphics);
  }
  
  public static final void b(String paramString1, String paramString2)
  {
    h = paramString1;
    jdField_a_of_type_Q.d();
    jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
    jdField_a_of_type_Q.a(0);
    i = paramString2;
    jdField_a_of_type_Q.jdField_a_of_type_JavaLangString = paramString2;
    new s(jdField_a_of_type_Q).start();
    B();
    d.a((byte)9, 0);
  }
  
  public static final void d(String paramString)
  {
    B();
    String str = "login";
    jdField_a_of_type_Bc.c(str);
    if ((paramString != null) && (!jdField_a_of_type_Boolean))
    {
      str = paramString;
      a("信息提示", str);
    }
  }
  
  public static final void B()
  {
    while (d.b() != -1) {
      d.a();
    }
  }
  
  public static final void C()
  {
    switch (jdField_b_of_type_Byte)
    {
    case 0: 
    case 1: 
    case 2: 
    case 7: 
    case 8: 
    case 9: 
      jdField_b_of_type_Int = 0;
      jdField_a_of_type_Q.d();
      jdField_a_of_type_Q.jdField_a_of_type_JavaLangString = jdField_g_of_type_JavaLangString;
      new s(jdField_a_of_type_Q).start();
      h.a();
    }
  }
  
  public static final void D()
  {
    I();
    System.gc();
  }
  
  public static final void E()
  {
    if (jdField_b_of_type_Int > 300)
    {
      jdField_b_of_type_Int = -1;
      if (jdField_b_of_type_Byte == 1)
      {
        d("无法快速登陆，请正常登陆！");
        return;
      }
      d(null);
      return;
    }
    jdField_b_of_type_Int += 1;
  }
  
  public static final void h(Graphics paramGraphics)
  {
    i(paramGraphics);
    j(paramGraphics);
    paramGraphics.setColor(-1);
    if (jdField_b_of_type_Int < 10) {
      paramGraphics.drawString("请求连接服务器", d.jdField_a_of_type_Int >> 1, d.jdField_b_of_type_Int - 75, 17);
    } else if (jdField_b_of_type_Int < 20) {
      paramGraphics.drawString("转换KEY", d.jdField_a_of_type_Int >> 1, d.jdField_b_of_type_Int - 75, 17);
    } else if (jdField_b_of_type_Int < 40) {
      paramGraphics.drawString("数据更新", d.jdField_a_of_type_Int >> 1, d.jdField_b_of_type_Int - 75, 17);
    } else {
      paramGraphics.drawString("获取服务器列表", d.jdField_a_of_type_Int >> 1, d.jdField_b_of_type_Int - 75, 17);
    }
    k(paramGraphics);
  }
  
  private static void j(Graphics paramGraphics)
  {
    paramGraphics.setColor(6644831);
    paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    paramGraphics.drawImage(a(40), d.jdField_a_of_type_Int - a(40).getWidth() >> 1, d.jdField_a_of_type_Int / 30 << 3, 20);
  }
  
  private static void k(Graphics paramGraphics)
  {
    int j = d.jdField_a_of_type_Int - 144 >> 1;
    int k = d.jdField_b_of_type_Int - 45;
    if (jdField_g_of_type_Int < 8) {
      jdField_g_of_type_Int += 1;
    } else {
      jdField_g_of_type_Int = 0;
    }
    paramGraphics.setColor(59, 56, 60);
    paramGraphics.fillRect(j, k, 140, 13);
    paramGraphics.setColor(7236463);
    paramGraphics.drawLine(j, k, j + 140, k);
    paramGraphics.drawLine(j, k + 12, j + 140, k + 12);
    f.a(paramGraphics, a(0), j - 4, k, 28, 0, 4, 13, 0);
    f.a(paramGraphics, a(0), j + 140, k, 28, 0, 4, 13, 2);
    int m = 144 * jdField_g_of_type_Int / 8;
    paramGraphics.setFont(bg.a);
    paramGraphics.setColor(14941449);
    paramGraphics.setClip(j - 2, k, m, 13);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(j, k + 1, 140, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(j - 1, k + 2, 142, 2);
    paramGraphics.setColor(6996735);
    paramGraphics.fillRect(j - 2, k + 3, 144, 2);
    paramGraphics.setColor(4036603);
    paramGraphics.fillRect(j - 2, k + 5, 144, 5);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(j - 1, k + 10, 142, 2);
    paramGraphics.setColor(2655724);
    paramGraphics.fillRect(j, k + 10, 140, 2);
    f.a(paramGraphics, a(0), j - 2, k + 2, 32, 0, 2, 9, 0);
  }
  
  public static void F()
  {
    jdField_a_of_type_N.a();
    jdField_a_of_type_N.a(1);
    jdField_a_of_type_N.a(jdField_d_of_type_JavaLangString);
    jdField_a_of_type_N.a(jdField_e_of_type_JavaLangString);
    u.a("data", jdField_a_of_type_N);
  }
  
  public static void G()
  {
    jdField_a_of_type_N.a();
    jdField_a_of_type_N.a(3);
    jdField_a_of_type_N.a(h);
    jdField_a_of_type_N.a(i);
    u.a("data", jdField_a_of_type_N);
  }
  
  public static boolean a(int paramInt)
  {
    return (jdField_a_of_type_Short & paramInt) != 0;
  }
  
  private static String[] a(String paramString)
  {
    InputStream localInputStream = null;
    DataInputStream localDataInputStream = null;
    try
    {
      if ((localInputStream = "".getClass().getResourceAsStream(paramString)) == null)
      {
        try
        {
          localInputStream.close();
        }
        catch (Exception localException1) {}
        try
        {
          null.close();
        }
        catch (Exception localException2) {}
        return null;
      }
      if ((paramString = (localDataInputStream = new DataInputStream(localInputStream)).readShort()) <= 0) {
        return null;
      }
      String[] arrayOfString = new String[paramString];
      for (Object localObject = 0; localObject < paramString; localObject++) {
        arrayOfString[localObject] = localDataInputStream.readUTF();
      }
      localObject = arrayOfString;
      return (String[])localObject;
    }
    catch (Exception localException7) {}finally
    {
      try
      {
        localInputStream.close();
      }
      catch (Exception localException10) {}
      try
      {
        localDataInputStream.close();
      }
      catch (Exception localException11) {}
    }
    return null;
  }
  
  private static String a(String paramString, int paramInt)
  {
    InputStream localInputStream = null;
    DataInputStream localDataInputStream = null;
    try
    {
      if ((localInputStream = "".getClass().getResourceAsStream(paramString)) == null)
      {
        try
        {
          localInputStream.close();
        }
        catch (Exception localException1) {}
        try
        {
          null.close();
        }
        catch (Exception localException2) {}
        return null;
      }
      if ((short)(localDataInputStream = new DataInputStream(localInputStream)).readByte() <= 0) {
        return null;
      }
      for (paramString = 0; paramString < paramInt - 1; paramString++)
      {
        int j = localDataInputStream.read();
        localDataInputStream.skipBytes(j << 1);
      }
      paramString = localDataInputStream.read();
      StringBuffer localStringBuffer = new StringBuffer();
      String str = -1;
      for (;;)
      {
        str++;
        if (str >= paramString) {
          break;
        }
        paramInt = (char)localDataInputStream.readShort();
        localStringBuffer.append(paramInt);
      }
      str = localStringBuffer.toString();
      return str;
    }
    catch (Exception localException7) {}finally
    {
      try
      {
        localInputStream.close();
      }
      catch (Exception localException10) {}
      try
      {
        localDataInputStream.close();
      }
      catch (Exception localException11) {}
    }
    return null;
  }
  
  public static String[] a(String paramString, int paramInt, Font paramFont)
  {
    au localau = new au(0, 1);
    int j = 0;
    int k = 0;
    for (int m = 0; m < paramString.length(); m++)
    {
      char c1 = paramString.charAt(m);
      k += paramFont.charWidth(c1);
      if (c1 == '\n')
      {
        localau.a(paramString.substring(j, m));
        j = Math.min(m + 1, paramString.length() - 1);
        k = 0;
      }
      else if (k >= paramInt)
      {
        localau.a(paramString.substring(j, m));
        m--;
        j = Math.min(m + 1, paramString.length() - 1);
        k = 0;
      }
    }
    if (j < paramString.length()) {
      localau.a(paramString.substring(j));
    }
    String[] arrayOfString = new String[localau.jdField_a_of_type_Int];
    localau.a(arrayOfString);
    return arrayOfString;
  }
  
  private static int a(String paramString, Font paramFont)
  {
    int j = 1;
    if (paramString == null) {
      return 1;
    }
    int k = 0;
    for (int m = 0; m < paramString.length(); m++)
    {
      char c1 = paramString.charAt(m);
      k += paramFont.charWidth(c1);
      if (c1 == '\n')
      {
        j++;
        k = 0;
      }
      else if (c1 == '`')
      {
        j++;
        k = 0;
      }
      else if (k >= 160)
      {
        j++;
        k = 0;
      }
    }
    return j;
  }
  
  public static void c(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      if ((jdField_a_of_type_Short & 0x2) != 0)
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short & 0xFFFFFFFD);
        return;
      }
      jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x2);
      return;
    case 2: 
      if ((jdField_a_of_type_Short & 0x4) != 0)
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short & 0xFFFFFFFB);
        return;
      }
      jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x4);
      return;
    case 3: 
      if ((jdField_a_of_type_Short & 0x8) != 0)
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short & 0xFFFFFFF7);
        return;
      }
      jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x8);
      return;
    case 4: 
      if ((jdField_a_of_type_Short & 0x10) != 0)
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short & 0xFFFFFFEF);
        return;
      }
      jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x10);
      return;
    case 5: 
      if ((jdField_a_of_type_Short & 0x20) != 0)
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short & 0xFFFFFFDF);
        return;
      }
      jdField_a_of_type_Short = (short)(jdField_a_of_type_Short | 0x20);
    }
  }
  
  public static void H()
  {
    String[] arrayOfString = new String[5];
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= arrayOfString.length) {
        break;
      }
      switch (j + 1)
      {
      case 1: 
        tmpTernaryOp = "fd5b5b'>关闭";
        break;
      case 2: 
        tmpTernaryOp = "fd5b5b'>关闭";
        break;
      case 3: 
        tmpTernaryOp = "fd5b5b'>关闭";
        break;
      case 4: 
        tmpTernaryOp = "fd5b5b'>关闭";
        break;
      case 5: 
        tmpTernaryOp = "fd5b5b'>拖拽";
        break;
      }
      arrayOfString[j] = ((jdField_a_of_type_Short & 0x20) != 0 ? "2ccfa3'>点击" : (jdField_a_of_type_Short & 0x10) != 0 ? "2ccfa3'>开启" : (jdField_a_of_type_Short & 0x8) != 0 ? "2ccfa3'>开启" : (jdField_a_of_type_Short & 0x4) != 0 ? "2ccfa3'>开启" : (jdField_a_of_type_Short & 0x2) != 0 ? "2ccfa3'>开启" : "");
    }
    String str = bc.a(bc.a(bc.a(bc.a(bc.a("nameset"), "_replace1", arrayOfString[0]), "_replace2", arrayOfString[1]), "_replace3", arrayOfString[2]), "_replace4", arrayOfString[3]);
    jdField_a_of_type_Bc.a(bc.a(str, "_replace5", arrayOfString[4]));
  }
  
  public static int a(String paramString, int paramInt)
  {
    if (paramString == null) {
      return paramInt;
    }
    try
    {
      return Integer.parseInt(paramString, 16);
    }
    catch (Exception localException)
    {
      localException;
    }
    return paramInt;
  }
  
  public static String[] a(String paramString1, String paramString2)
  {
    au localau = new au();
    int k = 0;
    int m;
    for (int j = paramString1.indexOf(paramString2); (j < paramString1.length()) && (j != -1); j = paramString1.indexOf(paramString2, j + paramString2.length()))
    {
      String str1 = paramString1.substring(k, j);
      localau.a(str1);
      m = j + paramString2.length();
    }
    String str2;
    if (!(str2 = paramString1.substring(m + 1 - paramString2.length())).equals("")) {
      localau.a(str2);
    }
    paramString1 = new String[localau.jdField_a_of_type_Int];
    for (paramString2 = 0; paramString2 < localau.jdField_a_of_type_Int; paramString2++) {
      paramString1[paramString2] = ((String)localau.a(paramString2));
    }
    return paramString1;
  }
  
  static
  {
    jdField_a_of_type_Bg = new bg();
    jdField_a_of_type_Int = -1;
    jdField_b_of_type_ArrayOfJavaLangString = new String[4];
    jdField_a_of_type_JavaLangStringBuffer = new StringBuffer();
    jdField_a_of_type_N = new n(1024);
    jdField_a_of_type_Q = new q();
    jdField_c_of_type_JavaLangString = "100";
    jdField_a_of_type_ArrayOfByte = new byte[5];
    jdField_a_of_type_C = new c();
    jdField_c_of_type_Int = 5;
    jdField_c_of_type_ArrayOfJavaLangString = null;
    jdField_a_of_type_A = null;
    jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage = new Image[15];
    jdField_d_of_type_Int = 30;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */