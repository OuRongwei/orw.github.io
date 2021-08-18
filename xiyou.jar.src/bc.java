import engine.Ancient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class bc
  extends ax
{
  public static String[] a;
  public static int d;
  public static int e;
  public static long a;
  public MIDlet a;
  
  public bc(MIDlet paramMIDlet)
  {
    this.jdField_a_of_type_JavaxMicroeditionMidletMIDlet = null;
    this.jdField_a_of_type_JavaxMicroeditionMidletMIDlet = paramMIDlet;
    e = d.b;
    d = d.jdField_a_of_type_Int;
  }
  
  public final void a(String paramString)
  {
    a(a(paramString));
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    a(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public static InputStream a(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      new DataOutputStream(localByteArrayOutputStream).writeUTF(paramString);
      paramString = new byte[localByteArrayOutputStream.size() - 2];
      System.arraycopy(localByteArrayOutputStream.toByteArray(), 2, paramString, 0, paramString.length);
      return new ByteArrayInputStream(paramString);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void c(String paramString)
  {
    try
    {
      paramString = paramString;
      a(new ByteArrayInputStream(a(paramString)));
      e.x();
      return;
    }
    catch (Exception localException) {}
  }
  
  private static byte[] a(String paramString)
  {
    byte[] arrayOfByte = null;
    try
    {
      int i = (paramString = Ancient.jdField_a_of_type_EngineAncient.getClass().getResourceAsStream("/out/" + paramString)).read();
      int j = paramString.read();
      int k = paramString.read();
      int m = paramString.read();
      arrayOfByte = new byte[i = (i << 24) + (j << 16) + (k << 8) + m];
      for (j = 0; j < i; j++) {
        arrayOfByte[j] = ((byte)(paramString.read() ^ 0xAB));
      }
      paramString.close();
    }
    catch (IOException localIOException)
    {
      localIOException;
    }
    return arrayOfByte;
  }
  
  public static final String a(String paramString)
  {
    String str = null;
    try
    {
      str = new String(a(paramString), "UTF-8");
    }
    catch (Exception localException) {}
    return str;
  }
  
  public static final String a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      return paramString1;
    }
    try
    {
      while (-1 != paramString1.indexOf(paramString2)) {
        paramString1 = paramString1.substring(0, paramString1.indexOf(paramString2)) + paramString3 + paramString1.substring(paramString1.indexOf(paramString2) + paramString2.length());
      }
    }
    catch (Exception localException) {}
    return paramString1;
  }
  
  private void a(InputStream paramInputStream)
  {
    bb localbb = new bb(this);
    try
    {
      paramInputStream.reset();
      localbb.a(paramInputStream, "form");
    }
    catch (Exception localException) {}
    a(localbb);
    if (d.b() != 12) {
      d.a((byte)12, 0);
    }
    if (b() != null) {
      bb.g();
    }
  }
  
  public final void d(String paramString)
  {
    StringBuffer localStringBuffer;
    if ((paramString = av.a(localStringBuffer = new StringBuffer(paramString))).startsWith("g"))
    {
      c(localStringBuffer);
      return;
    }
    if (paramString.equals("c"))
    {
      h.b(localStringBuffer.toString());
      return;
    }
    if (paramString.equals("send"))
    {
      a(localStringBuffer);
      return;
    }
    if (paramString.startsWith("s")) {
      b(localStringBuffer);
    }
  }
  
  private static void a(StringBuffer paramStringBuffer)
  {
    String str1 = av.a(paramStringBuffer);
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(Integer.parseInt(str1));
    while (((str1 = av.a(paramStringBuffer)) != null) && (str1.length() > 0))
    {
      String str2 = str1.substring(1);
      switch (str1.charAt(0))
      {
      case 'b': 
        localn.a(Byte.parseByte(str2));
        break;
      case 's': 
        localn.b(Short.parseShort(str2));
        break;
      case 'i': 
        localn.c(Integer.parseInt(str2));
        break;
      case 'l': 
        localn.a(Long.parseLong(str2));
        break;
      case 'u': 
        localn.a(str2);
        break;
      default: 
        localn.a(str1);
      }
    }
    e.jdField_a_of_type_Q.c();
  }
  
  private static void b(StringBuffer paramStringBuffer)
  {
    String str = av.a(paramStringBuffer);
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(Integer.parseInt(str));
    while (((str = av.a(paramStringBuffer)) != null) && (str.length() > 0)) {
      localn.a(str);
    }
    e.jdField_a_of_type_Q.c();
  }
  
  private void c(StringBuffer paramStringBuffer)
  {
    Object localObject1;
    if ((localObject1 = av.a(paramStringBuffer)).equals("open"))
    {
      c(av.a(paramStringBuffer));
      return;
    }
    if (((String)localObject1).equals("ddl"))
    {
      ay localay;
      if ((localay = (ay)a(av.a(paramStringBuffer)).a(av.a(paramStringBuffer))) != null)
      {
        localay.h = av.a(paramStringBuffer);
        if ((((localObject1 = av.a(paramStringBuffer)) != null ? 1 : 0) & (((String)localObject1).length() > 0 ? 1 : 0)) != 0) {
          localay.d(Integer.parseInt((String)localObject1));
        }
      }
      return;
    }
    int i1;
    if (((String)localObject1).equals("pathNode"))
    {
      if (ag.a())
      {
        e.c("跟随状态下不能寻路!");
        return;
      }
      d.a((byte)8, 0);
      e.jdField_a_of_type_Bc.h();
      i();
      new StringBuffer().append("pathNode:").append(paramStringBuffer.toString()).toString();
      int j = Integer.parseInt(av.a(paramStringBuffer));
      e.jdField_a_of_type_G.a = new int[j * 3];
      e.jdField_a_of_type_G.z = 0;
      for (i1 = 0; i1 < e.jdField_a_of_type_G.a.length; i1++) {
        e.jdField_a_of_type_G.a[i1] = Integer.parseInt(av.a(paramStringBuffer));
      }
      if (e.jdField_a_of_type_G.a[e.jdField_a_of_type_G.z] != e.jdField_a_of_type_Int)
      {
        e.c("好象走不到的样子哦!");
        e.jdField_a_of_type_G.m();
        return;
      }
      ad.b(e.jdField_a_of_type_G.a[(e.jdField_a_of_type_G.z * 3 + 1)], e.jdField_a_of_type_G.a[(e.jdField_a_of_type_G.z * 3 + 2)]);
      return;
    }
    if (((String)localObject1).equals("login"))
    {
      e.d = av.a(paramStringBuffer);
      e.e = av.a(paramStringBuffer);
      e.jdField_b_of_type_Byte = 0;
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      d.a();
      d.a((byte)4, 0);
      return;
    }
    if (((String)localObject1).equals("socket"))
    {
      e.b(av.a(paramStringBuffer), paramStringBuffer.toString());
      return;
    }
    if (((String)localObject1).equals("useSkill"))
    {
      e.jdField_a_of_type_Bc.h();
      i();
      t.jdField_a_of_type_Short = (short)Integer.parseInt(paramStringBuffer.toString());
      return;
    }
    if (((String)localObject1).equals("cdNotYet"))
    {
      e.jdField_a_of_type_Bc.h();
      i();
      t.jdField_a_of_type_Short = -1;
      t.a("CD还未冷却!");
      return;
    }
    if (((String)localObject1).equals("alwaysback"))
    {
      e.jdField_a_of_type_Bc.h();
      i();
      t.jdField_a_of_type_Short = -1;
      return;
    }
    if (((String)localObject1).equals("useItem"))
    {
      e.jdField_a_of_type_Bc.h();
      i();
      t.e = Integer.parseInt(paramStringBuffer.toString());
      return;
    }
    if (((String)localObject1).equals("gameLogin"))
    {
      h.a(paramStringBuffer.toString());
      return;
    }
    Object localObject2;
    if (((String)localObject1).equals("register"))
    {
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      e.jdField_b_of_type_Byte = 2;
      paramStringBuffer.append(':').append(Ancient.jdField_a_of_type_JavaLangString).append(':').append(Ancient.jdField_b_of_type_Byte);
      e.jdField_b_of_type_JavaLangString = paramStringBuffer.toString();
      if ((localObject2 = e.a(paramStringBuffer.toString(), ":")) != null)
      {
        e.d = localObject2[1];
        e.e = localObject2[2];
      }
      d.a();
      d.a((byte)4, 0);
      return;
    }
    if (((String)localObject1).equals("setps"))
    {
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      e.jdField_b_of_type_Byte = 7;
      e.jdField_b_of_type_JavaLangString = paramStringBuffer.toString();
      d.a();
      d.a((byte)4, 0);
      return;
    }
    String str4;
    int i4;
    if (((String)localObject1).equals("setbang"))
    {
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      i1 = (localObject2 = paramStringBuffer.toString()).lastIndexOf(':');
      str4 = ((String)localObject2).substring(i1 + 1);
      i1 = (localObject1 = ((String)localObject2).substring(0, i1)).lastIndexOf(':');
      localObject1 = ((String)localObject1).substring(i1 + 1);
      if (str4.length() > 5)
      {
        e.c("关键字应为五位以内数字或字母");
        return;
      }
      if (((String)localObject1).length() != 11)
      {
        e.c("手机号码不正确");
        return;
      }
      for (paramStringBuffer = 0; paramStringBuffer < str4.length(); paramStringBuffer++) {
        if ((((i4 = str4.charAt(paramStringBuffer)) < 'a') || (i4 > 122)) && ((i4 < 65) || (i4 > 90)) && ((i4 < 48) || (i4 > 57)))
        {
          e.c("关键字应为五位以内数字或字母");
          return;
        }
      }
      for (paramStringBuffer = 0; paramStringBuffer < ((String)localObject1).length(); paramStringBuffer++) {
        if (((i4 = ((String)localObject1).charAt(paramStringBuffer)) < '0') || (i4 > 57))
        {
          e.c("手机号码不正确");
          return;
        }
      }
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      e.jdField_b_of_type_Byte = 8;
      e.jdField_b_of_type_JavaLangString = (String)localObject2;
      d.a();
      d.a((byte)4, 0);
      return;
    }
    if (((String)localObject1).equals("findPword"))
    {
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      i1 = (localObject2 = paramStringBuffer.toString()).lastIndexOf(':');
      str4 = ((String)localObject2).substring(i1 + 1);
      i1 = (localObject1 = ((String)localObject2).substring(0, i1)).lastIndexOf(':');
      localObject1 = ((String)localObject1).substring(i1 + 1);
      if (str4.length() > 5)
      {
        e.c("关键字应为五位以内数字或字母");
        return;
      }
      if (((String)localObject1).length() != 11)
      {
        e.c("手机号码不正确");
        return;
      }
      for (paramStringBuffer = 0; paramStringBuffer < str4.length(); paramStringBuffer++) {
        if ((((i4 = str4.charAt(paramStringBuffer)) < 'a') || (i4 > 122)) && ((i4 < 65) || (i4 > 90)) && ((i4 < 48) || (i4 > 57)))
        {
          e.c("关键字应为五位以内数字或字母");
          return;
        }
      }
      e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = false;
      e.jdField_b_of_type_Byte = 8;
      e.jdField_b_of_type_JavaLangString = (String)localObject2;
      d.a();
      d.a((byte)4, 0);
      return;
    }
    if (((String)localObject1).equals("exit"))
    {
      d.e();
      return;
    }
    if (((String)localObject1).equals("mainmenu"))
    {
      e.w();
      e.jdField_a_of_type_Boolean = true;
      e.jdField_a_of_type_Q.d();
      e.d(null);
      return;
    }
    if (((String)localObject1).equals("menu"))
    {
      d.a();
      d.a((byte)3, 48);
      return;
    }
    if (((String)localObject1).equals("createPlayer"))
    {
      (localObject2 = e.jdField_a_of_type_Q.b()).a(17);
      ((n)localObject2).a(paramStringBuffer.toString());
      e.jdField_a_of_type_Q.c();
      return;
    }
    if (((String)localObject1).equals("gameset"))
    {
      e.a("gameset");
      for (int k = 0; k < 9; k++) {
        e.jdField_a_of_type_Bc.a("gameset", "setopen(" + (e.jdField_a_of_type_Short >> k & 0x1) + ",\"set" + k + "\")");
      }
      return;
    }
    if (!((String)localObject1).equals("saveset"))
    {
      if (((String)localObject1).equals("testNpc"))
      {
        h.a(Long.parseLong(paramStringBuffer.toString()));
        return;
      }
      String str1;
      if (((String)localObject1).equals("chat"))
      {
        str1 = av.a(paramStringBuffer);
        String str2 = paramStringBuffer.toString();
        int i3 = Integer.parseInt(str1);
        if ((localObject1 = new int[] { 0, 1, 4, 2, 3 })[(i3 - 1)] != 3) {
          y.jdField_a_of_type_Long = -1L;
        }
        y.a((byte)localObject1[(i3 - 1)], str2);
        return;
      }
      long l2;
      int i;
      if (((String)localObject1).equals("jump2chat"))
      {
        str1 = av.a(paramStringBuffer);
        l2 = -1L;
        i = -1;
        if ((i4 = Integer.parseInt(str1)) == 3)
        {
          l2 = Long.parseLong(av.a(paramStringBuffer));
          i = Integer.parseInt(av.a(paramStringBuffer));
        }
        y.a(i4, l2, i);
        return;
      }
      if (i.equals("openChatUi"))
      {
        e.jdField_a_of_type_Bc.h();
        y.a();
        return;
      }
      if (i.equals("openchat"))
      {
        y.a(0, -1L, 0);
        return;
      }
      if (i.equals("privatechat"))
      {
        str1 = av.a(paramStringBuffer);
        l2 = -1L;
        i = Integer.parseInt(str1);
        String str5 = null;
        if (i == 3)
        {
          l2 = Long.parseLong(av.a(paramStringBuffer));
          str5 = av.a(paramStringBuffer);
        }
        y.a(i, l2, str5);
        return;
      }
      int m;
      if (i.equals("goto"))
      {
        if (ag.a())
        {
          e.c("跟随状态下不能寻路!");
          return;
        }
        d.a((byte)8, 0);
        e.jdField_a_of_type_Bc.h();
        i();
        m = Integer.parseInt(av.a(paramStringBuffer));
        l2 = Long.parseLong(av.a(paramStringBuffer));
        if (m == 0)
        {
          ad.b(g.i.b, g.i.c);
          return;
        }
        ad.b(e.jdField_a_of_type_C.a(l2).b, e.jdField_a_of_type_C.a(l2).c);
        return;
      }
      if (i.equals("findway"))
      {
        if (ag.a())
        {
          e.c("跟随状态下不能寻路!");
          return;
        }
        d.a((byte)8, 0);
        e.jdField_a_of_type_Bc.h();
        i();
        m = Integer.parseInt(av.a(paramStringBuffer));
        int i2 = Integer.parseInt(av.a(paramStringBuffer));
        ad.b(m, i2);
        return;
      }
      long l1;
      if (i.equals("sneak"))
      {
        i();
        if ((l1 = Long.parseLong(av.a(paramStringBuffer))) != e.jdField_a_of_type_G.jdField_a_of_type_Long)
        {
          t.a(l1);
          return;
        }
        e.c("非法操作~");
        return;
      }
      if (i.equals("qiecuo"))
      {
        e.jdField_a_of_type_Bc.h();
        i();
        if ((l1 = Long.parseLong(av.a(paramStringBuffer))) != e.jdField_a_of_type_G.jdField_a_of_type_Long)
        {
          t.b(l1);
          return;
        }
        e.c("非法操作~");
        return;
      }
      if (i.equals("lockActor"))
      {
        l1 = Long.parseLong(av.a(paramStringBuffer));
        g.i = e.jdField_a_of_type_C.a(l1);
        return;
      }
      if (i.equals("checkDL"))
      {
        i();
        t.e();
        return;
      }
      if (i.equals("rebornRN"))
      {
        t.c(Integer.parseInt(av.a(paramStringBuffer)));
        return;
      }
      if (i.equals("worldmap"))
      {
        e.u();
        return;
      }
      if (i.equals("closemap"))
      {
        e.jdField_a_of_type_Byte = 0;
        return;
      }
      if (i.equals("opennameset"))
      {
        e.H();
        return;
      }
      if (i.equals("nameset"))
      {
        int n = Integer.parseInt(av.a(paramStringBuffer));
        String str3 = av.a(paramStringBuffer);
        StringBuffer localStringBuffer;
        (localStringBuffer = e.jdField_a_of_type_JavaLangStringBuffer).setLength(0);
        if (n == 5)
        {
          e.c("本客户端不支持拖拽操作！");
          return;
        }
        if (str3.equals("开启")) {
          localStringBuffer.append("update(").append('"').append(n).append('"').append(",").append('"').append("关闭").append('"').append(")");
        } else {
          localStringBuffer.append("update(").append('"').append(n).append('"').append(",").append('"').append("开启").append('"').append(")");
        }
        e.jdField_a_of_type_Bc.a("nameSet", localStringBuffer.toString());
        localStringBuffer.setLength(0);
        if (n == 5)
        {
          e.c("本客户端不支持拖拽操作！");
          return;
        }
        if (str3.equals("开启")) {
          localStringBuffer.append("change(").append('"').append(n).append('"').append(",").append('"').append("fd5b5b").append('"').append(")");
        } else {
          localStringBuffer.append("change(").append('"').append(n).append('"').append(",").append('"').append("2ccfa3").append('"').append(")");
        }
        e.jdField_a_of_type_Bc.a("nameSet", localStringBuffer.toString());
        e.c(n);
        return;
      }
      if (i.equals("checkHM"))
      {
        e.jdField_a_of_type_G.l();
        return;
      }
      if (i.equals("openintermenu"))
      {
        e.a("interactivemenu");
        return;
      }
      if (i.equals("opensetmenu"))
      {
        e.a("setmenu");
        return;
      }
      if (i.equals("recordset")) {
        e.a(2, "gameset", e.jdField_a_of_type_Short & 0xFFF);
      }
    }
  }
  
  public final void a(Graphics paramGraphics)
  {
    e = d.b;
    d = d.jdField_a_of_type_Int;
    jdField_a_of_type_Long = System.currentTimeMillis();
    e = e <= 0 ? 220 : e;
    d = d <= 0 ? 176 : d;
    int i = this.jdField_a_of_type_Short;
    int j = this.jdField_a_of_type_Short;
    do
    {
      j--;
      if (j < 0) {
        break;
      }
    } while (!((bb)a(j)).d());
    i = j;
    if (i == this.jdField_a_of_type_Short) {
      i = 0;
    }
    j = i - 1;
    for (;;)
    {
      j++;
      if (j >= this.jdField_a_of_type_Short) {
        break;
      }
      ((bb)a(j)).a(paramGraphics);
    }
  }
  
  public final void e()
  {
    if ((b() != null) && (bb.jdField_a_of_type_Boolean) && (!b().jdField_b_of_type_JavaLangString.equals("sm"))) {
      b().b(d.c());
    }
    int j;
    bc localbc;
    if (d.e() == 3)
    {
      j = d.h();
      localbc = this;
      if (b() != null)
      {
        localbc.b().a(j);
        d.f();
      }
      return;
    }
    if (d.e() > 0)
    {
      j = d.h();
      int i = d.f();
      localbc = this;
      if (b() != null)
      {
        localbc.b().a(i, j);
        d.f();
      }
      d.f();
    }
  }
  
  public static int b()
  {
    return d.c();
  }
  
  public static void f() {}
  
  public static void g() {}
  
  public static boolean d()
  {
    int i;
    return ((i = c()) >= 0) && (i <= 10);
  }
  
  public static int c()
  {
    for (int i = 19; i >= 0; i--) {
      if ((d.a(i) == 1) && (i > 4) && (i < 15)) {
        return i - 4;
      }
    }
    if (d.a(15) == 1) {
      return 15;
    }
    if (d.a(16) == 1) {
      return 16;
    }
    return -1;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    return null;
  }
  
  public final bb b()
  {
    return (bb)a(this.jdField_a_of_type_Short - 1);
  }
  
  public final void a(bb parambb)
  {
    
    if (parambb.g != null) {
      e(parambb.g);
    }
    a(parambb);
    if (parambb != null) {
      parambb.d = true;
    }
  }
  
  public final void a(ba paramba)
  {
    if (this.jdField_a_of_type_ArrayOfBa.length <= this.jdField_a_of_type_Short) {
      b();
    }
    this.jdField_a_of_type_ArrayOfBa[this.jdField_a_of_type_Short] = paramba;
    this.jdField_a_of_type_Short = ((short)(this.jdField_a_of_type_Short + 1));
  }
  
  public final void h()
  {
    int i = -1;
    for (;;)
    {
      i++;
      if (i >= this.jdField_a_of_type_Short) {
        break;
      }
      this.jdField_a_of_type_ArrayOfBa[i] = null;
    }
    this.jdField_a_of_type_Short = 0;
  }
  
  public static void i()
  {
    if (d.b() == 12) {
      d.a();
    }
  }
  
  public final void j()
  {
    if (this.jdField_a_of_type_Short > 0)
    {
      int i = this.jdField_a_of_type_Short - 1;
      bc localbc = this;
      if (i < localbc.jdField_a_of_type_ArrayOfBa.length)
      {
        ba localba = localbc.jdField_a_of_type_ArrayOfBa[i];
        localbc.b(localba);
      }
    }
    if (this.jdField_a_of_type_Short == 0) {
      d.a();
    }
  }
  
  public static String a(String paramString1, int paramInt, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (paramString1 != null) {
      try
      {
        int j = 0;
        int k = 0;
        int m = paramString1.length();
        while (k < m)
        {
          char c;
          if ((c = paramString1.charAt(k)) == ':') {
            j++;
          }
          if (paramInt == j)
          {
            if (i == 0)
            {
              i = 1;
              if (paramInt != 0) {
                localStringBuffer.append(":");
              }
              localStringBuffer.append(paramString2);
            }
          }
          else {
            localStringBuffer.append(c);
          }
          k++;
        }
      }
      catch (Exception localException) {}
    }
    return localStringBuffer.toString();
  }
  
  public static String a(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString != null) {
      try
      {
        int i = 0;
        int j = 0;
        int k = paramString.length();
        while (j < k)
        {
          char c;
          if ((c = paramString.charAt(j)) == ':')
          {
            i++;
          }
          else
          {
            if (paramInt == i - 1) {
              break;
            }
            if (paramInt == i) {
              localStringBuffer.append(c);
            }
          }
          j++;
        }
      }
      catch (Exception localException) {}
    }
    return localStringBuffer.toString();
  }
  
  public final bb a(String paramString)
  {
    int i = -1;
    bb localbb;
    do
    {
      i++;
      if (i >= this.jdField_a_of_type_Short) {
        break;
      }
    } while ((localbb = ((bb)a(i)).b(paramString)) == null);
    return localbb;
    return null;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((paramString1 = a(paramString1)) != null) {
      paramString1.c(paramString2);
    }
  }
  
  public final void e(String paramString)
  {
    if ((paramString = (bb)a(paramString)) != null)
    {
      b(paramString);
      if (this.jdField_a_of_type_Short == 0) {
        i();
      }
    }
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString)
  {
    paramString = bg.jdField_a_of_type_Byte * paramString.length() + 8;
    w.a(paramGraphics, 18, -1, paramInt1, paramInt2, paramString, bg.jdField_b_of_type_Byte + 2);
  }
  
  static
  {
    jdField_a_of_type_ArrayOfJavaLangString = new String[2];
    d = 176;
    e = 220;
    jdField_a_of_type_Long = 0L;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */