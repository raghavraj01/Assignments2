package io.datatroops

class validate{
  var rname= "Raghav@Raj"
  var dname= "RaghavRaj.com"
  def RecipientName(){
  if(rname.matches("[a-zA-Z@]+")){
println("Valid Recipient Name")
  }
  else{
println("Invalid Recipient Name")
  }
  }
  def DomainName(){
  if(dname.matches("[a-zA-Z(.com)/(.in)/(.org)]+")){
println("Valid Domain Name")
  }
  else{
println("Invalid Domain Name")
  }
  }
}
object MainObject{
  def main(args:Array [String]): Unit = {
    var v = new validate()
    v.RecipientName()
    v.DomainName()
  }
}
