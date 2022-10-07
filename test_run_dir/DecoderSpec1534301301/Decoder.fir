;buildInfoPackage: chisel3, version: 3.4.1, scalaVersion: 2.12.12, sbtVersion: 1.3.10
circuit Decoder : 
  module Decoder : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip sel : UInt<2>, out : UInt<4>}
    
    wire dec : UInt
    dec <= UInt<1>("h00")
    node _T = dshl(UInt<1>("h01"), io.sel) @[Decoder.scala 14:14]
    dec <= _T @[Decoder.scala 14:7]
    io.out <= dec @[Decoder.scala 17:10]
    
