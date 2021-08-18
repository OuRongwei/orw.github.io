import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class y
{
  public static long a;
  private static au jdField_a_of_type_Au = new au();
  private static String[] jdField_a_of_type_ArrayOfJavaLangString = { "[区域]", "[世界]", "[帮会]", "[密语]", "[队伍]", "[公告]", "[系统]", "[群落]", "[GM]" };
  private static bh jdField_a_of_type_Bh = new bh("<show bt='-1' h='" + d.jdField_b_of_type_Int + "' w='" + d.jdField_a_of_type_Int + "'><tb ln='n' nm='chat0'></tb></show>");
  private static bh jdField_b_of_type_Bh = new bh("<show bt='-1' h='" + d.jdField_b_of_type_Int + "' w='" + d.jdField_a_of_type_Int + "'><tb ln='n' nm='chat1'></tb></show>");
  private static bh c = new bh("<show bt='-1' h='" + d.jdField_b_of_type_Int + "' w='" + d.jdField_a_of_type_Int + "'><tb ln='n' nm='chat2'></tb></show>");
  private static bh d = new bh("<show bt='-1' h='" + d.jdField_b_of_type_Int + "' w='" + d.jdField_a_of_type_Int + "'><tb ln='n' nm='chat3'></tb></show>");
  private static bh[] jdField_a_of_type_ArrayOfBh = { jdField_a_of_type_Bh, jdField_b_of_type_Bh, c, d };
  private static Image jdField_a_of_type_JavaxMicroeditionLcduiImage = Image.createImage(1, 1);
  private static Graphics jdField_a_of_type_JavaxMicroeditionLcduiGraphics;
  private static int jdField_a_of_type_Int = 0;
  private static int jdField_b_of_type_Int = 0;
  private static int[] jdField_a_of_type_ArrayOfInt = new int[4];
  private static int[] jdField_b_of_type_ArrayOfInt = new int[4];
  
  public static void a(n paramn)
  {
    if (e.jdField_a_of_type_G == null) {
      return;
    }
    byte b1 = paramn.a();
    long l = paramn.a();
    String str1 = paramn.a();
    paramn = paramn.a();
    ac localac;
    (localac = new ac()).jdField_a_of_type_Byte = b1;
    localac.jdField_a_of_type_Long = l;
    localac.jdField_a_of_type_JavaLangString = str1;
    String str2 = "000000";
    switch (b1)
    {
    case 3: 
      str2 = "2ccfa3";
      break;
    case 0: 
      str2 = "ffffff";
      break;
    case 4: 
      str2 = "80a2f9";
      break;
    case 2: 
      str2 = "ffffff";
      break;
    case 7: 
      str2 = "7b03d5";
      break;
    case 1: 
      str2 = "2ccfa3";
      break;
    case 5: 
      str2 = "fd5b5b";
      break;
    case 6: 
      str2 = "fd5b5b";
      break;
    case 8: 
      str2 = "000000";
      break;
    case 9: 
      str2 = "ffffff";
    }
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    if ((b1 == 5) || (b1 == 6))
    {
      ae.a(jdField_a_of_type_ArrayOfJavaLangString[b1] + paramn, b1);
    }
    else if (b1 == 1)
    {
      ae.a(jdField_a_of_type_ArrayOfJavaLangString[b1] + str1 + " 说：" + paramn, 1);
    }
    else if (b1 == 3)
    {
      if (l == e.jdField_a_of_type_G.jdField_a_of_type_Long)
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='");
        e.jdField_a_of_type_JavaLangStringBuffer.append(str2 + "'>");
        e.jdField_a_of_type_JavaLangStringBuffer.append(jdField_a_of_type_ArrayOfJavaLangString[b1]);
        e.jdField_a_of_type_JavaLangStringBuffer.append("我对");
        e.jdField_a_of_type_JavaLangStringBuffer.append(str1);
        e.jdField_a_of_type_JavaLangStringBuffer.append(" 说：");
        e.jdField_a_of_type_JavaLangStringBuffer.append(paramn);
        e.jdField_a_of_type_JavaLangStringBuffer.append("</a>");
      }
      else
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='");
        e.jdField_a_of_type_JavaLangStringBuffer.append(str2 + "'>");
        e.jdField_a_of_type_JavaLangStringBuffer.append(jdField_a_of_type_ArrayOfJavaLangString[b1]);
        e.jdField_a_of_type_JavaLangStringBuffer.append(str1);
        e.jdField_a_of_type_JavaLangStringBuffer.append("对你 说：");
        e.jdField_a_of_type_JavaLangStringBuffer.append(paramn);
        e.jdField_a_of_type_JavaLangStringBuffer.append("</a>");
        e.jdField_a_of_type_ArrayOfByte[0] = 1;
      }
    }
    else
    {
      if (b1 == 7)
      {
        ae.a(paramn, b1);
        return;
      }
      e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='");
      e.jdField_a_of_type_JavaLangStringBuffer.append(str2 + "'>");
      e.jdField_a_of_type_JavaLangStringBuffer.append(jdField_a_of_type_ArrayOfJavaLangString[b1]);
      if (l == e.jdField_a_of_type_G.jdField_a_of_type_Long) {
        e.jdField_a_of_type_JavaLangStringBuffer.append("我");
      } else {
        e.jdField_a_of_type_JavaLangStringBuffer.append(str1);
      }
      e.jdField_a_of_type_JavaLangStringBuffer.append(" 说：");
      e.jdField_a_of_type_JavaLangStringBuffer.append(paramn);
      e.jdField_a_of_type_JavaLangStringBuffer.append("</a>");
    }
    String str3 = a(e.jdField_a_of_type_JavaLangStringBuffer.toString());
    Object localObject;
    if ((b1 != 5) && (b1 != 6) && (b1 != 1))
    {
      localObject = str3;
      ((ax)jdField_a_of_type_ArrayOfBh[jdField_a_of_type_Int].a("chat" + jdField_a_of_type_Int)).jdField_a_of_type_Short = 0;
      a(jdField_a_of_type_ArrayOfBh[jdField_a_of_type_Int], "chat" + jdField_a_of_type_Int, (String)localObject);
      jdField_a_of_type_JavaxMicroeditionLcduiGraphics = jdField_a_of_type_JavaxMicroeditionLcduiImage.getGraphics();
      ((ax)jdField_a_of_type_ArrayOfBh[jdField_a_of_type_Int].a("chat" + jdField_a_of_type_Int)).g = 0;
      e.jdField_a_of_type_Bg.jdField_b_of_type_Short = 0;
      jdField_a_of_type_ArrayOfBh[jdField_a_of_type_Int].a(jdField_a_of_type_JavaxMicroeditionLcduiGraphics, e.jdField_a_of_type_Bg);
      jdField_b_of_type_ArrayOfInt[jdField_a_of_type_Int] = (e.jdField_a_of_type_Bg.jdField_b_of_type_Short / bg.jdField_b_of_type_Byte);
      jdField_a_of_type_ArrayOfInt[jdField_a_of_type_Int] = 100;
      if ((jdField_a_of_type_Int = ++jdField_a_of_type_Int % 4) == jdField_b_of_type_Int) {
        jdField_b_of_type_Int = ++jdField_b_of_type_Int % 4;
      }
    }
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    if (b1 == 3)
    {
      if (l == e.jdField_a_of_type_G.jdField_a_of_type_Long)
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='").append(str2).append("'");
        e.jdField_a_of_type_JavaLangStringBuffer.append(a(l, jdField_a_of_type_ArrayOfJavaLangString[b1], str1, b1));
        e.jdField_a_of_type_JavaLangStringBuffer.append(" 说:");
        e.jdField_a_of_type_JavaLangStringBuffer.append(paramn).append("</a>");
      }
      else
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='").append(str2).append("'").append(a(l, jdField_a_of_type_ArrayOfJavaLangString[b1], str1, b1));
        e.jdField_a_of_type_JavaLangStringBuffer.append("对你说:");
        e.jdField_a_of_type_JavaLangStringBuffer.append(paramn).append("</a>");
      }
    }
    else
    {
      e.jdField_a_of_type_JavaLangStringBuffer.append("<a c='").append(str2).append("'").append(a(l, jdField_a_of_type_ArrayOfJavaLangString[b1], str1, b1));
      if ((b1 != 5) && (b1 != 6)) {
        e.jdField_a_of_type_JavaLangStringBuffer.append(" 说:");
      }
      e.jdField_a_of_type_JavaLangStringBuffer.append(paramn).append("</a>");
    }
    str3 = a(e.jdField_a_of_type_JavaLangStringBuffer.toString());
    localac.b = str3;
    a((localObject = localac).jdField_a_of_type_Byte);
    if (jdField_a_of_type_Au.jdField_a_of_type_Int >= 100) {
      jdField_a_of_type_Au.b(0);
    }
    jdField_a_of_type_Au.a(localObject);
    a((paramn = new String[] { "all", "world", "guild", "secret", "team", "all", "all" })[b1], paramn[b1] + "r", str3);
    if ((b1 > 0) && (b1 < 5)) {
      a("all", "allr", str3);
    }
  }
  
  private static void a(int paramInt)
  {
    if ((jdField_a_of_type_Au == null) || (jdField_a_of_type_Au.jdField_a_of_type_Int <= 0) || (paramInt == 5) || (paramInt == 6) || (paramInt == 0)) {
      return;
    }
    int i = 0;
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= jdField_a_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      if (((ac)jdField_a_of_type_Au.a(j)).jdField_a_of_type_Byte == paramInt) {
        i++;
      }
    }
    if (i >= 50) {
      jdField_a_of_type_Au.b(0);
    }
  }
  
  public static void a(byte paramByte, String paramString)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(64);
    localn.a(jdField_a_of_type_Long);
    localn.a(paramByte);
    localn.a(paramString);
    e.jdField_a_of_type_Q.c();
  }
  
  private static String a(long paramLong, String paramString1, String paramString2, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramLong == e.jdField_a_of_type_G.jdField_a_of_type_Long)
    {
      if (paramInt == 3) {
        localStringBuffer.append(" cmd=''>").append(paramString1).append("我对").append(paramString2);
      } else {
        localStringBuffer.append(" cmd=''>").append(paramString1).append("我");
      }
      return localStringBuffer.toString();
    }
    switch (paramInt)
    {
    case 0: 
      localStringBuffer.append(" cmd='o:callac(").append('"').append(paramLong).append('"').append(",").append('"').append(paramString2).append('"').append(")'>").append(paramString1).append(paramString2);
      break;
    case 1: 
      localStringBuffer.append(" cmd='o:callwc(").append('"').append(paramLong).append('"').append(",").append('"').append(paramString2).append('"').append(")'>").append(paramString1).append(paramString2);
      break;
    case 4: 
      localStringBuffer.append(" cmd='o:calltc(").append('"').append(paramLong).append('"').append(",").append('"').append(paramString2).append('"').append(")'>").append(paramString1).append(paramString2);
      break;
    case 2: 
      localStringBuffer.append(" cmd='o:callgc(").append('"').append(paramLong).append('"').append(",").append('"').append(paramString2).append('"').append(")'>").append(paramString1).append(paramString2);
      break;
    case 3: 
      localStringBuffer.append(" cmd='o:callsc(").append('"').append(paramLong).append('"').append(",").append('"').append(paramString2).append('"').append(")'>").append(paramString1).append(paramString2);
      break;
    case 5: 
    case 6: 
      localStringBuffer.append(" cmd=''>").append(paramString1).append(":");
    }
    return localStringBuffer.toString();
  }
  
  private static String a(String paramString)
  {
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    if (paramString.indexOf("<td>") >= 0) {
      e.jdField_a_of_type_JavaLangStringBuffer.append("<tr>").append(paramString).append("</tr>");
    } else {
      e.jdField_a_of_type_JavaLangStringBuffer.append("<tr><td>").append(paramString).append("</td></tr>");
    }
    return e.jdField_a_of_type_JavaLangStringBuffer.toString();
  }
  
  private static void a(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = e.jdField_a_of_type_Bc.a(paramString1);
    if ((paramString3 == null) || (paramString1 == null)) {
      return;
    }
    ax localax = null;
    if (paramString2 != null)
    {
      localax = (ax)paramString1.a(paramString2);
    }
    else
    {
      int i = -1;
      do
      {
        i++;
        if (i >= paramString1.jdField_a_of_type_Short) {
          break;
        }
      } while (((paramString2 = paramString1.a(i)) == null) || (!(paramString2 instanceof bi)));
      localax = (ax)paramString2;
    }
    if (localax != null)
    {
      paramString2 = ba.a(bc.a(paramString3), localax);
      if ((paramString1 = localax).jdField_a_of_type_ArrayOfBa.length <= paramString1.jdField_a_of_type_Short) {
        paramString1.b();
      }
      if (paramString1.jdField_a_of_type_Short >= 0)
      {
        for (paramString3 = paramString1.jdField_a_of_type_Short - 1; paramString3 >= 0; paramString3--) {
          paramString1.jdField_a_of_type_ArrayOfBa[(paramString3 + 1)] = paramString1.jdField_a_of_type_ArrayOfBa[paramString3];
        }
        paramString1.jdField_a_of_type_ArrayOfBa[0] = paramString2;
        paramString2.a = paramString1;
        paramString1.jdField_a_of_type_Short = ((short)(paramString1.jdField_a_of_type_Short + 1));
      }
    }
  }
  
  private static void a(ax paramax, String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (paramax == null)) {
      return;
    }
    ax localax = null;
    if (paramString1 != null)
    {
      localax = (ax)paramax.a(paramString1);
    }
    else
    {
      int i = -1;
      do
      {
        i++;
        if (i >= paramax.jdField_a_of_type_Short) {
          break;
        }
      } while (((paramString1 = paramax.a(i)) == null) || (!(paramString1 instanceof bi)));
      localax = (ax)paramString1;
    }
    if (localax != null) {
      localax.a(ba.a(bc.a(paramString2), localax));
    }
  }
  
  public static final void a(Graphics paramGraphics)
  {
    if (jdField_b_of_type_Int == jdField_a_of_type_Int) {
      return;
    }
    int i = jdField_b_of_type_Int;
    int j = 0;
    while (i != jdField_a_of_type_Int)
    {
      j += jdField_b_of_type_ArrayOfInt[i];
      i++;
      i %= 4;
    }
    if (j == 0) {
      return;
    }
    if (j > 3) {
      i = bg.jdField_b_of_type_Byte * 3;
    } else {
      i = bg.jdField_b_of_type_Byte * j;
    }
    paramGraphics.setClip(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    ad.a(paramGraphics, 0, d.jdField_b_of_type_Int - 30 - i, d.jdField_a_of_type_Int, i);
    paramGraphics.setClip(0, d.jdField_b_of_type_Int - 30 - i, d.jdField_a_of_type_Int, i);
    i = jdField_b_of_type_Int;
    j = (short)(d.jdField_b_of_type_Int - 30 - bg.jdField_b_of_type_Byte * j);
    while (i != jdField_a_of_type_Int)
    {
      e.jdField_a_of_type_Bg.jdField_b_of_type_Short = ((short)j);
      e.jdField_a_of_type_Bg.jdField_a_of_type_Short = 2;
      jdField_a_of_type_ArrayOfBh[i].b(e.jdField_a_of_type_Bg.jdField_a_of_type_Short, e.jdField_a_of_type_Bg.jdField_b_of_type_Short - 4);
      Graphics localGraphics = paramGraphics;
      bh localbh;
      (localbh = jdField_a_of_type_ArrayOfBh[i]).b.jdField_a_of_type_Short = localbh.d;
      localbh.b.jdField_b_of_type_Short = ((short)localbh.d);
      localbh.b.e = localbh.i;
      localbh.b.d = localbh.e;
      localbh.a(localGraphics, localbh.b);
      j += bg.jdField_b_of_type_Byte * jdField_b_of_type_ArrayOfInt[i];
      jdField_a_of_type_ArrayOfInt[i] -= 1;
      if (jdField_a_of_type_ArrayOfInt[i] <= 0) {
        jdField_b_of_type_Int = (i + 1) % 4;
      }
      i++;
      i %= 4;
    }
    paramGraphics.setClip(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
  }
  
  public static void a(int paramInt, long paramLong, String paramString)
  {
    jdField_a_of_type_Long = paramLong;
    ??? = new int[] { 1, 4, 3, -1, 2 };
    if (paramInt != 3)
    {
      paramLong = "";
      e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
      e.jdField_a_of_type_JavaLangStringBuffer.append("~<ddl nm='channel' list='区域|1:世界|2:队伍|3:帮会|4' w='").append(80).append("' num='").append(???[paramInt]).append("'></ddl>");
      ??? = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    }
    else
    {
      e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
      e.jdField_a_of_type_JavaLangStringBuffer.append("<tr><td><a>~密聊:").append(paramString).append("</a></td></tr>");
      paramLong = e.jdField_a_of_type_JavaLangStringBuffer.toString();
      ??? = "";
    }
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    e.jdField_a_of_type_JavaLangStringBuffer.append("getNum(").append('"').append("channel").append('"').append(")");
    String paramString = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    e.jdField_a_of_type_JavaLangStringBuffer.append('"').append("5").append('"');
    String str1 = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    if (paramInt != 3) {
      paramInt = paramString;
    } else {
      paramInt = str1;
    }
    paramLong = bc.a(bc.a(bc.a("chat"), "$replace1", paramLong), "$replace2", (String)???);
    e.jdField_a_of_type_Bc.a(bc.a(paramLong, "$replace3", paramInt));
  }
  
  public static void a(int paramInt1, long paramLong, int paramInt2)
  {
    jdField_a_of_type_Long = paramLong;
    Object localObject = { 1, 2, 4, -1, 3 };
    String str;
    if (paramInt1 != 3)
    {
      paramLong = "";
      e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
      e.jdField_a_of_type_JavaLangStringBuffer.append("~<ddl nm='channel' list='区域|1:世界|2:队伍|3:帮会|4' w='").append(80).append("' num='").append(localObject[paramInt1]).append("'></ddl>");
      ??? = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    }
    else
    {
      e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
      int i = paramInt2;
      long l = paramLong;
      paramLong = 0;
      paramLong = -1;
      do
      {
        paramLong++;
      } while (((ac)jdField_a_of_type_Au.a(paramLong)).jdField_a_of_type_Long != l);
      localObject = (i == 1) && (paramInt1 == 3) ? g.i.jdField_a_of_type_JavaLangString : (i == 0) && (paramInt1 == 3) ? null : paramLong < jdField_a_of_type_Au.jdField_a_of_type_Int ? ((ac)jdField_a_of_type_Au.a(paramLong)).jdField_a_of_type_JavaLangString : (jdField_a_of_type_Au == null) || (jdField_a_of_type_Au.jdField_a_of_type_Int <= 0) ? "" : null;
      e.jdField_a_of_type_JavaLangStringBuffer.append("<tr><td><a>~收件人:").append((String)localObject).append("</a></td></tr>");
      paramLong = e.jdField_a_of_type_JavaLangStringBuffer.toString();
      str = "";
    }
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    e.jdField_a_of_type_JavaLangStringBuffer.append("getNum(").append('"').append("channel").append('"').append(")");
    int paramInt2 = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    e.jdField_a_of_type_JavaLangStringBuffer.append('"').append("5").append('"');
    localObject = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    if (paramInt1 != 3) {
      paramInt1 = paramInt2;
    } else {
      paramInt1 = (int)localObject;
    }
    paramLong = bc.a(bc.a(bc.a("chat"), "$replace1", paramLong), "$replace2", str);
    e.jdField_a_of_type_Bc.a(bc.a(paramLong, "$replace3", paramInt1));
  }
  
  public static void a()
  {
    String[] arrayOfString1 = new String[jdField_a_of_type_Au.jdField_a_of_type_Int];
    int[] arrayOfInt = new int[jdField_a_of_type_Au.jdField_a_of_type_Int];
    String[] arrayOfString2 = { "", "", "", "", "" };
    int i = arrayOfString1.length;
    while (i-- > 0)
    {
      arrayOfInt[i] = ((ac)jdField_a_of_type_Au.a(i)).jdField_a_of_type_Byte;
      arrayOfString1[i] = ((ac)jdField_a_of_type_Au.a(i)).b;
      if ((arrayOfString1.length < 50) || (i > arrayOfString1.length - 50))
      {
        int tmp116_115 = 0;
        String[] tmp116_114 = arrayOfString2;
        tmp116_114[tmp116_115] = (tmp116_114[tmp116_115] + arrayOfString1[i]);
      }
      switch (arrayOfInt[i])
      {
      case 1: 
        int tmp173_172 = 1;
        String[] tmp173_171 = arrayOfString2;
        tmp173_171[tmp173_172] = (tmp173_171[tmp173_172] + arrayOfString1[i]);
        break;
      case 4: 
        int tmp200_199 = 2;
        String[] tmp200_198 = arrayOfString2;
        tmp200_198[tmp200_199] = (tmp200_198[tmp200_199] + arrayOfString1[i]);
        break;
      case 2: 
        int tmp227_226 = 3;
        String[] tmp227_225 = arrayOfString2;
        tmp227_225[tmp227_226] = (tmp227_225[tmp227_226] + arrayOfString1[i]);
        break;
      case 3: 
        int tmp254_253 = 4;
        String[] tmp254_252 = arrayOfString2;
        tmp254_252[tmp254_253] = (tmp254_252[tmp254_253] + arrayOfString1[i]);
      }
    }
    String str = bc.a(bc.a(bc.a(bc.a(bc.a("chatrecord"), "$replace1", arrayOfString2[0]), "$replace2", arrayOfString2[1]), "$replace3", arrayOfString2[2]), "$replace4", arrayOfString2[3]);
    e.jdField_a_of_type_Bc.a(bc.a(str, "$replace5", arrayOfString2[4]));
    if (e.jdField_a_of_type_ArrayOfByte[0] == 1) {
      e.jdField_a_of_type_ArrayOfByte[0] = 0;
    }
  }
  
  public static void b()
  {
    for (int i = 0; i < 4; i++)
    {
      ((ax)jdField_a_of_type_ArrayOfBh[i].a("chat" + i)).jdField_a_of_type_Short = 0;
      jdField_a_of_type_ArrayOfInt[i] = 0;
      jdField_b_of_type_ArrayOfInt[i] = 0;
    }
    jdField_a_of_type_Int = jdField_b_of_type_Int = 0;
    jdField_a_of_type_Au.a();
    ae.a();
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */