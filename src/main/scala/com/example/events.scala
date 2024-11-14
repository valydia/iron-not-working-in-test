package com.example

import io.github.iltotore.iron.*

object events {

  opaque type MyLong <: Long :| Pure = Long :| Pure
  object MyLong extends RefinedTypeOps.Transparent[MyLong]

}
