public abstract class CafeDecorator extends Cafe{
    Cafe cCafeASerDecorado;
    protected CafeDecorator(Cafe cACafeASerDecorado){
        cCafeASerDecorado = cACafeASerDecorado; 
    }
}