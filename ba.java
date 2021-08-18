import java.io.InputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public abstract class ba
{
  public String f;
  public byte a;
  public int b;
  public int c;
  public byte b;
  public static final int[][] a;
  public short b;
  public short c;
  public short d = Short.MIN_VALUE;
  public short e = Short.MIN_VALUE;
  public short f;
  public short g;
  public short h;
  public short i;
  public short j = Short.MIN_VALUE;
  public short k;
  public short l;
  public ba a;
  public String g;
  public String h;
  public boolean b;
  public String i;
  public short[][] a;
  
  public ba()
  {
    this.jdField_f_of_type_JavaLangString = null;
    this.jdField_a_of_type_Byte = 0;
    this.jdField_b_of_type_Int = -1;
    this.jdField_c_of_type_Int = -1;
    this.jdField_b_of_type_Byte = -1;
    this.jdField_a_of_type_Ba = null;
    this.jdField_g_of_type_JavaLangString = null;
    this.jdField_h_of_type_JavaLangString = null;
    this.jdField_b_of_type_Boolean = false;
    this.jdField_i_of_type_JavaLangString = null;
    this.jdField_a_of_type_Array2dOfShort = null;
    this.jdField_b_of_type_Short = Short.MIN_VALUE;
    this.jdField_c_of_type_Short = Short.MIN_VALUE;
    this.jdField_f_of_type_Short = Short.MIN_VALUE;
    this.jdField_g_of_type_Short = Short.MIN_VALUE;
    this.jdField_h_of_type_Short = Short.MIN_VALUE;
    this.jdField_i_of_type_Short = Short.MIN_VALUE;
    this.jdField_b_of_type_Boolean = true;
    this.jdField_g_of_type_JavaLangString = null;
    this.jdField_a_of_type_Ba = null;
    this.jdField_h_of_type_JavaLangString = null;
    this.jdField_i_of_type_JavaLangString = null;
  }
  
  public int a()
  {
    return -1;
  }
  
  public void b(int paramInt) {}
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public void a(int paramInt1, int paramInt2) {}
  
  public boolean a()
  {
    return false;
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void c(int paramInt) {}
  
  public final void b(String paramString)
  {
    this.jdField_i_of_type_JavaLangString = paramString;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.jdField_b_of_type_Boolean = paramBoolean;
  }
  
  public final boolean c()
  {
    return this.jdField_b_of_type_Boolean;
  }
  
  public abstract bg a(Graphics paramGraphics, bg parambg);
  
  public final void c()
  {
    if (this.jdField_a_of_type_Ba == null) {
      return;
    }
    ba tmp12_9 = this.jdField_a_of_type_Ba;
    tmp12_9.jdField_h_of_type_Short = ((short)(tmp12_9.jdField_h_of_type_Short + this.l));
    ba tmp29_26 = this.jdField_a_of_type_Ba;
    tmp29_26.jdField_i_of_type_Short = ((short)tmp29_26.jdField_i_of_type_Short);
    ba tmp41_38 = this.jdField_a_of_type_Ba;
    tmp41_38.d = ((short)(tmp41_38.d + this.k));
    ba tmp58_55 = this.jdField_a_of_type_Ba;
    tmp58_55.e = ((short)tmp58_55.e);
  }
  
  public final void d()
  {
    if (this.jdField_a_of_type_Ba == null) {
      return;
    }
    ba tmp12_9 = this.jdField_a_of_type_Ba;
    tmp12_9.jdField_h_of_type_Short = ((short)(tmp12_9.jdField_h_of_type_Short - this.l));
    ba tmp29_26 = this.jdField_a_of_type_Ba;
    tmp29_26.jdField_i_of_type_Short = ((short)tmp29_26.jdField_i_of_type_Short);
    ba tmp41_38 = this.jdField_a_of_type_Ba;
    tmp41_38.d = ((short)(tmp41_38.d - this.k));
    ba tmp58_55 = this.jdField_a_of_type_Ba;
    tmp58_55.e = ((short)tmp58_55.e);
  }
  
  public ba a(String paramString)
  {
    if ((this.jdField_g_of_type_JavaLangString != null) && (this.jdField_g_of_type_JavaLangString.equals(paramString))) {
      return this;
    }
    return null;
  }
  
  public final bb a()
  {
    while (this.jdField_a_of_type_Ba != null) {
      this = this.jdField_a_of_type_Ba;
    }
    return (bb)this;
  }
  
  public ba a(ba paramba, byte paramByte)
  {
    if (this.jdField_a_of_type_Ba != null) {
      return this.jdField_a_of_type_Ba.a(paramba, paramByte);
    }
    return null;
  }
  
  public static void a(l paraml, String paramString)
  {
    while ((!paramString.equals(paraml.a)) || (paraml.jdField_b_of_type_Int != 3)) {
      paraml.a();
    }
  }
  
  public void a(l paraml) {}
  
  public final void d(l paraml)
  {
    this.jdField_g_of_type_JavaLangString = paraml.a("nm");
  }
  
  public final void a(InputStream paramInputStream, String paramString)
  {
    try
    {
      l locall;
      (locall = new l()).a(paramInputStream, "UTF-8");
      locall.a();
      locall.a(2, paramString);
      a(locall);
      locall.a(3, paramString);
      locall.a();
      locall.a(1, null);
      paramInputStream.close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public static ba a(InputStream paramInputStream, ba paramba)
  {
    Object localObject = null;
    try
    {
      l locall;
      (locall = new l()).a(paramInputStream, "UTF-8");
      locall.a();
      String str = locall.a;
      if ("tb".equals(str)) {
        localObject = new bi(paramba);
      } else if ("tr".equals(str)) {
        localObject = new bl(paramba);
      } else if ("td".equals(str)) {
        localObject = new bk(paramba);
      } else if ("a".equals(str)) {
        localObject = new av(paramba);
      } else if ("i".equals(str)) {
        localObject = new bd(paramba);
      } else if ("br".equals(str)) {
        localObject = new aw(paramba);
      } else if ("ddl".equals(str)) {
        localObject = new ay(paramba);
      } else if ("exp".equals(str)) {
        localObject = new az(paramba);
      }
      if (localObject != null) {
        ((ba)localObject).a(locall);
      }
      locall.a();
      locall.a(1, null);
      paramInputStream.close();
    }
    catch (Exception localException) {}
    return (ba)localObject;
  }
  
  public static String[] a(String paramString, int paramInt, Font paramFont)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return new String[] { "" };
    }
    au localau = new au();
    String str1 = 0;
    int m = paramString.length();
    Object localObject1 = null;
    String str2;
    do
    {
      str2 = str1;
      String str3 = paramString.indexOf('`', str2);
      do
      {
        String str4 = str2;
        Object localObject3 = localObject1;
        localObject1 = paramString;
        String str5;
        while ((str5 = ((String)localObject1).indexOf(' ', str2)) == 0) {
          str2++;
        }
        if ((str5 = str5) == -1) {
          str5 = ((String)localObject1).length();
        } else {
          str5++;
        }
        str2++;
        while (str2 < str5) {
          str2++;
        }
        str2 = a(((String)localObject1).charAt(str2)) ? str2 : a(paramString.charAt(str2)) ? str2 + 1 : str5;
        if ((str3 >= 0) && (str3 < str2)) {
          str2 = str3;
        }
        localObject1 = paramString.substring(str1, str2).trim();
        if (paramFont.stringWidth((String)localObject1) > paramInt)
        {
          if (str4 == str1)
          {
            for (str1 = ((String)localObject1).length() - 1; str1 > 0; str1--)
            {
              localObject2 = ((String)localObject1).substring(0, str1);
              if (paramFont.stringWidth((String)localObject2) < paramInt)
              {
                str2 = str4 + str1;
                localObject1 = localObject2;
                break;
              }
            }
            break;
          }
          str2 = str4;
          localObject1 = (String)localObject3;
          break;
        }
        if (str2 == localObject2)
        {
          str2++;
          break;
        }
      } while (str2 < m);
      localau.a(localObject1);
    } while ((str1 = str2) < m);
    Object localObject2 = new String[localau.a];
    localau.a((Object[])localObject2);
    return (String[])localObject2;
  }
  
  private static boolean a(int paramInt)
  {
    return ((paramInt >= 11904) && (paramInt < 44032)) || ((paramInt >= 63744) && (paramInt < 64256)) || ((paramInt >= 65280) && (paramInt < 65504));
  }
  
  public char a()
  {
    return '\000';
  }
  
  public void a() {}
  
  static
  {
    jdField_a_of_type_Array2dOfInt = new int[][] { { 15109601, 9381250, 9276813, 15100382, 3147832, 16777215, 13500897, 12539291, 16777215, 11744422 }, { 14333035, 10315041, 5111295, 15504158, 5846820, 2424832, 16747520, 16753924, 6952704, 10637312 }, { 8249855, 884159, 16777214, 962047, 11617, 466746, 3970283, 5607615, 343937, 32193 }, { 8225169, 3883345, 16777214, 5923964, 2434841, 2236962, 4605510, 8424596, 16753944, 4605510 }, { 13051685, 5706772, 16777215, 13051685, 6115133, 0, 14992896, 13553358, 16753944, 5706772 } };
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ba.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */