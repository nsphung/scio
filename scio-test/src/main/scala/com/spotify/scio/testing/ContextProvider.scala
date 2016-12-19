package com.spotify.scio.testing

import com.spotify.scio.ScioContext

private[scio] trait ContextProvider {
  def context: ScioContext
}

private[scio] trait UnitTestContextProvider extends ContextProvider {
  override def context = ScioContext.forTest()
}

private [scio] trait IntegrationTestContextProvider extends ContextProvider {
  override def context = ScioContext()
}