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
  type ExtAddress = String // ???
  type GM_MultiSurface = Double // ?
  type GM_MultiSolid = Double // ?
  type ExtPhysicalBuildingUnit = Double // ??
  type ExtPhysicalUtilityNetwork = Double // ?

  //Del SruveyingDomain
  type CC_OperationMethod = Int //???
  type GM_Point = Int //???
  type GM_MultiCurve = Int //??

  type COL_InstitucionTipo = String //!!, este dominio no se definió
  type COL_BAUso = String
  type ExtArchive = Long // ??
  type Cl_ResponsibleParty = String // ?
  type Cl_PresentationFormCode = Long // ?
  type MultiMediaType = String // ??
  type OM_Observation = String // ?
  type OM_Process = String // ?
  type DQ_Element = String // ??
  type LI_Lineage = String // ?
}
