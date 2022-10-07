circuit Mux2 :
  module Mux2 :
    input clock : Clock
    input reset : UInt<1>
    input io_a : UInt<1>
    input io_b : UInt<1>
    input io_sel : UInt<1>
    output io_y : UInt<1>

    node _T = and(io_a, io_sel) @[Mux2.scala 19:13]
    node _T_1 = eq(io_sel, UInt<1>("h0")) @[Mux2.scala 19:27]
    node _T_2 = and(io_b, _T_1) @[Mux2.scala 19:25]
    node _T_3 = or(_T, _T_2) @[Mux2.scala 19:20]
    node res = _T_3 @[Mux2.scala 15:17 Mux2.scala 19:7]
    io_y <= res @[Mux2.scala 23:8]