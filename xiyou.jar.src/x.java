import javax.microedition.lcdui.Graphics;

public final class x
{
  private int b;
  private int c;
  public int a;
  public long a;
  public byte a;
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.b = (paramInt1 >> f.c);
    this.c = (paramInt2 >> f.c);
  }
  
  public final void a(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setColor(this.jdField_a_of_type_Int);
    if (this.jdField_a_of_type_Byte == 1)
    {
      if (d.c % 5 != 0) {
        paramGraphics.fillRect(paramInt + this.b - 1, 2 + this.c - 1, 3, 3);
      }
    }
    else
    {
      if ((this.jdField_a_of_type_Byte > 1) && (this.jdField_a_of_type_Byte < 6))
      {
        paramGraphics.fillRect(paramInt + this.b - 1, 2 + this.c - 1, 3, 3);
        return;
      }
      if ((this.jdField_a_of_type_Byte >= 6) && (e.a(0) != null)) {
        f.a(paramGraphics, e.a(0), paramInt + this.b, 2 + this.c, 93 + (this.jdField_a_of_type_Byte - 6) * 3, 12, 3, 8, 0);
      }
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */