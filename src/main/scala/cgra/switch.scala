// See README.md for license details.

package cgra

import chisel3._

/**
  * Switch: 
  */
class Switch(dataWidth: Int, rowNum: Int, colNum: Int, inNum: Int, outNum: Int) extends Module {
  val io = IO(new Bundle {
    val in = Input(Vec(inNum,UInt(dataWidth.W)))
    val out = Output(Vec(outNum,UInt(dataWidth.W)))
  })



}
