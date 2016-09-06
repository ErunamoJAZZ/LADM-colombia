package co.ctzen.ldam

import co.ctzen.domain.SpatialUnitDomain._
import co.ctzen.domain.types._

/**
  * Created by cdsanchez on 3/09/16.
  */
trait LA_SpatialUnit {
  val area: Option[LA_AreaValue]
  val dimension: Option[LA_DimensionType]
  val exitAddressID: Seq[ExtAddress]
  val label: Option[String]
  val referencePoint: Option[GM_Point]
  val suID: Oid
  val surfaceRelation: Option[LA_SurfaceRelationType]
  val volume: Seq[LA_VolumeValue]
  val minusBoundaryFace: Seq[La_BoundaryFace] // Asociación con La_BoundaryFace 0..*
  val plusBoundaryFace: Seq[La_BoundaryFace] // Asociaciòn con La_BoundaryFace 0..*
  val minusBoundaryFaceString: Seq[LA_BoundaryFaceString] // Asociación con LA_BoundaryFaceString 0..*
  val plusBoundaryFaceString: Seq[LA_BoundaryFaceString] // Asociaciòn con LA_BoundaryFaceString 0..*
  val point: Option[COL_Point] // Asociación con COL_Point 0..1
  val whole: Seq[LA_SpatialUnitGroup] // Asociación con LA_SpatialUnitGroup 0..*
  val source: Seq[COL_SpatialSource] // Asociación con COL_SpatialSource 0..*
  val polygon: Seq[COL_Polygon] // Asociación con COL_Polygon  0..*
  val level: Option[COL_Level] // Asociación con COL_Level  0..1
  val unit: Seq[COL_BAUnit] // Asociación con COL_BAUnit 0..*

  val relationSu1: Seq[LA_RequiredRelationshipSpatialUnit] // Asociación con LA_RequiredRelationshipSpatialUnit TODO verificar si este diseño es correcto
  val relationSu2: Seq[LA_RequiredRelationshipSpatialUnit] // Asociación con LA_RequiredRelationshipSpatialUnit TODO verificar si este diseño es correcto

  def areaClosed: Boolean
  def computeArea: Area
  def computeVolume: Volume
  def createArea: GM_MultiSurface
  def createVolume: GM_MultiSolid
  def volumeClosed: Boolean
}

// Abstracta por el momento para evitar conflictos con las funciones no implementadas
abstract case class
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
                          ) extends LA_SpatialUnit


// Abstracta por el momento para evitar conflictos con las funciones no implementadas
abstract case class
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
                          ) extends LA_SpatialUnit

case class
COL_Level(
            IID: Oid, //  TODO revisar el nombre (doble II)
            name: Option[String],
            registerType: Option[COL_RegisterType],
            structure: Option[COL_StructureType],
            `type`: Option[COL_LevelContentType]
          )

case class
LA_SpatialUnitGroup(
                      hierachyLevel: Int,
                      label: Option[String],
                      name: Option[String],
                      referencePoint: Option[GM_Point],
                      sugID: Oid
                   )