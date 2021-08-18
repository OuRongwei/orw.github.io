import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

public final class bd
  extends ba
  implements CommandListener
{
  private static String[] jdField_a_of_type_ArrayOfJavaLangString = { "", "1,.+_)(*&^%$#@", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0" };
  private boolean jdField_c_of_type_Boolean = false;
  private static String[] jdField_b_of_type_ArrayOfJavaLangString = { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
  public byte c;
  public boolean a;
  private int jdField_a_of_type_Int = 0;
  private StringBuffer jdField_a_of_type_JavaLangStringBuffer = null;
  private StringBuffer jdField_b_of_type_JavaLangStringBuffer = null;
  private int jdField_d_of_type_Int = 0;
  private int jdField_e_of_type_Int = 0;
  private int jdField_f_of_type_Int = 0;
  private int g = 0;
  private long jdField_b_of_type_Long = 0L;
  private long jdField_c_of_type_Long = 0L;
  private static char jdField_a_of_type_Char = '*';
  private static String jdField_c_of_type_JavaLangString = "01234567890";
  private byte jdField_d_of_type_Byte = 0;
  public long a;
  public TextBox a;
  private Alert jdField_a_of_type_JavaxMicroeditionLcduiAlert = null;
  private Command jdField_a_of_type_JavaxMicroeditionLcduiCommand = null;
  private Command jdField_b_of_type_JavaxMicroeditionLcduiCommand = null;
  private Displayable jdField_a_of_type_JavaxMicroeditionLcduiDisplayable = null;
  public String a;
  public String b;
  private int h = 0;
  private int i = 0;
  private String jdField_d_of_type_JavaLangString = null;
  private String jdField_e_of_type_JavaLangString = null;
  private boolean jdField_d_of_type_Boolean = false;
  private boolean jdField_e_of_type_Boolean = false;
  private boolean jdField_f_of_type_Boolean = false;
  private short jdField_a_of_type_Short;
  
  public bd(ba paramba)
  {
    this.jdField_c_of_type_Byte = 0;
    this.jdField_a_of_type_Boolean = false;
    this.jdField_a_of_type_Long = 0L;
    this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox = null;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_b_of_type_JavaLangString = null;
    this.jdField_c_of_type_Byte = 99;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_Long = -1L;
    this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox = new TextBox("", "", 60, 0);
    this.jdField_a_of_type_JavaLangString = "";
    this.jdField_b_of_type_JavaLangString = "";
    this.a = paramba;
    this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.addCommand(this.jdField_a_of_type_JavaxMicroeditionLcduiCommand);
    this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.addCommand(this.jdField_b_of_type_JavaxMicroeditionLcduiCommand);
    this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setCommandListener(this);
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    if (this.f == Short.MIN_VALUE) {
      this.f = 80;
    }
    if (this.f > this.a.h) {
      this.f = this.a.h;
    }
    this.jdField_b_of_type_Short = parambg.jdField_a_of_type_Short;
    this.c = parambg.jdField_b_of_type_Short;
    if (parambg.jdField_a_of_type_Short + this.f >= this.a.d + this.a.h)
    {
      bg tmp94_93 = parambg;
      tmp94_93.jdField_b_of_type_Short = ((short)(tmp94_93.jdField_b_of_type_Short + parambg.c));
      parambg.jdField_a_of_type_Short = this.a.d;
    }
    this.i = parambg.jdField_b_of_type_Short;
    this.h = parambg.jdField_a_of_type_Short;
    if (this.jdField_a_of_type_Short < bg.jdField_b_of_type_Byte + 1) {
      this.jdField_a_of_type_Short = ((short)(bg.jdField_b_of_type_Byte + 1));
    }
    int j = a().b == this ? 1 : 0;
    if (parambg.a())
    {
      if (j != 0) {
        paramGraphics.setColor(6650752);
      } else {
        paramGraphics.setColor(2500650);
      }
      paramGraphics.fillRect(parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, this.f, this.jdField_a_of_type_Short);
      if ((j != 0) && (this.jdField_c_of_type_Byte != 110))
      {
        paramGraphics.setColor(11776947);
        paramGraphics.fillRoundRect(parambg.jdField_a_of_type_Short + this.f - 20, parambg.jdField_b_of_type_Short + 1, 20, this.jdField_a_of_type_Short - 2, 3, 3);
        paramGraphics.setColor(16777215);
        paramGraphics.drawString(this.jdField_c_of_type_Boolean ? "数" : "英", parambg.jdField_a_of_type_Short + this.f - 10, parambg.jdField_b_of_type_Short, 17);
      }
      j = paramGraphics.getClipX();
      int k = paramGraphics.getClipY();
      int m = paramGraphics.getClipWidth();
      int n = paramGraphics.getClipHeight();
      paramGraphics.clipRect(parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short >= a().e ? parambg.jdField_b_of_type_Short : a().e, this.f, parambg.jdField_b_of_type_Short + bg.jdField_b_of_type_Byte + 1 <= a().e + a().jdField_i_of_type_Short ? this.jdField_a_of_type_Short : a().e + a().jdField_i_of_type_Short - parambg.jdField_b_of_type_Short);
      paramGraphics.setColor(this.jdField_a_of_type_Int);
      if (this.jdField_b_of_type_JavaLangString != null)
      {
        int i1 = parambg.jdField_a_of_type_Short + 2;
        int i2 = parambg.jdField_b_of_type_Short;
        if ((this.jdField_c_of_type_Byte == 112) && (this.jdField_d_of_type_Byte > 0))
        {
          this.jdField_d_of_type_Byte = ((byte)(this.jdField_d_of_type_Byte - 1));
          if ((this.jdField_d_of_type_Byte == 0) && (this.jdField_b_of_type_JavaLangStringBuffer.length() > 0))
          {
            this.jdField_b_of_type_JavaLangStringBuffer.setCharAt(this.jdField_b_of_type_JavaLangStringBuffer.length() - 1, jdField_a_of_type_Char);
            c(this.jdField_b_of_type_JavaLangStringBuffer.toString());
          }
        }
        int i5;
        int i6;
        if (((this.jdField_c_of_type_Byte == 115) || (this.jdField_c_of_type_Byte == 101) || (this.jdField_c_of_type_Byte == 112)) && (a().b == this))
        {
          String str = this.jdField_b_of_type_JavaLangString;
          i4 = 0;
          for (i5 = 0; i5 < str.length(); i5++) {
            if ((i6 = str.charAt(i5)) < 'ÿ') {
              i4 += bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.charWidth(i6);
            } else {
              i4 += bg.jdField_a_of_type_Byte;
            }
          }
          if (i4 > this.f - 24)
          {
            i1 += this.f - 30;
            paramGraphics.drawString(this.jdField_b_of_type_JavaLangString, i1, i2 + 2, 24);
            break label1021;
          }
        }
        int i3 = 0;
        if (a(this.jdField_b_of_type_JavaLangString) > this.f - ((this.jdField_c_of_type_Byte == 115) || (this.jdField_c_of_type_Byte == 101) || (this.jdField_c_of_type_Byte == 112) ? 24 : 0)) {
          i3 = a(this.jdField_b_of_type_JavaLangString) - (this.f - ((this.jdField_c_of_type_Byte == 115) || (this.jdField_c_of_type_Byte == 101) || (this.jdField_c_of_type_Byte == 112) ? 24 : 0));
        }
        for (int i4 = 0; i4 < this.jdField_b_of_type_JavaLangString.length(); i4++)
        {
          if ((i5 = this.jdField_b_of_type_JavaLangString.charAt(i4)) == '^')
          {
            i6 = 0;
            int i8 = 1;
            int i7;
            for (int i9 = 1; i9 <= 2; i9++)
            {
              if (i4 + i9 >= this.jdField_b_of_type_JavaLangString.length())
              {
                i8 = 0;
                break;
              }
              int i10;
              if (((i10 = this.jdField_b_of_type_JavaLangString.charAt(i4 + i9)) < '0') || (i10 > 57))
              {
                i8 = 0;
                break;
              }
              i6 += (i10 - 48) * (i9 == 1 ? 10 : 1);
            }
            if ((i8 != 0) && (i7 >= 0) && (i7 < 9))
            {
              f.a(paramGraphics, e.a(10), i1 - i3, i2 + 2, i7 * 15, 0, 15, 14, 0);
              i1 += 15;
              i4 += 2;
              continue;
            }
          }
          paramGraphics.drawChar(i5, i1 - i3, i2 + 2, 20);
          if (i5 < 255) {
            i1 += bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.charWidth(i5);
          } else {
            i1 += bg.jdField_a_of_type_Byte;
          }
        }
        label1021:
        if ((a().b == this) && (this.jdField_c_of_type_Byte != 116) && (this.jdField_c_of_type_Byte != 97)) {
          a(paramGraphics, i1 + 2, parambg.jdField_b_of_type_Short);
        }
      }
      else if ((a().b == this) && (this.jdField_c_of_type_Byte != 116) && (this.jdField_c_of_type_Byte != 97))
      {
        a(paramGraphics, parambg.jdField_a_of_type_Short + 2, parambg.jdField_b_of_type_Short);
      }
      paramGraphics.setColor(0);
      paramGraphics.drawRect(parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, this.f - 1, this.jdField_a_of_type_Short - 1);
      paramGraphics.drawRect(parambg.jdField_a_of_type_Short - 1, parambg.jdField_b_of_type_Short - 1, this.f + 1, this.jdField_a_of_type_Short + 2);
      if (parambg.c < this.jdField_a_of_type_Short) {
        parambg.c = this.jdField_a_of_type_Short;
      }
      paramGraphics.setClip(j, k, m, n);
    }
    this.g = parambg.c;
    bg tmp1206_1205 = parambg;
    tmp1206_1205.jdField_a_of_type_Short = ((short)(tmp1206_1205.jdField_a_of_type_Short + (short)(this.f + 3)));
    return parambg;
  }
  
  private static int a(String paramString)
  {
    int j = 0;
    for (int k = 0; k < paramString.length(); k++)
    {
      char c1;
      if ((c1 = paramString.charAt(k)) == '^')
      {
        int m = 0;
        int n = 1;
        for (int i1 = 1; i1 <= 2; i1++)
        {
          if (k + i1 >= paramString.length())
          {
            n = 0;
            break;
          }
          int i2;
          if (((i2 = paramString.charAt(k + i1)) < '0') || (i2 > 57))
          {
            n = 0;
            break;
          }
          m += (i2 - 48) * (i1 == 1 ? 10 : 1);
        }
        if ((n != 0) && (m >= 0) && (m < 9))
        {
          j += 15;
          k += 2;
          continue;
        }
      }
      if (c1 < 'ÿ') {
        j += bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.charWidth(c1);
      } else {
        j += bg.jdField_a_of_type_Byte;
      }
    }
    return j;
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(0);
    if (++this.jdField_d_of_type_Int > 5) {
      this.jdField_d_of_type_Int = 0;
    }
    if (this.jdField_d_of_type_Int < 3) {
      paramGraphics.drawLine(paramInt1, paramInt2 + 3, paramInt1, paramInt2 + bg.jdField_b_of_type_Byte - 3);
    }
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void a(String paramString)
  {
    this.jdField_a_of_type_JavaLangString = paramString;
    if (!this.jdField_a_of_type_JavaLangStringBuffer.toString().equals(paramString)) {
      this.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(paramString);
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 > this.h) && (paramInt2 > this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.jdField_a_of_type_Short);
  }
  
  private void c(String paramString)
  {
    this.jdField_b_of_type_JavaLangString = paramString;
    if (this.jdField_c_of_type_Byte != 112)
    {
      this.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(paramString);
      return;
    }
    this.jdField_b_of_type_JavaLangStringBuffer = new StringBuffer(paramString);
  }
  
  public static String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str = 0;
    paramString = paramString.length();
    while (str < paramString)
    {
      localStringBuffer.append(jdField_a_of_type_Char);
      str++;
    }
    return localStringBuffer.toString();
  }
  
  public final void b(int paramInt)
  {
    Object localObject = a();
    if (this.jdField_c_of_type_Byte == 116)
    {
      if (((paramInt == 4) || (this.jdField_e_of_type_Boolean)) && ((paramInt = ((bb)localObject).a(this.jdField_d_of_type_JavaLangString)) != null))
      {
        bc.f();
        int j;
        if ((j = this.c + this.g) + paramInt.g > a().jdField_i_of_type_Short) {
          j = this.c - paramInt.g;
        }
        if (j < a().e) {
          j = a().jdField_i_of_type_Short - paramInt.g >> 1;
        }
        ba localba;
        if ((this.jdField_e_of_type_JavaLangString != null) && (this.jdField_e_of_type_JavaLangString != "") && ((localba = paramInt.a(this.jdField_e_of_type_JavaLangString)) != null)) {
          paramInt.c(localba);
        }
        paramInt.b(this.jdField_b_of_type_Short, j);
        ((bb)localObject).c(paramInt);
      }
    }
    else if ((((bb)localObject).b == this) && (((bb)localObject).jdField_a_of_type_Bg != null) && (this.jdField_a_of_type_Boolean)) {
      if ((paramInt == 4) || (this.jdField_e_of_type_Boolean))
      {
        localObject = localObject;
        paramInt = this;
        if (((bb)localObject).jdField_a_of_type_Bc.a != null)
        {
          localObject = Display.getDisplay(((bb)localObject).jdField_a_of_type_Bc.a);
          if (paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox != ((Display)localObject).getCurrent())
          {
            if (paramInt.jdField_a_of_type_JavaLangStringBuffer.length() == 0) {
              paramInt.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(paramInt.jdField_a_of_type_JavaLangString);
            }
            int k;
            int m = (k = paramInt).jdField_a_of_type_JavaxMicroeditionLcduiTextBox.getConstraints();
            int n = k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.getMaxSize();
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox = null;
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox = new TextBox("", "", 60, m);
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setMaxSize(n);
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.addCommand(k.jdField_a_of_type_JavaxMicroeditionLcduiCommand);
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.addCommand(k.jdField_b_of_type_JavaxMicroeditionLcduiCommand);
            k.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setCommandListener(k);
            paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setString(paramInt.jdField_a_of_type_JavaLangString);
            switch (paramInt.jdField_c_of_type_Byte)
            {
            case 110: 
              paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setConstraints(2);
              break;
            case 101: 
            case 112: 
              paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setConstraints(0);
              break;
            case 99: 
              paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setConstraints(0);
            }
            paramInt.jdField_a_of_type_JavaxMicroeditionLcduiDisplayable = ((Display)localObject).getCurrent();
            ((Display)localObject).setCurrent(paramInt.jdField_a_of_type_JavaxMicroeditionLcduiTextBox);
          }
        }
      }
      else
      {
        if (bc.d())
        {
          a(bc.c());
        }
        else if ((bc.b() == 2) || (bc.b() == -8))
        {
          paramInt = this;
          if (this.jdField_a_of_type_JavaLangStringBuffer.length() > 0)
          {
            paramInt.jdField_a_of_type_JavaLangStringBuffer.deleteCharAt(paramInt.jdField_a_of_type_JavaLangStringBuffer.length() - 1);
            if (paramInt.jdField_c_of_type_Byte == 112) {
              paramInt.jdField_b_of_type_JavaLangStringBuffer.deleteCharAt(paramInt.jdField_b_of_type_JavaLangStringBuffer.length() - 1);
            } else if ((paramInt.jdField_c_of_type_Byte == 110) && ((paramInt.jdField_a_of_type_JavaLangStringBuffer.length() == 0) || (paramInt.b() < 0L))) {
              paramInt.d(0L + "");
            }
          }
          paramInt.jdField_d_of_type_Int = 0;
          paramInt.jdField_f_of_type_Int = -1;
          paramInt.g = 0;
        }
        else if (bc.b() == 15)
        {
          this.jdField_c_of_type_Boolean = (!this.jdField_c_of_type_Boolean);
        }
        if (this.jdField_c_of_type_Byte == 112)
        {
          a(this.jdField_a_of_type_JavaLangStringBuffer.toString());
          c(this.jdField_b_of_type_JavaLangStringBuffer.toString());
        }
        else
        {
          a(this.jdField_a_of_type_JavaLangStringBuffer.toString());
          c(this.jdField_a_of_type_JavaLangStringBuffer.toString());
        }
        bc.f();
      }
    }
    this.jdField_e_of_type_Boolean = false;
  }
  
  private void a(int paramInt)
  {
    for (int j = 0; j <= 10; j++) {
      if (j == paramInt)
      {
        if (this.jdField_c_of_type_Boolean)
        {
          a(jdField_b_of_type_ArrayOfJavaLangString[j].charAt(0));
          return;
        }
        if ((this.jdField_c_of_type_Byte == 101) || (this.jdField_c_of_type_Byte == 112))
        {
          if ((this.jdField_f_of_type_Int != paramInt) || (System.currentTimeMillis() - this.jdField_c_of_type_Long > this.jdField_b_of_type_Long))
          {
            this.g = 0;
            if (this.jdField_a_of_type_JavaLangStringBuffer.length() < this.jdField_e_of_type_Int)
            {
              a(jdField_a_of_type_ArrayOfJavaLangString[j].charAt(this.g));
              this.jdField_f_of_type_Int = paramInt;
            }
            else
            {
              this.jdField_f_of_type_Int = -1;
            }
          }
          else
          {
            if (this.jdField_a_of_type_JavaLangStringBuffer.length() > 0) {
              this.jdField_a_of_type_JavaLangStringBuffer.deleteCharAt(this.jdField_a_of_type_JavaLangStringBuffer.length() - 1);
            }
            if (++this.g >= jdField_a_of_type_ArrayOfJavaLangString[j].length()) {
              this.g = 0;
            }
            a(jdField_a_of_type_ArrayOfJavaLangString[j].charAt(this.g));
          }
          this.jdField_c_of_type_Long = System.currentTimeMillis();
          return;
        }
        a(jdField_c_of_type_JavaLangString.charAt(j));
        return;
      }
    }
  }
  
  private void a(char paramChar)
  {
    if (this.jdField_a_of_type_JavaLangStringBuffer.length() < this.jdField_e_of_type_Int)
    {
      if ((this.jdField_c_of_type_Byte == 110) && (this.jdField_a_of_type_JavaLangStringBuffer.length() == 1) && (this.jdField_a_of_type_JavaLangStringBuffer.toString() == "0")) {
        this.jdField_a_of_type_JavaLangStringBuffer.deleteCharAt(0);
      }
      this.jdField_a_of_type_JavaLangStringBuffer.append(paramChar);
      if (this.jdField_c_of_type_Byte == 112)
      {
        this.jdField_b_of_type_JavaLangStringBuffer.delete(0, this.jdField_b_of_type_JavaLangStringBuffer.length());
        int j = this.jdField_a_of_type_JavaLangStringBuffer.length();
        for (int k = 0; k < j - 1; k++) {
          this.jdField_b_of_type_JavaLangStringBuffer.append(jdField_a_of_type_Char);
        }
        if (j > 0) {
          this.jdField_b_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangStringBuffer.charAt(this.jdField_a_of_type_JavaLangStringBuffer.length() - 1));
        }
        this.jdField_d_of_type_Byte = 10;
        return;
      }
      if (this.jdField_c_of_type_Byte == 110)
      {
        long l = Long.parseLong(this.jdField_a_of_type_JavaLangStringBuffer.toString());
        if (this.jdField_a_of_type_Long >= 0L) {
          try
          {
            if ((l = Long.parseLong(this.jdField_a_of_type_JavaLangStringBuffer.toString())) > this.jdField_a_of_type_Long) {
              d(Long.toString(this.jdField_a_of_type_Long));
            } else {
              d(Long.toString(l));
            }
          }
          catch (Exception localException) {}
        }
        if (l < 0L) {
          d(0L + "");
        }
      }
    }
  }
  
  private void d(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = this;
      this.jdField_a_of_type_JavaLangStringBuffer.delete(0, paramString.jdField_a_of_type_JavaLangStringBuffer.length());
      if (paramString.jdField_c_of_type_Byte == 112) {
        paramString.jdField_b_of_type_JavaLangStringBuffer.delete(0, paramString.jdField_b_of_type_JavaLangStringBuffer.length());
      }
      return;
    }
    if (this.jdField_c_of_type_Byte == 110)
    {
      int j = 0;
      int k = paramString.length();
      while (j < k)
      {
        if (!Character.isDigit(paramString.charAt(j))) {
          return;
        }
        j++;
      }
    }
    this.jdField_a_of_type_JavaLangStringBuffer.delete(0, this.jdField_a_of_type_JavaLangStringBuffer.length());
    this.jdField_a_of_type_JavaLangStringBuffer.append(paramString);
  }
  
  private int b()
  {
    if (this.jdField_a_of_type_JavaLangStringBuffer.toString().trim().equals("")) {
      return 0;
    }
    try
    {
      return Integer.parseInt(this.jdField_a_of_type_JavaLangStringBuffer.toString());
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (!this.jdField_f_of_type_Boolean) {
      this.jdField_f_of_type_Boolean = true;
    }
    this.jdField_e_of_type_Boolean = true;
    b(-1);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    Display localDisplay = Display.getDisplay(a().jdField_a_of_type_Bc.a);
    if (paramCommand == this.jdField_a_of_type_JavaxMicroeditionLcduiCommand)
    {
      paramCommand = this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.getString().trim();
      this.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(paramCommand);
      this.jdField_b_of_type_JavaLangStringBuffer = new StringBuffer(a(paramCommand));
      this.jdField_a_of_type_JavaLangStringBuffer.setLength(paramCommand.length());
      this.jdField_b_of_type_JavaLangStringBuffer.setLength(paramCommand.length());
      int j;
      if ((!this.jdField_d_of_type_Boolean) || ((j = a(paramCommand)) == ' '))
      {
        if (this.jdField_c_of_type_Byte == 112)
        {
          this.jdField_a_of_type_JavaLangString = paramCommand.replace(':', 65306);
          this.jdField_a_of_type_JavaLangString = paramCommand.replace('&', '*');
          this.jdField_b_of_type_JavaLangString = a(this.jdField_a_of_type_JavaLangString);
        }
        else if (this.jdField_c_of_type_Byte == 110)
        {
          long l = 0L;
          j = paramCommand.length();
          while (l < j)
          {
            if (!Character.isDigit(paramCommand.charAt((int)l)))
            {
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTitle("只能输入数字");
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setString("请您重新输入");
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTimeout(2000);
              localDisplay.setCurrent(this.jdField_a_of_type_JavaxMicroeditionLcduiAlert, paramDisplayable);
              return;
            }
            l += 1L;
          }
          if (this.jdField_a_of_type_Long >= 0L) {
            try
            {
              if ((l = Long.parseLong(paramCommand.toString())) > this.jdField_a_of_type_Long) {
                this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = Long.toString(this.jdField_a_of_type_Long));
              } else {
                this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = Long.toString(l));
              }
            }
            catch (Exception localException) {}
          }
        }
        else if (this.jdField_c_of_type_Byte == 115)
        {
          int k = 0;
          int m = paramCommand.length();
          while (k < m)
          {
            if (!Character.isDigit(paramCommand.charAt(k)))
            {
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTitle("只能输入数字");
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setString("请您重新输入");
              this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTimeout(2000);
              localDisplay.setCurrent(this.jdField_a_of_type_JavaxMicroeditionLcduiAlert, paramDisplayable);
              return;
            }
            k++;
          }
          this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = paramCommand.replace(':', 65306));
          this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = paramCommand.replace('&', '*'));
        }
        else
        {
          this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = paramCommand.replace(':', 65306));
          this.jdField_b_of_type_JavaLangString = (this.jdField_a_of_type_JavaLangString = paramCommand.replace('&', '*'));
        }
        localDisplay.setCurrent(this.jdField_a_of_type_JavaxMicroeditionLcduiDisplayable);
        this.jdField_a_of_type_JavaxMicroeditionLcduiDisplayable = null;
        return;
      }
      this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTitle("只能输入数字字母和汉字");
      this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setString("您输入的内容中有非法字符“" + j + "”,请重新输入");
      this.jdField_a_of_type_JavaxMicroeditionLcduiAlert.setTimeout(2000);
      localDisplay.setCurrent(this.jdField_a_of_type_JavaxMicroeditionLcduiAlert, paramDisplayable);
      return;
    }
    if (paramCommand == this.jdField_b_of_type_JavaxMicroeditionLcduiCommand)
    {
      localDisplay.setCurrent(this.jdField_a_of_type_JavaxMicroeditionLcduiDisplayable);
      this.jdField_a_of_type_JavaxMicroeditionLcduiDisplayable = null;
    }
  }
  
  public final void a(l paraml)
  {
    String str1;
    if ((str1 = paraml.a("t")) != null)
    {
      this.jdField_c_of_type_Byte = ((byte)str1.charAt(0));
      switch (this.jdField_c_of_type_Byte)
      {
      case 110: 
        break;
      case 101: 
      case 112: 
        break;
      case 99: 
        this.jdField_i_of_type_JavaLangString = "按确定打开输入框";
        break;
      case 116: 
        this.jdField_d_of_type_JavaLangString = bc.a(str1, 1);
        this.jdField_e_of_type_JavaLangString = bc.a(str1, 2);
        break;
      case 97: 
        this.jdField_a_of_type_Boolean = false;
      }
    }
    String str2;
    if ((str2 = paraml.a("len")) != null) {
      if (this.jdField_c_of_type_Byte == 110) {
        this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setMaxSize(str2.length());
      } else {
        this.jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setMaxSize(Integer.parseInt(str2));
      }
    }
    d(paraml);
    if (paraml.a("isno") != null) {
      this.jdField_d_of_type_Boolean = true;
    }
    paraml.a("ic");
    if ((str1 = paraml.a("w")) != null) {
      this.f = Short.parseShort(str1);
    }
    if ((str1 = paraml.a("v")) != null) {
      this.jdField_a_of_type_JavaLangString = str1;
    }
    if ((str1 = paraml.a("s")) != null) {
      this.jdField_b_of_type_JavaLangString = str1;
    }
    if ((str1 = paraml.a("c")) != null) {
      this.jdField_a_of_type_Int = Integer.parseInt(str1, 16);
    }
    if ((str1 = paraml.a("h")) != null) {
      this.jdField_a_of_type_Short = Short.parseShort(str1);
    }
    this.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(this.jdField_b_of_type_JavaLangString);
    int k;
    if (this.jdField_c_of_type_Byte == 112)
    {
      this.jdField_a_of_type_JavaLangStringBuffer = new StringBuffer(this.jdField_a_of_type_JavaLangString);
      this.jdField_b_of_type_JavaLangStringBuffer = new StringBuffer();
      int j = 0;
      k = this.jdField_a_of_type_JavaLangStringBuffer.length();
      while (j < k)
      {
        this.jdField_b_of_type_JavaLangStringBuffer.append(jdField_a_of_type_Char);
        this.jdField_b_of_type_JavaLangString = this.jdField_b_of_type_JavaLangStringBuffer.toString();
        j++;
      }
    }
    else if (this.jdField_c_of_type_Byte == 110)
    {
      if (k != null) {
        this.jdField_a_of_type_Long = Long.parseLong(k);
      } else {
        this.jdField_a_of_type_Long = Long.MAX_VALUE;
      }
    }
    ba.a(paraml, "i");
  }
  
  private static boolean a(char paramChar)
  {
    char[] arrayOfChar = { '<', '>', '`', '/', '\\', '\'', '"', ':' };
    int j = 0;
    int k = arrayOfChar.length;
    while (j < k)
    {
      if (paramChar == arrayOfChar[j]) {
        return false;
      }
      j++;
    }
    return ((paramChar >= '一') && (paramChar <= 40868)) || ((paramChar >= '_') && (paramChar <= 'z')) || ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }
  
  private static char a(String paramString)
  {
    int j = paramString.length();
    paramString = new StringBuffer(paramString);
    for (int k = 0; k < j; k++) {
      if (!a(paramString.charAt(k))) {
        return paramString.charAt(k);
      }
    }
    return ' ';
  }
  
  public final boolean d()
  {
    return (this.jdField_b_of_type_JavaLangString == null) || (this.jdField_b_of_type_JavaLangString.length() == 0);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */