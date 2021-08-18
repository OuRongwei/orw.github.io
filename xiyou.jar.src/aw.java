import javax.microedition.lcdui.Graphics;

public final class aw
  extends ba
{
  public aw(ba paramba)
  {
    this.a = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    c();
    parambg.a = this.a.d;
    bg tmp16_15 = parambg;
    tmp16_15.b = ((short)(tmp16_15.b + (short)(parambg.c + 1)));
    parambg.c = 0;
    d();
    return parambg;
  }
  
  public final void a(l paraml)
  {
    ba.a(paraml, "br");
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\aw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */