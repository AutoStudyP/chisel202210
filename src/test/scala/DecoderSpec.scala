import chisel3.iotesters.PeekPokeTester
import org.scalatest._

class DecoderTester(dut: Decoder) extends PeekPokeTester(dut) {

  for (n <- 0 to 3) {
    poke(dut.io.sel, n)     //io.sel = 우리가 짠 치젤 논리회로 입력과 출력값. == val io에서 sel 결과
    step(1)
    val res = 1 << n
    println(n + " " + res)  //하나하나 프린트로 빼줌
    expect(dut.io.out, res) // io.out = 우리가 짠 치젤의 논리회로 입력과 출력값  ==val io 에서 out 결과
    //out이 result와 같은지 확인하는 코드
  }
}

class DecoderSpec extends FlatSpec with Matchers {
  "Decoder" should "pass" in {
    chisel3.iotesters.Driver(() => new Decoder) { c => new DecoderTester(c)} should be (true)
  }
}
