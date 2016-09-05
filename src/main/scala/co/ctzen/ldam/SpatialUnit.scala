package co.ctzen.ldam

import co.ctzen.domain.SpatialUnitDomain._
import co.ctzen.domain.types._

/**
  * Created by cdsanchez on 3/09/16.
  */
trait SpatialUnit {
  val area: Option[LA_AreaValue]
  val dimension: Option[LA_DimensionType]
  val exitAddressID: Seq[ExtAddress]
  val label: Option[String]
  val referencePoint: Option[GM_Point]
  val suID: Oid
  val surfaceRelation: Option[LA_SurfaceRelationType]
  val volume: Seq[LA_VolumeValue]


  def areaClosed: Boolean
  def computeArea: Area
  def computeVolume: Volume
  def createArea: GM_MultiSurface
  def createVolume: GM_MultiSolid
  def volumeClosed: Boolean
}

abstract case class // Abstracta por el momento para evitar conflictos con las funciones no implementadas
COL_LegalSpaceBuildingUnit(
                            override val area: Option[LA_AreaValue],
                            override val dimension: Option[LA_DimensionType],
                            override val exitAddressID: Seq[ExtAddress],
                            override val label: Option[String],
                            override  val referencePoint: Option[GM_Point],
                            override val suID: Oid,
                            override val surfaceRelation: Option[LA_SurfaceRelationType],
                            override val volume: Seq[LA_VolumeValue],
                            extPhysicalBuildingUnitlD: Option[ExtPhysicalBuildingUnit],
                            `type`: Option[COL_BuildingUnitType]
                          ) extends SpatialUnit


abstract case class // Abstracta por el momento para evitar conflictos con las funciones no implementadas
COL_LegalSpaceUtilityNetwork(
                            override val area: Option[LA_AreaValue],
                            override val dimension: Option[LA_DimensionType],
                            override val exitAddressID: Seq[ExtAddress],
                            override val label: Option[String],
                            override  val referencePoint: Option[GM_Point],
                            override val suID: Oid,
                            override val surfaceRelation: Option[LA_SurfaceRelationType],
                            override val volume: Seq[LA_VolumeValue],
                            extPhysicalNetworklD: Option[ExtPhysicalUtilityNetwork],
                            status: Option[LA_UtilityNetworkStatusType],
                            `type`: Option[COL_UtilityNetworkType]
                          ) extends SpatialUnit
