import chisel3._
import chisel3.util._

class Decoder extends Module {
  val io = IO(new Bundle {
    val sel = Input(UInt(2.W)) //select 신호 자료에는 a
    //2비트 짜리 코드       W는 폭임
    val out = Output(UInt(4.W)) //out 자료에는 bor result
    //4빗 짜리 코드            W는 폭임
  })

  val sel = io.sel     //io.sel을 갖고
  val dec = WireDefault(0.U)

  // ***** your code starts here *****
  dec := 1.U << sel;  //1.u 왼쪽으로 쉬프트 dec 값 업데이트 해줘야함
  // ***** your code ends here *****

  io.out := dec //디코더 값을 io.out 으로 보냄
}


