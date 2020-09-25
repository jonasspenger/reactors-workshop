// example from: http://reactors.io/tutorialdocs//reactors/hello-world/index.html
import io.reactors._

object HelloWorld {
  def main(args: Array[String]) {
    val welcomeReactor = Reactor[String] {
      self =>
        self.main.events onEvent { name =>
          println(s"Welcome, $name!")
          self.main.seal()
        }
    }
    val system = ReactorSystem.default("test-system")
    val ch = system.spawn(welcomeReactor)
    ch ! "Alan"
  }
}
