import engine.Ancient;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class av
  extends ba
{
  public String a;
  private byte c;
  private byte jdField_d_of_type_Byte = 0;
  private char jdField_a_of_type_Char = '\000';
  public String b = null;
  public String c;
  public String d;
  public String e;
  private int jdField_a_of_type_Int = 0;
  private int jdField_d_of_type_Int = -1;
  private int e;
  private int f = -36;
  private a jdField_a_of_type_A = null;
  private int g = 991540;
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  private au jdField_a_of_type_Au;
  
  public av(ba paramba)
  {
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_c_of_type_Byte = 0;
    this.jdField_c_of_type_JavaLangString = null;
    this.jdField_d_of_type_JavaLangString = null;
    this.jdField_e_of_type_JavaLangString = null;
    this.jdField_e_of_type_Int = -1;
    this.jdField_c_of_type_Byte = 0;
    this.jdField_a_of_type_Byte = 0;
    this.jdField_a_of_type_Char = '\000';
    this.jdField_b_of_type_Int = -1;
    this.b = null;
    this.jdField_c_of_type_JavaLangString = null;
    this.jdField_a_of_type_Int = -1;
    this.jdField_a_of_type_Ba = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    c();
    if ((this.jdField_a_of_type_Int < 0) && (("".equals(this.jdField_h_of_type_JavaLangString)) || (this.jdField_h_of_type_JavaLangString == null))) {
      return parambg;
    }
    this.d = (this.jdField_b_of_type_Short = this.jdField_a_of_type_Ba.d);
    this.e = (this.jdField_c_of_type_Short = this.jdField_a_of_type_Ba.e);
    this.jdField_h_of_type_Short = (this.jdField_f_of_type_Short = this.jdField_a_of_type_Ba.jdField_h_of_type_Short);
    this.jdField_a_of_type_Au = new au();
    this.jdField_a_of_type_Array2dOfShort = null;
    this.jdField_c_of_type_Short = parambg.jdField_b_of_type_Short;
    int m = a().b == this ? 1 : 0;
    if (this.jdField_d_of_type_Int >= 0) {
      a(paramGraphics, this.jdField_d_of_type_Int, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short);
    }
    if (this.jdField_e_of_type_Int >= 0) {
      a(paramGraphics, this.jdField_e_of_type_Int, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short);
    }
    if (this.jdField_a_of_type_Int >= 0)
    {
      short[] arrayOfShort1;
      if ((this.jdField_a_of_type_Ba instanceof bk))
      {
        if ((((bk)this.jdField_a_of_type_Ba).jdField_a_of_type_Int == 1) && (this.jdField_h_of_type_JavaLangString == null))
        {
          parambg.jdField_a_of_type_Short = ((short)(this.d + (this.jdField_h_of_type_Short >> 1) - (b() >> 1)));
          if (this.jdField_a_of_type_Ba.jdField_i_of_type_Short != Short.MIN_VALUE) {
            parambg.jdField_b_of_type_Short = ((short)(this.e + (this.jdField_a_of_type_Ba.jdField_i_of_type_Short >> 1) - (c() >> 1)));
          }
        }
        else if (parambg.jdField_a_of_type_Short + b() > this.d + this.jdField_h_of_type_Short)
        {
          bg tmp303_302 = parambg;
          tmp303_302.jdField_b_of_type_Short = ((short)(tmp303_302.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
          parambg.jdField_a_of_type_Short = this.d;
        }
        arrayOfShort1 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + this.jdField_a_of_type_Ba.jdField_h_of_type_Short), (short)(parambg.jdField_b_of_type_Short + this.jdField_a_of_type_Ba.jdField_i_of_type_Short) };
        this.jdField_a_of_type_Au.a(arrayOfShort1);
      }
      else
      {
        if (parambg.jdField_a_of_type_Short + b() > this.d + this.jdField_h_of_type_Short)
        {
          bg tmp409_408 = parambg;
          tmp409_408.jdField_b_of_type_Short = ((short)(tmp409_408.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
          parambg.jdField_a_of_type_Short = this.d;
        }
        arrayOfShort1 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + b()), (short)(parambg.jdField_b_of_type_Short + c()) };
        this.jdField_a_of_type_Au.a(arrayOfShort1);
      }
      if (parambg.jdField_c_of_type_Short < c()) {
        parambg.jdField_c_of_type_Short = ((short)c());
      }
      if (parambg.a())
      {
        if (this.jdField_a_of_type_Byte == 1)
        {
          bg tmp520_519 = parambg;
          tmp520_519.jdField_a_of_type_Short = ((short)(tmp520_519.jdField_a_of_type_Short + (this.jdField_f_of_type_Short - b() >> 1)));
        }
        else if (this.jdField_a_of_type_Byte == 3)
        {
          bg tmp552_551 = parambg;
          tmp552_551.jdField_a_of_type_Short = ((short)(tmp552_551.jdField_a_of_type_Short + (this.jdField_f_of_type_Short - b())));
        }
        switch (this.jdField_c_of_type_Byte)
        {
        case 1: 
          if (m == 0) {
            w.a(paramGraphics, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, bg.jdField_a_of_type_Byte + 4, bg.jdField_b_of_type_Byte + 2);
          }
          break;
        case 2: 
          a(paramGraphics, this.jdField_a_of_type_Int, parambg.jdField_a_of_type_Short + 1 + this.i, parambg.jdField_b_of_type_Short + 1 + this.h);
          if (m != 0)
          {
            paramGraphics.setColor(16776960);
            if (d.jdField_c_of_type_Int % 4 == 0)
            {
              paramGraphics.drawRect(parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, b(), c());
              paramGraphics.drawRect(parambg.jdField_a_of_type_Short - 1, parambg.jdField_b_of_type_Short - 1, b() + 2, c() + 2);
            }
            else
            {
              paramGraphics.drawRect(parambg.jdField_a_of_type_Short + 1, parambg.jdField_b_of_type_Short + 1, b() - 2, c() - 2);
              paramGraphics.drawRect(parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, b(), c());
            }
          }
          break;
        case 7: 
          if (m != 0) {
            a(paramGraphics, this.jdField_a_of_type_Int, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + 15);
          } else {
            this.f = -36;
          }
          break;
        case 9: 
          a(paramGraphics, this.jdField_a_of_type_Int, parambg.jdField_a_of_type_Short - 27, parambg.jdField_b_of_type_Short);
          break;
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 8: 
        default: 
          a(paramGraphics, this.jdField_a_of_type_Int, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short);
        }
      }
      if (this.jdField_h_of_type_JavaLangString == null)
      {
        arrayOfShort1 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + (short)(b() + 2)), (short)(parambg.jdField_b_of_type_Short + (short)(c() + 2)) };
        this.jdField_a_of_type_Au.a(arrayOfShort1);
      }
      bg tmp948_947 = parambg;
      tmp948_947.jdField_a_of_type_Short = ((short)(tmp948_947.jdField_a_of_type_Short + (short)(b() + 2)));
    }
    int n = 0;
    if (this.jdField_h_of_type_JavaLangString != null)
    {
      if (parambg.jdField_c_of_type_Short < bg.jdField_b_of_type_Byte) {
        parambg.jdField_c_of_type_Short = ((short)bg.jdField_b_of_type_Byte);
      }
      int i1 = this.jdField_h_of_type_JavaLangString.length();
      if (this.jdField_b_of_type_Int != -1)
      {
        n = this.jdField_b_of_type_Int;
      }
      else
      {
        n = -1;
        if ((this.jdField_c_of_type_Byte == 5) && (this.b != null)) {
          n = 16777215;
        } else if ((this.jdField_c_of_type_Byte == 5) && (this.b == null)) {
          n = 16761897;
        }
      }
      paramGraphics.setColor(n);
      int i2;
      short[] arrayOfShort2;
      int i5;
      if (this.jdField_a_of_type_Byte == 3)
      {
        if (this.jdField_c_of_type_Byte == 3)
        {
          i2 = this.jdField_h_of_type_Short;
          if (m != 0) {
            w.a(paramGraphics, 18, 6003415, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - i2, parambg.jdField_b_of_type_Short, i2, bg.jdField_b_of_type_Byte + 2);
          } else {
            w.a(paramGraphics, 18, -1, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - i2, parambg.jdField_b_of_type_Short, i2, bg.jdField_b_of_type_Byte + 2);
          }
        }
        i2 = bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(this.jdField_h_of_type_JavaLangString);
        arrayOfShort2 = new short[] { (short)(parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - i2), parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short), (short)(parambg.jdField_b_of_type_Short + bg.jdField_b_of_type_Byte) };
        this.jdField_a_of_type_Au.a(arrayOfShort2);
        if (parambg.a())
        {
          if (this.jdField_c_of_type_Byte == 5)
          {
            ae.a(paramGraphics, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4, parambg.jdField_b_of_type_Short, this.jdField_h_of_type_JavaLangString, n, this.g, 24);
          }
          else
          {
            if (m != 0)
            {
              i5 = paramGraphics.getColor();
              paramGraphics.setColor(0);
              paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4 + 1, parambg.jdField_b_of_type_Short, 24);
              paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4 - 1, parambg.jdField_b_of_type_Short, 24);
              paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4, parambg.jdField_b_of_type_Short + 1, 24);
              paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4, parambg.jdField_b_of_type_Short - 1, 24);
              paramGraphics.setColor(i5);
            }
            paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short - 4, parambg.jdField_b_of_type_Short, 24);
          }
          bg tmp1436_1435 = parambg;
          tmp1436_1435.jdField_a_of_type_Short = ((short)(tmp1436_1435.jdField_a_of_type_Short + this.jdField_f_of_type_Short));
        }
      }
      else if (this.jdField_a_of_type_Byte == 2)
      {
        this.jdField_d_of_type_Byte = ((byte)(this.jdField_d_of_type_Byte - 1));
        if (this.jdField_d_of_type_Byte < -bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(this.jdField_h_of_type_JavaLangString)) {
          this.jdField_d_of_type_Byte = 0;
        }
        if (parambg.a()) {
          if (this.jdField_c_of_type_Byte == 5) {
            ae.a(paramGraphics, parambg.jdField_a_of_type_Short + this.jdField_d_of_type_Byte, parambg.jdField_b_of_type_Short, this.jdField_h_of_type_JavaLangString, n, this.g, 0);
          } else {
            paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.jdField_a_of_type_Short + this.jdField_d_of_type_Byte, parambg.jdField_b_of_type_Short, 17);
          }
        }
      }
      else
      {
        int i6;
        int i7;
        int i8;
        int i11;
        if (this.jdField_a_of_type_Byte == 1)
        {
          if (this.jdField_c_of_type_Byte == 3)
          {
            i2 = this.jdField_f_of_type_Short;
            if (m != 0) {
              w.a(paramGraphics, 18, 6003415, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i2, bg.jdField_b_of_type_Byte + 2);
            } else {
              w.a(paramGraphics, 18, -1, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i2, bg.jdField_b_of_type_Byte + 2);
            }
          }
          String[] arrayOfString = ba.a(this.jdField_h_of_type_JavaLangString, this.jdField_f_of_type_Short, bg.jdField_a_of_type_JavaxMicroeditionLcduiFont);
          arrayOfShort2 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short), (short)(parambg.jdField_b_of_type_Short + bg.jdField_b_of_type_Byte) };
          this.jdField_a_of_type_Au.a(arrayOfShort2);
          i5 = 0;
          for (i6 = 0; i6 < arrayOfString.length; i6++) {
            if (parambg.a())
            {
              Object localObject2;
              switch (this.jdField_c_of_type_Byte)
              {
              case 5: 
                ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], n, this.g, 17);
                break;
              case 6: 
                localObject2 = arrayOfString[i6].toCharArray();
                i7 = -1;
                for (;;)
                {
                  i7++;
                  if (i7 >= localObject2.length) {
                    break;
                  }
                  if (localObject2[i7] == '/') {
                    ad.b(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) - 30, parambg.jdField_b_of_type_Short + this.h, this.i);
                  } else {
                    try
                    {
                      ad.a(paramGraphics, e.a(3), localObject2[i7] - '0', parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) - 30, parambg.jdField_b_of_type_Short + this.h, this.i);
                    }
                    catch (Exception localException1) {}
                  }
                  bg tmp1932_1931 = parambg;
                  tmp1932_1931.jdField_a_of_type_Short = ((short)(tmp1932_1931.jdField_a_of_type_Short + 6));
                }
                break;
              case 1: 
                i7 = arrayOfString[i6].length() * 15;
                if (bg.jdField_b_of_type_Byte >= 22)
                {
                  if (m != 0) {
                    w.a(paramGraphics, 22, 0, parambg.jdField_a_of_type_Short - 2, parambg.jdField_b_of_type_Short, this.jdField_f_of_type_Short, bg.jdField_b_of_type_Byte + 2);
                  } else {
                    w.a(paramGraphics, 21, 0, parambg.jdField_a_of_type_Short - 2, parambg.jdField_b_of_type_Short, this.jdField_f_of_type_Short, bg.jdField_b_of_type_Byte + 2);
                  }
                  ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], 16761897, 17);
                  if (a() > 0) {
                    if (((i8 = a()) >= '0') && (i8 <= 57)) {
                      ad.a(paramGraphics, e.a(3), i8 - 48, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) + (paramGraphics.getFont().stringWidth(arrayOfString[i6]) >> 1) + 2, parambg.jdField_b_of_type_Short, 3);
                    } else if (i8 == 35) {
                      ad.c(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) + (paramGraphics.getFont().stringWidth(arrayOfString[i6]) >> 1) + 2, parambg.jdField_b_of_type_Short, 1);
                    } else if (i8 == 42) {
                      ad.c(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) + (paramGraphics.getFont().stringWidth(arrayOfString[i6]) >> 1) + 2, parambg.jdField_b_of_type_Short, 0);
                    }
                  }
                }
                else
                {
                  if (m != 0) {
                    w.a(paramGraphics, 22, 0, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i7 + 12, bg.jdField_b_of_type_Byte + 2);
                  } else {
                    w.a(paramGraphics, 21, 0, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i7 + 12, bg.jdField_b_of_type_Byte + 2);
                  }
                  ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], 16761897, 17);
                  if (a() > 0) {
                    if (((i8 = a()) >= '0') && (i8 <= 57)) {
                      ad.a(paramGraphics, e.a(3), i8 - 48, parambg.jdField_a_of_type_Short + i7 + 8, parambg.jdField_b_of_type_Short, 3);
                    } else if (i8 == 35) {
                      ad.c(paramGraphics, parambg.jdField_a_of_type_Short + i7 + 8, parambg.jdField_b_of_type_Short, 1);
                    } else if (i8 == 42) {
                      ad.c(paramGraphics, parambg.jdField_a_of_type_Short + i7 + 8, parambg.jdField_b_of_type_Short, 0);
                    }
                  }
                }
                break;
              case 3: 
                i8 = m != 0 ? n : 16777215;
                if (m != 0) {
                  ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], i8, 0, 17);
                } else {
                  ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], i8, 17);
                }
                break;
              case 8: 
                if ((i7 = d.jdField_c_of_type_Int - this.k) < 30)
                {
                  if (i7 != i5)
                  {
                    i5 = i7;
                    i7 = this.j == -1 ? e.a(Integer.parseInt(this.jdField_h_of_type_JavaLangString)) : this.j + (Integer.parseInt(arrayOfString[i6]) - this.j) * i7 / 30;
                    ad.a(paramGraphics, e.a(3), i7, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) - arrayOfString[i6].length() * 6, parambg.jdField_b_of_type_Short + this.h, this.i);
                  }
                }
                else
                {
                  localObject2 = arrayOfString[i6].toCharArray();
                  i11 = -1;
                  for (;;)
                  {
                    i11++;
                    if (i11 >= localObject2.length) {
                      break;
                    }
                    ad.a(paramGraphics, e.a(3), localObject2[i11] - '0', parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1) - arrayOfString[i6].length() * 6, parambg.jdField_b_of_type_Short + this.h, this.i);
                    bg tmp2706_2705 = parambg;
                    tmp2706_2705.jdField_a_of_type_Short = ((short)(tmp2706_2705.jdField_a_of_type_Short + 6));
                  }
                }
                break;
              case 2: 
              case 4: 
              case 7: 
              default: 
                if (m != 0) {
                  ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], n, 0, 17);
                }
                ae.a(paramGraphics, parambg.jdField_a_of_type_Short + (this.jdField_f_of_type_Short >> 1), parambg.jdField_b_of_type_Short, arrayOfString[i6], n, 17);
              }
              if (i6 < arrayOfString.length - 1)
              {
                bg tmp2795_2794 = parambg;
                tmp2795_2794.jdField_b_of_type_Short = ((short)(tmp2795_2794.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
                parambg.jdField_c_of_type_Short = ((short)bg.jdField_b_of_type_Byte);
                localObject2 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, (short)(parambg.jdField_a_of_type_Short + this.jdField_f_of_type_Short), (short)(parambg.jdField_b_of_type_Short + bg.jdField_b_of_type_Byte) };
                this.jdField_a_of_type_Au.a(localObject2);
              }
            }
            else if (arrayOfString.length > 1)
            {
              bg tmp2880_2879 = parambg;
              tmp2880_2879.jdField_b_of_type_Short = ((short)(tmp2880_2879.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
              parambg.jdField_c_of_type_Short = ((short)bg.jdField_b_of_type_Byte);
              bg tmp2902_2901 = parambg;
              tmp2902_2901.jdField_b_of_type_Short = ((short)tmp2902_2901.jdField_b_of_type_Short);
            }
          }
        }
        else
        {
          int i3;
          if (this.jdField_c_of_type_Byte == 9)
          {
            i3 = parambg.jdField_a_of_type_Short + 28;
            int i4 = 6 * bg.jdField_a_of_type_Byte;
            if (m != 0)
            {
              i3 -= 4;
              w.a(paramGraphics, 27, 0, i3, parambg.jdField_b_of_type_Short, i4 + 4, bg.jdField_b_of_type_Byte + 2);
            }
            else
            {
              i3 -= 14;
              w.a(paramGraphics, 28, 0, i3, parambg.jdField_b_of_type_Short, i4 + 4, bg.jdField_b_of_type_Byte + 2);
            }
            i5 = paramGraphics.getColor();
            if (m != 0) {
              ae.a(paramGraphics, i3 + 4, parambg.jdField_b_of_type_Short, this.jdField_h_of_type_JavaLangString, 16630828, 20);
            } else {
              ae.a(paramGraphics, i3 + 4, parambg.jdField_b_of_type_Short, this.jdField_h_of_type_JavaLangString, 9276813, 20);
            }
            paramGraphics.setColor(i5);
          }
          else
          {
            i3 = 0;
            Object localObject1 = null;
            if (this.jdField_c_of_type_Byte == 3)
            {
              i5 = this.jdField_f_of_type_Short;
              if (m != 0) {
                w.a(paramGraphics, 18, 6003415, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i5, bg.jdField_b_of_type_Byte + 2);
              } else {
                w.a(paramGraphics, 18, -1, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i5, bg.jdField_b_of_type_Byte + 2);
              }
            }
            if (parambg.jdField_a_of_type_Short == this.d)
            {
              bg tmp3148_3147 = parambg;
              tmp3148_3147.jdField_a_of_type_Short = ((short)(tmp3148_3147.jdField_a_of_type_Short + 4));
            }
            i5 = 0;
            label4305:
            for (i6 = 0; i6 < i1; i6++)
            {
              char c1 = this.jdField_h_of_type_JavaLangString.charAt(i6);
              i7 = 1;
              if (c1 == '#')
              {
                i8 = 0;
                e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
                for (i11 = 1; i11 < 7; i11++)
                {
                  if (i6 + i11 >= i1)
                  {
                    paramGraphics.setColor(n);
                    break label4305;
                  }
                  if (((i8 = this.jdField_h_of_type_JavaLangString.charAt(i6 + i11)) < '0') || (i8 > 102))
                  {
                    if (i5 != 0)
                    {
                      i5 = i5 == 0 ? 1 : 0;
                      paramGraphics.setColor(n);
                      break label4305;
                    }
                    i7 = 0;
                  }
                  e.jdField_a_of_type_JavaLangStringBuffer.append(i8);
                }
                if (i7 != 0)
                {
                  i6 += 6;
                  i5 = 1;
                  i11 = e.a(e.jdField_a_of_type_JavaLangStringBuffer.toString(), n);
                  paramGraphics.setColor(i11);
                  e.jdField_a_of_type_JavaLangStringBuffer.delete(0, e.jdField_a_of_type_JavaLangStringBuffer.length());
                  continue;
                }
              }
              else if (c1 == '^')
              {
                int i9 = 0;
                i11 = 1;
                for (i7 = 1; i7 <= 2; i7++)
                {
                  if (i6 + i7 >= i1)
                  {
                    i11 = 0;
                    break;
                  }
                  int i12;
                  if (((i12 = this.jdField_h_of_type_JavaLangString.charAt(i6 + i7)) < '0') || (i12 > 57))
                  {
                    i11 = 0;
                    break;
                  }
                  i9 += (i12 - 48) * (i7 == 1 ? 10 : 1);
                }
                if ((i11 != 0) && (i9 >= 0) && (i9 < 9))
                {
                  if (parambg.jdField_a_of_type_Short + 15 > this.d + this.jdField_f_of_type_Short)
                  {
                    tmp3489_3488 = parambg;
                    tmp3489_3488.jdField_b_of_type_Short = ((short)(tmp3489_3488.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
                    parambg.jdField_a_of_type_Short = this.d;
                    tmp3511_3510 = parambg;
                    tmp3511_3510.jdField_a_of_type_Short = ((short)(tmp3511_3510.jdField_a_of_type_Short + 4));
                  }
                  f.a(paramGraphics, e.a(10), parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, i9 * 15, 0, 15, 14, 0);
                  tmp3550_3549 = parambg;
                  tmp3550_3549.jdField_a_of_type_Short = ((short)(tmp3550_3549.jdField_a_of_type_Short + 15));
                  i6 += 2;
                  continue;
                }
              }
              if (this.jdField_c_of_type_Byte == 6)
              {
                if ((parambg.jdField_a_of_type_Short + 7 > this.d + this.jdField_f_of_type_Short) || (c1 == '`'))
                {
                  tmp3603_3602 = parambg;
                  tmp3603_3602.jdField_b_of_type_Short = ((short)(tmp3603_3602.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
                  if (localObject1 != null)
                  {
                    localObject1[2] = parambg.jdField_a_of_type_Short;
                    localObject1[3] = parambg.jdField_b_of_type_Short;
                    this.jdField_a_of_type_Au.a(localObject1);
                    localObject1 = null;
                  }
                  parambg.jdField_a_of_type_Short = this.d;
                  tmp3658_3657 = parambg;
                  tmp3658_3657.jdField_a_of_type_Short = ((short)(tmp3658_3657.jdField_a_of_type_Short + 4));
                  parambg.jdField_c_of_type_Short = ((short)bg.jdField_b_of_type_Byte);
                  if (c1 == '`') {
                    continue;
                  }
                }
              }
              else if ((parambg.jdField_a_of_type_Short + bg.jdField_a_of_type_Byte > this.d + this.jdField_f_of_type_Short) || (c1 == '`'))
              {
                tmp3714_3713 = parambg;
                tmp3714_3713.jdField_b_of_type_Short = ((short)(tmp3714_3713.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
                if (localObject1 != null)
                {
                  localObject1[2] = parambg.jdField_a_of_type_Short;
                  localObject1[3] = parambg.jdField_b_of_type_Short;
                  this.jdField_a_of_type_Au.a(localObject1);
                  localObject1 = null;
                }
                parambg.jdField_a_of_type_Short = this.d;
                tmp3769_3768 = parambg;
                tmp3769_3768.jdField_a_of_type_Short = ((short)(tmp3769_3768.jdField_a_of_type_Short + 4));
                parambg.jdField_c_of_type_Short = ((short)bg.jdField_b_of_type_Byte);
                if (c1 == '`') {
                  continue;
                }
              }
              if (c1 == '~')
              {
                tmp3802_3801 = parambg;
                tmp3802_3801.jdField_a_of_type_Short = ((short)(tmp3802_3801.jdField_a_of_type_Short + 2));
              }
              else
              {
                if (localObject1 == null) {
                  localObject1 = new short[] { parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, 0, 0 };
                }
                if (parambg.a()) {
                  switch (this.jdField_c_of_type_Byte)
                  {
                  case 5: 
                    ae.a(paramGraphics, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, String.valueOf(c1), n, this.g, 17);
                    break;
                  case 6: 
                    if (c1 == '/') {
                      ad.b(paramGraphics, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + this.h, this.i);
                    } else {
                      try
                      {
                        ad.a(paramGraphics, e.a(3), c1 - '0', parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + this.h, this.i);
                      }
                      catch (Exception localException2) {}
                    }
                    break;
                  case 8: 
                    int i10;
                    if ((i10 = d.jdField_c_of_type_Int - this.k) < 30)
                    {
                      if (i10 != i3)
                      {
                        i3 = i10;
                        i10 = this.j == -1 ? e.a(Integer.parseInt(this.jdField_h_of_type_JavaLangString)) : this.j + (Integer.parseInt(this.jdField_h_of_type_JavaLangString) - this.j) * i10 / 30;
                        ad.a(paramGraphics, e.a(3), i10, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + this.h, this.i);
                      }
                    }
                    else {
                      ad.a(paramGraphics, e.a(3), c1 - '0', parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + this.h, this.i);
                    }
                    break;
                  case 7: 
                  default: 
                    if (m != 0)
                    {
                      i11 = paramGraphics.getColor();
                      paramGraphics.setColor(0);
                      paramGraphics.drawChar(c1, parambg.jdField_a_of_type_Short + 1, parambg.jdField_b_of_type_Short, 20);
                      paramGraphics.drawChar(c1, parambg.jdField_a_of_type_Short - 1, parambg.jdField_b_of_type_Short, 20);
                      paramGraphics.drawChar(c1, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short + 1, 20);
                      paramGraphics.drawChar(c1, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short - 1, 20);
                      paramGraphics.setColor(i11);
                    }
                    paramGraphics.drawChar(c1, parambg.jdField_a_of_type_Short, parambg.jdField_b_of_type_Short, 20);
                  }
                }
                if ((this.jdField_c_of_type_Byte == 6) || (this.jdField_c_of_type_Byte == 8))
                {
                  tmp4249_4248 = parambg;
                  tmp4249_4248.jdField_a_of_type_Short = ((short)(tmp4249_4248.jdField_a_of_type_Short + 6));
                }
                else if (c1 < 'ÿ')
                {
                  tmp4272_4271 = parambg;
                  tmp4272_4271.jdField_a_of_type_Short = ((short)(tmp4272_4271.jdField_a_of_type_Short + bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.charWidth(c1)));
                }
                else
                {
                  tmp4293_4292 = parambg;
                  tmp4293_4292.jdField_a_of_type_Short = ((short)(tmp4293_4292.jdField_a_of_type_Short + bg.jdField_a_of_type_Byte));
                }
              }
            }
            if (localObject1 != null)
            {
              localObject1[2] = parambg.jdField_a_of_type_Short;
              localObject1[3] = ((short)(parambg.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
              this.jdField_a_of_type_Au.a(localObject1);
            }
          }
        }
      }
    }
    if ((this.jdField_a_of_type_Array2dOfShort == null) && (this.jdField_a_of_type_Au.a() > 0))
    {
      this.jdField_a_of_type_Array2dOfShort = new short[this.jdField_a_of_type_Au.a()][4];
      this.jdField_a_of_type_Au.a((Object[])this.jdField_a_of_type_Array2dOfShort);
      this.jdField_b_of_type_Short = this.jdField_a_of_type_Array2dOfShort[0][0];
      this.jdField_c_of_type_Short = this.jdField_a_of_type_Array2dOfShort[0][1];
    }
    if (this.jdField_c_of_type_Short == parambg.jdField_b_of_type_Short)
    {
      bg tmp4430_4429 = parambg;
      tmp4430_4429.jdField_a_of_type_Short = ((short)(tmp4430_4429.jdField_a_of_type_Short + 3));
    }
    d();
    this.jdField_a_of_type_Au.a();
    return parambg;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    if (this.jdField_a_of_type_Array2dOfShort != null) {
      for (int m = 0; m < this.jdField_a_of_type_Array2dOfShort.length; m++) {
        if ((paramInt1 > this.jdField_a_of_type_Array2dOfShort[m][0]) && (paramInt2 > this.jdField_a_of_type_Array2dOfShort[m][1]) && (paramInt1 < this.jdField_a_of_type_Array2dOfShort[m][2]) && (paramInt2 < this.jdField_a_of_type_Array2dOfShort[m][3])) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean a()
  {
    return this.b != null;
  }
  
  public final boolean b()
  {
    return (this.b != null) || (this.jdField_c_of_type_JavaLangString != null);
  }
  
  public final void a(int paramInt)
  {
    this.jdField_c_of_type_Int = paramInt;
    if (this.jdField_a_of_type_A != null) {
      this.jdField_a_of_type_A.b(paramInt);
    }
  }
  
  public final void b(int paramInt)
  {
    bb localbb;
    if ((localbb = a()).jdField_a_of_type_Bc != null)
    {
      if (paramInt == 4) {
        a();
      } else if ((paramInt == 2) && (this.jdField_d_of_type_JavaLangString != null)) {
        localbb.a().a(this.jdField_d_of_type_JavaLangString);
      } else if ((paramInt == 3) && (this.jdField_e_of_type_JavaLangString != null)) {
        localbb.a().a(this.jdField_e_of_type_JavaLangString);
      }
      bc.f();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    a();
  }
  
  public final void a(l paraml)
  {
    d(paraml);
    String str1;
    if ((str1 = paraml.a("type")) != null) {
      if (str1.equals("menu"))
      {
        this.jdField_c_of_type_Byte = 1;
      }
      else if (str1.equals("cell"))
      {
        this.jdField_c_of_type_Byte = 2;
        if (paraml.a("fy") != null) {
          this.h = Integer.parseInt(paraml.a("fy"));
        }
        if (paraml.a("fx") != null) {
          this.i = Integer.parseInt(paraml.a("fx"));
        }
      }
      else if (str1.equals("but"))
      {
        this.jdField_c_of_type_Byte = 3;
      }
      else if (str1.equals("show"))
      {
        this.jdField_c_of_type_Byte = 4;
      }
      else if (str1.equals("double"))
      {
        this.jdField_c_of_type_Byte = 5;
      }
      else if (str1.equals("num"))
      {
        this.jdField_c_of_type_Byte = 6;
        if (paraml.a("fy") != null) {
          this.h = Integer.parseInt(paraml.a("fy"));
        } else {
          this.h = 6;
        }
        if (paraml.a("sy") != null) {
          this.i = Integer.parseInt(paraml.a("sy"));
        } else {
          this.i = 2;
        }
      }
      else if (str1.equals("cr"))
      {
        this.jdField_c_of_type_Byte = 7;
        this.h = Integer.parseInt(paraml.a("sy"));
      }
      else if (str1.equals("ran"))
      {
        this.jdField_c_of_type_Byte = 8;
        if (paraml.a("fy") != null) {
          this.h = Integer.parseInt(paraml.a("fy"));
        } else {
          this.h = 6;
        }
        if (paraml.a("sy") != null) {
          this.i = Integer.parseInt(paraml.a("sy"));
        } else {
          this.i = 2;
        }
        if (paraml.a("ov") != null) {
          this.j = Integer.parseInt(paraml.a("ov"));
        } else {
          this.j = -1;
        }
        this.k = d.jdField_c_of_type_Int;
      }
      else if (str1.equals("move"))
      {
        this.jdField_c_of_type_Byte = 9;
      }
      else if (str1.equals("showl"))
      {
        this.jdField_c_of_type_Byte = 10;
      }
    }
    if ((str1 = paraml.a("pic")) != null)
    {
      int m = Integer.parseInt(str1);
      c(m);
    }
    String str2;
    if ((str2 = paraml.a("bg")) != null) {
      this.jdField_d_of_type_Int = Integer.parseInt(str2);
    }
    if ((str2 = paraml.a("shadow")) != null) {
      this.jdField_e_of_type_Int = Integer.parseInt(str2);
    }
    if (((str2 = paraml.a("c")) != null) && (!str2.equals(""))) {
      this.jdField_b_of_type_Int = Integer.parseInt(str2, 16);
    }
    if (((str2 = paraml.a("cc")) != null) && (!str2.equals(""))) {
      this.g = Integer.parseInt(str2, 16);
    }
    if ((str2 = paraml.a("pl")) != null) {
      if (str2.equals("min")) {
        this.jdField_a_of_type_Byte = 1;
      } else if (str2.equals("s")) {
        this.jdField_a_of_type_Byte = 2;
      } else if (str2.equals("r")) {
        this.jdField_a_of_type_Byte = 3;
      }
    }
    this.b = paraml.a("cmd");
    this.jdField_i_of_type_JavaLangString = paraml.a("tip");
    if (((str2 = paraml.a("hk")) != null) && (str2.length() > 0)) {
      this.jdField_a_of_type_Char = str2.charAt(0);
    }
    this.jdField_c_of_type_JavaLangString = paraml.a("oc");
    this.jdField_f_of_type_JavaLangString = paraml.a("of");
    this.jdField_a_of_type_JavaLangString = paraml.a("val");
    this.jdField_d_of_type_JavaLangString = paraml.a("ol");
    this.jdField_e_of_type_JavaLangString = paraml.a("or");
    paraml.a("isa");
    if ((str2 = paraml.a("num")) != null) {
      a(Integer.parseInt(str2));
    }
    if ((str2 = paraml.c()).trim().length() != 0) {
      this.jdField_h_of_type_JavaLangString = str2;
    }
    ba.a(paraml, "a");
  }
  
  public final void a()
  {
    if (this.jdField_a_of_type_Int == 11) {
      return;
    }
    bb localbb = a();
    if (this.b != null)
    {
      Object localObject;
      String str;
      if (((str = a(localObject = new StringBuffer(this.b))).equals("g")) || (str.equals("c")) || (str.equals("s")) || (str.equals("send")))
      {
        ((StringBuffer)localObject).insert(0, ':');
        ((StringBuffer)localObject).insert(0, str);
        localbb.a(((StringBuffer)localObject).toString());
      }
      else if (str.equals("b"))
      {
        localObject = ((StringBuffer)localObject).toString();
        try
        {
          Ancient.a.platformRequest((String)localObject);
          d.e();
        }
        catch (Exception localException) {}
      }
      else if (str.endsWith("exp"))
      {
        az tmp149_146 = ((az)this.jdField_a_of_type_Ba);
        tmp149_146.a(!tmp149_146.a);
      }
      else if (str.equals("o"))
      {
        localbb.a().a(((StringBuffer)localObject).toString());
      }
      else if (str.equals("k"))
      {
        Integer.parseInt(((StringBuffer)localObject).toString());
      }
    }
    if (this.jdField_c_of_type_JavaLangString != null) {
      localbb.a().a(this.jdField_c_of_type_JavaLangString);
    }
  }
  
  public static String a(StringBuffer paramStringBuffer)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (paramStringBuffer.length() > 0)
    {
      char c1 = paramStringBuffer.charAt(0);
      paramStringBuffer.deleteCharAt(0);
      if (c1 == ':') {
        break;
      }
      localStringBuffer.append(c1);
    }
    return localStringBuffer.toString();
  }
  
  public final void c(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
    if ((paramInt >= 999) && (paramInt < 2000))
    {
      this.jdField_a_of_type_A = new a();
      if (paramInt == 999)
      {
        if (e.jdField_a_of_type_G != null) {
          this.jdField_a_of_type_A.a(e.jdField_a_of_type_G.m);
        } else {
          this.jdField_a_of_type_A.a(0);
        }
        this.jdField_a_of_type_A.m = (e.jdField_a_of_type_G != null ? e.jdField_a_of_type_G.m : 0);
      }
      else
      {
        this.jdField_a_of_type_A.a(paramInt - 1000);
        this.jdField_a_of_type_A.m = (paramInt - 1000);
      }
      this.jdField_a_of_type_A.b(this.h);
      return;
    }
    if (this.jdField_a_of_type_A != null) {
      this.jdField_a_of_type_A = null;
    }
  }
  
  public final int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  private int b()
  {
    if (this.jdField_a_of_type_Int == -1) {
      return 0;
    }
    if ((this.jdField_a_of_type_Int >= 999) && (this.jdField_a_of_type_Int < 2000)) {
      return 50;
    }
    if ((this.jdField_a_of_type_Int >= 50) && (this.jdField_a_of_type_Int < 100)) {
      return 13;
    }
    if ((this.jdField_a_of_type_Int >= 100) && (this.jdField_a_of_type_Int < 256)) {
      return 23;
    }
    if (((this.jdField_a_of_type_Int == 11) || (this.jdField_a_of_type_Int >= 50)) && (this.jdField_a_of_type_Int < 500)) {
      return 20;
    }
    if ((this.jdField_a_of_type_Int >= 0) && (this.jdField_a_of_type_Int < 11)) {
      return 11;
    }
    if ((this.jdField_a_of_type_Int > 19) && (this.jdField_a_of_type_Int < 50)) {
      return 18;
    }
    if ((this.jdField_a_of_type_Int >= 500) && (this.jdField_a_of_type_Int < 510)) {
      return 46;
    }
    if (this.jdField_a_of_type_Int == 513) {
      return 1;
    }
    if ((this.jdField_a_of_type_Int >= 523) && (this.jdField_a_of_type_Int <= 524)) {
      return 16;
    }
    if (this.jdField_a_of_type_Int == 525) {
      return 10;
    }
    if ((this.jdField_a_of_type_Int >= 3000) && (this.jdField_a_of_type_Int < 3009)) {
      return 16;
    }
    return 12;
  }
  
  private int c()
  {
    if (this.jdField_a_of_type_Int == -1) {
      return 0;
    }
    if ((this.jdField_a_of_type_Int >= 999) && (this.jdField_a_of_type_Int < 2000)) {
      return 40;
    }
    if ((this.jdField_a_of_type_Int >= 50) && (this.jdField_a_of_type_Int < 100)) {
      return 12;
    }
    if ((this.jdField_a_of_type_Int >= 100) && (this.jdField_a_of_type_Int < 256)) {
      return 24;
    }
    if (((this.jdField_a_of_type_Int == 11) || (this.jdField_a_of_type_Int >= 50)) && (this.jdField_a_of_type_Int < 500)) {
      return 20;
    }
    if ((this.jdField_a_of_type_Int >= 0) && (this.jdField_a_of_type_Int < 11)) {
      return 11;
    }
    if ((this.jdField_a_of_type_Int > 19) && (this.jdField_a_of_type_Int < 50)) {
      return 18;
    }
    if ((this.jdField_a_of_type_Int >= 500) && (this.jdField_a_of_type_Int < 510)) {
      return 77;
    }
    if (this.jdField_a_of_type_Int == 513) {
      return 1;
    }
    if ((this.jdField_a_of_type_Int >= 523) && (this.jdField_a_of_type_Int <= 525)) {
      return 20;
    }
    if ((this.jdField_a_of_type_Int >= 3000) && (this.jdField_a_of_type_Int < 3009)) {
      return 15;
    }
    return 12;
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == -1) {
      return;
    }
    if ((paramInt1 >= 0) && (paramInt1 < 11))
    {
      f.a(paramGraphics, e.a(9), paramInt2, paramInt3 + 4, paramInt1 * 11, 0, 11, 11, 0);
      return;
    }
    if ((paramInt1 > 19) && (paramInt1 < 50))
    {
      f.a(paramGraphics, e.a(10), paramInt2, paramInt3, (paramInt1 - 20) * 15, 0, 15, 14, 0);
      return;
    }
    if ((paramInt1 >= 50) && (paramInt1 < 100))
    {
      if (this.jdField_c_of_type_Int >= 0)
      {
        ad.a(paramGraphics, paramInt2 + 2, paramInt3 + 2, paramInt1 - 50);
        ad.a(paramGraphics, e.a(3), this.jdField_c_of_type_Int, paramInt2 + 17, paramInt3 + 7, this.i);
        return;
      }
      ad.a(paramGraphics, paramInt2 + 2, paramInt3 + 2, paramInt1 - 50);
      return;
    }
    if ((paramInt1 >= 100) && (paramInt1 < 256))
    {
      paramGraphics.setColor(9147026);
      f.a(paramGraphics, e.a(11), paramInt2, paramInt3, (paramInt1 - 100) % 7 * 18, (paramInt1 - 100) / 7 * 18, 18, 18, 0);
      return;
    }
    if ((paramInt1 >= 256) && (paramInt1 < 500))
    {
      f.a(paramGraphics, e.a(4), paramInt2, paramInt3 + 2, (paramInt1 - 256) % 7 * 18, (paramInt1 - 256) / 7 * 18, 18, 18, 0);
      return;
    }
    int m;
    if ((paramInt1 >= 500) && (paramInt1 < 510))
    {
      if (d.jdField_a_of_type_Int > 176)
      {
        m = paramInt3 + 70;
        m = a().b == this ? m - 20 : m;
        if (d.jdField_a_of_type_Int > 240)
        {
          f.a(paramGraphics, e.a(34), paramInt2 + 8, m, (paramInt1 - 500) * 62, 0, 62, 40, 0);
          return;
        }
        f.a(paramGraphics, e.a(34), paramInt2, m, (paramInt1 - 500) * 62, 0, 62, 40, 0);
      }
    }
    else
    {
      if ((paramInt1 >= 510) && (paramInt1 < 550)) {}
      switch (paramInt1)
      {
      case 510: 
        if (this.jdField_c_of_type_Int >= 0)
        {
          ad.a(paramGraphics, paramInt2 - 7, paramInt3);
          ad.a(paramGraphics, e.a(3), this.jdField_c_of_type_Int, paramInt2 + 7, paramInt3, 6);
          return;
        }
        ad.a(paramGraphics, paramInt2, paramInt3);
        return;
      case 511: 
        if (this.jdField_c_of_type_Int >= 0)
        {
          ad.a(paramGraphics, paramInt2 + 10, paramInt3, 3);
          ad.a(paramGraphics, e.a(3), this.jdField_c_of_type_Int, paramInt2 + 10 + 20, paramInt3 + 8, 5);
          m = (this.jdField_c_of_type_Int < 1000 ? 3 : this.jdField_c_of_type_Int < 100 ? 2 : this.jdField_c_of_type_Int < 10 ? 1 : 4) * 6;
          ad.b(paramGraphics, paramInt2 + 10 + 20 + m, paramInt3 + 8);
          return;
        }
        ad.a(paramGraphics, paramInt2, paramInt3, 3);
        return;
      case 512: 
        ad.b(paramGraphics, paramInt2, paramInt3);
        if (this.jdField_c_of_type_Int >= 0)
        {
          ad.a(paramGraphics, e.a(3), this.jdField_c_of_type_Int, paramInt2, paramInt3, 6);
          return;
        }
        break;
      case 513: 
        ad.b(paramGraphics, paramInt2 - 2, paramInt3 + 6, 2);
        return;
      case 514: 
      case 515: 
      case 516: 
      case 517: 
        paramInt3 = paramInt1 - 514;
        paramInt2 = paramInt3 + 3;
        paramInt1 = paramInt2;
        f.a(paramGraphics, e.a(0), paramInt1, paramInt2, 48 + paramInt3 * 18, 0, 18, 12, 0);
        return;
      case 518: 
      case 519: 
      case 520: 
      case 521: 
      case 522: 
        f.a(paramGraphics, e.a(0), paramInt2, paramInt3, (paramInt1 - 518) * 10 + 120, 0, 10, 11, 0);
        return;
      case 523: 
      case 524: 
        f.a(paramGraphics, e.a(0), paramInt2, paramInt3, 0 + (paramInt1 - 523 << 4), 0, 16, 20, 0);
        return;
      case 525: 
        f.a(paramGraphics, e.a(0), paramInt2, paramInt3, 38, 0, 10, 20, 0);
        return;
      default: 
        return;
        int n;
        if ((paramInt1 >= 999) && (paramInt1 < 2000))
        {
          if (this.jdField_a_of_type_A != null)
          {
            if (this.jdField_c_of_type_Byte == 10)
            {
              if (d.jdField_b_of_type_Int >= 240)
              {
                m = 0;
                n = 24;
                switch (paramInt1 - 1000)
                {
                case 0: 
                  n -= 2;
                  break;
                case 1: 
                  m += 6;
                  break;
                case 2: 
                  m += 4;
                  break;
                case 3: 
                  m += 4;
                  n -= 4;
                }
                if (d.jdField_a_of_type_Int > 176) {
                  f.a(paramGraphics, e.a(34), paramInt2 - m - 10, paramInt3 + n, (paramInt1 - 1000) * 62, 0, 62, 40, 0);
                } else {
                  f.a(paramGraphics, e.a(34), paramInt2 - m, paramInt3 + n, (paramInt1 - 1000) * 62, 0, 62, 40, 0);
                }
              }
              if (d.jdField_a_of_type_Int > 176) {
                this.jdField_a_of_type_A.a.a(paramGraphics, paramInt2 + 20, paramInt3 + 40, this.jdField_a_of_type_A.b);
              } else {
                this.jdField_a_of_type_A.a.a(paramGraphics, paramInt2 + 30, paramInt3 + 40, this.jdField_a_of_type_A.b);
              }
              this.jdField_a_of_type_A.a.a(0);
              if (bc.jdField_a_of_type_Long - a().jdField_a_of_type_Long >= 2000L)
              {
                a().jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
                this.jdField_a_of_type_A.a(13, 1, 0);
              }
            }
            else if (this.jdField_c_of_type_Byte == 4)
            {
              this.jdField_a_of_type_A.a.a(paramGraphics, paramInt2 + 20, paramInt3 + 40, this.jdField_a_of_type_A.b);
              this.jdField_a_of_type_A.a.a(0);
              if (bc.jdField_a_of_type_Long - a().jdField_a_of_type_Long >= 2000L)
              {
                a().jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
                this.jdField_a_of_type_A.a(3, 1, 0);
              }
            }
            else if (this.jdField_c_of_type_Byte == 7)
            {
              m = 10;
              n = 10;
              int i1 = 56;
              switch (paramInt1 - 1000)
              {
              case 0: 
                n = 16;
                m += 30;
                break;
              case 1: 
                n = 20;
                m += 35;
                break;
              case 2: 
                n = 16;
                m += 32;
                break;
              case 3: 
                n = 20;
                m += 32;
                i1 += 4;
              }
              if (d.jdField_a_of_type_Int < 220) {
                n = 2;
              }
              if ((d.jdField_a_of_type_Int > 230) && (d.jdField_a_of_type_Int < 250)) {
                n -= 6;
              }
              f.a(paramGraphics, e.a(33), paramInt2 + n, paramInt3 + this.f, (paramInt1 - 1000) * 45, 0, 45, 36, 0);
              if (d.jdField_a_of_type_Int < 220)
              {
                m = 24;
                i1 = 68;
              }
              if ((d.jdField_a_of_type_Int > 230) && (d.jdField_a_of_type_Int < 250)) {
                m -= 10;
              }
              this.jdField_a_of_type_A.a.a(paramGraphics, paramInt2 + m, paramInt3 + i1, this.jdField_a_of_type_A.b);
              this.jdField_a_of_type_A.a.a(0);
              if (this.f <= 0)
              {
                this.f = ((int)(this.f + (bc.jdField_a_of_type_Long - a().jdField_a_of_type_Long) / 4L));
                if (this.f >= 0) {
                  this.f = -20;
                }
              }
              if (bc.jdField_a_of_type_Long - a().jdField_a_of_type_Long >= 2000L)
              {
                a().jdField_a_of_type_Long = bc.jdField_a_of_type_Long;
                this.jdField_a_of_type_A.a(13, 1, 0);
              }
            }
            else
            {
              this.jdField_a_of_type_A.a.a(paramGraphics, paramInt2 + 25, paramInt3 + 40, this.jdField_a_of_type_A.b);
              this.jdField_a_of_type_A.a(0, 1, 0);
            }
            if ((paramInt1 != 999) || (e.jdField_a_of_type_G == null)) {
              break;
            }
          }
        }
        else if ((paramInt1 >= 2011) && (paramInt1 < 2015))
        {
          if (a().b != this)
          {
            m = 10;
            n = 52;
            switch (paramInt1 - 2011)
            {
            case 0: 
              m += 10;
              break;
            case 1: 
              m += 20;
              break;
            case 2: 
              m += 12;
              break;
            case 3: 
              m += 16;
              n += 4;
            }
            if (d.jdField_a_of_type_Int < 220)
            {
              m = 4;
              n = 68;
            }
            if ((d.jdField_a_of_type_Int > 230) && (d.jdField_a_of_type_Int < 250)) {
              m -= 10;
            }
            f.a(paramGraphics, e.a(30), paramInt2 + m, paramInt3 + n, (paramInt1 - 2011) * 30, 0, 30, 36, 0);
          }
        }
        else
        {
          if ((paramInt1 >= 2100) && (paramInt1 < 2200))
          {
            m = paramInt2;
            if (a().b == this) {
              m += 10;
            }
            f.a(paramGraphics, e.a(33), m + 28, paramInt3, 204, 0, 25, 25, 0);
            f.a(paramGraphics, e.a(2), m + 6 + 28, paramInt3 + 6, 65 + (this.jdField_a_of_type_Int - 2100) * 13, 0, 13, 12, 0);
            return;
          }
          if (paramInt1 == 2200)
          {
            m = paramInt2;
            if (a().b == this) {
              m += 10;
            }
            f.a(paramGraphics, e.a(33), m + 28, paramInt3, 179, 0, 25, 25, 0);
            return;
          }
          if ((paramInt1 >= 3000) && (paramInt1 < 3009)) {
            f.a(paramGraphics, e.a(10), paramInt2, paramInt3, (paramInt1 - 3000) * 15, 0, 15, 14, 0);
          }
        }
        break;
      }
    }
  }
  
  public final char a()
  {
    return this.jdField_a_of_type_Char;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\av.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */