/*
 * A 3-bit majority circuit.
 */

import chisel3._

class Majority extends Module {
  val io = IO(new Bundle {
    val a = Input(Bool())
    val b = Input(Bool())
    val c = Input(Bool())
    val out = Output(Bool())
  })

  val a = io.a
  val b = io.b
  val c = io.c

  // This too simple implementation will pass the most simplistic tests only (MajoritySimple).
  // Rewrite this expression to express the majority to pass all tests.

  // ***** your code starts here *****
//  val res = a
val res = (a & b) | (a & c) | (b & c)
  //  if
// (a & b) | (a & c) | (b & c)
//{

  io.out := res
}

// generate Verilog
object Majority extends App {
  (new chisel3.stage.ChiselStage).emitVerilog(new Majority())
}
