;buildInfoPackage: chisel3, version: 3.4.1, scalaVersion: 2.12.12, sbtVersion: 1.3.10
circuit Mux2 : 
  module Mux2 : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip a : UInt<1>, flip b : UInt<1>, flip sel : UInt<1>, y : UInt<1>}
    
    wire res : UInt<1> @[Mux2.scala 15:17]
    node _T = and(io.a, io.sel) @[Mux2.scala 19:13]
    node _T_1 = eq(io.sel, UInt<1>("h00")) @[Mux2.scala 19:27]
    node _T_2 = and(io.b, _T_1) @[Mux2.scala 19:25]
    node _T_3 = or(_T, _T_2) @[Mux2.scala 19:20]
    res <= _T_3 @[Mux2.scala 19:7]
    io.y <= res @[Mux2.scala 23:8]
    
