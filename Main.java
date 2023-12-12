public class Main
{
    static Entry<String,String> e = new Entry<String,String>();
    static Caller ionel = new Caller(e,"Ionel");
    static Caller gigel = new Caller(e,"Gigel");
    static Accepter maria = new Accepter(e);
    public static void main(String[] args)
    {
        
    	Thread tIonel = new Thread(ionel);
       
    	Thread tGigel = new Thread(gigel);
        
    	Thread tMaria = new Thread(maria);

    	tIonel.start();
        
    	tGigel.start();
        
    	tMaria.start();
    }
}
