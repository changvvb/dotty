import scala.quoted._

object Test {

  inline def foo(x: Expr[Int])(using Quotes): Expr[Int] = '{ // error
    println("foo")
    ${
      ${??? : Expr[Int]}

      x
    }
  }


}
