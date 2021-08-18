import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bj
  extends ax
{
  int d = 0;
  
  public bj(ba paramba)
  {
    this.jdField_a_of_type_Ba = paramba;
    b(false);
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    this.f = this.jdField_a_of_type_Ba.f;
    this.g = ((short)bb.c);
    this.b = this.jdField_a_of_type_Ba.b;
    this.c = this.jdField_a_of_type_Ba.c;
    w.a(paramGraphics, this.b, this.c, this.f);
    int i = this.f / this.jdField_a_of_type_Short;
    this.d = this.b;
    this.e = ((short)(this.c + 3));
    av localav = null;
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= this.jdField_a_of_type_Short) {
        break;
      }
      paramGraphics.setColor(128, 215, 166);
      (localav = (av)a(j)).jdField_a_of_type_Array2dOfShort = new short[1][4];
      localav.jdField_a_of_type_Array2dOfShort[0][0] = this.d;
      localav.jdField_a_of_type_Array2dOfShort[0][1] = this.e;
      localav.jdField_a_of_type_Array2dOfShort[0][2] = ((short)(this.d + i));
      localav.jdField_a_of_type_Array2dOfShort[0][3] = ((short)(this.e + bb.c - 3));
      int k = paramGraphics.getClipX();
      int m = paramGraphics.getClipY();
      int n = paramGraphics.getClipWidth();
      int i1 = paramGraphics.getClipHeight();
      paramGraphics.setClip(this.d, this.e - 1, i, bb.c - 3);
      if (j == this.d) {
        paramGraphics.setColor(14023352);
      }
      int i2 = 5;
      if (bg.b > 22) {
        i2 = 0;
      } else if (bg.b > 20) {
        i2 = 2;
      } else if (bg.b > 17) {
        i2 = 3;
      } else if (bg.b > 15) {
        i2 = 4;
      }
      if ((j == this.d) && (((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.b == this))
      {
        w.a(paramGraphics, 30, 8546142, this.d + (i >> 1) - (bg.a.stringWidth(localav.h) / 2 + 4), this.e + i2, bg.a.stringWidth(localav.h) + 8, bg.b);
        ae.a(paramGraphics, this.d + (i >> 1), this.e + i2, localav.h, 10016752, 0, 17);
      }
      else
      {
        w.a(paramGraphics, 29, 6508357, this.d + (i >> 1) - (bg.a.stringWidth(localav.h) / 2 + 4), this.e + i2, bg.a.stringWidth(localav.h) + 8, bg.b);
        ae.a(paramGraphics, this.d + (i >> 1), this.e + i2, localav.h, 15781737, 17);
      }
      this.d = ((short)(this.d + i));
      paramGraphics.setClip(k, m, n, i1);
    }
    return parambg;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    int i = -1;
    do
    {
      i++;
      if (i >= this.jdField_a_of_type_Short) {
        break;
      }
    } while (!a(i).a(paramInt1, paramInt2));
    ((bb)this.jdField_a_of_type_Ba).a(((bb)this.jdField_a_of_type_Ba).b(((av)a(i)).jdField_a_of_type_JavaLangString));
    this.d = i;
    return true;
    return false;
  }
  
  public final void b(int paramInt)
  {
    bb localbb;
    if ((localbb = a()).jdField_a_of_type_Bc != null)
    {
      if (paramInt == 2) {
        ((bb)this.jdField_a_of_type_Ba).a(a(2));
      } else if (paramInt == 3) {
        ((bb)this.jdField_a_of_type_Ba).a(a(3));
      } else if (paramInt == 1) {
        ((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.b = null;
      } else if (paramInt == 18)
      {
        if (((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.d != null) {
          ((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.a().a(((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.d);
        } else {
          localbb.f();
        }
      }
      else if (paramInt == 17) {
        ((bb)this.jdField_a_of_type_Ba).jdField_a_of_type_Bb.e();
      }
      bc.f();
    }
  }
  
  private bb a(int paramInt)
  {
    if (paramInt == 3) {
      this.d = ((this.d + 1) % this.jdField_a_of_type_Short);
    } else {
      this.d = ((this.d + this.jdField_a_of_type_Short - 1) % this.jdField_a_of_type_Short);
    }
    return ((bb)this.jdField_a_of_type_Ba).c(((av)a(this.d)).jdField_a_of_type_JavaLangString);
  }
  
  public final boolean a(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    int i = -1;
    do
    {
      i++;
      if (i >= this.jdField_a_of_type_Short) {
        break;
      }
    } while (!((av)a(i)).jdField_a_of_type_JavaLangString.equals(paramString));
    return true;
    return false;
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    d(paraml);
    do
    {
      paraml.a();
      String str = paraml.jdField_a_of_type_JavaLangString;
      if (paraml.b == 2)
      {
        b(paraml);
        paraml.a(3, str);
      }
    } while ((paraml.b != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("tag")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */