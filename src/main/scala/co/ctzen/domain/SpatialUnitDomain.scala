package co.ctzen.domain

import co.ctzen.domain.types.{Area, Volume}
import co.ctzen.domain.AdministrativeDomain.COL_AreaTipo

/**
  * Created by cdsanchez on 5/09/16.
  */
object SpatialUnitDomain {

  /**
    * Este es un caso especial, porque viene con
    * unos tipos de datos acá.
    */
  case class LA_AreaValue(
                           `type`: COL_AreaTipo,
                           areaSize: Area
                         )

  case class LA_VolumeValue(
                             `type`: LA_VolumeType,
                             volumeSize: Volume
                           )


  type LA_VolumeType = LA_VolumeType.Value

  type COL_StructureType = COL_StructureType.Value
  type COL_LevelContentType = COL_LevelContentType.Value
  type LA_SurfaceRelationType = LA_SurfaceRelationType.Value
  type COL_UtilityNetworkType = COL_UtilityNetworkType.Value

  type COL_RegisterType = COL_RegisterType.Value
  type LA_DimensionType = LA_DimensionType.Value
  type COL_BuildingUnitType = COL_BuildingUnitType.Value
  type LA_UtilityNetworkStatusType = LA_UtilityNetworkStatusType.Value


  /**
    *
    */
  object LA_VolumeType extends Enumeration {
    val
    ToDo
    = Value
  }

  /** ***************************************************************/
  /**
    *
    */
  object COL_StructureType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_LevelContentType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object LA_SurfaceRelationType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_UtilityNetworkType extends Enumeration {
    val
    ToDo
    = Value
  }

  /** ***************************************************************/

  /**
    *
    */
  object COL_RegisterType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object LA_DimensionType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object COL_BuildingUnitType extends Enumeration {
    val
    ToDo
    = Value
  }

  /**
    *
    */
  object LA_UtilityNetworkStatusType extends Enumeration {
    val
    ToDo
    = Value
  }

}
