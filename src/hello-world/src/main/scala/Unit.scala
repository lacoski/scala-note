object Unit {
    def main(args: Array[String]) {
        val myVar1 :Int = 10;
        val myVar2 :Int = 40;

        doSomeThing()

        def doSomeThing(): Unit = {
            println(myVar1)
            println(myVar2)
        }
    }
}