package vineet

import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.{break, breakable}

object MainObject {
  def main(args: Array[String]): Unit = {


    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("\nEnter")
        println("1. To Enter Double of an element")
        println("2. To Enter square of an element")
        println("3. To delete an element")
        println("4. Display the OOPS.assign.Queue")
        println("5. Exit")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nEnter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new DoubleQueue(queue)
            queueObj.enqueue(elementToBePushed)

          case 2 =>
            println("\nEnter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new SquareQueue(queue)
            queueObj.enqueue(elementToBePushed)
          case 3 =>

            if (queue.size == 0) println("\nEmpty OOPS.assign.Queue")
            else {
              val obj = new SquareQueue(queue)
              val poppedElement = obj.dequeue(queue)
              println("Deleted Element is : " + poppedElement)
            }
          case 4 => 1
            if (queue.size == 0) println("\nEmpty OOPS.assign.Queue")
            else {
              println("\n OOPS.assign.Queue")
              for (loopVariable <- queue)
                print(loopVariable + " ")
              println()

            }
          case 5 =>
            println("Exiting")
            break
          case _ =>
            println("Wrong Choice. Enter again")
        }
      }
    }
  }
}