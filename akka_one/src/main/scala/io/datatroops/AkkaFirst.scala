package io.datatroops

class MClass{
  var a=10
  var b=20
  def sum(){
    println("sum of numbers is: "+(a+b))
  }
}
object MObject()
{
  def main (args:Array[String])
  {
    var v= new MClass()
    v.sum()
  }
}
