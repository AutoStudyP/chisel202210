circuit Decoder :
  module Decoder :
    input clock : Clock
    input reset : UInt<1>
    input io_sel : UInt<2>
    output io_out : UInt<4>

    node _T = dshl(UInt<1>("h1"), io_sel) @[Decoder.scala 14:14]
    node dec = _T
    io_out <= dec @[Decoder.scala 17:10]