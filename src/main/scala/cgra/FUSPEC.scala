// See README.md for license details.

package cgra

import chisel3._

/**
  * FUSPEC
  */
class FUSPEC(dataWidth: Int) extends Module {
  val io = IO(new Bundle {
    val in0 = Input(UInt(dataWidth.W))
    val in1 = Input(UInt(dataWidth.W))
    val in2 = Input(UInt(dataWidth.W))
    val out   = Output(UInt(dataWidth.W))
  })




}
