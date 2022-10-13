import chisel3.iotesters.PeekPokeTester
import org.scalatest._

class AddSubTester(dut: AddSub) extends PeekPokeTester(dut) {

  poke(dut.io.a, 1) //a에 1줌
  poke(dut.io.b, 2) // b에 2줌
  poke(dut.io.selAdd, 1) //1번을 선택했음
  step(1)
  expect(dut.io.y, 3)  //3이 도출 == +

  poke(dut.io.a, 3)  //a에 3
  poke(dut.io.b, 2)  //b에 2
  poke(dut.io.selAdd, 0)  // 0번 선택
  step(1)
  expect(dut.io.y, 1) //결과 1 == -
}

class AddSubSpec extends FlatSpec with Matchers {
  "AddSub" should "pass" in {
    chisel3.iotesters.Driver(() => new AddSub) { c => new AddSubTester(c)} should be (true)
  }
}
