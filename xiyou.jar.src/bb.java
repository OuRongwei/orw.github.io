import javax.microedition.lcdui.Graphics;

public class bb
  extends ax
{
  public static byte c;
  private static byte jdField_d_of_type_Byte;
  private bb b;
  public String a;
  public String b;
  public bc a;
  private byte jdField_e_of_type_Byte;
  public static boolean a;
  private au jdField_a_of_type_Au = null;
  public String c;
  private String jdField_e_of_type_JavaLangString = null;
  public ba b;
  public bg a;
  private int jdField_d_of_type_Int = 0;
  public boolean c;
  private am jdField_a_of_type_Am = null;
  private StringBuffer jdField_a_of_type_JavaLangStringBuffer = null;
  private String j = null;
  private int jdField_e_of_type_Int = 0;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  public boolean d;
  private String k = null;
  private String l = null;
  public long a;
  public bb a;
  public bj a;
  private String m = null;
  private String n = null;
  private String o = null;
  public String d;
  
  public bb(bc parambc)
  {
    this.jdField_b_of_type_Bb = null;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_b_of_type_JavaLangString = null;
    this.jdField_a_of_type_Bc = null;
    this.jdField_c_of_type_JavaLangString = null;
    this.jdField_b_of_type_Ba = null;
    this.jdField_a_of_type_Bg = null;
    this.jdField_c_of_type_Boolean = false;
    this.jdField_d_of_type_Boolean = false;
    this.jdField_a_of_type_Long = 0L;
    this.jdField_a_of_type_Bb = this;
    this.jdField_a_of_type_Bj = null;
    this.jdField_d_of_type_JavaLangString = null;
    this.jdField_b_of_type_JavaLangString = "";
    this.jdField_a_of_type_Bg = new bg();
    this.jdField_b_of_type_Byte = 2;
    this.jdField_e_of_type_Int = -1;
    this.f = -1;
    this.h = -1;
    this.jdField_a_of_type_Long = 0L;
    this.jdField_a_of_type_Bc = parambc;
  }
  
  public bb()
  {
    this.jdField_b_of_type_Bb = null;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_b_of_type_JavaLangString = null;
    this.jdField_a_of_type_Bc = null;
    this.jdField_c_of_type_JavaLangString = null;
    this.jdField_b_of_type_Ba = null;
    this.jdField_a_of_type_Bg = null;
    this.jdField_c_of_type_Boolean = false;
    this.jdField_d_of_type_Boolean = false;
    this.jdField_a_of_type_Long = 0L;
    this.jdField_a_of_type_Bb = this;
    this.jdField_a_of_type_Bj = null;
    this.jdField_d_of_type_JavaLangString = null;
    this.jdField_b_of_type_JavaLangString = "";
    this.jdField_a_of_type_Bg = new bg();
    this.jdField_b_of_type_Byte = 2;
    this.jdField_e_of_type_Int = -1;
    this.f = -1;
    this.h = -1;
    this.jdField_a_of_type_Long = 0L;
  }
  
  public final void a(bb parambb)
  {
    if (parambb == null) {
      return;
    }
    this.jdField_a_of_type_Bb = parambb;
    this.jdField_a_of_type_Bb.jdField_d_of_type_Boolean = true;
    this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = b().jdField_a_of_type_Bj;
    this.jdField_d_of_type_Int = this.e;
  }
  
  public final void a(Graphics paramGraphics)
  {
    if ((this.jdField_a_of_type_Bb.jdField_d_of_type_Boolean) && (this.jdField_a_of_type_Bb.k != null))
    {
      this.jdField_a_of_type_Bb.jdField_d_of_type_Boolean = false;
      this.jdField_a_of_type_Bb.a().a(this.jdField_a_of_type_Bb.k);
    }
    this.jdField_a_of_type_Bg.jdField_a_of_type_Short = this.d;
    this.jdField_a_of_type_Bg.jdField_b_of_type_Short = ((short)this.jdField_d_of_type_Int);
    this.jdField_a_of_type_Bg.e = this.jdField_i_of_type_Short;
    this.jdField_a_of_type_Bg.d = this.e;
    a(paramGraphics, this.jdField_a_of_type_Bg);
    if ((this.jdField_a_of_type_Bb.j != null) && (this.jdField_a_of_type_Bb.jdField_c_of_type_Boolean)) {
      this.jdField_a_of_type_Bb.a().a(this.jdField_a_of_type_Bb.j);
    }
  }
  
  public bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    paramGraphics.setClip(this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short + 10, this.jdField_g_of_type_Short + 10);
    int i4;
    int i2;
    int i1;
    if (this.jdField_b_of_type_Byte != -1)
    {
      int i3;
      Graphics localGraphics;
      if (this.jdField_b_of_type_Byte == -2)
      {
        i4 = this.jdField_g_of_type_Short;
        i3 = this.jdField_f_of_type_Short;
        i2 = this.c;
        i1 = this.jdField_b_of_type_Short;
        (localGraphics = paramGraphics).setColor(0);
        localGraphics.fillRect(i1, i2, i3, i4);
        localGraphics.setColor(-1);
      }
      else
      {
        i4 = this.jdField_g_of_type_Short;
        i3 = this.jdField_f_of_type_Short;
        i2 = this.c;
        i1 = this.jdField_b_of_type_Short;
        (localGraphics = paramGraphics).setColor(105, 113, 113);
        localGraphics.fillRect(i1, i2, i3, i4);
        localGraphics.setColor(-1);
      }
    }
    w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short, this.jdField_g_of_type_Short);
    paramGraphics.clipRect(this.d, this.e, this.jdField_h_of_type_Short, this.jdField_i_of_type_Short + 1);
    parambg.c = 0;
    for (int i = 0; i < this.jdField_a_of_type_Bb.jdField_a_of_type_Short; i++) {
      parambg = this.jdField_a_of_type_Bb.a(i).a(paramGraphics, parambg);
    }
    paramGraphics.setClip(this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short, this.jdField_g_of_type_Short);
    this.g = (parambg.jdField_b_of_type_Short + parambg.c - this.jdField_d_of_type_Int);
    if ((this.g == 0) && (this.jdField_i_of_type_Short <= 0))
    {
      new StringBuffer().append("ui error!name:").append(this.jdField_g_of_type_JavaLangString).toString();
      bc.i();
      return parambg;
    }
    paramGraphics.setColor(2);
    if (this.g > this.jdField_i_of_type_Short)
    {
      i = this.e + 4;
      i1 = this.jdField_i_of_type_Short - 8;
      this.jdField_e_of_type_Int = ((i - this.jdField_d_of_type_Int) * i1 / this.g);
      this.f = (i1 * i1 / this.g + 2);
      paramGraphics.setColor(3746866);
      paramGraphics.fillRect(this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 7, i + this.jdField_e_of_type_Int, 6, this.f);
      paramGraphics.setColor(12688514);
      paramGraphics.fillRect(this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 6, i + this.jdField_e_of_type_Int + 1, 4, this.f - 2);
      paramGraphics.setColor(10387303);
      paramGraphics.fillRect(this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 5, i + this.jdField_e_of_type_Int + 2, 2, this.f - 4);
    }
    Object localObject;
    if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && ((localObject = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_i_of_type_JavaLangString) != null) && (!"".equals(localObject)) && (((String)localObject).charAt(0) != '`') && (((String)localObject).length() > 0))
    {
      i1 = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_b_of_type_Short + bg.jdField_a_of_type_Byte;
      if ((i2 = bc.jdField_d_of_type_Int - i1) > bc.jdField_d_of_type_Int >> 1) {
        i2 = bc.jdField_d_of_type_Int >> 1;
      }
      String[] arrayOfString;
      i4 = (arrayOfString = ba.a((String)localObject, i2 - 4, bg.jdField_a_of_type_JavaxMicroeditionLcduiFont)).length * bg.jdField_b_of_type_Byte + 2;
      i4 = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c - i4;
      if (i1 + i2 > bc.jdField_d_of_type_Int) {
        i1 = bc.jdField_d_of_type_Int - i2 - 2;
      }
      if (arrayOfString.length == 1) {
        i2 = arrayOfString[0].length() * bg.jdField_a_of_type_Byte + 4;
      }
      if (i4 < this.e) {
        i4 = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c + bg.jdField_b_of_type_Byte;
      }
      ae.a(paramGraphics, i1, i4, (String)localObject, i2);
    }
    paramGraphics.setColor(16777215);
    paramGraphics.setClip(0, 0, bc.jdField_d_of_type_Int, bc.jdField_e_of_type_Int);
    paramGraphics.setColor(ba.jdField_a_of_type_Array2dOfInt[0][2]);
    if (this.jdField_a_of_type_Bj != null) {
      this.jdField_a_of_type_Bj.a(paramGraphics, parambg);
    } else if (this.jdField_c_of_type_JavaLangString != null)
    {
      if (this.jdField_c_of_type_JavaLangString.equals("BITMAP"))
      {
        localObject = paramGraphics;
        i1 = d.jdField_a_of_type_Int - 60 >> 1;
        f.a((Graphics)localObject, e.a(14), i1, 10, 144, 30, 60, 15, 0);
      }
      else if ((this.jdField_c_of_type_JavaLangString.equals("选择人物")) || (this.jdField_c_of_type_JavaLangString.equals("登陆界面")) || (this.jdField_c_of_type_JavaLangString.equals("修改密码")) || (this.jdField_c_of_type_JavaLangString.equals("服务器列表")))
      {
        w.a(paramGraphics, this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short);
        ae.a(paramGraphics, this.jdField_b_of_type_Short + this.jdField_f_of_type_Short >> 1, this.c + 2, this.jdField_c_of_type_JavaLangString, 10016752, 0, 17);
      }
      else
      {
        w.a(paramGraphics, this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short);
        ae.a(paramGraphics, this.jdField_b_of_type_Short + this.jdField_f_of_type_Short >> 1, this.c + 2, this.jdField_c_of_type_JavaLangString, 10016752, 0, 17);
      }
    }
    else if (this.jdField_e_of_type_JavaLangString != null) {
      if ("any".equals(this.jdField_b_of_type_JavaLangString)) {
        w.a(paramGraphics, this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short, this.jdField_e_of_type_JavaLangString, false);
      } else {
        w.a(paramGraphics, this.jdField_b_of_type_Short, this.c, this.jdField_f_of_type_Short, this.jdField_e_of_type_JavaLangString, true);
      }
    }
    if (e())
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, this.c + this.jdField_g_of_type_Short - jdField_d_of_type_Byte, this.jdField_b_of_type_Short + this.jdField_f_of_type_Short, this.c + this.jdField_g_of_type_Short);
      f.a(paramGraphics, e.a(14), this.jdField_b_of_type_Short, this.c + this.jdField_g_of_type_Short - 14, 177, 0, 26, 13, 0);
      f.a(paramGraphics, e.a(2), this.jdField_b_of_type_Short + 27, this.c + this.jdField_g_of_type_Short - 13, 299, 0, 11, 12, 0);
      f.a(paramGraphics, e.a(14), this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 27, this.c + this.jdField_g_of_type_Short - 14, 177, 13, 26, 13, 0);
      f.a(paramGraphics, e.a(2), this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 39, this.c + this.jdField_g_of_type_Short - 13, 310, 0, 11, 12, 0);
      paramGraphics.drawImage(e.a(44), this.jdField_b_of_type_Short + (this.jdField_b_of_type_Short + this.jdField_f_of_type_Short >> 1), this.c + this.jdField_g_of_type_Short - 2, 33);
    }
    return parambg;
  }
  
  public final bb a(String paramString)
  {
    for (int i = 0; i < this.jdField_a_of_type_Au.jdField_a_of_type_Int; i++)
    {
      bb localbb;
      if (((localbb = (bb)this.jdField_a_of_type_Au.a(i)).jdField_g_of_type_JavaLangString != null) && (localbb.jdField_g_of_type_JavaLangString.equals(paramString))) {
        return localbb;
      }
    }
    return null;
  }
  
  public final void b(int paramInt)
  {
    if ((this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString.equals("sm"))) {
      return;
    }
    if ((b().jdField_a_of_type_Bj != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba == b().jdField_a_of_type_Bj))
    {
      b().jdField_a_of_type_Bj.b(paramInt);
      return;
    }
    au localau1;
    if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba == null) && ((localau1 = ax.a(this.jdField_a_of_type_Bb, null)).jdField_a_of_type_Int > 0))
    {
      this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localau1.a());
      this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
    }
    if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba == null) && (b().jdField_a_of_type_Bj != null) && (b().jdField_a_of_type_Bj.a(this.jdField_g_of_type_JavaLangString)))
    {
      this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = b().jdField_a_of_type_Bj;
      return;
    }
    if (paramInt >= 0)
    {
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString.equals("any")))
      {
        f();
        bc.f();
        return;
      }
      if (paramInt == 18)
      {
        if ((b().jdField_a_of_type_Bj != null) && (b().jdField_a_of_type_Bj.a(this.jdField_g_of_type_JavaLangString)))
        {
          this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = b().jdField_a_of_type_Bj;
          return;
        }
        h();
        return;
      }
      if (paramInt == 17)
      {
        e();
        return;
      }
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba instanceof be)))
      {
        this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.b(-1);
        return;
      }
      au localau2 = ax.a(this.jdField_a_of_type_Bb, null);
      int i1 = this.jdField_a_of_type_Bg.jdField_b_of_type_Short + this.jdField_a_of_type_Bg.c - this.jdField_d_of_type_Int;
      byte b1 = -1;
      int i = 1;
      if (paramInt == 0)
      {
        b1 = 0;
      }
      else if (paramInt == 1)
      {
        b1 = 1;
      }
      else if (paramInt == 2)
      {
        b1 = 2;
      }
      else if (paramInt == 3)
      {
        b1 = 3;
      }
      else if ((paramInt == 16) && (this.jdField_e_of_type_Byte == 0))
      {
        b1 = 0;
        i = 6;
      }
      else if ((paramInt == 15) && (this.jdField_e_of_type_Byte == 0))
      {
        b1 = 1;
        i = 6;
      }
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba instanceof av)) && (i == 1) && (((((av)this.jdField_a_of_type_Bb.jdField_b_of_type_Ba).jdField_d_of_type_JavaLangString != null) && (b1 == 2)) || ((((av)this.jdField_a_of_type_Bb.jdField_b_of_type_Ba).jdField_e_of_type_JavaLangString != null) && (b1 == 3))))
      {
        this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.b(paramInt);
        return;
      }
      int i2;
      Object localObject;
      int i4;
      if ((b1 == 1) || (b1 == 3))
      {
        while (i > 0)
        {
          i--;
          paramInt = null;
          if ((i2 = localau2.a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba) + 1) < localau2.jdField_a_of_type_Int)
          {
            localObject = null;
            if (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) {
              localObject = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba, b1);
            }
            if ((localObject == null) && (b1 == 1)) {
              for (i4 = i2; i4 < localau2.jdField_a_of_type_Int; i4++) {
                if ((paramInt = (ba)localau2.a(i4)).c != this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c)
                {
                  localObject = paramInt;
                  break;
                }
              }
            }
            if (localObject == null) {
              localObject = (ba)localau2.a(i2);
            }
            if ((i2 == 0) || (i2 == localau2.jdField_a_of_type_Int - 1)) {
              i = 0;
            }
            if (((ba)localObject).c + this.jdField_a_of_type_Bg.c + 6 <= this.e + this.jdField_i_of_type_Short)
            {
              this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localObject);
              this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
            }
            else
            {
              this.jdField_d_of_type_Int -= bg.jdField_b_of_type_Byte;
              if (this.jdField_a_of_type_Bg.jdField_b_of_type_Short - bg.jdField_b_of_type_Byte + this.jdField_a_of_type_Bg.c <= this.e + this.jdField_i_of_type_Short) {
                this.jdField_d_of_type_Int = (this.e - (i1 - this.jdField_i_of_type_Short));
              }
            }
          }
          else if (((this.jdField_d_of_type_Int == this.e - (i1 - this.jdField_i_of_type_Short)) || (i1 < this.jdField_i_of_type_Short)) && (localau2.jdField_a_of_type_Int > 0))
          {
            this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localau2.a());
            this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
            this.jdField_d_of_type_Int = this.e;
          }
          else
          {
            this.jdField_d_of_type_Int -= bg.jdField_b_of_type_Byte;
            if (this.jdField_a_of_type_Bg.jdField_b_of_type_Short - bg.jdField_b_of_type_Byte + this.jdField_a_of_type_Bg.c <= this.e + this.jdField_i_of_type_Short) {
              this.jdField_d_of_type_Int = (this.e - (i1 - this.jdField_i_of_type_Short));
            }
          }
          if (i1 < this.jdField_i_of_type_Short) {
            this.jdField_d_of_type_Int = this.e;
          }
          if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString != null)) {
            a().a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString);
          }
        }
        return;
      }
      if ((b1 == 0) || ((!(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba instanceof bd)) && (b1 == 2)))
      {
        while (i > 0)
        {
          i--;
          if (b1 == 0)
          {
            paramInt = null;
            if ((localau2.a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba) == 0) && (this.jdField_a_of_type_Bb.b().jdField_a_of_type_Bj != null) && (b().jdField_a_of_type_Bj.a(this.jdField_g_of_type_JavaLangString)))
            {
              this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = this.jdField_a_of_type_Bb.b().jdField_a_of_type_Bj;
              return;
            }
          }
          paramInt = null;
          if ((i2 = localau2.a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba) - 1) >= 0)
          {
            localObject = null;
            if (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) {
              localObject = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba, b1);
            }
            if ((localObject == null) && (b1 == 0)) {
              for (i4 = i2; i4 > 0; i4--) {
                if ((paramInt = (ba)localau2.a(i4)).c != this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c)
                {
                  localObject = paramInt;
                  break;
                }
              }
            }
            if (localObject == null) {
              localObject = (ba)localau2.a(i2);
            }
            if ((i2 == 0) || (i2 == localau2.jdField_a_of_type_Int - 1)) {
              i = 0;
            }
            if (((ba)localObject).c >= this.e)
            {
              this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localObject);
              this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
            }
            else
            {
              this.jdField_d_of_type_Int += bg.jdField_b_of_type_Byte;
              if (this.jdField_d_of_type_Int > this.e) {
                this.jdField_d_of_type_Int = this.e;
              }
            }
          }
          else if ((this.jdField_d_of_type_Int == this.e) && (localau2.jdField_a_of_type_Int > 0))
          {
            this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localau2.a(localau2.jdField_a_of_type_Int - 1));
            this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
            this.jdField_d_of_type_Int = (this.e - (i1 - this.jdField_i_of_type_Short));
          }
          else
          {
            this.jdField_d_of_type_Int += bg.jdField_b_of_type_Byte;
            if (this.jdField_d_of_type_Int > this.e) {
              this.jdField_d_of_type_Int = this.e;
            }
          }
          if (i1 < this.jdField_i_of_type_Short) {
            this.jdField_d_of_type_Int = this.e;
          }
          if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString != null)) {
            a().a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString);
          }
        }
        return;
      }
      if (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba == null) {
        return;
      }
      if ((i2 = bc.c()) != -1) {
        for (int i3 = 0; i3 < localau2.jdField_a_of_type_Int; i3++)
        {
          ba localba;
          if (((localba = (ba)localau2.a(i3)).a() != 0) && (((i4 = localba.a() - '0') == i2) || ((i4 == 0) && (i2 == 10)) || ((i4 == -13) && (i2 == 15)) || ((i4 == -6) && (i2 == 16))))
          {
            this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = localba;
            localba.a();
            if (localba.c < this.e) {
              this.jdField_d_of_type_Int += this.e - localba.c;
            }
            if (localba.c > this.e + this.jdField_i_of_type_Short) {
              this.jdField_d_of_type_Int -= localba.c - (this.e + this.jdField_i_of_type_Short) + bg.jdField_b_of_type_Byte;
            }
            bc.f();
          }
        }
      }
      if ((this.jdField_a_of_type_Bc.b() != null) && (this.jdField_a_of_type_Bc.b().jdField_a_of_type_Bb == this.jdField_a_of_type_Bb) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c >= this.e) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c <= this.e + this.jdField_i_of_type_Short))
      {
        this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.b(paramInt);
        bc.f();
      }
    }
  }
  
  public final void e()
  {
    if (this.jdField_a_of_type_Bb.o != null) {
      this.jdField_a_of_type_Bb.a().a(this.jdField_a_of_type_Bb.o);
    } else if (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) {
      this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.a(-1, -1);
    }
    bc.f();
  }
  
  private void h()
  {
    if (this.jdField_a_of_type_Bb.jdField_d_of_type_JavaLangString != null) {
      this.jdField_a_of_type_Bb.a().a(this.jdField_a_of_type_Bb.jdField_d_of_type_JavaLangString);
    } else {
      f();
    }
    bc.f();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (jdField_a_of_type_Boolean)
    {
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString.equals("sm"))) {
        return;
      }
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_JavaLangString.equals("any")))
      {
        f();
        bc.g();
        return;
      }
      au localau = ax.a(this.jdField_a_of_type_Bb, null);
      if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba == null) && (localau.jdField_a_of_type_Int > 0))
      {
        this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = ((ba)localau.a());
        if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba instanceof av)) {
          this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
        }
      }
      if (this.jdField_a_of_type_Bb.e())
      {
        if (a(paramInt1, paramInt2) == 0)
        {
          this.jdField_a_of_type_Bb.e();
          return;
        }
        if (a(paramInt1, paramInt2) == 1)
        {
          this.jdField_a_of_type_Bb.h();
          return;
        }
      }
      if (this.jdField_a_of_type_Bj != null) {
        this.jdField_a_of_type_Bj.a(paramInt1, paramInt2);
      }
      ba localba = null;
      for (int i1 = 0; i1 < localau.jdField_a_of_type_Int; i1++)
      {
        localba = localObject = (ba)localau.a(i1);
        if ((((ba)localObject).a(paramInt1, paramInt2)) && (((localObject instanceof bd)) || ((localObject instanceof av)) || ((localObject instanceof ay)) || ((localObject instanceof be))))
        {
          this.jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
          break;
        }
      }
      if (i1 < localau.jdField_a_of_type_Int) {
        if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && (localba == this.jdField_a_of_type_Bb.jdField_b_of_type_Ba))
        {
          this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.a(paramInt1, paramInt2);
        }
        else
        {
          this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = localba;
          if ((this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString != null)) {
            a().a(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_JavaLangString);
          }
        }
      }
      Object localObject = ax.b(this.jdField_a_of_type_Bb, null);
      for (int i = 0; i < ((au)localObject).jdField_a_of_type_Int; i++) {
        if (((localba = (ba)((au)localObject).a(i)) instanceof av))
        {
          av localav;
          if ((localav = (av)localba).jdField_a_of_type_Array2dOfShort != null) {
            for (int i2 = 0; i2 < localav.jdField_a_of_type_Array2dOfShort.length; i2++) {}
          }
          if (((paramInt1 > localav.jdField_a_of_type_Array2dOfShort[i2][0]) && (paramInt2 > localav.jdField_a_of_type_Array2dOfShort[i2][1]) && (paramInt1 < localav.jdField_a_of_type_Array2dOfShort[i2][2]) && (paramInt2 < localav.jdField_a_of_type_Array2dOfShort[i2][3]) && (localav.jdField_a_of_type_Array2dOfShort[i2][2] <= localav.jdField_f_of_type_Short) ? 1 : 0) != 0)
          {
            if ((((av)localba).jdField_c_of_type_JavaLangString != null) && (((av)localba).jdField_b_of_type_JavaLangString == null)) {
              a().a(((av)localba).jdField_c_of_type_JavaLangString);
            }
            this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = localba;
            break;
          }
        }
      }
      if (this.jdField_e_of_type_Int != -1)
      {
        this.h = paramInt2;
        if (a(paramInt1, paramInt2) == 0) {
          return;
        }
        if (a(paramInt1, paramInt2) == 1)
        {
          this.jdField_d_of_type_Int += this.e + 4 + this.jdField_e_of_type_Int - paramInt2;
          if (this.jdField_d_of_type_Int >= this.e) {
            this.jdField_d_of_type_Int = this.e;
          }
          return;
        }
        if (a(paramInt1, paramInt2) == 2)
        {
          this.jdField_d_of_type_Int -= paramInt2 - (this.e + 4 + this.jdField_e_of_type_Int + this.f);
          if (this.jdField_d_of_type_Int <= this.e - (this.g - this.jdField_i_of_type_Short)) {
            this.jdField_d_of_type_Int = (this.e - (this.g - this.jdField_i_of_type_Short));
          }
          return;
        }
      }
      if (d.jdField_a_of_type_Int > 330)
      {
        if ((paramInt1 < 60) && (paramInt1 > 0) && (paramInt2 < d.jdField_b_of_type_Int) && (paramInt2 > d.jdField_b_of_type_Int - 40))
        {
          this.jdField_a_of_type_Bb.e();
          return;
        }
        if ((paramInt1 < d.jdField_a_of_type_Int) && (paramInt1 > d.jdField_a_of_type_Int - 60) && (paramInt2 < d.jdField_b_of_type_Int) && (paramInt2 > d.jdField_b_of_type_Int - 40)) {
          this.jdField_a_of_type_Bb.h();
        }
      }
      else
      {
        if ((paramInt1 < 50) && (paramInt1 > 0) && (paramInt2 < d.jdField_b_of_type_Int) && (paramInt2 > d.jdField_b_of_type_Int - 20))
        {
          this.jdField_a_of_type_Bb.e();
          return;
        }
        if ((paramInt1 < d.jdField_a_of_type_Int) && (paramInt1 > d.jdField_a_of_type_Int - 50) && (paramInt2 < d.jdField_b_of_type_Int) && (paramInt2 > d.jdField_b_of_type_Int - 20))
        {
          this.jdField_a_of_type_Bb.h();
          return;
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if ((this.jdField_e_of_type_Int != -1) && (this.h != -1) && (d.e() == 3))
    {
      this.jdField_d_of_type_Int -= this.h - paramInt;
      if (this.jdField_d_of_type_Int >= this.e)
      {
        this.jdField_d_of_type_Int = this.e;
        return;
      }
      if (this.jdField_d_of_type_Int <= this.e - (this.g - this.jdField_i_of_type_Short)) {
        this.jdField_d_of_type_Int = (this.e - (this.g - this.jdField_i_of_type_Short));
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 3 - 20) && (paramInt2 > this.e + 4 + this.jdField_e_of_type_Int) && (paramInt1 < this.jdField_b_of_type_Short + this.jdField_f_of_type_Short) && (paramInt2 < this.e + 4 + this.jdField_e_of_type_Int + this.f)) {
      return 0;
    }
    if ((paramInt1 > this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 3 - 20) && (paramInt1 < this.jdField_b_of_type_Short + this.jdField_f_of_type_Short) && (paramInt2 > this.e + 4) && (paramInt2 < this.e + 4 + this.jdField_e_of_type_Int)) {
      return 1;
    }
    if ((paramInt1 <= this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 3 - 20) || (paramInt1 >= this.jdField_b_of_type_Short + this.jdField_f_of_type_Short) || (paramInt2 <= this.e + 4 + this.jdField_e_of_type_Int + this.f) || (paramInt2 >= this.e + this.jdField_i_of_type_Short)) {
      return -1;
    }
    return 2;
  }
  
  private byte a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > this.jdField_b_of_type_Short + 1) && (paramInt1 < this.jdField_b_of_type_Short + 6 + (bg.jdField_a_of_type_Byte << 1)) && (paramInt2 > this.c + this.jdField_g_of_type_Short - jdField_d_of_type_Byte) && (paramInt2 < this.c + this.jdField_g_of_type_Short)) {
      return 0;
    }
    return (byte)((paramInt1 <= this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 1 - (bg.jdField_a_of_type_Byte << 1)) || (paramInt2 <= this.c + this.jdField_g_of_type_Short - jdField_d_of_type_Byte) || (paramInt1 >= this.jdField_b_of_type_Short + this.jdField_f_of_type_Short - 6) || (paramInt2 >= this.c + this.jdField_g_of_type_Short) ? -1 : 1);
  }
  
  public void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    int i = 32768;
    int i1 = 32768;
    int i2 = paraml.c;
    Object localObject;
    for (int i3 = 0; i3 < i2; i3++)
    {
      String str1 = paraml.a(i3);
      localObject = paraml.b(i3);
      if (str1.equals("nm"))
      {
        this.jdField_g_of_type_JavaLangString = ((String)localObject);
      }
      else if (str1.equals("tl"))
      {
        this.jdField_c_of_type_JavaLangString = ((String)localObject);
      }
      else if (str1.equals("mtl"))
      {
        this.jdField_e_of_type_JavaLangString = ((String)localObject);
      }
      else
      {
        int i4;
        if (str1.equals("pic"))
        {
          i4 = Integer.parseInt((String)localObject);
          c(i4);
        }
        else if (i4.equals("w"))
        {
          if (((String)localObject).indexOf('%') >= 0)
          {
            localObject = ((String)localObject).trim();
            this.jdField_f_of_type_Short = ((short)(Short.parseShort(((String)localObject).substring(0, ((String)localObject).length() - 1)) * bc.jdField_d_of_type_Int / 100));
          }
          else
          {
            this.jdField_f_of_type_Short = Short.parseShort((String)localObject);
          }
        }
        else if (i4.equals("h"))
        {
          if (((String)localObject).indexOf('%') >= 0)
          {
            localObject = ((String)localObject).trim();
            this.jdField_g_of_type_Short = ((short)(Short.parseShort(((String)localObject).substring(0, ((String)localObject).length() - 1)) * bc.jdField_e_of_type_Int / 100));
          }
          else
          {
            this.jdField_g_of_type_Short = Short.parseShort((String)localObject);
            if ((i4 = bg.jdField_b_of_type_Byte - 18) > 0)
            {
              this.jdField_g_of_type_Short = ((short)(this.jdField_g_of_type_Short + this.jdField_g_of_type_Short / 10 * i4));
              if (this.jdField_g_of_type_Short >= (short)bc.jdField_e_of_type_Int) {
                this.jdField_g_of_type_Short = ((short)bc.jdField_e_of_type_Int);
              }
            }
          }
        }
        else if (i4.equals("x"))
        {
          if (((String)localObject).indexOf('%') >= 0) {
            i = (short)(Short.parseShort((localObject = ((String)localObject).trim()).substring(0, ((String)localObject).length() - 1)) * bc.jdField_d_of_type_Int / 100);
          } else {
            i = Short.parseShort((String)localObject);
          }
        }
        else if (i4.equals("y"))
        {
          if (((String)localObject).indexOf('%') >= 0) {
            i1 = (short)(Short.parseShort((localObject = ((String)localObject).trim()).substring(0, ((String)localObject).length() - 1)) * bc.jdField_e_of_type_Int / 100);
          } else {
            i1 = Short.parseShort((String)localObject);
          }
        }
        else if (i4.equals("pl"))
        {
          this.jdField_a_of_type_JavaLangString = ((String)localObject);
        }
        else if (i4.equals("run"))
        {
          this.j = ((String)localObject);
          this.jdField_c_of_type_Boolean = true;
        }
        else if (i4.equals("ob"))
        {
          this.jdField_a_of_type_JavaLangStringBuffer.append((String)localObject);
        }
        else if (!i4.equals("lc"))
        {
          if (i4.equals("type"))
          {
            this.jdField_b_of_type_JavaLangString = ((String)localObject);
          }
          else if (i4.equals("open"))
          {
            this.k = ((String)localObject);
            this.jdField_d_of_type_Boolean = true;
          }
          else if (i4.equals("close"))
          {
            this.l = ((String)localObject);
          }
          else if (i4.equals("bt"))
          {
            this.jdField_b_of_type_Byte = Byte.parseByte((String)localObject);
          }
          else if (i4.equals("c"))
          {
            this.jdField_b_of_type_Int = Integer.parseInt((String)localObject, 16);
          }
          else if (i4.equals("text"))
          {
            this.jdField_h_of_type_JavaLangString = ((String)localObject);
          }
          else if (i4.equals("hk"))
          {
            this.jdField_e_of_type_Byte = ((byte)((String)localObject).charAt(0));
          }
        }
      }
    }
    this.o = paraml.a("ol");
    this.jdField_d_of_type_JavaLangString = paraml.a("or");
    this.m = paraml.a("bl");
    this.n = paraml.a("br");
    paraml.a("mr");
    paraml.a("ml");
    if ((this.jdField_b_of_type_JavaLangString != null) && (this.jdField_b_of_type_JavaLangString.equals("sm")))
    {
      i = (short)(bc.jdField_d_of_type_Int * 100 / 10);
      i1 = (short)(bc.jdField_e_of_type_Int - (bg.jdField_b_of_type_Byte + 4) >> 1);
      this.jdField_f_of_type_Short = ((short)(bc.jdField_d_of_type_Int * 100 / 80));
      this.jdField_g_of_type_Short = ((short)(bg.jdField_b_of_type_Byte + 4));
      jdField_a_of_type_Boolean = false;
    }
    if (this.jdField_f_of_type_Short == Short.MIN_VALUE) {
      this.jdField_f_of_type_Short = ((short)bc.jdField_d_of_type_Int);
    }
    if (this.jdField_g_of_type_Short == Short.MIN_VALUE) {
      this.jdField_g_of_type_Short = ((short)bc.jdField_e_of_type_Int);
    }
    if ((d.jdField_a_of_type_Int > 330) && (this.jdField_f_of_type_Short != (short)bc.jdField_d_of_type_Int))
    {
      this.jdField_f_of_type_Short = ((short)(this.jdField_f_of_type_Short + (this.jdField_f_of_type_Short << 3) / 10));
      if (this.jdField_f_of_type_Short > (short)bc.jdField_d_of_type_Int) {
        this.jdField_f_of_type_Short = ((short)bc.jdField_d_of_type_Int);
      }
    }
    if (i == 32768) {
      i = (short)(bc.jdField_d_of_type_Int - this.jdField_f_of_type_Short >> 1);
    }
    if (i1 == 32768) {
      i1 = (short)(bc.jdField_e_of_type_Int - this.jdField_g_of_type_Short >> 1);
    }
    if ((this.jdField_a_of_type_JavaLangString != null) && (this.jdField_a_of_type_JavaLangString.equals("ld")))
    {
      i = 2;
      i1 = (short)(bc.jdField_e_of_type_Int - this.jdField_g_of_type_Short - 2);
    }
    if (!e())
    {
      if (this.jdField_f_of_type_Short > bc.jdField_d_of_type_Int)
      {
        this.jdField_f_of_type_Short = ((short)(bc.jdField_d_of_type_Int - 4));
        i = 2;
      }
      if (this.jdField_g_of_type_Short > bc.jdField_e_of_type_Int)
      {
        this.jdField_g_of_type_Short = ((short)(bc.jdField_e_of_type_Int - 4));
        i1 = 2;
      }
    }
    do
    {
      paraml.a();
      String str2 = paraml.jdField_a_of_type_JavaLangString;
      c(paraml);
      if (paraml.jdField_b_of_type_Int == 2)
      {
        if (str2.equals("form"))
        {
          localObject = new bb(this.jdField_a_of_type_Bc);
          b((bb)localObject);
          ((bb)localObject).a(paraml);
        }
        else if (str2.equals("s"))
        {
          paraml.a();
          localObject = paraml.b();
          this.jdField_a_of_type_Am = new am();
          this.jdField_a_of_type_Am.a((String)localObject);
          this.jdField_a_of_type_Am.a(new bf(this));
          ba.a(paraml, str2);
        }
        else if (str2.equals("tag"))
        {
          this.jdField_a_of_type_Bj = new bj(this);
          this.jdField_a_of_type_Bj.a(paraml);
        }
        else
        {
          b(paraml);
        }
        paraml.a(3, str2);
      }
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("form")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
    b(i, i1);
  }
  
  public final void b(bb parambb)
  {
    this.jdField_a_of_type_Au.a(parambb);
    parambb.jdField_b_of_type_Bb = this;
  }
  
  public final void f()
  {
    bb localbb = this;
    this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = null;
    localbb.jdField_c_of_type_Boolean = false;
    if (localbb.jdField_a_of_type_Bb.l != null) {
      localbb.jdField_a_of_type_Bb.a().a(localbb.l);
    }
    this.jdField_a_of_type_Bc.j();
  }
  
  public final boolean d()
  {
    return (this.jdField_f_of_type_Short == bc.jdField_d_of_type_Int) && (this.jdField_g_of_type_Short == bc.jdField_e_of_type_Int);
  }
  
  private boolean e()
  {
    if (this.jdField_b_of_type_JavaLangString.equals("nobut")) {
      return false;
    }
    if ((this.jdField_f_of_type_Short == bc.jdField_d_of_type_Int) && (this.jdField_g_of_type_Short == bc.jdField_e_of_type_Int)) {
      return true;
    }
    return (this.m != null) || (this.n != null);
  }
  
  public static void g()
  {
    jdField_a_of_type_Boolean = true;
  }
  
  public final bb b(String paramString)
  {
    for (bb localbb = this; localbb.jdField_b_of_type_Bb != null; localbb = localbb.jdField_b_of_type_Bb) {}
    return localbb.c(paramString);
  }
  
  private bb b()
  {
    if (this.jdField_a_of_type_Bj != null) {
      return this;
    }
    if (this.jdField_b_of_type_Bb != null) {
      return this.jdField_b_of_type_Bb;
    }
    return this;
  }
  
  public final bb c(String paramString)
  {
    if ((this.jdField_g_of_type_JavaLangString != null) && (this.jdField_g_of_type_JavaLangString.toLowerCase().equals(paramString.toLowerCase()))) {
      return this;
    }
    int i = 0;
    int i1 = this.jdField_a_of_type_Au.jdField_a_of_type_Int;
    while (i < i1)
    {
      bb localbb;
      if ((localbb = ((bb)this.jdField_a_of_type_Au.a(i)).c(paramString)) != null) {
        return localbb;
      }
      i++;
    }
    return null;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.jdField_b_of_type_Short = ((short)paramInt1);
    this.c = ((short)paramInt2);
    this.j = this.c;
    this.d = this.jdField_b_of_type_Short;
    this.jdField_h_of_type_Short = this.jdField_f_of_type_Short;
    this.e = this.c;
    this.jdField_i_of_type_Short = this.jdField_g_of_type_Short;
    if ((this.jdField_c_of_type_JavaLangString != null) && (!this.jdField_c_of_type_JavaLangString.equals("BITMAP")))
    {
      this.e = ((short)(this.e + (jdField_c_of_type_Byte + 1)));
      this.jdField_i_of_type_Short = ((short)(this.jdField_i_of_type_Short - (jdField_c_of_type_Byte + 1)));
    }
    else if (this.jdField_e_of_type_JavaLangString != null)
    {
      this.e = ((short)(this.e + (jdField_c_of_type_Byte + 1)));
      this.jdField_i_of_type_Short = ((short)(this.jdField_i_of_type_Short - (jdField_c_of_type_Byte + 1)));
    }
    if (e()) {
      this.jdField_i_of_type_Short = ((short)(this.jdField_i_of_type_Short - jdField_d_of_type_Byte));
    }
    this.d = ((short)this.d);
    this.jdField_h_of_type_Short = ((short)this.jdField_h_of_type_Short);
    this.e = ((short)(this.e + 1));
    this.jdField_i_of_type_Short = ((short)(this.jdField_i_of_type_Short - 1));
    this.jdField_d_of_type_Int = this.e;
    if (this.jdField_a_of_type_Bj != null) {
      this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = this.jdField_a_of_type_Bj;
    }
  }
  
  public final void c(bb parambb)
  {
    if (parambb != null)
    {
      parambb.jdField_d_of_type_Boolean = true;
      int i;
      int i1;
      if ((parambb.jdField_a_of_type_JavaLangString != null) && (parambb.jdField_a_of_type_JavaLangString.equals("fw")) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null))
      {
        i = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_b_of_type_Short;
        i1 = this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c;
        int i2 = i += 10 - parambb.jdField_f_of_type_Short;
        i1 += 10;
        int i3 = bc.jdField_e_of_type_Int - 16 - 7 - parambb.jdField_g_of_type_Short;
        i = (short)(i + parambb.jdField_f_of_type_Short <= bc.jdField_d_of_type_Int ? i : i2);
        i1 = (short)(i1 >= i3 ? i3 : i1);
        if (i < 0) {
          i = 0;
        }
        if (i1 < 0) {
          i1 = 0;
        }
        parambb.b(i, i1);
      }
      else if ((parambb.jdField_a_of_type_JavaLangString != null) && (parambb.jdField_a_of_type_JavaLangString.equals("ddl")) && (this.jdField_a_of_type_Bb.jdField_b_of_type_Ba != null))
      {
        i = (short)(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_b_of_type_Short + 1);
        i1 = (short)(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.c + this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_g_of_type_Short);
        parambb.jdField_f_of_type_Short = ((short)(this.jdField_a_of_type_Bb.jdField_b_of_type_Ba.jdField_f_of_type_Short - 2));
        parambb.b(i, i1);
      }
      this.jdField_a_of_type_Bc.a(parambb);
    }
  }
  
  public final void c(ba paramba)
  {
    this.jdField_a_of_type_Bb.jdField_b_of_type_Ba = paramba;
    if (paramba != null)
    {
      if ((paramba.c > 0) && (paramba.c < this.e)) {
        this.jdField_d_of_type_Int += this.e - paramba.c;
      }
      if (paramba.c > this.e + this.jdField_i_of_type_Short) {
        this.jdField_d_of_type_Int -= paramba.c - (this.e + this.jdField_i_of_type_Short) + bg.jdField_b_of_type_Byte;
      }
    }
  }
  
  public final am a()
  {
    if (this.jdField_a_of_type_Am == null)
    {
      this.jdField_a_of_type_Am = new am();
      this.jdField_a_of_type_Am.a(" ");
      this.jdField_a_of_type_Am.a(new bf(this));
    }
    return this.jdField_a_of_type_Am;
  }
  
  public final void a(String paramString)
  {
    if (this.jdField_a_of_type_Bc != null) {
      this.jdField_a_of_type_Bc.d(paramString);
    }
  }
  
  public final void c(String paramString)
  {
    if (paramString != null) {
      a().a(paramString);
    }
  }
  
  static
  {
    jdField_c_of_type_Byte = 27;
    jdField_d_of_type_Byte = 16;
    jdField_a_of_type_Boolean = true;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */