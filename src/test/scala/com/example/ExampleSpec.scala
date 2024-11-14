package com.example

import weaver.*

object ExampleSpec extends SimpleIOSuite {

  pureTest("foo should return Some(3)"){
    expect.same(Example.foo, Some(3))
  }

}
