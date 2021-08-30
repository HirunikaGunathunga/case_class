import scala.math.sqrt
import scala.math.pow

object MyCode extends App {
  val p1=Point(3,8)
  val p2=Point(-2,0)

  //Q1
  println(p1+p2)
  //Q2
  val p3=p1.move(1,-2)
  println(p3)
  //Q3
  println("Distance"+p2.distance(p1))
  //Q4
  println(p1.invert())

}

case class Point(m:Int,n:Int){
  def x:Int=m
  def y:Int=n

  def +(p:Point):Point=Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int):Point=Point(this.x+dx,this.y+dy)
  def distance(p:Point):Double= sqrt( pow(this.x-p.x,2) + pow(this.y-p.y,2))
  def invert():Point= Point(this.y,this.x)
  override def toString:String="(" +x+ "," +y+ ")"
}
