package SubiecteAI.ChainOfResponsibility.clase;

//Handler
public abstract class CheckAbstract implements ICheck{
    private ICheck next;
    public void setNext(ICheck next){
        this.next = next;
    }

    protected void forward(Request request){
        if(next!=null){
            next.handle(request);
        }
    }


}
