package com.example

import io.github.iltotore.iron.*

object mytypes {

  opaque type MyLong <: Long :| Pure = Long :| Pure
  object MyLong extends RefinedTypeOps.Transparent[MyLong]

}
