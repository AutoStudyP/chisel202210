import chisel3._

class
 Mux2 extends Module {
  val io = IO(new Bundle { //번들 묶음신호
    val a = Input(Bool())
    val b = Input(Bool())
    val sel = Input(Bool())
    val y = Output(Bool())   //결과값
  })

  val a = io.a
  val b = io.b
  val sel = io.sel
  val res = Wire(Bool())

  // ***** your code starts here *****

//  res := (a & sel) | (b & !sel);
  res:=Mux(sel,b,a)
//  res:= ~sel&b | sel&a;
  // ***** your code ends here *****

  io.y := res

}
//  object Mux2 extends App{
//    emitVerilog(new Mux2())
//  }
