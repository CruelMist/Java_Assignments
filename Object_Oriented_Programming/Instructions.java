class Vehicle
{
    void Start()
    {
        System.out.println("Start");
    }
    void Stop()
    {
        System.out.println("Stop");
    }
}
class Two_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Starting the two wheeler");
    }
    void Stop()
    {
        System.out.println("Stopping the two wheeler");
    }
}
class Four_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Starting the four wheeler");
    }
    void Stop()
    {
        System.out.println("Stopping the two wheeler");
    }
}
class Instructions
{
    public static void main(String[] args)
    {
        Two_Wheeler t=new Two_Wheeler();
        Four_Wheeler f= new Four_Wheeler();
        t.Start();
        t.Stop();
        f.Start();
        f.Stop();
    }
    
}