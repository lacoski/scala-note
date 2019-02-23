object BeforeAfter {
    def main(args: Array[String]) {

        before {
            println("***** My simulation is about to begin! *****")
        }

        /* Place for arbitrary Scala code that is to be executed after the simulation has ended. */
        after {
            println("***** My simulation has ended! ******")
        }
        val myVar1 :Int = 10;
        val myVar2 :Int = 40;

        doSomeThing()

        def doSomeThing(): Unit = {
            println(myVar1)
            println(myVar2)
        }
    }
}