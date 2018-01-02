package com.raquo.laminar.experimental.airstream.fixtures

import com.raquo.laminar.experimental.airstream.core.Observer
import com.raquo.laminar.experimental.airstream.signal.Signal

import scala.scalajs.js

trait TestableSignal[A] extends Signal[A] {

  // Make these fields public for testing

  def _testObservers: js.Array[Observer[A]] = externalObservers

}
