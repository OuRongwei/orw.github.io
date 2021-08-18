import java.io.PrintStream;

public final class m
  extends Exception
{
  private Throwable a = null;
  
  public m(String paramString, l paraml, Throwable paramThrowable)
  {
    super((paramString != null ? paramString + " " : "") + (paraml != null ? "(position:" + paraml.a() + ") " : "") + (paramThrowable != null ? "caused by: " + paramThrowable : ""));
    this.a = paramThrowable;
  }
  
  public final void printStackTrace()
  {
    if (this.a == null)
    {
      super.printStackTrace();
      return;
    }
    synchronized (System.err)
    {
      System.err.println(super.getMessage() + "; nested exception is:");
      this.a.printStackTrace();
      return;
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */