package co.ctzen.domain

/**
  * Created by cdsanchez on 3/09/16.
  */

//TODO Tipos de datos que ni idea de dónde salen.
object types {
  type Oid = Long //???
  type ISO8601_ISO14825_Type= Long //???
  type Fraction = Fractional[Int] //???

  //Del SpatialUniDomain
  type Area = Double // ???
  type Volume = Double // ???

  //Del SruveyingDomain
  type CC_OperationMethod = Int //???
  type GM_Point = Int //???

  type COL_InstitucionTipo = String //!!, este dominio no se definió
  type COL_BAUso = String
}
