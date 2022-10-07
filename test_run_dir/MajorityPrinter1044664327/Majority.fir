;buildInfoPackage: chisel3, version: 3.4.1, scalaVersion: 2.12.12, sbtVersion: 1.3.10
circuit Majority : 
  module Majority : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip a : UInt<1>, flip b : UInt<1>, flip c : UInt<1>, out : UInt<1>}
    
    node _T = and(io.a, io.b) @[Majority.scala 24:14]
    node _T_1 = and(io.a, io.c) @[Majority.scala 24:24]
    node _T_2 = or(_T, _T_1) @[Majority.scala 24:19]
    node _T_3 = and(io.b, io.c) @[Majority.scala 24:34]
    node res = or(_T_2, _T_3) @[Majority.scala 24:29]
    io.out <= res @[Majority.scala 29:10]
    
