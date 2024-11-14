package com.example

import mytypes.MyLong

object Example:

  def foo: Option[MyLong] = {
    val myLong = 3L
    MyLong.option(myLong)
  }