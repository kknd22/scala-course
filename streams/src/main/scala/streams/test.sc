Vector("abc": _*)




val level =
  """------
    |--ST--
    |--oo--
    |--oo--
    |------""".stripMargin



Vector(level.split("\n").map(str => Vector(str: _*)): _*)

