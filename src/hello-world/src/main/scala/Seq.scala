import scala.collection._

object SeqList {
    def main(args: Array[String]) {
        val a = Seq(Seq(1,2), Seq(3,4))
        val test_flatten = a.flatten
        println(test_flatten)

        val steps = Seq(1, 2, 3)
        println(steps)

        // Create new list từ list có sẵn
        val profile_test = steps.flatMap(
            for_i => Seq(
                Seq(for_i)
            )
        )
        println(profile_test)
    }
}