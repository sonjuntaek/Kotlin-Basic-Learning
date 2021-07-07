private class PrivateClass {

}

public class PublicClass {

}

//클래스에는 protected를 붙일 수 없다.
/*
protected class ProtectedClass{

}
*/

internal class InternalClass{

}

public open class AccessTestClass{
    public var public1 : Int = 3
    private var private1 : Int = 4
    protected var protected1 : Int = 5
    internal var internal1 : Int = 6
}

class SubAccessTestClass: AccessTestClass(){
    var protected2 = super.protected1;
}