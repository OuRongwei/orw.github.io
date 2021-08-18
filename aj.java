public final class aj
  extends ak
{
  public boolean a = false;
  
  public aj(String paramString)
  {
    if (paramString.toLowerCase().equals("true"))
    {
      this.a = true;
      return;
    }
    this.a = false;
  }
  
  public aj(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final String a()
  {
    return new Boolean(this.a).toString();
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */